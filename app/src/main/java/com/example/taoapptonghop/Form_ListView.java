package com.example.taoapptonghop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Form_ListView extends AppCompatActivity {

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
        adapter = new Adapter(Form_ListView.this, R.layout.items_listview, arrayList);
        listView.setAdapter(adapter);

    }
}