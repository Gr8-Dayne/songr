package com.daylong.songr;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Album {

    // Id makes primary key of table
    @Id
    // GeneratedValue Starts at one and increments
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    public String albumTitle;
    public String albumArtist;
    private int albumSongCount;
    private double albumLength;
    public String albumCover;

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

    public String getAlbumCover(){
        return this.albumCover;
    }

    public String getAlbumSongCount(){
        return "Songs in album: " + this.albumSongCount;
    }

    public String getAlbumLength(){
        return "Total album run time: " + this.albumLength;
    }

    public String toString(){
        return String.format("%s :: created by %s.", this.albumTitle, this.albumArtist);
    }
}