package com.company;

import java.util.Scanner;

public class prime {
    static void prime(int n){
        int flag = 0;
        if(n == 2){
            flag = 1;
        }
        else{
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
        }
        if(flag == 1){
            System.out.println("prime");
        }
        else{
            System.out.println("non prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0){
            prime(n);
        }
        else{
            System.out.println("Please enter a positive number");
        }
    }
}
