package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicList_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list_);

        ArrayList<Song> songList= new ArrayList<>();
        Intent intent = getIntent();
        int musicSelection = (int) intent.getSerializableExtra("listNum");

        switch (musicSelection){
            case 1:
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));
                break;
            case 2:
                songList.add(new Song("reggae", "Let you go", 3.5, "SOJA", "", "Strength To Survive"));

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
        }

        SongAdapter itemsAdapter = new SongAdapter(this, songList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Intent intent = new Intent(MusicList_Activity.this, MusicPlayer_Activity.class);
                 startActivity(intent);
             }
         });

    }
}
