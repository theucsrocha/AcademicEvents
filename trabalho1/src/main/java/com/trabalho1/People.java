package com.trabalho1;

public class People {

    private String name;
    protected static int sequencialId;
    int id;

    public People(String name){
        this.name = name;
        id = sequencialId++;
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
