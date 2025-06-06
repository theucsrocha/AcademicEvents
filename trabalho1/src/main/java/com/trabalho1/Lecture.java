package com.trabalho1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Lecture extends Event {

    private String themeOfLecture;
    private ArrayList<String> speakersArrayList;

    public Lecture(String name, int capacity, LocalDate date,String local, String themeOfLecture,boolean isOnline){
        super(name, capacity, date, local,isOnline);
        this.themeOfLecture = themeOfLecture;
        this.speakersArrayList = new ArrayList<String>();
    }

    public void printSpeakers(){
        
        if (speakersArrayList.size() == 0) {
            System.out.println("There are no speakers registered in this lecture!");
            
        }

        else{
            Iterator<String> i = speakersArrayList.listIterator();
            System.out.println("Speakers list of the lecture:" + this.getName());
            while (i.hasNext()) {
            System.out.println(i.next());
        }

        }   
    }

    

    
}
