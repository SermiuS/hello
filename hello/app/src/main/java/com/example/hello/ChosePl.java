package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChosePl extends AppCompatActivity {

    Button RU,eng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_pl);

       // Button eng = (Button)findViewById(R.id.eng);
        Button ru = (Button)findViewById(R.id.RU);
        Button lv = (Button)findViewById(R.id.lv);

      /*  eng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ienac = new Intent(ChosePl.this,Chose_darbiba.class);
                startActivity(ienac);
            }
        });
*/
        ru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ienacRU = new Intent(ChosePl.this,Chose_darbiba_ru.class);
                startActivity(ienacRU);
            }
        });

        lv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ienac = new Intent(ChosePl.this,Chose_darbiba_lv.class);
                startActivity(ienac);
            }
        });

    }
}
