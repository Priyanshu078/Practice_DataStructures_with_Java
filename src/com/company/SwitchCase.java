package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // switch case
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid day");
        }

        // nested Switch Case

        int rollno = sc.nextInt();
        String name = sc.next();
        switch (rollno){
            case 1:
                switch (name){
                    case "Priyanshu":
                        System.out.println("Paliwal");
                        break;
                    case "Good":
                        System.out.println("morning");
                        break;
                }
                break;
            case 2:
                switch (name){
                    case "Ram":
                        System.out.println("Excellent");
                        break;
                    case "Shyam":
                        System.out.println("Outstanding");
                        break;
                }
                System.out.println();
                break;
            case 3:
                switch (name){
                    case "Sam":
                        System.out.println("Naughty");
                        break;
                    case "Tonny":
                        System.out.println("Stark");
                        break;
                }
                System.out.println();
                break;
            case 4:
                switch (name){
                    case "Priyanshu":
                        System.out.println("Paliwal");
                        break;
                    case "Good":
                        System.out.println("morning");
                        break;
                }
                System.out.println();
                break;
            case 5:
                switch (name){
                    case "Cancel":
                        System.out.println("Order");
                        break;
                    case "Good":
                        System.out.println("evening");
                        break;
                }
                System.out.println();
                break;
            default:
                System.out.println("Enter a valid rollno");
        }
    }
}
