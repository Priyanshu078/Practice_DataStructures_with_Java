package com.company;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int term1 = 0;
        int term2 = 1;
        int next = 0;
        int n = in.nextInt();
        for(int i = 1;i<=50;i++){
            if(i == 1){
                System.out.print(term1 +">>");
            }
            else if(i == 2){
                System.out.print(term2 + ">>");
            }
            else{
                next = term1 + term2;
                term1 = term2;
                term2 = next;
                if(term2 <= 7){
                    continue;
                }
                System.out.print(term2 +">>");
            }
        }
    }
}
