package com.company;

import java.util.Scanner;

public class WashingMachine {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int maxWeight = 7000;
        if(weight >= 0 && weight <= 2000){
            System.out.println("25 minutes");
        }
        else if(weight >= 2001 && weight <= 4000){
            System.out.println("35 minutes");
        }
        else if(weight >= 4001 && weight <= 7000){
            System.out.println("45 minutes");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
