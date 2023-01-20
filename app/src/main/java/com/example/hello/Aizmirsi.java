package com.example.hello;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Aizmirsi extends AppCompatActivity {

    private EditText Etemail;
    private Button jauns;
    private FirebaseAuth mAuth;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aizmirsi);

      /*  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false); */

        Etemail = (EditText)findViewById(R.id.email);
        jauns = (Button)findViewById(R.id.jauns);

        mAuth = FirebaseAuth.getInstance();

        jauns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Etemail.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(),"Ievadi Epastu",Toast.LENGTH_SHORT).show();
                    return;
                }

                mAuth.sendPasswordResetEmail(email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Aizmirsi.this, "Vēstule ir tavā ēpastā!", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(Aizmirsi.this, "Kļūda!", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });



    }

    public void onButtonClickBack(View v){
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
