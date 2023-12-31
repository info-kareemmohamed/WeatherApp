package com.example.weatherapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.weatherapp.R;
import com.example.weatherapp.model.ToDay;
import com.example.weatherapp.recyclerview.RecyclerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView ,recyclerView2;
    private ArrayList<ToDay> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        list.add(new ToDay("25", "5AM"));
        list.add(new ToDay("30", "6PM"));
        list.add(new ToDay("35", "7PM"));
        list.add(new ToDay("20", "8PM"));
        list.add(new ToDay("25", "5PM"));
        list.add(new ToDay("30", "6AM"));
        list.add(new ToDay("35", "7PM"));
        list.add(new ToDay("20", "8AM"));

        recyclerView = findViewById(R.id.recyclerToday);
        recyclerView2 = findViewById(R.id.recyclerNextDays);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(list, this);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setHasFixedSize(true);
        recyclerView2.setAdapter(recyclerAdapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setHasFixedSize(true);
    }
}