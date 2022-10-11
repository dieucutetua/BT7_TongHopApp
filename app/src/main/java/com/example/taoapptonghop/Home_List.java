package com.example.taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Home_List extends AppCompatActivity {

    ListView listView;
    ArrayList<ThuVien> arrayList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_list);
        getSupportActionBar().hide();

        arrayList = new ArrayList<>();
        ListView listView =(ListView)findViewById(R.id.list);
        arrayList.add(new ThuVien("Giáo trình ","Khoa","A1+A2",R.drawable.img_giaotrinh));
        arrayList.add(new ThuVien("Đồ án","Khoa Điện ","A3+A4",R.drawable.img_doan));
        arrayList.add(new ThuVien("Sách tham khảo","Khoa Điện ","B",R.drawable.img_sachthamkhao));
        arrayList.add(new ThuVien("Sách pháp luật","Pháp luật và đời sống","C",R.drawable.img_sachphapluat));
        arrayList.add(new ThuVien("Báo","Kinh Tế, Thể Thao , ..","Kệ sát cửa",R.drawable.img_bao));
        arrayList.add(new ThuVien("Tiểu thuyết ","Đời sống, Tình cảm, Công việc...","Tầng 2",R.drawable.img_tieuthuyet));
        arrayList.add(new ThuVien("Truyện ","Đời sống, Tình cảm, Công việc...","Tầng 2",R.drawable.img_truyen));
        adapter = new Adapter(Home_List.this, R.layout.items_listview, arrayList);
        listView.setAdapter(adapter);

    }
}