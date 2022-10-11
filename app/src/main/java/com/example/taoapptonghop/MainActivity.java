package com.example.taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editUserName, editPassword;
    ImageView buttonSignUp, buttonSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        editUserName =(EditText)findViewById(R.id.txtUserName1);
        editPassword = (EditText) findViewById(R.id.txtPassword1);
        buttonSignIn = (ImageView) findViewById(R.id.btnSignin1);
        buttonSignUp = (ImageView) findViewById(R.id.btnSignup1);

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "1";
                String password = "1";
                if(editUserName.getText().toString().equals(username) && editPassword.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(), "Login successfully",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Home.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SignUp.class);
                startActivity(i);
            }
        });
    }
}