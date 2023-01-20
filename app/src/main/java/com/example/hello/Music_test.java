package com.example.hello;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class Music_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_test);
    }

    public void play_Song(View V) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try{
        mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/words-68323.appspot.com/o/mocart.mp3?alt=media&token=d4b2d49e-eb72-4df2-97ae-26c63aebe568");
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
     mediaPlayer.prepare();
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}