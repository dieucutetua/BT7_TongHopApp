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
        setContentView(R.layout.activity_form_list_view);
        getSupportActionBar().hide();

        arrayList = new ArrayList<>();
        ListView listView =(ListView)findViewById(R.id.list);
        arrayList.add(new ThuVien("Nước ép","Thái xanh đặc biệt ","6$",R.drawable.img));
        arrayList.add(new ThuVien("Nước ép","Thái xanh đặc biệt ","6$",R.drawable.img));
        adapter = new Adapter(Home_List.this, R.layout.items_listview, arrayList);
        listView.setAdapter(adapter);

    }
}