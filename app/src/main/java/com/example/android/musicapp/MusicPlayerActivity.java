package com.example.android.musicapp;

import android.content.Intent;
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

public class MusicPlayerActivity extends AppCompatActivity {
    private int like=0;
    private Song curSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player_);
        ButterKnife.bind(this);
        Intent getIntent= getIntent();
        curSong = getIntent.getParcelableExtra("curSong");
        songName.setText(curSong.getName());
        artistName.setText(curSong.getMainArtist());
        songGenre.setText(curSong.getGenre());
        getSupportActionBar().setTitle(getResources().getString(R.string.Player));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @BindView(R.id.playerMusicListTypeTV) TextView songGenre;
    @BindView(R.id.playerPicIv)  ImageView songPic;
    @BindView(R.id.playerPauseSongIv) ImageView pauseSong;
    @BindView(R.id.playerPausePicIv) ImageView pausePic;
    @BindView(R.id.playerPlaySongIv) ImageView playSong;
    @BindView(R.id.playerPlayPicIv) ImageView playPic;
    @BindView(R.id.playerSongNameTV) TextView songName;
    @BindView(R.id.playerArtistTV) TextView artistName;
    @BindView(R.id.playerSongSB) SeekBar songBar;
    @OnClick(R.id.playerNoLikeIv)
    public void noLikeSong(){
        if (like==2){
            songPic.setBackgroundColor(getResources().getColor(R.color.noLike));
            songName.setTextColor(getResources().getColor(R.color.noLike));
            curSong.noLikeSong();
            curSong.noLikeSong();
            like=1;
        }else if(like!=1){
            songPic.setBackgroundColor(getResources().getColor(R.color.noLike));
            songName.setTextColor(getResources().getColor(R.color.noLike));
            curSong.noLikeSong();
            like=1;}
    }
    @OnClick(R.id.playerLikeIv)
    public void likeSong(){
        if(like==1) {
            songPic.setBackgroundColor(getResources().getColor(R.color.like));
            songName.setTextColor(getResources().getColor(R.color.like));
            curSong.likeSong();
            curSong.likeSong();
        }else if(like!=2){
        songPic.setBackgroundColor(getResources().getColor(R.color.like));
        songName.setTextColor(getResources().getColor(R.color.like));
        curSong.likeSong();
        like=2;}
    }
    @OnClick(R.id.playerPauseSongIv)
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
    @OnClick(R.id.playerPlaySongIv)
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
    @OnClick(R.id.playerSongInfoIv)
    public void goToDetails(){
        Intent intent = new Intent(MusicPlayerActivity.this, SongDetailsActivity.class);
        intent.putExtra("curSong", curSong);
        startActivity(intent);
    }
}
