package com.daylong.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller public class HomeController {

    @GetMapping("/") public String getHomePage(@RequestParam(defaultValue = "TypeHere", required=false) String helloThere, Model m){
        m.addAttribute("username", helloThere);
        return "home";
    }

    @GetMapping("/album") public String getAlbums(Model m){
        Album[] daftAlbums = new Album[]{new Album("Random Access Memories", "Daft Punk", 13, 74.24), new Album( "Homework", "Daft Punk", 16, 73.53), new Album("Human After All", "Daft Punk", 10, 45.38)};
        m.addAttribute("albumsPunk", daftAlbums);
        return "albums";
    }

    @GetMapping("/helloWorld/{input}")
    public String getCapitalization(@PathVariable String input, Model m){
        m.addAttribute("All-Cap", input);
        return "hello friend";
    }
}
