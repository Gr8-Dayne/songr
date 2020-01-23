package com.daylong.songr;


import javax.persistence.*;
import java.util.List;


@Entity
public class Album {

    // Id makes primary key of table
    @Id
    // GeneratedValue Starts at one and increments
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToMany(mappedBy = "album")

    public List<AlbumSongs> albumSongs;

    private String albumTitle;
    private String albumArtist;
    private int albumSongCount;
    private double albumLength;
    private String albumCover;

    public Album(String albumTitle, String albumArtist, int albumSongCount, double albumLength, String albumCover) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.albumSongCount = albumSongCount;
        this.albumLength = albumLength;
        this.albumCover = albumCover;
    }

    // Empty Constructor
    public Album(){

    }

    public String toString(){
        return String.format("%s :: created by %s.", this.albumTitle, this.albumArtist);
    }

    public String getAlbumCover(){
        return this.albumCover;
    }

    public String getAlbumTitle(){
        return this.albumTitle;
    }

    public String getAlbumArtist(){
        return this.albumArtist;
    }

    public String getAlbumSongCount(){
        return "Songs in album: " + this.albumSongCount;
    }

    public String getAlbumLength(){
        return "Total album run time: " + this.albumLength;
    }

    public long getId(){
        return id;
    }
}