package com.example.harjoitustyo;

import java.io.Serializable;

public class Superhero implements Serializable {

    protected String name;
    protected String type;
    protected int attack;
    protected int defense;
    protected int health;
    protected int maxHealth;
    protected int id;

    protected int experience;

    private int idCounter;

    private int picture;

    public Superhero(String name, String type, int attack, int defense, int health, int maxHealth, int id, int experience, int picture) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.maxHealth = maxHealth;
        this.id = id;
        this.experience=experience;
        this.picture= picture;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getId() {
        return id;
    }

    public int getExperience() {
        return experience;
    }

    public int getPicture() {return picture;}





}
