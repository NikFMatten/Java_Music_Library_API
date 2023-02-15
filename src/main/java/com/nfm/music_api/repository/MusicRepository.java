package com.nfm.music_api.repository;

import com.nfm.music_api.data.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music, Integer> {

    public List<Music> findByName(String name);
    public List<Music> findByArtist(String artist);
    public List<Music> findByGenre(String genre);
    public List<Music> findByYear(Integer year);

}
