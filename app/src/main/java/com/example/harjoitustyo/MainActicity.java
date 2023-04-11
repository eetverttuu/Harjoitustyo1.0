package com.example.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAddSuperhero(View view){
        Intent intent = new Intent(this, AddNewSuperheroActivity.class);
        startActivity(intent);
    }

    public void switchToListSuperhero(View view){
        Intent intent = new Intent(this, ListSuperheroActivity.class);
        startActivity(intent);
    }

    public void switchToTrainSuperhero(View view){
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);
    }

    public void switchToBattle(View view){
        Intent intent = new Intent(this, BattleFieldActivity.class);
        startActivity(intent);
    }
}