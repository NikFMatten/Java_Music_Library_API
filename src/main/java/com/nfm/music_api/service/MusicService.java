package com.nfm.music_api.service;

import com.nfm.music_api.data.Music;
import com.nfm.music_api.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public Music saveMusic(Music music){
        return musicRepository.save(music);
    }



}
