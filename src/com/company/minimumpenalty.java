package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class minimumpenalty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            for(int j = i;j< arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i<arr.length-1;i++){
            int j = i+1;
            arrayList.add(Math.abs(arr[j] - arr[i]));
        }
        int sum =0;
        for (int item :
             arrayList) {
            sum += item;
        }
        System.out.println(sum);
    }
}
