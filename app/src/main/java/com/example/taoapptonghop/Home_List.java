package com.example.taoapptonghop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home_List extends AppCompatActivity {

    private RecyclerView recThuVien;
    private List<ThuVien> thuVienList;
    private ThuVienAdapter thuVienAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_list);
        getSupportActionBar().hide();

        BottomNavigationView navigationView = findViewById(R.id.bottomNav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(getApplicationContext(), "Home",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Home_List.this, Home.class);
                        startActivity(i);
                        break;
                    case R.id.profile:
                        Toast.makeText(getApplicationContext(), "Profile",Toast.LENGTH_SHORT).show();
                        Intent i1 = new Intent(Home_List.this, Profile.class);
                        startActivity(i1);
                        break;
                    case R.id.list:
                        Toast.makeText(getApplicationContext(), "List",Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(Home_List.this, Home_List.class);
                        startActivity(i2);
                        break;
                    case R.id.signin:
                        Toast.makeText(getApplicationContext(), "SignIn",Toast.LENGTH_SHORT).show();
                        Intent i3 = new Intent(Home_List.this, MainActivity.class);
                        startActivity(i3);
                        break;
                    case R.id.signup:
                        Toast.makeText(getApplicationContext(), "SignUp",Toast.LENGTH_SHORT).show();
                        Intent i4 = new Intent(Home_List.this, SignUp.class);
                        startActivity(i4);
                        break;

                }
                return true;
            }
        });

        recThuVien = findViewById(R.id.rc_list);
        thuVienList = new ArrayList<>();

        ThuVien thuvien1 = new ThuVien("Giáo trình ","Khoa","A1+A2",R.drawable.img_giaotrinh);
        ThuVien thuvien2 = new ThuVien("Đồ án","Khoa Điện ","A3+A4",R.drawable.img_doan);
        ThuVien thuvien3 = new ThuVien("Sách tham khảo","Khoa Điện ","B",R.drawable.img_sachthamkhao);
        ThuVien thuvien4 = new ThuVien("Sách pháp luật","Pháp luật và đời sống","C",R.drawable.img_sachphapluat);
        ThuVien thuvien5 = new ThuVien("Báo","Kinh Tế, Thể Thao , ..","Kệ sát cửa",R.drawable.img_bao);
        ThuVien thuvien6 = new ThuVien("Tiểu thuyết ","Đời sống, Tình cảm, Công việc...","Tầng 2",R.drawable.img_tieuthuyet);
        ThuVien thuvien7 = new ThuVien("Truyện ","Đời sống, Tình cảm, Công việc...","Tầng 2",R.drawable.img_truyen);

        thuVienList.add(thuvien1);
        thuVienList.add(thuvien2);
        thuVienList.add(thuvien3);
        thuVienList.add(thuvien4);
        thuVienList.add(thuvien5);

        thuVienAdapter =  new ThuVienAdapter(thuVienList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recThuVien.setLayoutManager(linearLayoutManager);
        recThuVien.setAdapter(thuVienAdapter);
    }
}