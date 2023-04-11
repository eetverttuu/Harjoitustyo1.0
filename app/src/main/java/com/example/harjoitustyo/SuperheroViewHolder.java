package com.example.harjoitustyo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SuperheroViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView name, /*winsLosses*/ attackDefense, health, experience;

    public SuperheroViewHolder(@NonNull View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        name=itemView.findViewById(R.id.txtSuperheroName);
        //winsLosses=itemView.findViewById(R.id.txtWinsLosses);
        attackDefense=itemView.findViewById(R.id.txtAttackDefense);
        health=itemView.findViewById(R.id.txtHealth);
        experience=itemView.findViewById(R.id.txtExperience);

    }
}
