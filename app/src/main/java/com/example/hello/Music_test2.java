package com.example.hello;

import android.content.Context;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;

import java.io.IOException;

public class Music_test2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_test2);

        String url = "https://firebasestorage.googleapis.com/v0/b/words-68323.appspot.com/o/mocart.mp3?alt=media&token=d4b2d49e-eb72-4df2-97ae-26c63aebe568";
        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

        final ImageButton start = (ImageButton) findViewById(R.id.start);
        final ImageButton pause = (ImageButton)findViewById(R.id.pause);
        final ImageButton stop = (ImageButton)findViewById(R.id.stop);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        Button Back = (Button) findViewById(R.id.Back);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                finish();
            }
        });

 ////

        }
    }