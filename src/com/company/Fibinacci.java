package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibinacci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int n = sc.nextInt();
        while(n > 0){
            System.out.print(first + " >> ");
            int next = first + second;
            first = second;
            second = next;
            n--;
        }
    }
}
