package com.example.taoapptonghop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class Main_List extends AppCompatActivity{
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        getSupportActionBar().hide();
        BottomNavigationView navigationView = findViewById(R.id.bottomNav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(getApplicationContext(), "Home",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Main_List.this, Home.class);
                        startActivity(i);
                        break;
                    case R.id.profile:
                        Toast.makeText(getApplicationContext(), "Profile",Toast.LENGTH_SHORT).show();
                        Intent i1 = new Intent(Main_List.this, Profile.class);
                        startActivity(i1);
                        break;
                    case R.id.list:
                        Toast.makeText(getApplicationContext(), "List",Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(Main_List.this, Main_List.class);
                        startActivity(i2);
                        break;
                    case R.id.signin:
                        Toast.makeText(getApplicationContext(), "SignIn",Toast.LENGTH_SHORT).show();
                        Intent i3 = new Intent(Main_List.this, MainActivity.class);
                        startActivity(i3);
                        break;
                    case R.id.signup:
                        Toast.makeText(getApplicationContext(), "SignUp",Toast.LENGTH_SHORT).show();
                        Intent i4 = new Intent(Main_List.this, SignUp.class);
                        startActivity(i4);
                        break;

                }
                return true;
            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.main_list);

        ViewHome viewHome = new ViewHome(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewHome);

        tabLayout.setupWithViewPager(viewPager);
    }
}