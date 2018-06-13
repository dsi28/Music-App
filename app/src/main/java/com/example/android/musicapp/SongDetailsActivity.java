package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SongDetailsActivity extends AppCompatActivity {
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
        getSupportActionBar().setTitle(getResources().getString(R.string.Detail));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @BindView(R.id.detailsNameTV) TextView sName;
    @BindView(R.id.detailsArtistTV)TextView aName;
    @BindView(R.id.detailsGenreTV) TextView gName;
    @BindView(R.id.detailsScoreTV) TextView score;
    @BindView(R.id.albumDetailsTV) TextView album;
    @OnClick(R.id.detailsBtn)
    public void goToPlayer(){
        finish();
    }
}
