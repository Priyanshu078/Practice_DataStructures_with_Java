package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class clinic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] patients = new int[20];
        int sum = 0;
        for(int i = 0;i<patients.length;i++){
            int n = in.nextInt();
            if(n>0 && n<=120){
                patients[i] = n;
            }
            else{
                break;
            }
        }
        for(int i = 0; i<patients.length;i++){
            if(patients[i] >0 && patients[i] < 17){
                sum+=200;
                System.out.println(sum);
            }
            else if(patients[i] >= 17 && patients[i] <= 40){
                sum+=400;
                System.out.println(sum);
            }
            else if(patients[i]>40){
                sum+=300;
                System.out.println(sum);
            }
        }
        System.out.println("Total Income " + sum + " INR");
    }
}
