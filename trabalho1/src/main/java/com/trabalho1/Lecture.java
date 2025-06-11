package com.trabalho1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Represents a Lecture event, which has a theme and a list of speakers.
 */

public class Lecture extends Event {

    private String themeOfLecture;
    private ArrayList<String> speakersArrayList;

    public Lecture(String name, int capacity, LocalDate date,String local, String themeOfLecture,boolean isOnline){
        super(name, capacity, date, local,isOnline);
        this.themeOfLecture = themeOfLecture;
        this.speakersArrayList = new ArrayList<String>();
    }

    /**
     * Prints the list of speakers for the lecture.
     * If there are no speakers, prints a warning message.
     */

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

    public void registerSpeaker(Scanner scanner){
        
        System.out.println("Enter the name of the speaker:");
        String speakerName = scanner.nextLine();
        speakersArrayList.add(speakerName);
        System.out.println("Speaker " + speakerName + " registered successfully in the lecture: " + this.getName());
        
            
        
    }

    public void registerSpeaker(Scanner scanner, int amountSpeakers){
        for (int i = 0; i < amountSpeakers; i++) {
            System.out.println("Enter the name of the speaker " + (i + 1) + ":");
            String speakerName = scanner.nextLine();
            speakersArrayList.add(speakerName);
        }
        System.out.println("Speakers registered successfully in the lecture: " + this.getName());
    }

    public String getThemeOfLecture(){
        return themeOfLecture;
    }

    public ArrayList<String> getSpeakersArrayList() {
        return speakersArrayList;
    }
    
}
