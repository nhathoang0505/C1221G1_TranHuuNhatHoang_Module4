package com.example.repository.impl;

import com.example.model.Song;
import com.example.repository.ISongRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepositoryImpl implements ISongRepository {
    static List<Song> uploadList = new ArrayList<>();

    static {
        uploadList.add(new Song("We don't talk anymore", "GD VIET NAM", "trash", "TungGD.mp3 "));
    }

    @Override
    public List<Song> songList() {
        return uploadList;
    }

    @Override
    public void save(Song song) {
        uploadList.add(song);
    }
}
