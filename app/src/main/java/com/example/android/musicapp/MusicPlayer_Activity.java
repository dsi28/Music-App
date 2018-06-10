package com.example.android.musicapp;

import android.content.Intent;
import android.media.Image;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MusicPlayer_Activity extends AppCompatActivity {
    public boolean songStatus=true;//true= playing, false=paused

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player_);
        ButterKnife.bind(this);
    }
    @BindView(R.id.playerPic)  ImageView songPic;
    @BindView(R.id.playerPauseSong) ImageView pauseSong;
    @BindView(R.id.playerPausePic) ImageView pausePic;
    @BindView(R.id.playerPlaySong) ImageView playSong;
    @BindView(R.id.playerPlayPic) ImageView playPic;
    @BindView(R.id.playerSongNameTV) TextView songName;
    @BindView(R.id.playerArtist) TextView artistName;
    @BindView(R.id.playerSongBar) SeekBar songBar;
    @OnClick(R.id.playerNoLike)
    public void noLikeSong(){
        songPic.setBackgroundColor(getResources().getColor(R.color.noLike));
        songName.setTextColor(getResources().getColor(R.color.noLike));
    }
    @OnClick(R.id.playerLike)
    public void likeSong(){
        songPic.setBackgroundColor(getResources().getColor(R.color.like));
        songName.setTextColor(getResources().getColor(R.color.like));
    }
    @OnClick(R.id.playerPauseSong)
    public void pauseSong(){
        pauseSong.setVisibility(View.INVISIBLE);
        playSong.setVisibility(View.VISIBLE);
        new CountDownTimer(500, 500) { // 5000 = 5 sec
            public void onTick(long millisUntilFinished) {
                pausePic.setVisibility(View.VISIBLE);
            }
            public void onFinish() {
                pausePic.setVisibility(View.INVISIBLE);
            }
        }.start();
    }
    @OnClick(R.id.playerPlaySong)
    public void playSong(){
        playSong.setVisibility(View.INVISIBLE);
        pauseSong.setVisibility(View.VISIBLE);
        new CountDownTimer(500, 500) { // 5000 = 5 sec
            public void onTick(long millisUntilFinished) {
                playPic.setVisibility(View.VISIBLE);
            }
            public void onFinish() {
                playPic.setVisibility(View.INVISIBLE);
            }
        }.start();
    }

    @OnClick(R.id.playerSongInfo)
    public void goToDetails(){
//        Intent intent = new Intent(MusicPlayer_Activity.this, SongDetails.class);
//        startActivity(intent);
    }
}
