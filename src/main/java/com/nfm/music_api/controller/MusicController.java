package com.nfm.music_api.controller;

import com.nfm.music_api.data.Music;
import com.nfm.music_api.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {

    @Autowired
    private MusicService musicService;

    @PostMapping("/addMusic")
    public Music addMusic(@RequestBody Music music){
        return musicService.saveMusic(music);
    }

    @GetMapping("/music")
    public List<Music> findAllMusic(){
        return musicService.getAllMusic();
    }
}
