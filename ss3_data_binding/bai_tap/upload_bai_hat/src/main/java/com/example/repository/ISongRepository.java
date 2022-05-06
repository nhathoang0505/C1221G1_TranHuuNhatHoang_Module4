package com.example.repository;

import com.example.model.Song;

import java.util.List;

public interface ISongRepository {
    public List<Song> songList();

    void save(Song song);
}
