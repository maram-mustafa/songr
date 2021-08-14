package com.example.songer.Controller;

import com.example.songer.Models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.songer.repositories.AlbumRepository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

//    @GetMapping("/albums")
//
//    public String getAlbum(Model model){
//
//        Album album1 = new Album ("lost on you","LP",400,"https://media.vogue.co.uk/photos/5d547e68e566280008416125/3:4/w_1278,h_1704,c_limit/original");
//        Album album2 = new Album ("take me to church","hozier",500,"https://img.discogs.com/mlfy4neiaYzGcZwI-H5R7K7d0rM=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-7072911-1433081001-4666.jpeg.jpg");
//        Album album3 = new Album ("addicted to you","Avicii",600,"https://img.discogs.com/A7y1zcjBIopT4qIcHOMp_UZ0n-8=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-10275010-1499971568-8487.jpeg.jpg");
//
//        List<Album> albums= new ArrayList<Album>();
//        albums.add(album1);
//        albums.add(album2);
//        albums.add(album3);
//
//
//        model.addAttribute("albums",albums);
//        return "albums.html";
//    }

/////////////////////////////////////////////////// LAB 12 /////////////////////////////////////////////////////////////

    @GetMapping("/allAlbums")
    public String getAlbums(Model model){

        model.addAttribute("album", new Album());        // for data in form
        model.addAttribute("albums",albumRepository.findAll());  // for data in results
        return "allAlbums.html";
    }

    @PostMapping("/addAlbum")
    public RedirectView addAlbum(@ModelAttribute Album album){
        albumRepository.save(album);
        return new RedirectView("/allAlbums");
    }


}
