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

    public List<AlbumSongs> songsFromAlbum;

    private String albumTitle;
    private String albumArtist;
    private Integer albumSongCount;
    private Integer albumLength;
    private String albumCover;

    public Album(String albumTitle, String albumArtist, Integer albumSongCount, Integer albumLength, String albumCover) {
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

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", albumSongs=" + songsFromAlbum +
                ", albumTitle='" + albumTitle + '\'' +
                ", albumArtist='" + albumArtist + '\'' +
                ", albumSongCount=" + albumSongCount +
                ", albumLength=" + albumLength +
                ", albumCover='" + albumCover + '\'' +
                '}';
    }
}