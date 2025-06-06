package com.trabalho1;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int choice;
        int option;
        Scanner scanner = new Scanner(System.in);
        EventMeneger meneger = new EventMeneger();
        

        // Inicializa o vetor estático se necessário
        if (Event.allEventsRegistred == null) {
            Event.allEventsRegistred = new java.util.Vector<>();
        }

        do {
            System.out.println("Welcome to Academic Events Manager, choose your option:");
            System.out.println("1 - Manage Events");
            System.out.println("2 - Manage People");
            System.out.println("3 - Reports");
            System.out.println("4 - Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Manager Menu! Choose your option:");
                        System.out.println("1 - Create new event");
                        System.out.println("2 - List all events");
                        System.out.println("3 - List events by type");
                        System.out.println("4 - List events by date");
                        System.out.println("5 - Exit");
                        option = scanner.nextInt();
                        scanner.nextLine();

                        switch (option) {
                            case 1:
                                System.out.println("What is the type of the event?");
                                System.out.println("1 - Lecture");
                                System.out.println("2 - Workshop");
                                System.out.println("3 - Course");
                                System.out.println("4 - Academic Fair");
                                int eventType = scanner.nextInt();
                                scanner.nextLine();

                                System.out.print("Event name: ");
                                String name = scanner.nextLine();
                                System.out.print("Capacity: ");
                                int capacity = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Date (YYYY-MM-DD): ");
                                String dateStr = scanner.nextLine();
                                LocalDate date = LocalDate.parse(dateStr);
                                System.out.print("Location: ");
                                String local = scanner.nextLine();
                                System.out.print("Is online? (true/false): ");
                                boolean isOnline = scanner.nextBoolean();
                                scanner.nextLine();

                                Event event = null;
                                switch (eventType) {
                                    case 1:
                                        System.out.print("Lecture theme: ");
                                        String theme = scanner.nextLine();
                                        event = new Lecture(name, capacity, date, local, theme, isOnline);
                                        break;
                                    case 2:
                                        System.out.print("Workshop apprenticeship: ");
                                        String apprenticeship = scanner.nextLine();
                                        event = new WorkShop(name, capacity, date, local, apprenticeship, isOnline);
                                        break;
                                    case 3:
                                        System.out.print("Course hours: ");
                                        int hours = scanner.nextInt();
                                        scanner.nextLine();
                                        event = new Course(name, capacity, date, local, hours, isOnline);
                                        break;
                                    case 4:
                                        event = new AcademicFair(name, capacity, date, local, isOnline);
                                        break;
                                    default:
                                        System.out.println("Invalid event type!");
                                }
                                if (event != null) {
                                   meneger.addEvent(event);
                                    System.out.println("Event created successfully!");
                                }
                                break;
                            case 2:
                                meneger.listAllEvents();
                                break;
                            
                            case 3: 
                                
                            
                            default:
                                break;
                        }
                    } while (option != 5);
                    break;
                default:
                    break;
            }
        } while (choice != 4);
    }
}