package com.company;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class vendingMachine {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        char type = in.next().charAt(0);
        String[] coffee = {"Espresso Coffee", "Cappuchino Coffee","Latte Coffee"};
        String[] tea = {"Plain tea", "Assam tea", "Ginger tea", "Cardamom tea", "Masala tea", "Green tea", "Lemon tea", "orgainic darjelling tea"};
        String[] soups = {"Hot and Sour soop", "Veg Corn Soup", "Tomato Soup", "Spicy tomato soup"};
        String[] beverages = {"Hot chocolate drink", "Badam drink", "Badam pista drink"};
        switch (type){
            case 'c':
                int num1 = in.nextInt();
                if(num1<=coffee.length) {
                    for (int i = 0; i < coffee.length; i++) {
                        if (i == num1 - 1) {
                            System.out.println("Welcome to CCD!");
                            System.out.println("Enjoy your " + coffee[i]);
                        }
                    }
                }
                else{
                    System.out.println("Invalid Output!");
                }
                break;
            case 't':
                int num2 = in.nextInt();
                if(num2<=tea.length) {
                    for (int i = 0; i < tea.length; i++) {
                        if (i == num2 - 1) {
                            System.out.println("Welcome to CCD!");
                            System.out.println("Enjoy your " + tea[i]);
                        }
                    }
                }
                else{
                    System.out.println("Invalid Output!");
                }
                break;
            case 's':
                int num3 = in.nextInt();
                if(num3<= soups.length) {
                    for (int i = 0; i < soups.length; i++) {
                        if (i == num3 - 1) {
                            System.out.println("Welcome to CCD!");
                            System.out.println("Enjoy your " + soups[i]);
                        }
                    }
                }
                else{
                    System.out.println("Invalid Output!");
                }
                break;
            case 'b':
                int num4 = in.nextInt();
                if(num4<= beverages.length) {
                    for (int i = 0; i < beverages.length; i++) {
                        if (i == num4 - 1) {
                            System.out.println("Welcome to CCD!");
                            System.out.println("Enjoy your " + beverages[i] + "!");
                        }
                    }
                }
                else {
                    System.out.println("Invalid Output!");
                }
                break;
        }
    }
}
