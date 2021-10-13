package com.company;

import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1;
        while(n>1){
            if(n % 2 != 0) {
                flag = 0;
                break;
            }
            n = n/2;
        }
        if(n == 0) {
            System.out.println("No");
        }
        else if(flag == 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
