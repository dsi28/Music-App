package com.example.android.musicapp;

import android.app.Activity;
import android.content.Context;
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
    public class ViewHolder{
        private TextView songNameVH;
        private TextView artistNameVH;
        private TextView scoreVH;
        ViewHolder(View v){
            songNameVH=(TextView) v.findViewById(R.id.sNameTV);
            artistNameVH=(TextView) v.findViewById(R.id.aNameTV);
            scoreVH=(TextView) v.findViewById(R.id.scoreTV);
        }
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;
        if(row==null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= inflater.inflate(R.layout.list_item, parent, false);
            holder= new ViewHolder(row);
            row.setTag(holder);
        }else{
            holder = (ViewHolder) row.getTag();
        }
        Song currentSong = getItem(position);
        holder.songNameVH.setText(currentSong.getName());
        holder.artistNameVH.setText(currentSong.getDisplayArtist());
        holder.scoreVH.setText(currentSong.getScore());
        return row;
    }
    public SongAdapter(Activity context, ArrayList<Song> songList){
        super(context, 0, songList);
    }
}
