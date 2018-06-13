package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicListActivity extends AppCompatActivity {
    private ListView listView;
    private SongAdapter itemsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list_);
        getSupportActionBar().setTitle(getResources().getString(R.string.Library));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent getIntent = getIntent();
        int selection = (int) getIntent.getSerializableExtra("selection");
        ArrayList<Song> songList = new ArrayList<>();
        switch (selection){
            case 1:
                songList.add(new Song("Reggae", "I Don't Wanna Wait", 3.5, "SOJA", "", "Born In Babylon"));
                songList.add(new Song("Reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Here Comes Trouble", 3.5, "Chronixx", "", "Dread and Treble"));
                songList.add(new Song("Reggae", "She Still Loves Me", 3.5, "SOJA", "Collie Buddz", "Amid The Noise And Haste"));
                songList.add(new Song("Reggae", "The Mountain", 3.5, "Trevor Hall", "", "Everything Everytime Everywhere"));
                songList.add(new Song("Reggae", "Sorry", 3.5, "SOJA", "", "Get Wiser"));
                songList.add(new Song("Reggae", "You and Me", 3.5, "SOJA", "Chris Boomer", "Born In Babylon"));
                songList.add(new Song("Reggae", "Moving Stones", 3.5, "SOJA", "", "Poetry In Motion"));
                songList.add(new Song("Reggae", "Mentality", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Everything Changes", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Not Done Yet", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Be With Me Now", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Tell Me", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Gone Today", 3.5, "SOJA", "", "Strength To Survive"));
                break;
            case 2:
                songList.add(new Song("Hip Hop", "Never Quit", 3.5, "Benjah", "", "Motives"));
                songList.add(new Song("Hip Hop", "Angels", 3.5, "Chance The Rapper", "Saba", "Coloring Book"));
                songList.add(new Song("Hip Hop", "Beware", 3.5, "Jidenna", "", "The Chief"));
                songList.add(new Song("Hip Hop", "Go To Work", 3.5, "Benjah", "", "Motives"));
                songList.add(new Song("Hip Hop", "Peice Of Mind", 3.5, "Joey", "", "Joey"));
                songList.add(new Song("Hip Hop", "Sunday Candy", 3.5, "Social Experiment", "", "Surf"));
                songList.add(new Song("Hip Hop", "Bang Bang", 3.5, "K'NAAN", "Adam Levine", "Troubadour"));
                break;
            case 3:
                songList.add(new Song("Dance", "Ovaload", 3.5, "Gentleman", "Sean Paul", "OvaLoad"));
                songList.add(new Song("Dance", "Front of the Line", 3.5, "Major Lazer", "M. Montano, Konshens", "Know No Better"));
                songList.add(new Song("Dance", "Sell My Gun", 3.5, "Chronixx", "", "Sell My Gun"));
                break;
            case 4:songList.add(new Song("Rock", "Dream On", 3.5, "Aerosmith", "", "Aerosmith"));
                songList.add(new Song("Rock", "Feeling This", 3.5, "blink-182", "", "blink-182"));
                songList.add(new Song("Rock", "Johnny B. Goode", 3.5, "Chuck Berry", "", "Barry On Top"));
                break;
            case 5: break;
            default: break;
        }
        itemsAdapter = new SongAdapter(this, songList);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MusicListActivity.this, MusicPlayerActivity.class);
                intent.putExtra("curSong", itemsAdapter.getItem(position));
                startActivity(intent);
            }
        });

    }


}
