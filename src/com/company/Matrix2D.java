package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix2D {
    public static int sumDifference(ArrayList<ArrayList<Integer>> arr){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<arr.size();i++){
            for(int j = 0;j<arr.get(i).size();j++){
                if(i == j){
                    sum1 += arr.get(i).get(j);

                }
                if((i + j) == arr.size() - 1){
                    sum2 += arr.get(i).get(j);
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        return Math.abs(sum1 - sum2);
    }
    public static void main(String [] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++) {
            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(sc.nextInt());
            }
            arr.add(arr1);
        }
        System.out.println(sumDifference(arr));
    }
}
