package com.nfm.music_api.controller;

import com.nfm.music_api.data.Music;
import com.nfm.music_api.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @Autowired
    private MusicService musicService;

    @PostMapping("/addMusic")
    public Music addMusic(@RequestBody Music music){
        return musicService.saveMusic(music);
    }
}
