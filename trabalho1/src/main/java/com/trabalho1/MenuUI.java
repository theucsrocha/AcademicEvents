package com.trabalho1;

import java.util.Scanner;

public class MenuUI{

    public static int showMainMenu(Scanner scanner){
            System.out.println("\n========================================");
            System.out.println("   Welcome to Academic Events Manager   ");
            System.out.println("========================================");
            System.out.println("1 - Manage Events");
            System.out.println("2 - Manage People");
            System.out.println("3 - Certificates");
            System.out.println("4 - Exit");
            System.out.print("Choose your option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
    
    }

    public static int showManageEventsMenu(Scanner scanner){
            System.out.println("\n----------------------------------------");
            System.out.println("           Events Manager Menu          ");
            System.out.println("----------------------------------------");
            System.out.println("1 - Create new event");
            System.out.println("2 - List all events");
            System.out.println("3 - List events by type");
            System.out.println("4 - List events by date");
            System.out.println("5 - Exit");
            System.out.print("Choose your option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
    }

    public static int showMenuTypeEvent(Scanner scanner){
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
            return eventType;
    }
    
    public static int showManagePeopleMenu(Scanner scanner){
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
            int option = scanner.nextInt();
            scanner.nextLine();
            return option;
    }

    public static void showMenuCertificateGenerator(Scanner scanner, EventMeneger meneger){
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
            if (e.isEmpty()) {
                System.out.println("No registered people in this event.");
                return;
                
            }
            System.out.print("Choose the ID of the person: ");
            String idPeople = scanner.nextLine();
            CertificateUtil.certificateGenarate(e.getPeopleById(Integer.parseInt(idPeople)), e);
        
    }

}