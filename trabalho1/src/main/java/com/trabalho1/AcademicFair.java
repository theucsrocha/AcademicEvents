package com.trabalho1;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Represents an Academic Fair event, which can have multiple exhibitions.
 */
public class AcademicFair extends Event {
    // List of exhibitions in the academic fair
    private ArrayList<String> exhibitions;

    public AcademicFair(String name, int capacity, LocalDate date,String local,boolean isOnline){
        super(name, capacity, date, local,isOnline);
        this.exhibitions = new ArrayList<String>();

    }

    public void addExhibitions(String newExhibitions){
        exhibitions.add(newExhibitions);
        System.out.println("Exhibitions addicionad");
        
    }

    public void addExhibitions(int amountNewExhibitions, Scanner scanner){
        for (int i = 0; i < amountNewExhibitions; i++) {
            System.out.println("Enter the name of the exhibition " + (i + 1) + ":");
            String newExhibitions = scanner.nextLine();
            exhibitions.add(newExhibitions);
        }
        System.out.println("Exhibitions addicionad");
        
        
    }

    public ArrayList<String> getExhibitions(){
        return exhibitions;
    }
}
