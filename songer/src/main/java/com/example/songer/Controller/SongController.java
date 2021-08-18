package com.example.songer.Controller;

import com.example.songer.Models.Song;
import com.example.songer.repositories.AlbumRepository;
import com.example.songer.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import com.example.songer.Models.Album;

public class SongController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;


    @GetMapping("/allsongs")
    public String getSongs(Model model) {
        model.addAttribute("song", new Song());
        model.addAttribute("songs", songRepository.findAll()); // for the results table
        model.addAttribute("albums", albumRepository.findAll()); // for the select options
        return "allSongs.html";
    }


    @PostMapping("/addSong")
    public RedirectView addSong(@ModelAttribute Song song) {
        System.out.println(song.getAlbum().getSongs());
        songRepository.save(song);
        return new RedirectView("/allSongs");
    }


}
