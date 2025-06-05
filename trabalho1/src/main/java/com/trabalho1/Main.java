package com.trabalho1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Welcome to Academic Events maneger,choose your option:");
            System.out.println("1 - Maneger Events");
            System.out.println("2 - Meneger People");
            System.out.println("3 - Reports");
            System.out.println("4 - Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Meneger Menu! Choose your option: ");
                    System.out.println("1 - Create new events");
                    System.out.println("2 - List all events");
                    System.out.println();
                    break;
            
                default:
                    break;
            }

        }while(choice!=4);
    }
}