package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                arrayList.add(i);
            }
        }
        for(int i = 0;i<arrayList.size();i++){
            sum += arrayList.get(i);
        }
        if(sum == n){
            System.out.println("Perfect Number");
        }
    }
}
