package com.company;

import java.util.Scanner;

public class oddEven {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]%2 == 1 && arr[j]%2 == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
