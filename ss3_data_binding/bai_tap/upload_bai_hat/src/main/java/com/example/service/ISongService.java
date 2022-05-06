package com.example.service;

import com.example.model.Song;

import java.util.List;

public interface ISongService {
    public List<Song> songList();

    void save(Song song);
}
