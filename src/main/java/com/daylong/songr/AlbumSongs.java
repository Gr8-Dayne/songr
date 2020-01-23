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
    public long trackNumber;
    public String Album;

    public AlbumSongs(){

    }

    public AlbumSongs(String songName, int songDuration){
        this.songName = songName;
        this.songName = songName;
        this.songDuration = songDuration;
        this.songDuration = songDuration;
        this.trackNumber = trackNumber;
        this.trackNumber = trackNumber;
        this.Album = Album;
        this.Album = Album;
    }

    @Override
    public String toString() {
        return "AlbumSongs{" +
                "id=" + id +
                ", album=" + album +
                ", songName='" + songName + '\'' +
                ", songDuration=" + songDuration +
                ", trackNumber=" + trackNumber +
                ", Album='" + Album + '\'' +
                '}';
    }
}
