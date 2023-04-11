package com.example.harjoitustyo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SuperheroListAdapter extends RecyclerView.Adapter<SuperheroViewHolder> {
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private Context context;

    public SuperheroListAdapter(Context context, ArrayList<Superhero> superheroes) {
        this.context = context;
        this.superheroes = superheroes;
    }

    @NonNull
    @Override
    public SuperheroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SuperheroViewHolder(LayoutInflater.from(context).inflate(R.layout.superhero_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SuperheroViewHolder holder, int position) {
        holder.imageView.setImageResource(superheroes.get(position).getPicture());
        holder.name.setText(new StringBuilder().append(superheroes.get(position).getType()).append("in nimi on ").append(superheroes.get(position).getName()).toString());
        //holder.winsLosses.setText(new StringBuilder().append(superheroes.get(position).getWins()).append(" ").append(users.get(position).getLastName()).toString());
        holder.attackDefense.setText(new StringBuilder().append("Hyökkäyspisteet: ").append(superheroes.get(position).getAttack()).append("  |  ").append("Puoluspisteet: ").append(superheroes.get(position).getDefense()).toString());
        holder.health.setText(new StringBuilder().append("Elämäpisteet: ").append(superheroes.get(position).getHealth()));
        holder.experience.setText(new StringBuilder().append("Kokemuspisteet: ").append(superheroes.get(position).getExperience()));

    }

    @Override
    public int getItemCount() {
        return superheroes.size();

    }
}