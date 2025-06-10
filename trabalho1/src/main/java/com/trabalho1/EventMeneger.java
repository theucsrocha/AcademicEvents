package com.trabalho1;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Vector;


public class EventMeneger {

    private Vector<People> allPeopleRegistred;
    private Vector<Event> allEventsRegistred;

    public EventMeneger() {
    this.allEventsRegistred = new Vector<>();
    this.allPeopleRegistred = new Vector<>();
}

    public void addEvent(Event event){
        allEventsRegistred.add(event);
    }

    public void addPeople(People people){
        allPeopleRegistred.add(people);
    }

    public void listByEvent(Scanner scanner){
        int choice;
        do{
            System.out.println("Choose the type of event:");
            System.out.println("1 - Lecture");
            System.out.println("2 - WorkShop");
            System.out.println("3 - Academic Fair");
            System.out.println("4 - Course");
            System.out.println("5 - Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (Event e : allEventsRegistred) {
                        if (e instanceof Lecture) {
                            System.out.println(e.getName() + "\n  Capacity: " + e.getCapacity() + "\n Free Slots: " + e.getFreeSlots());
                        }
                    }
                    break;
                case 2:
                    for (Event e : allEventsRegistred) {
                        if (e instanceof WorkShop) {
                            System.out.println(e.getName() + "\n  Capacity: " + e.getCapacity() + "\n Free Slots: " + e.getFreeSlots());
                        }
                    }
                    break;
                case 3:
                    for (Event e : allEventsRegistred) {
                        if (e instanceof AcademicFair) {
                            System.out.println(e.getName() + "\n  Capacity: " + e.getCapacity() + "\n Free Slots: " + e.getFreeSlots());
                        }
                    }
                    break;
                case 4:
                    for (Event e : allEventsRegistred) {
                        if (e instanceof Course) {
                            System.out.println(e.getName() + "\n  Capacity: " + e.getCapacity() + "\n Free Slots: " + e.getFreeSlots());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting report menu...");
                    break;
                default:
                    System.out.println("Option not found, retry please!\n");
                    break;
            }
        } while(choice != 5);
    }

    public void listByDate(LocalDate date){
        for(Event e: allEventsRegistred){
            if(e.getDate().equals(date)){
                System.out.println(e.getName() + "\n  Capacity: " + e.getCapacity() + "\n Free Slots: " + e.getFreeSlots());
            }
        }
    }

    public void listAllEvents(){
        if (allEventsRegistred.size() == 0) {
            System.out.println("Not Found");
            }
        else{
            for(Event e : allEventsRegistred){
                System.out.println((allEventsRegistred.indexOf(e) + 1) + ": " +  e.getName() + "\n  Capacity: " + e.getCapacity() + "\n Free Slots: " + e.getFreeSlots());
            }
        }
    }

    public void listAllPeople(){
        if (allPeopleRegistred.size() == 0) {
            System.out.println("Not Found");
            }
        else{
            for(People p : allPeopleRegistred){
                System.out.println(p.getName() + "\n  ID: " + p.getId());
            }
        }
    }

    public void registerPeopleInEvent(Scanner scanner){
        listAllPeople();
        System.out.println("Choose the ID of people for register:");
        int id = Integer.parseInt(scanner.nextLine());

        for(People p : allPeopleRegistred){
            if(p.getId() == id ){
                System.out.println("Event list:");
                listAllEvents();
                System.out.println("Choose the event for register:");
                int option = scanner.nextInt();
                scanner.nextLine(); 
                int situation = allEventsRegistred.get(option - 1).registerPeople(p);
                
                if (situation == 1) {
                    System.out.println("People registred!");
                }
                else{
                    System.out.println("Erro!");
                }
                break;
            }
        }
        



    }
}