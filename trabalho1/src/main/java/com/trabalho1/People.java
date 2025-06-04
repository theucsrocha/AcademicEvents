package com.trabalho1;

import java.util.Vector;

public class People {

    private String name;
    protected static int sequencialId;
    private Vector<People> allPeoplesRegistred;
    int id;

    public People(String name){
        this.name = name;
        id = sequencialId++;
        allPeoplesRegistred.add(this);
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
}
