package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Musican_eng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musican_eng);

        Button Mocart = (Button)findViewById(R.id.Mocart);
        Button Back = (Button)findViewById(R.id.Back);
        Button Bah = (Button)findViewById(R.id.Bax);
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
                Intent mocartENG = new Intent(Musican_eng.this,Mocart_eng.class);
                startActivity(mocartENG);
            }
        });

        Bah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bahENG = new Intent(Musican_eng.this,Bah_eng.class);
                startActivity(bahENG);
            }
        });

        Vivaldi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vivaldiEng= new Intent (Musican_eng.this,Vivaldi_eng.class);
                startActivity(vivaldiEng);
            }
        });

        Bethoven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bethovenEng= new Intent (Musican_eng.this,Bethoven_eng.class);
                startActivity(bethovenEng);
            }
        });


    }
}
