package com.example.service.impl;

import com.example.model.Song;
import com.example.repository.impl.SongRepositoryImpl;
import com.example.service.ISongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {
    SongRepositoryImpl songRepository = new SongRepositoryImpl();

    @Override
    public List<Song> songList() {
        return songRepository.songList();
    }

    @Override
    public void save(Song song) {
        this.songRepository.save(song);
    }
}
