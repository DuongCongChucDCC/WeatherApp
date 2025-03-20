package com.example.weatherapp.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.weatherapp.Domains.Hourly;
import com.example.weatherapp.R;

import java.util.ArrayList;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.HourlyViewHolder> {
    ArrayList<Hourly> hourlyList;
    Context context;

    public HourlyAdapter(ArrayList<Hourly> hourlyList) {
        this.hourlyList = hourlyList;
    }

    @NonNull
    @Override
    public HourlyAdapter.HourlyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.hourly_viewholder, parent, false);
        return new HourlyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapter.HourlyViewHolder holder, int position) {
        holder.hourTxt.setText(hourlyList.get(position).getHour());
        holder.tempTxt.setText(hourlyList.get(position).getTemp() + "°");
        int drawableResourceId = holder.itemView.getResources().getIdentifier(hourlyList.get(position).getIcon(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(context).load(drawableResourceId).into(holder.iconImg);
    }

    @Override
    public int getItemCount() {
        Log.d("ZZZZZZZZZZ", "getItemCount: " + hourlyList.size());
        return hourlyList.size();
    }

    public class HourlyViewHolder extends RecyclerView.ViewHolder {
        TextView hourTxt, tempTxt;
        ImageView iconImg;

        public HourlyViewHolder(@NonNull View itemView) {
            super(itemView);
            hourTxt = itemView.findViewById(R.id.hourTxt);
            tempTxt = itemView.findViewById(R.id.tempTxt);
            iconImg = itemView.findViewById(R.id.iconImg);
        }
    }
}
