package com.nfm.music_api.repository;

import com.nfm.music_api.data.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Integer> {
    
}
