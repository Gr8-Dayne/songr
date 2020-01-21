package com.daylong.songr;


public class Album {

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