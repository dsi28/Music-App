package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    public int buttonClicked;



    @OnClick(R.id.mainPlay)
    public void test(){
        if(playImage.getVisibility() == View.VISIBLE){
            Intent goMusicList = new Intent(MainActivity.this, MusicList_Activity.class);
            goMusicList.putExtra("listNum",buttonClicked);
            startActivity(goMusicList);
        }

    }



    @OnClick(R.id.mainBtn1)
    public void setButtonClicked1(){
        buttonClicked=1;
        setViewHighlight();
    }
    @OnClick(R.id.mainBtn2)
    public void setButtonClicked2(){
        buttonClicked=2;
        setViewHighlight();
    }
    @OnClick(R.id.mainBtn3)
    public void setButtonClicked3(){
        buttonClicked=3;
        setViewHighlight();
    }
    @OnClick(R.id.mainBtn4)
    public void setButtonClicked4(){
        buttonClicked=4;
        setViewHighlight();
    }
    @OnClick(R.id.mainBtn5)
    public void setButtonClicked5(){
        buttonClicked=5;
        setViewHighlight();
    }

    public void setViewHighlight(){
        playImage.setVisibility(View.VISIBLE);
        switch (buttonClicked){
            case 1:
                btn1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                break;
            case 2:
                btn2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                break;
            case 3:
                btn3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                break;
            case 4:
                btn4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                break;
            case 5:
                btn5.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                break;
            default:
                break;
        }
    }


    @BindView(R.id.mainBtn1) Button btn1;
    @BindView(R.id.mainBtn2) Button btn2;
    @BindView(R.id.mainBtn3) Button btn3;
    @BindView(R.id.mainBtn4) Button btn4;
    @BindView(R.id.mainBtn5) Button btn5;
    @BindView(R.id.mainPlay) ImageView playImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butterknife.ButterKnife.bind(this);

    }
}
