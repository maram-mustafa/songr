package com.example.songer.Controller;

import com.example.songer.Models.Song;
import com.example.songer.repositories.AlbumRepository;
import com.example.songer.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class SongController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;


    @GetMapping("/allsongs")
    public String getSongs(Model model){

        model.addAttribute("song", new Song());
        return "allSongs.html";
    }




}
