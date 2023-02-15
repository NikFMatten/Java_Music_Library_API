package com.nfm.music_api.service;

import com.nfm.music_api.data.Music;
import com.nfm.music_api.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
