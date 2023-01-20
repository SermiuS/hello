package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Musican_lv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musican_lv);

        Button Back = (Button)findViewById(R.id.Back);
        Button Mocart = (Button)findViewById(R.id.Mocart);
        Button Bax = (Button)findViewById(R.id.Bax);
        Button Vivaldi = (Button)findViewById(R.id.Vivaldi);
        Button Bethoven = (Button)findViewById(R.id.Bethoven);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Mocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mocartRU = new Intent(Musican_lv.this,Mocart_lv.class);
                startActivity(mocartRU);
            }
        });

        Bax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baxLv = new Intent(Musican_lv.this,Bah_lv.class);
                startActivity(baxLv);
            }
        });

        Vivaldi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vivaldiLv= new Intent (Musican_lv.this,Vivaldi_lv.class);
                startActivity(vivaldiLv);
            }
        });

        Bethoven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bethovenLv= new Intent (Musican_lv.this,Bethoven_lv.class);
                startActivity(bethovenLv);
            }
        });

    }
}
