package com.nfm.music_api.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Music {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String artist;
    private String genre;
    private Integer year;

    public Music() {
    }

    public Music(Integer id, String name, String artist, String genre, Integer year) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
