package com.trabalho1;

import java.util.Vector;

/**
 * Represents a generic person in the system.
 * Used as a base class for Student, Teacher, and External.
 */

public class People {
    public static int totalPeople;
    private String name;
    protected static int sequencialId;
    int id;

    public People(String name){
        this.name = name;
        id = sequencialId++;
        totalPeople++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotalPeople() {
        return totalPeople;
    }
}
