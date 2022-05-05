package com.example.networking;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Mountain> mountainList;

    public RecyclerViewAdapter(MainActivity mainActivity, ArrayList<Mountain> mountainList){
        this.mountainList = mountainList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mountainText;

        ViewHolder(View view) {
            super(view);
            mountainText = view.findViewById(R.id.textView);
        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_mountains, parent, false);
        return new ViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

        String ID = mountainList.get(position).getID();
        String name = mountainList.get(position).getName();
        String type = mountainList.get(position).getType();
        String location = mountainList.get(position).getLocation();
        int height = mountainList.get(position).getHeight();

        holder.mountainText.setText("ID: " + ID + "\nName: " + name + "\nType: " + type + "\nLocation: " + location + "\nHeight: " + height + "m above sea level");
    }

    @Override
    public int getItemCount() {
        return mountainList.size();
    }
}
