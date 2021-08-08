package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class OxygenLevel {
    public static void main(String [] args){
        int avgTrainee1 = 0;
        int avgTrainee2 = 0;
        int avgTrainee3 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int max = 0;
        boolean selected1 = false;
        boolean selected2 = false;
        boolean selected3 = false;
        ArrayList<Integer> trainee1 = new ArrayList<>();
        ArrayList<Integer> trainee2 = new ArrayList<>();
        ArrayList<Integer> trainee3 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            System.out.println("Round " + i);
            int a = sc.nextInt();
            trainee1.add(a);
            int b = sc.nextInt();
            trainee2.add(b);
            int c = sc.nextInt();
            trainee3.add(c);
        }
        for (int i = 0; i<trainee1.size(); i++){
            sum1 += trainee1.get(i);
        }
        avgTrainee1 = sum1/3;
        System.out.println(avgTrainee1);
        for (int i = 0; i<trainee2.size();i++){
            sum2 += trainee2.get(i);
        }
        avgTrainee2 = sum2/3;
        System.out.println(avgTrainee2);
        for (int i = 0; i< trainee3.size();i++){
            sum3 += trainee3.get(i);
        }
        avgTrainee3 = sum3/3;
        System.out.println(avgTrainee3);
        if(avgTrainee1 > avgTrainee2){
            if(avgTrainee1 > avgTrainee3){
                selected1 = true;
                max = avgTrainee1;
            }
            else{
                selected3 = true;
                max = avgTrainee3;
            }
        }
        else{
            if(avgTrainee2 > avgTrainee3){
                selected2 = true;
                max = avgTrainee2;
            }
            else{
                selected3 = true;
                max = avgTrainee3;
            }
        }

        if(avgTrainee1 == avgTrainee2){
            if(max == avgTrainee1){
                selected1 = true;
                selected2 = true;
            }
        }
        else if(avgTrainee2 == avgTrainee3){
            if(max == avgTrainee2){
                selected2 = true;
                selected3 = true;
            }
        }
        else if (avgTrainee1 == avgTrainee3){
            if(max == avgTrainee1){
                selected1 = true;
                selected3 = true;
            }
        }

        if(selected1 && selected2){
            if(avgTrainee1 > 70 && avgTrainee2 > 70) {
                System.out.println("Selected 1 & 2");
            }
        }
        else if(selected2 && selected3){
            if(avgTrainee2 > 70 && avgTrainee3 > 70) {
                System.out.println("Selected 2 & 3");
            }
        }
        else if(selected1 && selected3){
            if(avgTrainee1 > 70 && avgTrainee3 > 70) {
                System.out.println("Selected 1 & 3");
            }
        }
        else if(selected1){
            if(avgTrainee1 > 70) {
                System.out.println("Selected 1");
            }
        }
        else if(selected2){
            if(avgTrainee2 > 70) {
                System.out.println("Selected 2");
            }
        }
        else if(selected3){
            if(avgTrainee3 > 70) {
                System.out.println("Selected 3");
            }
        }
        else{
            System.out.println("No one Selected");
        }
    }
}
