package com.example.verb.RecycleView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.verb.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView name; TextView score;

    public MyViewHolder(@NonNull View item){
        super(item);
        imageView = item.findViewById(R.id.imageView);
        name = item.findViewById(R.id.name);
        score = item.findViewById(R.id.score);
    }
}
