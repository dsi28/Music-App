package com.example.android.musicapp;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
public class Song implements Parcelable {
    private String genre;
    private String name;
    private double length;
    private String mainArtist;
    private String featArtist;
    private String displayArtist;
    private String album;
    private int score=10;
    private int pic;
    public Song(String genre, String name, double length, String mainArtist, String featArtist, String album, int img) {
        setGenre(genre);
        setName(name);
        setLength(length);
        setMainArtist(mainArtist);
        setFeatArtist(featArtist);
        setAlbum(album);
        setDisplayArtist();
        setPic(img);
    }
    public void noLikeSong(){
        score--;
    }
    public void likeSong(){
        score++;
    }
    public String displaySongInfo(){
        return name+"\n"+displayArtist;
    }
    public String getDisplayArtist() {
        return displayArtist;
    }
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
        return score+"";
    }
    public void setDisplayArtist(){
        if (featArtist.equals("")){
            displayArtist= mainArtist;
        }else {
            displayArtist = mainArtist + ", " + featArtist;
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
    protected Song(Parcel in) { // the order of this has to be same as write to parcel method
        genre = in.readString();
        name = in.readString();
        length = in.readDouble();
        mainArtist = in.readString();
        featArtist = in.readString();
        displayArtist = in.readString();
        album = in.readString();
        score = in.readInt();
        pic= in.readInt();
    }
    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }
        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) { // the order of this has to be the same as the protected Song contructor
        dest.writeString(genre);
        dest.writeString(name);
        dest.writeDouble(length);
        dest.writeString(mainArtist);
        dest.writeString(featArtist);
        dest.writeString(displayArtist);
        dest.writeString(album);
        dest.writeInt(score);
        dest.writeInt(pic);
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        if(pic==0) this.pic=pic;
        else this.pic = pic;
    }
}
