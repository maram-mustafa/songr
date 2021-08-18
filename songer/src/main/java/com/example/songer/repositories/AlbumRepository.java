package com.example.songer.repositories;

import com.example.songer.Models.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Integer> {
}