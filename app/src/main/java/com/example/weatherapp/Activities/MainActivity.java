package com.example.weatherapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.Adapters.HourlyAdapter;
import com.example.weatherapp.Domains.Hourly;
import com.example.weatherapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initRecyclerView();
        setVariables();
    }

    private void setVariables() {
        TextView futureTxt = findViewById(R.id.futureTxt);
        futureTxt.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, FutureActivity.class));
        });
    }

    private void initRecyclerView() {
        ArrayList<Hourly> hourlyList = new ArrayList<>();
        hourlyList.add(new Hourly("12:00", 20, "cloudy"));
        hourlyList.add(new Hourly("13:00", 21, "sunny"));
        hourlyList.add(new Hourly("14:00", 22, "wind"));
        hourlyList.add(new Hourly("15:00", 23, "rainy"));
        hourlyList.add(new Hourly("16:00", 24, "storm"));
        hourlyList.add(new Hourly("17:00", 25, "cloudy"));
        hourlyList.add(new Hourly("18:00", 26, "sunny"));

        recyclerView = findViewById(R.id.view7Day);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapter = new HourlyAdapter(hourlyList);
        recyclerView.setAdapter(adapter);
    }
}