package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song>{

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);
        TextView songName = (TextView) listItemView.findViewById(R.id.sNameTV);
        songName.setText(currentSong.getName());
        TextView artistName = (TextView) listItemView.findViewById(R.id.aNameTV);
        artistName.setText(currentSong.getDisplayArtist());
        TextView scoreTextView = (TextView) listItemView.findViewById(R.id.scoreTV);
        scoreTextView.setText(currentSong.getScore());
        return listItemView;
    }
    public SongAdapter(Activity context, ArrayList<Song> songList){
        super(context, 0, songList);
    }
}
