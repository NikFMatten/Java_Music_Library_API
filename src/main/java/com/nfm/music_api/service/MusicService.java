package com.nfm.music_api.service;

import com.nfm.music_api.data.Music;
import com.nfm.music_api.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public Music saveMusic(Music music){
        return musicRepository.save(music);
    }

    public List<Music> getAllMusic(){
        return musicRepository.findAll();
    }

    public Music getById(Integer id){
        return musicRepository.findById(id).orElse(null);
    }

    public void deleteById(Integer id){
        musicRepository.deleteById(id);
    }

    public List<Music> getByName(String name){
        return musicRepository.findByName(name);
    }

    public List<Music> getByArtist(String artist){
        return musicRepository.findByArtist(artist);
    }

    public List<Music> getByGenre(String genre){
        return musicRepository.findByGenre(genre);
    }

    public List<Music> getByYear(Integer year){
        return musicRepository.findByYear(year);
    }

    @PutMapping
    public Music updateById(Music music, Integer id){
        Music musicToUpdate = musicRepository.findById(id).orElse(null);
        musicToUpdate.setName(music.getName());
        musicToUpdate.setArtist(music.getArtist());
        musicToUpdate.setGenre(music.getGenre());
        musicToUpdate.setYear(music.getYear());
        return musicRepository.save(musicToUpdate);
    }

}
