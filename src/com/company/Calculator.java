package com.company;

import java.util.Scanner;

public class Calculator {
    public int calculate(char c, int a, int b) {
        int result = 0;
        if(c == '+'){
            result = a+b;
        }
        else if(c == '-'){
            result = a-b;
        }
        else if(c == '*'){
            result = a*b;
        }
        else{
            result = a/b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calci = new Calculator();
        while (true) {
            System.out.println("Enter the values");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("enter the operator");
            char c = sc.next().trim().charAt(0);
            if(c == 'x'){
                System.out.println("Thanks for using the calculator");
                break;
            }
            System.out.println(calci.calculate(c, a, b));
        }
    }
}