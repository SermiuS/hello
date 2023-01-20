package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    TextView Result;
    TextView Result2;
    EditText nickname1;
    EditText nickname2;
    Button save;

    DatabaseReference databaseSpele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String uid = ((FirebaseUser) user).getUid();



        databaseSpele =  FirebaseDatabase.getInstance().getReference("Spele").child(uid); //kada ir datubaze


        nickname1 = (EditText) findViewById(R.id.nickname1);
        nickname2 = (EditText)findViewById(R.id.nickname2);
        save = (Button) findViewById(R.id.save);
        Result = (TextView)findViewById(R.id.Result);
        Result2 = (TextView)findViewById(R.id.Result2);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saves();
            }
        });
    }

    private void saves(){
        String nick = nickname1.getText().toString().trim();
        String result = Result.getText().toString().trim();

        String nick2 = nickname2.getText().toString().trim();
        String result2 = Result2.getText().toString().trim();

        if(!TextUtils.isEmpty(nick)){
            if(!TextUtils.isEmpty(nick2)) {
                String id = databaseSpele.push().getKey();


                Nicks nicks = new Nicks(nick, result, nick2, result2);

                databaseSpele.child(id).setValue(nicks);

                Toast.makeText(this, "Nick added", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"You shood enter a nickname", Toast.LENGTH_LONG).show();
            }

        }else{
            Toast.makeText(this,"You shood enter a nickname", Toast.LENGTH_LONG).show();
        }
    }


    int resSum = 0;
    int resSum2 = 0;

    public void onButtonClick3(View n){
        String[] words = {"SOLO","SUN","MOTHER","BOY",
                "DOG","CAT","DREAM","SPIRIT","SONG","CRIMINAL",
                "BLOOD","KNEES","GIRLFRIEND","DAD","ANIMAL","FEELING",
                "SHOES","CONTROL","CHURCH","FRIEND","DARKNESS","SILENCE",
                "HEATHENS","ROOM","WORLD","PAIN","AGE","RAIN",
                "FIRE","PIRATES","ANGEL","HEART","DAY","NIGHT",
                "MOON","PLANE","FAMILY","WAY","LIFE","ALWAYS",
                "BLUE","GREEN","OCEAN","ISLAND","KING","LIGHT",
                "WOMAN","MAN","POKER","FACE","ROMANCE","HELLO",
                "CHAMPIONS","ARMY","NOTHING","BED","EARTH","SNOW"};

        Random generator = new Random();
        int randomIndex=generator.nextInt(words.length);

        TextView resText = (TextView)findViewById(R.id.textView);
        resText.setText(words[randomIndex]);
    }

    public void onButtonClick(View v) {


        TextView resText = (TextView) findViewById(R.id.Result);

        resSum = resSum + 1;
        resText.setText(Integer.toString(resSum));
    }

    public void onButtonClick2(View v) {

        TextView resText = (TextView) findViewById(R.id.Result2);

        resSum2 = resSum2 + 1;
        resText.setText(Integer.toString(resSum2));
    }

    public void onButtonClickRestart(View v){
        resSum = 0;
        resSum2 = 0;
        TextView word = (TextView)findViewById(R.id.textView);
        word.setText("WORD");
        TextView resText = (TextView) findViewById(R.id.Result);
        TextView wesText = (TextView) findViewById(R.id.Result2);
        resText.setText(Integer.toString(resSum));
        wesText.setText(Integer.toString(resSum2));

    }

    public void onButtonClickBack(View v){
        finish();
    }
}
