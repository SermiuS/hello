package com.example.hello;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Viktorina_ru extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4,back;
    TextView score, question;

    private Questions mQuestions1 = new Questions();

    private String mAnswer1;
    private int mScore = 0;
    private int mQuestions1Lenght = mQuestions1.mQuestions1.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viktorina_ru);

        r = new Random();

        answer1 = (Button)findViewById(R.id.answer1);
        answer2 = (Button)findViewById(R.id.answer2);
        answer3 = (Button)findViewById(R.id.answer3);
        answer4 = (Button)findViewById(R.id.answer4);
        back = (Button)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        score = (TextView)findViewById(R.id.score);
        question = (TextView)findViewById(R.id.question);

        score.setText("Результат " + mScore);

        updateQuestions1(r.nextInt(mQuestions1Lenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer1){
                    mScore++;
                    score.setText("Результат " + mScore);
                    updateQuestions1(r.nextInt(mQuestions1Lenght));
                }else{
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer1){
                    mScore++;
                    score.setText("Результат " + mScore);
                    updateQuestions1(r.nextInt(mQuestions1Lenght));
                }else{
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer1){
                    mScore++;
                    score.setText("Результат " + mScore);
                    updateQuestions1(r.nextInt(mQuestions1Lenght));
                }else{
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer1){
                    mScore++;
                    score.setText("Результат " + mScore);
                    updateQuestions1(r.nextInt(mQuestions1Lenght));
                }else{
                    gameOver();
                }
            }
        });

    }

    private void updateQuestions1(int num){
        question.setText(mQuestions1.getQuestion1(num));
        answer1.setText(mQuestions1.getChoice11(num));
        answer2.setText(mQuestions1.getChoice21(num));
        answer3.setText(mQuestions1.getChoice31(num));
        answer4.setText(mQuestions1.getChoice41(num));

        mAnswer1 = mQuestions1.getCorrectAnswer1(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Viktorina_ru.this);
        alertDialogBuilder
                .setMessage("Ты проиграл! Результат " + mScore + " очков")
                .setCancelable(false)
                .setPositiveButton("Новая игра",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),Viktorina_ru.class));
                            }
                        })
                .setNegativeButton("Выход",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
