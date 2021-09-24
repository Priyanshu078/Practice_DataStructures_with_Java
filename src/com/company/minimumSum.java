package com.company;

import java.util.Scanner;

public class minimumSum {
    public static void main(String[] args) {
        int n = 6;
        Scanner in = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int sum = 0;
        int minimum = Integer.MAX_VALUE;
        for(int i = 0;i<n-1;i++){
            int j = i+1;
            sum = arr[i] + arr[j];
            if(sum < minimum){
                minimum = sum;
            }
        }
        System.out.println(minimum);
    }
}
