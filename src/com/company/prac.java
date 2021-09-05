package com.company;

import java.util.*;

public class prac {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+">>");
        }
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for(int i = 0;i<numbers.length;i+=2){
            sumOfEven += numbers[i];
        }
        for(int i = 1;i<numbers.length;i+=2){
            sumOfOdd += numbers[i];
        }
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);
        System.out.println(sumOfEven-sumOfOdd);
        for(int i = 0;i<numbers.length;i++){
            for(int j = i+1;j< numbers.length;j++){
                if(numbers[j] > numbers[i]){
                    int temp = numbers[j];
                    numbers [j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+">>");
        }
    }
}
