package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chose_darbiba_ru extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_darbiba_ru);

        Button Game = (Button)findViewById(R.id.Game);
        Button Back = (Button)findViewById(R.id.Back);
        Button Musican = (Button)findViewById(R.id.Musican);
        Button Viktorina = (Button)findViewById(R.id.viktorina);

        Game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game = new Intent(Chose_darbiba_ru.this, MainActivity.class);
                startActivity(game);
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Musican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musican = new Intent(Chose_darbiba_ru.this, Musican_ru.class);
                startActivity(musican);
            }
        });

        Viktorina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viktorina = new Intent(Chose_darbiba_ru.this, Viktorina_ru.class);
                startActivity(viktorina);
            }
        });

    }
}
