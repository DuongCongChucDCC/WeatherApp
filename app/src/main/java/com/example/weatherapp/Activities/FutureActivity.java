package com.example.weatherapp.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.Adapters.FutureAdapter;
import com.example.weatherapp.Domains.FutureDomain;
import com.example.weatherapp.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_future);
        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> {
            startActivity(new Intent(FutureActivity.this, MainActivity.class));
        });
    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items = new ArrayList<>();
        items.add(new FutureDomain("Mon", "sunny", "Sunny", 21, 3));
        items.add(new FutureDomain("Tue", "windy", "Windy", 22, 4));
        items.add(new FutureDomain("Wed", "cloudy", "Cloudy", 23, 5));
        items.add(new FutureDomain("Thu", "rainy", "Rainy", 24, 6));
        items.add(new FutureDomain("Fri", "storm", "Stormy", 25, 7));
        items.add(new FutureDomain("Sat", "sunny", "Sunny", 26, 8));
        items.add(new FutureDomain("Sun", "cloudy", "Cloudy", 27, 9));

        recyclerView = findViewById(R.id.view2);
        adapter = new FutureAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }
}