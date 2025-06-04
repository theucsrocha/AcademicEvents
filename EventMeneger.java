package com.trabalho1;
import java.util.Vector;

public class EventMeneger {

    private Vector<People> allPeopleRegistred;
    private Vector<Event> allEventsRegistred;

    public EventMeneger(){
        this.allEventsRegistred = new Vector<>();
        this.allPeopleRegistred = new Vector<>();

    }

    public void addEvent(Event event){
        allEventsRegistred.add(event);

    }

    public void addPeople(People people){
        allPeopleRegistred.add(people);
    }

    



}
