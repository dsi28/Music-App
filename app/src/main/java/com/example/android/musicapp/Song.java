package com.example.android.musicapp;

import android.graphics.drawable.Drawable;

public class Song {
    //private static int id;
    private String genre;
    private String name;
    private double length;
    private String mainArtist;
    private String featArtist;
    private String displayArtist;
    private String album;
    private int Score=10;
//    public Drawable pic;


    public Song(String genre, String name, double length, String mainArtist, String featArtist, String album) {
        //id++;
        setGenre(genre);
        setName(name);
        setLength(length);
        setMainArtist(mainArtist);
        setFeatArtist(featArtist);
        setAlbum(album);
        setDisplayArtist();
    }

    public String displaySongInfo(){
        return name+"\n"+displayArtist;
    }


    //get

    public String getDisplayArtist() {
        return displayArtist;
    }

//    public int getId() {
//        return id;
//    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getMainArtist() {
        return mainArtist;
    }

    public String getFeatArtist() {
        return featArtist;
    }

    public String getAlbum() {
        return album;
    }

    public String getScore() {
        return Score+"";
    }

//    public Drawable getPic() {
//        return pic;
//    }
//

    //set
    public void setDisplayArtist(){
        if (featArtist.equals("")){
            displayArtist= mainArtist;
        }else {
            displayArtist = mainArtist + ", " + featArtist;
            //cut off
        }
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setMainArtist(String mainArtist) {
        this.mainArtist = mainArtist;
    }

    public void setFeatArtist(String featArtist) {
        this.featArtist = featArtist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setScore(int score) {
        Score = score;
    }

//    public void setPic(Drawable pic) {
//        this.pic = pic;
//    }
}
