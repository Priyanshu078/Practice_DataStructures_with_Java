package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class maxSumANDmaxMUL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max1 = 0;
        int max2 = 0;
        int[] numbers = new int[n];
        for(int i = 0;i<numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i = 0;i<numbers.length-1;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        max1 = numbers[numbers.length-1];
        max2 = numbers[numbers.length-2];
        System.out.println(max1 +"," + max2);
    }
}
