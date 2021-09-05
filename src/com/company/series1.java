package com.company;

import javax.swing.*;
import java.util.Scanner;

public class series1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int term1 = 0;
//        int term2 = 0;
//        int n = in.nextInt();
//        for(int i = 1;i<=n;i++) {
//            if(i == 1 || i == 2) {
//                term1 = 0;
//                term2 = 0;
//            }
//            else if(i%2 == 0){
//                term2 += 1;
//            }
//            else{
//                term1 += 2;
//            }
//        }
//        if(n%2 == 0){
//            System.out.println(term2);
//        }
//        else{
//            System.out.println(term1);
//        }
        int a = 2,b= 0,c1=0,c2 = 0;
        if(n%2==0) {
            for (int i = 1; i <= n / 2; i++) {
                c1 = a * b;
                c2 = c1 / 2;
                b++;
            }
            System.out.println(c2);
        }
        else{
            for (int i = 1; i <= n / 2; i++) {
                c1 = a * b;
                c2 = c1 / 2;
                b++;
            }
            c1 = a*b;
            System.out.println(c1);
        }
    }
}
