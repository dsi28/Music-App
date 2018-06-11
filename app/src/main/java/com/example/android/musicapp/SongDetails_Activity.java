package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SongDetails_Activity extends AppCompatActivity {
    private Song curSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);
        ButterKnife.bind(this);
        Intent getIntent= getIntent();
        curSong = getIntent.getParcelableExtra("curSong");
        sName.setText(curSong.getName());
        aName.setText(curSong.getDisplayArtist());
        gName.setText(curSong.getGenre());
        score.setText(curSong.getScore());
        album.setText(curSong.getAlbum());
    }

    @BindView(R.id.detailsName) TextView sName;
    @BindView(R.id.detailsArtist)TextView aName;
    @BindView(R.id.detailsGenre) TextView gName;
    @BindView(R.id.detailsScore) TextView score;
    @BindView(R.id.albumDetails) TextView album;
    @OnClick(R.id.detailsBtn)
    public void goToPlayer(){
        finish();

    }
}
