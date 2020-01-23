package com.daylong.songr;


import javax.persistence.*;

@Entity
public class AlbumSongs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Album album;

    public String songName;
    public int songDuration;

    public AlbumSongs(){

    }

    public AlbumSongs(String songName, int songDuration){
        this.songName = songName;
        this.songName = songName;
        this.songDuration = songDuration;
        this.songDuration = songDuration;
    }

    @Override
    public String toString() {
        return "AlbumSongs{" + "id=" + id + ", album=" + album + ", songName='" + songName + '\'' + ", songDuration=" + songDuration + '}';
    }
}
