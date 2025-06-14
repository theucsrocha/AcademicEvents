package com.trabalho1;

import java.time.LocalDate;

/**
 * Represents a Course event, which has a specific duration in hours.
 * Only students can be registered in a course.
 */

public class Course extends Event {
    
    private int hoursCourse;

    public Course(String name, int capacity, LocalDate date,String local, int hoursCourse,boolean isOnline){
        super(name, capacity, date, local,isOnline);
        this.hoursCourse = hoursCourse;
    }
    /**
     * Registers a person in the course.
     * Only students are allowed to register.
     */
    @Override
    public int registerPeople(People people){
        if(!(people instanceof Student) ){
        System.out.println("----------------------------------------");
        System.out.println("Only students can be registered in a course.");
        System.out.println("----------------------------------------");
        return 0;
    }
        else{
            return super.registerPeople(people);
    }
}

    public int getHoursCourse() {
        return hoursCourse;
    }

    public void setHoursCourse(int hoursCourse) {
        this.hoursCourse = hoursCourse;
    }

}
