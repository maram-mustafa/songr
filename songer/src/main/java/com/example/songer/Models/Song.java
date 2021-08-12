package com.example.songer.Models;


import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trackNumber;
    private String title;
    private int length;

    @ManyToOne
    private Album album;  // create instance from album


    public Song(){   //default constroctur
    }

    public Song(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Song{" +
                "trackNumber=" + trackNumber +
                ", title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
