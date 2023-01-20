package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Musican_ru extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musican_ru);

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
               Intent mocartRU = new Intent(Musican_ru.this,Mocart_ru.class);
               startActivity(mocartRU);
           }
       });

      Bax.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent baxRu = new Intent(Musican_ru.this,Bah_ru.class);
              startActivity(baxRu);
          }
      });

      Vivaldi.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent vivaldiRu= new Intent (Musican_ru.this,Vivaldi_ru.class);
              startActivity(vivaldiRu);
          }
      });

        Bethoven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bethovenRu= new Intent (Musican_ru.this,Bethoven_ru.class);
                startActivity(bethovenRu);
            }
        });


    }
}
