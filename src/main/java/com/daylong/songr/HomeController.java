package com.daylong.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller public class HomeController {

    // This connects App to postgres. Allows us to CRUD
    @Autowired
    AlbumRepo albumRepo;

    @GetMapping("/") public String getHomePage(){
        return "home";
    }

    // Note that input is required in "{input}" field
    // Credit to Shane for helping me through this mapping
    @GetMapping("/capitalize/{input}") public String capitalize(@PathVariable  String input, Model m){
        String word = input.toUpperCase();
        m.addAttribute("capital", word);
        return "capitalize";
    }

    @GetMapping("/albums") public String getAlbums(Model m){
//        Album[] daftAlbums = new Album[]{
//                new Album("Random Access Memories", "Daft Punk", 13, 74.24, "https://img.discogs.com/FU2NGUXkaKMzJZ8queTYGbylB4U=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-4570505-1368699003-9153.jpeg.jpg"),
//                new Album("Human After All", "Daft Punk", 10, 45.38, "https://upload.wikimedia.org/wikipedia/en/thumb/0/0d/Humanafterall.jpg/220px-Humanafterall.jpg"),
//                new Album( "Homework", "Daft Punk", 16, 73.53, "https://static.raru.co.za/cover/2014/05/03/135503-m.jpg?v=1399102231")
//        };
        List<Album> albums = albumRepo.findAll();
        m.addAttribute("albumsPunk", albums);
        return "albums";
    }

    @PostMapping("/albums") public RedirectView postAlbums(String title, String artist, int songs, double length, String url){
        Album newAlbum = new Album(title, artist, songs, length, url);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }

//    @GetMapping("/error") public String errorOccurred(){
//        return "error";
//    }
}
