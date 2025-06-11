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


        do {
            System.out.println("\n========================================");
            System.out.println("   Welcome to Academic Events Manager   ");
            System.out.println("========================================");
            System.out.println("1 - Manage Events");
            System.out.println("2 - Manage People");
            System.out.println("3 - Certificates");
            System.out.println("4 - Exit");
            System.out.print("Choose your option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("\n----------------------------------------");
                        System.out.println("           Events Manager Menu          ");
                        System.out.println("----------------------------------------");
                        System.out.println("1 - Create new event");
                        System.out.println("2 - List all events");
                        System.out.println("3 - List events by type");
                        System.out.println("4 - List events by date");
                        System.out.println("5 - Exit");
                        System.out.print("Choose your option: ");
                        option = scanner.nextInt();
                        scanner.nextLine();

                        switch (option) {
                            case 1:
                                System.out.println("\n----------------------------------------");
                                System.out.println("        What is the type of event?      ");
                                System.out.println("----------------------------------------");
                                System.out.println("  1 - Lecture");
                                System.out.println("  2 - Workshop");
                                System.out.println("  3 - Course");
                                System.out.println("  4 - Academic Fair");
                                System.out.print("Choose the event type: ");
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
                                        System.out.print("How many speakers do you want to add? ");
                                        int numSpeakers = scanner.nextInt();
                                        scanner.nextLine();
                                        if(numSpeakers == 1) {
                                            ((Lecture) event).registerSpeaker(scanner);
                                        } else if(numSpeakers > 1) {
                                            ((Lecture) event).registerSpeaker(scanner, numSpeakers);
                                        }
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
                                        System.out.println("How many exhibitions do you want to add? ");
                                        int numExhibitions = scanner.nextInt();
                                        scanner.nextLine();
                                        if(numExhibitions == 1) {
                                            System.out.print("Enter the name of the exhibition: ");
                                            String exhibition = scanner.nextLine();
                                            ((AcademicFair) event).addExhibitions(exhibition);
                                        } else if(numExhibitions > 1) {
                                            ((AcademicFair) event).addExhibitions(numExhibitions, scanner);
                                        }
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
                                meneger.listByEvent(scanner);
                                break;
                            case 4:
                                System.out.print("Enter the date (YYYY-MM-DD) to list events: ");
                                String dateInput = scanner.nextLine();
                                LocalDate eventDate = LocalDate.parse(dateInput);
                                meneger.listByDate(eventDate);
                                break;
                            case 5:
                                System.out.println("Exiting event management menu...");
                                break;
                            
                            default:
                                break;
                        }
                    } while (option != 5);
                    break;
                case 2:
                    do {
                        System.out.println("\n----------------------------------------");
                        System.out.println("           People Manager Menu          ");
                        System.out.println("----------------------------------------");
                        System.out.println("  1 - Create new student");
                        System.out.println("  2 - Create new teacher");
                        System.out.println("  3 - List all people");
                        System.out.println("  4 - Register people in event");
                        System.out.println("  5 - Create new external people");
                        System.out.println("  6 - Exit");
                        System.out.print("Choose your option: ");
                        option = scanner.nextInt();
                        scanner.nextLine();

                        switch (option) {
                            case 1:
                                System.out.print("Student name: ");
                                String studentName = scanner.nextLine();
                                System.out.print("University: ");
                                String university = scanner.nextLine();
                                meneger.addPeople(new Student(studentName, university));
                                break;
                            case 2:
                                System.out.print("Teacher name: ");
                                String teacherName = scanner.nextLine();
                                System.out.println("Specialization: ");
                                String specialization = scanner.nextLine();
                                meneger.addPeople(new Teacher(teacherName, specialization));
                                break;
                            case 3:
                                meneger.listAllPeople();
                                break;
                            case 4:
                                meneger.registerPeopleInEvent(scanner);
                                break;

                            case 5:  
                                System.out.println("External name: ");
                                String externalName = scanner.nextLine();  
                                System.out.println("External ocupation: ");
                                String externalOccupation = scanner.nextLine();
                                meneger.addPeople(new External(externalName, externalOccupation));
                                break;
                            case 6:
                                System.out.println("Exiting people management menu...");
                                break;
                            default:
                                break;
                        }
                    } while (option != 6);
                    break;
                case 3:
                    System.out.println("\n----------------------------------------");
                    System.out.println("           Certificate Generator        ");
                    System.out.println("----------------------------------------");
                    System.out.println("Choose the event:");
                    meneger.listAllEvents();
                    System.out.print("Enter the number of the event: ");
                    String numberEvent = scanner.nextLine();
                    System.out.println("Choose the person:");
                    Event e = meneger.getEventByIndex(Integer.parseInt(numberEvent) - 1);
                    e.report();
                    System.out.print("Choose the ID of the person: ");
                    String idPeople = scanner.nextLine();
                    CertificateUtil.certificateGenarate(e.getPeopleById(Integer.parseInt(idPeople)), e);
                default:
                    break;
            }
        } while (choice != 4);
    }
}