package com.trabalho1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.time.LocalDate;

public class Event implements IEvents {
    private String name;
    private int capacity;
    private LocalDate date;
    private String local;
    private Map <Integer, People> registeredPeople;
    private boolean isOnline = false;
    public static int totalEvents;


     public Event(String name, int capacity, LocalDate date,String local,boolean isOnline){
        
        this.name = name;
        this.capacity = capacity;
        this.date = date;
        this.local = local;
        this.registeredPeople = new HashMap<Integer, People>();
        this.isOnline = isOnline;
        totalEvents++;
    }

    public Event(){}


    public boolean isEmpty(){
        if (registeredPeople.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(registeredPeople.size() == capacity){
            return true;
        }
        return false;
    }

    public int registerPeople(People people){
        if(this.isOnline){
            registeredPeople.put(people.getId(), people);
            System.out.println("----------------------------------------");
            System.out.println("Student registered in the event: " + this.name);
            System.out.println("----------------------------------------");
            return 1;
        } else {
            if (isFull()) {
                System.out.println("----------------------------------------");
                System.out.println("Event is full, cannot register " + people.getName());
                System.out.println("----------------------------------------");
                return 0;
            }

            if (registeredPeople.containsKey(people.getId())) {
                System.out.println("----------------------------------------");
                System.out.println(people.getName() + " is already registered.");
                System.out.println("----------------------------------------");
                return 0;
            }

            registeredPeople.put(people.getId(), people);
            System.out.println("----------------------------------------");
            System.out.println("Student registered in the event: " + this.name);
            System.out.println("----------------------------------------");
            return 1;
        }
}

    public void report(){
        if (isEmpty()) {
            System.out.println("----------------------------------------");
            System.out.println("This event is empty.");
            System.out.println("----------------------------------------");
        } else {
            Collection<People> studentsCollection = registeredPeople.values();
            Iterator<People> i = studentsCollection.iterator();
            System.out.println("========================================");
            System.out.println("Report of event: " + name);
            System.out.println("========================================");
            while (i.hasNext()) {
                People p = i.next();
                System.out.println(p.getClass().getSimpleName() + " / " + p.getName() + " | ID: " + p.getId());
            }
            System.out.println("========================================");
        }
    }

    
    public int getFreeSlots(){
        return capacity - registeredPeople.size();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocal() {
        return local;
    }

    public Map<Integer, People> getRegisteredPeople() {
        return registeredPeople;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotalEvents() {
        return totalEvents;
    }

    public People getPeopleById(int id){
        People person = registeredPeople.get(id);
    if (person != null) {
        return person;
    } else {
        System.out.println("No person found with this ID in the event.");
        return null;
    }
}
}


