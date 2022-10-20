package com.example.taoapptonghop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    EditText editUserName, editPassword;
    ImageView buttonSignUp, buttonSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        BottomNavigationView navigationView = findViewById(R.id.bottomNav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(getApplicationContext(), "Home",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, Home.class);
                        startActivity(i);
                        break;
                    case R.id.profile:
                        Toast.makeText(getApplicationContext(), "Profile",Toast.LENGTH_SHORT).show();
                        Intent i1 = new Intent(MainActivity.this, Profile.class);
                        startActivity(i1);
                        break;
                    case R.id.list:
                        Toast.makeText(getApplicationContext(), "List",Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(MainActivity.this, Home_List.class);
                        startActivity(i2);
                        break;
                    case R.id.signin:
                        Toast.makeText(getApplicationContext(), "SignIn",Toast.LENGTH_SHORT).show();
                        Intent i3 = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(i3);
                        break;
                    case R.id.signup:
                        Toast.makeText(getApplicationContext(), "SignUp",Toast.LENGTH_SHORT).show();
                        Intent i4 = new Intent(MainActivity.this, SignUp.class);
                        startActivity(i4);
                        break;

                }
                return true;
            }
        });


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