package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    public int buttonClicked;
    public boolean playDisplayed= false;
    public void setViewHighlight(){
        playImage.setVisibility(View.VISIBLE);
        playDisplayed=true;
        playImage.setVisibility(View.VISIBLE);
        btn1.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
        btn2.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
        btn3.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
        btn4.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
        btn5.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
        switch (buttonClicked){
            case 1:
                btn1.setBackgroundTintList(getResources().getColorStateList(R.color.selected));
                break;
            case 2:
                btn2.setBackgroundTintList(getResources().getColorStateList(R.color.selected));
                break;
            case 3:
                btn3.setBackgroundTintList(getResources().getColorStateList(R.color.selected));
                break;
            case 4:
                btn4.setBackgroundTintList(getResources().getColorStateList(R.color.selected));
                break;
            case 5:
                btn5.setBackgroundTintList(getResources().getColorStateList(R.color.selected));
                break;
            default:
                break;
        }
    }
    @OnClick(R.id.reggaeBtn)
    public void setButtonClicked1(){
        buttonClicked=1;
        setViewHighlight();
    }
    @OnClick(R.id.hipHopBtn)
    public void setButtonClicked2(){
        buttonClicked=2;
        setViewHighlight();
    }
    @OnClick(R.id.danceBtn)
    public void setButtonClicked3(){
        buttonClicked=3;
        setViewHighlight();
    }
    @OnClick(R.id.rockBtn)
    public void setButtonClicked4(){
        buttonClicked=4;
        setViewHighlight();
    }
    @OnClick(R.id.myMusicBtn)
    public void setButtonClicked5(){
        buttonClicked=5;
        setViewHighlight();
    }
    @OnClick(R.id.mainPlayIv)
    public void test(){
        if(playImage.getVisibility() == View.VISIBLE){
            Intent goMusicList = new Intent(MainActivity.this, MusicListActivity.class);
            goMusicList.putExtra("selection", buttonClicked);
            startActivity(goMusicList);
        }
    }
    @BindView(R.id.reggaeBtn) Button btn1;
    @BindView(R.id.hipHopBtn) Button btn2;
    @BindView(R.id.danceBtn) Button btn3;
    @BindView(R.id.rockBtn) Button btn4;
    @BindView(R.id.myMusicBtn) Button btn5;
    @BindView(R.id.mainPlayIv) ImageView playImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butterknife.ButterKnife.bind(this);
    }
}
