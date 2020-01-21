package com.daylong.songr;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller public class HomeController {

    @GetMapping("/") public String getHomePage(@RequestParam(defaultValue = "GENERAL KANOBI", required=false) String user, Model m){
        m.addAttribute("user", user);
        return "home";
    }

    // Note that input is required in "{input}" field
    // Credit to Shane for helping me through this mapping
    @GetMapping("/capitalize/{input}") public String capitalize(@PathVariable  String input, Model m){
        String word = input.toUpperCase();
        m.addAttribute("capital", word);
        return "capitalize";
    }

    @GetMapping("/album") public String getAlbums(Model m){
        Album[] daftAlbums = new Album[]{
                new Album("Random Access Memories", "Daft Punk", 13, 74.24, "https://img.discogs.com/FU2NGUXkaKMzJZ8queTYGbylB4U=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-4570505-1368699003-9153.jpeg.jpg"),
                new Album("Human After All", "Daft Punk", 10, 45.38, "https://upload.wikimedia.org/wikipedia/en/thumb/0/0d/Humanafterall.jpg/220px-Humanafterall.jpg"),
                new Album( "Homework", "Daft Punk", 16, 73.53, "https://static.raru.co.za/cover/2014/05/03/135503-m.jpg?v=1399102231")
        };
        m.addAttribute("albumsPunk", daftAlbums);
        return "albums";
    }
}
