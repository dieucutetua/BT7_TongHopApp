package com.example.taoapptonghop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Stack;

public class Profile extends AppCompatActivity {

    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();
        BottomNavigationView navigationView = findViewById(R.id.bottomNav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(getApplicationContext(), "Home",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Profile.this, Home.class);
                        startActivity(i);
                        break;
                    case R.id.profile:
                        Toast.makeText(getApplicationContext(), "Profile",Toast.LENGTH_SHORT).show();
                        Intent i1 = new Intent(Profile.this, Profile.class);
                        startActivity(i1);
                        break;
                    case R.id.list:
                        Toast.makeText(getApplicationContext(), "List",Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(Profile.this, Main_List.class);
                        startActivity(i2);
                        break;
                    case R.id.signin:
                        Toast.makeText(getApplicationContext(), "SignIn",Toast.LENGTH_SHORT).show();
                        Intent i3 = new Intent(Profile.this, MainActivity.class);
                        startActivity(i3);
                        break;
                    case R.id.signup:
                        Toast.makeText(getApplicationContext(), "SignUp",Toast.LENGTH_SHORT).show();
                        Intent i4 = new Intent(Profile.this, SignUp.class);
                        startActivity(i4);
                        break;

                }
                return true;
            }
        });

        btnLogout = (Button) findViewById(R.id.buttonBack);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Profile.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}