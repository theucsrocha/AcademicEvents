package com.trabalho1;
import java.util.HashMap;
import java.util.Map;

public class Event implements IEvents {
    private String name;
    private int capacity;
    private String date;
    private String local;
    private Map <Integer, People> Registeredstudents;

    public Event(String name, int capacity, String date,String local){
        
        this.name = name;
        this.capacity = capacity;
        this.date = date;
        this.local = local;
    }

}
