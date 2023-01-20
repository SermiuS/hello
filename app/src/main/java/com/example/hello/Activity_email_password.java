package com.example.hello;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Activity_email_password extends AppCompatActivity implements android.view.View.OnClickListener {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    EditText ETemail;
    EditText ETpassword;

    CheckBox rememberMe;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_password);

        mAuth = FirebaseAuth.getInstance();

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null) {
                    // user signed in

                } else {
                    //user is signed out

                }
            }
        };

        ETemail = (EditText)findViewById(R.id.et_email);
        ETpassword = (EditText)findViewById(R.id.et_password);


        /////////////
        rememberMe=findViewById(R.id.remember);

        sharedPreferences=getSharedPreferences("LoginPrefs", MODE_PRIVATE);
        editor=sharedPreferences.edit();

        String mail=sharedPreferences.getString("email","No Email Stored");
        String name=sharedPreferences.getString("name","Un Named");
        String passwords=sharedPreferences.getString("password","");
        ETemail.setText(mail);
        ETpassword.setText(passwords);



        findViewById(R.id.signin).setOnClickListener(this);
        findViewById(R.id.regist).setOnClickListener(this);


        Button forget = (Button)findViewById(R.id.forget);
        forget.setOnClickListener(new android.view.View.OnClickListener(){

            public void onClick(View view) {
                Intent aizmirsi = new Intent(Activity_email_password.this,Aizmirsi.class);
                startActivity(aizmirsi);
            }
        });

        }


    @Override
    public void onClick(android.view.View view)
    {
        if (view.getId() == R.id.signin) {
            signing(ETemail.getText().toString(),ETpassword.getText().toString());
        } else if (view.getId() == R.id.regist) {
            registracija(ETemail.getText().toString(),ETpassword.getText().toString());
        }
    }

        public void signing(String email, String password) {
            if (!TextUtils.isEmpty(email)) {
                if (!TextUtils.isEmpty(password)) {
                    mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {
                                Toast.makeText(Activity_email_password.this, "Sign in", Toast.LENGTH_SHORT).show();
                                Intent SIGN = new Intent(Activity_email_password.this,ChosePl.class);
                                startActivity(SIGN);

                                //////
                                if(rememberMe.isChecked()){
                                    editor.putString("email",ETemail.getText().toString());
                                    editor.putString("password",ETpassword.getText().toString());
                                    editor.commit();
                                }else{
                                    editor.putString("email","");
                                    editor.putString("password","");
                                    editor.commit();
                                }



                            } else
                                Toast.makeText(Activity_email_password.this, "Non sign in", Toast.LENGTH_SHORT).show();


                        }
                    });
                } else {
                    Toast.makeText(Activity_email_password.this, "Enter password", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(Activity_email_password.this, "Enter email", Toast.LENGTH_SHORT).show();
            }

}

        public void registracija(String email, String password){
       //Эту команду используй, если не пустые, то выполнять код, если пустые то вывод ошибки     if(!TextUtils.isEmpty(email,password){
            if (!TextUtils.isEmpty(email)) {
                if (!TextUtils.isEmpty(password)) {
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>(){
                     @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Activity_email_password.this, "Register in", Toast.LENGTH_SHORT).show();
                    }else
                        Toast.makeText(Activity_email_password.this, "Non register", Toast.LENGTH_SHORT).show();
                }

            });
                } else {
                    Toast.makeText(Activity_email_password.this, "Enter password", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(Activity_email_password.this, "Enter email", Toast.LENGTH_SHORT).show();
            }
        }



}