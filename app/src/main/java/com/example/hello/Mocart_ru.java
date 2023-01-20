package com.example.hello;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.IOException;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Mocart_ru extends AppCompatActivity {
    MediaPlayer mPlayer;
    ImageButton startButton, pauseButton, stopButton;
    SeekBar volumeControl;
    AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mocart_ru);

      /*  Button Back = (Button) findViewById(R.id.Back);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        */

    /*    mPlayer = MediaPlayer.create(this, R.raw.mocart);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlay();
            }
        });
        */

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curValue = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        volumeControl = (SeekBar) findViewById(R.id.volumeControl);
        volumeControl.setMax(maxVolume);
        volumeControl.setProgress(curValue);
        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ////////////////

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










    }

 /*   private void stopPlay() {
        mPlayer.stop();
        pauseButton.setEnabled(false);
        stopButton.setEnabled(false);
        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
            startButton.setEnabled(true);
        } catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
*/



//работать тут
   /*     public void pause (View view){

            mPlayer.pause();
            startButton.setEnabled(true);
            pauseButton.setEnabled(false);
            stopButton.setEnabled(true);

        }
        public void stop (View view){
            stopPlay();
        }
        @Override
        public void onDestroy () {
            super.onDestroy();
            if (mPlayer.isPlaying()) {
                stopPlay();
            }
        }

    }*/



    }