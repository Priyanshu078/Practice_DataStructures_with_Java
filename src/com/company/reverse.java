package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String [] args){
        int n=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reverse = 0;
        while(a>0){
            int remainder = a%10;
            reverse  = reverse * 10 + remainder;
            a = a/10;
        }
        System.out.println(reverse);
        if(a == n){

        }
    }
}
