package com.example.networking;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Mountain> mountainList;

    public RecyclerViewAdapter(ArrayList<Mountain> mountainList){
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

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

        holder.mountainText.setText("ID: " + mountainList.get(position).getID() + "\nName: " + mountainList.get(position).getName() +
                "\nType: " + mountainList.get(position).getType() + "\nLocation: " + mountainList.get(position).getLocation() + "\nHeight: " +
                mountainList.get(position).getHeight() + "m above sea level");
    }

    @Override
    public int getItemCount() {
        return mountainList.size();
    }
}
