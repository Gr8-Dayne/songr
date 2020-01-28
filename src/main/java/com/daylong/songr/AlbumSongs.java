package com.daylong.songr;


import javax.persistence.*;

@Entity
public class AlbumSongs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Album album;

    private String songName;
    private Integer songDuration;
    private Integer trackNumber;

    public AlbumSongs(){}

    public AlbumSongs(String songName, Integer songDuration, Integer trackNumber, Album album){
        this.songName = songName;
        this.songDuration = songDuration;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public long getId(){
        return this.id;
    }

    public String getSongName(){
        return this.songName;
    }

    public Integer getSongDuration(){
        return this.songDuration;
    }

    public int getTrackNumber(){
        return this.trackNumber;
    }

    @Override
    public String toString() {
        return "Track Name: " + songName + ", Track Duration: " + songDuration + ", Track Number: " + trackNumber;
    }
}
