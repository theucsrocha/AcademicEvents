package com.trabalho1;

import java.time.LocalDate;

public class Course extends Event {
    
    private int hoursCourse;

    public Course(String name, int capacity, LocalDate date,String local, int hoursCourse,boolean isOnline){
        super(name, capacity, date, local,isOnline);
        this.hoursCourse = hoursCourse;
    }

    @Override
    public int registerPeople(People people){
        if(people instanceof Teacher ){
            System.out.println("Only Students can be register in a course.");
            return 0;
        }
        else{
            registerPeople(people);
            return 1;
        }
    }

    public int getHoursCourse() {
        return hoursCourse;
    }

    public void setHoursCourse(int hoursCourse) {
        this.hoursCourse = hoursCourse;
    }

}
