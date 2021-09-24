package com.company;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        System.out.println("TCS NINJA Problem");
        Scanner sc = new Scanner(System.in);
        int term1 = 0;
        int term2 = 0;
        int n = sc.nextInt();
//        for(int i = 1;i<=n;i++){
//            if(i == 1){
//                System.out.print(term1 + ">>");
//            }
//            else if(i == 2){
//                System.out.print(term2 + ">>");
//            }
//            else{
//                if(i%2 == 0){
//                    term2 += 1;
//                    System.out.print(term2 + ">>");
//                }
//                else{
//                    term1 += 2;
//                    System.out.print(term1 + ">>");
//                }
//            }
//    }
        for(int i = 1;i<=n;i++){
            if(i == 1){
                term1 = 0;
            }
            else if(i == 2){
                term2 = 0;
            }
            else{
                if(i%2 == 0){
                    term2 += 1;
                }
                else{
                    term1 += 2;
                }
            }
        }
        if(n % 2 == 0){
            System.out.println(term2);
        }
        else{
            System.out.println(term1);
        }
    }
}