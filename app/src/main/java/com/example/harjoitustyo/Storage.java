package com.example.harjoitustyo;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Superhero> superheroes = new ArrayList<>();

    private static Storage storage = null;

    private Storage(){
    }

    public static Storage getInstance(){
        if(storage==null){
            storage=new Storage();
        }
        return storage;
    }

    public void addSuperhero(Superhero superhero){
        superheroes.add(superhero);
    }

    public ArrayList<Superhero> getSuperheroes(){
        return superheroes;
    }
}

