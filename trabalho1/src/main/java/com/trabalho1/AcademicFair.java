package com.trabalho1;

import java.time.LocalDate;
import java.util.ArrayList;

public class AcademicFair extends Event {
    
    private ArrayList<String> exhibitions;

    public AcademicFair(String name, int capacity, LocalDate date,String local,boolean isOnline){
        super(name, capacity, date, local,isOnline);
        this.exhibitions = new ArrayList<String>();

    }

    public void addExhibitions(String newExhibitions){
        exhibitions.add(newExhibitions);
        System.out.println("Exhibitions addicionad");
        
    }
}
