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
    private double songDuration;
    private int trackNumber;

    public AlbumSongs(Long id, String songName, double songDuration, int trackNumber, Album songParent){
        this.id = id;
        this.songName = songName;
        this.songDuration = songDuration;
        this.trackNumber = trackNumber;
        this.songParent = songParent;
    }

    public AlbumSongs(){

    }

    public long getId(){
        return this.id;
    }

    public String getSongName(){
        return this.songName;
    }

    public double getSongDuration(){
        return this.songDuration;
    }

    public int getTrackNumber(){
        return this.trackNumber;
    }

    public String getSongParent(){
        return this.songParent.toString();
    }

    @Override
    public String toString() {
        return "AlbumSongs{" +
                "id=" + id +
                ", album=" + songParent +
                ", songName='" + songName + '\'' +
                ", songDuration=" + songDuration +
                ", trackNumber=" + trackNumber +
                '}';
    }
}
