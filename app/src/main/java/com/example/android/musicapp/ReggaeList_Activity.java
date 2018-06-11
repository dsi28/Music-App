package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ReggaeList_Activity extends AppCompatActivity {
    private ListView listView;
    private SongAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list_);

        ArrayList<Song> songList= new ArrayList<>();

                songList.add(new Song("Reggae", "I Don't Wanna Wait", 3.5, "SOJA", "", "Born In Babylon"));
                songList.add(new Song("Reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Here Comes Trouble", 3.5, "Chronixx", "", "Dread and Treble"));
                songList.add(new Song("Reggae", "She Still Loves Me", 3.5, "SOJA", "Collie Buddz", "Amid The Noise And Haste"));
                songList.add(new Song("Reggae", "The Mountain", 3.5, "Trevor Hall", "", "Everything Everytime Everywhere"));
                songList.add(new Song("Reggae", "Sorry", 3.5, "SOJA", "", "Get Wiser"));
                songList.add(new Song("Reggae", "You and Me", 3.5, "SOJA", "Chris Boomer", "Born In Babylon"));
                songList.add(new Song("Reggae", "Moving Stones", 3.5, "SOJA", "", "Poetry In Motion"));
                songList.add(new Song("Reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("Reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));


        itemsAdapter = new SongAdapter(this, songList);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Intent intent = new Intent(ReggaeList_Activity.this, MusicPlayer_Activity.class);
                 intent.putExtra("curSong", itemsAdapter.getItem(position));
                 startActivity(intent);
             }
         });

    }
}
