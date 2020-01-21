package com.daylong.songr;


public class Album {

    public String albumTitle;
    public String albumArtist;
    private int albumSongCount;
    private double albumLength;
//    img bufferedimage;

    public Album(String albumTitle, String albumArtist, int albumSongCount, double albumLength) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.albumSongCount = albumSongCount;
        this.albumLength = albumLength;
//        this.img = URL;
    }

    public int getAlbumSongCount(){
        return this.albumSongCount;
    }

    public double getAlbumLength(){
        return this.albumLength;
    }

    public String toString(){
        return String.format("%s : was created by : %s", this.albumTitle, this.albumArtist);
    }
}