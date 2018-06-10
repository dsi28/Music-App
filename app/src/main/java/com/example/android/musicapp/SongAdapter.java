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
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the minwok word
        TextView songName = (TextView) listItemView.findViewById(R.id.sNameTV);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songName.setText(currentSong.getName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.aNameTV);
        artistName.setText(currentSong.getDisplayArtist());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView scoreTextView = (TextView) listItemView.findViewById(R.id.scoreTV);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        scoreTextView.setText(currentSong.getScore());

//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
//        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    public SongAdapter(Activity context, ArrayList<Song> songList){
        super(context, 0, songList);
    }


}
