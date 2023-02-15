package com.nfm.music_api.controller;

import com.nfm.music_api.data.Music;
import com.nfm.music_api.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/music/{id}")
    public Music findMusicById(@PathVariable Integer id){
        return musicService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Integer id){
        musicService.deleteById(id);
    }
    @GetMapping("/findByName/{name}")
    public List<Music> findMusicByName(@PathVariable String name){
        return musicService.getByName(name);
    }

    @GetMapping("/findByArtist/{artist}")
    public List<Music> findMusicByArtist(@PathVariable String artist){
        return musicService.getByArtist(artist);
    }

    @GetMapping("/findByGenre/{genre}")
    public List<Music> findByGenre(@PathVariable String genre){
        return musicService.getByGenre(genre);
    }

    @GetMapping("/findByYear/{year}")
    public List<Music> findByYear(@PathVariable Integer year){
        return musicService.getByYear(year);
    }

    @PutMapping("/updateMusic/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Music updateMusicById(@RequestBody Music music, @PathVariable Integer id){
        return musicService.updateById(music, id);
    }
}
