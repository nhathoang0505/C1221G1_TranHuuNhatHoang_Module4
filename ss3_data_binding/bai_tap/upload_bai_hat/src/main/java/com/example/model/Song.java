package com.example.model;

public class Song {
    private String nameSong;
    private String singer;
    private String genre;
    private String url;

    public Song(String nameSong, String singer, String genre, String url) {
        this.nameSong = nameSong;
        this.singer = singer;
        this.genre = genre;
        this.url = url;
    }

    public Song() {
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
