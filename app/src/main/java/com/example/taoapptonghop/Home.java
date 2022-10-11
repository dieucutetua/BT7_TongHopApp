package com.example.taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView buttonProfile, buttonListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        buttonProfile = (ImageView) findViewById(R.id.Button1);
        buttonListView = (ImageView) findViewById(R.id.Button2);
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Profile.class);
                startActivity(i);
            }
        });
        buttonListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Home_List.class);
                startActivity(i);
            }
        });
    }
}