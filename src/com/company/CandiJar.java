package com.company;

import java.util.Scanner;

public class CandiJar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        int total = 10;
        int minimum = 5;
        if(order > 0 && order <= minimum){
            System.out.println("Number of candies sold " +order);
            total = total - order;
            System.out.println("Total number of candies " +total);
        }
        else {
            System.out.println("Invalid Input");
            System.out.println("Total number of candies" +total);
        }

    }
}
