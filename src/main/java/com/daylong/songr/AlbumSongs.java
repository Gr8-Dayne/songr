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
    public double songDuration;
    public int trackNumber;

    public AlbumSongs(){

    }

    public AlbumSongs(Long id, String songName, double songDuration, int trackNumber, Album album){
        this.id = id;
        this.songName = songName;
        this.songDuration = songDuration;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public long getId(){
        return this.id;
    }

    public String getSongName(){
        return "SongName: " + songName;
    }

    public double getSongDuration(){
        return this.songDuration;
    }

    public int getTrackNumber(){
        return this.trackNumber;
    }

    public String getSongsAlbum(){
        return this.album.toString();
    }

    @Override
    public String toString() {
        return "AlbumSongs{" +
                "id=" + id +
                ", album=" + album +
                ", songName='" + songName + '\'' +
                ", songDuration=" + songDuration +
                ", trackNumber=" + trackNumber +
                '}';
    }
}
