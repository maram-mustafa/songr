package com.example.songer.repositories;

import com.example.songer.Models.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Integer> {
}
