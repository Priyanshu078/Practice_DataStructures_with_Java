package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find the largest of the three");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max;

        if(a > b){
            if(a > c){
                max = a;
                System.out.println(max + " is Maximum of the three");
            }
            else{
                max = c;
                System.out.println(max + " is Maximum of the three");
            }
        }
        else{
            if(b>c){
                max = b;
                System.out.println(max + " is Maximum of the three");
            }
            else{
                max = c;
                System.out.println(max + " is Maximum of the three");
            }
        }
    }
}
