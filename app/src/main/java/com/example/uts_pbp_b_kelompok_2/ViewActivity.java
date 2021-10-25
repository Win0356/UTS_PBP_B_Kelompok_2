package com.example.uts_pbp_b_kelompok_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;


import com.example.uts_pbp_b_kelompok_2.Adapter.ViewAdapter;
import com.example.uts_pbp_b_kelompok_2.model.Model;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view);

        RecyclerView recyclerView = findViewById(R.id.rv_activity);
        ViewAdapter recyclerViewAdapter = new ViewAdapter(getTodo());
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private ArrayList<Model> getTodo() {
        ArrayList<Model> model = new DaftarService().model;
        return model;
    }
}