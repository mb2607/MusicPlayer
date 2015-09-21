package com.extmbt.musicplayer;

/**
 * Created by EXTMBT on 16-09-2015.
 */
public class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public String getArtist() {return artist;}
    public long getId() {return id;}
    public String getTitle() {return title;}


}
