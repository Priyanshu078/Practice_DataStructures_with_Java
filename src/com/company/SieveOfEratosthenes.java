package com.company;

import java.util.Arrays;

public class SieveOfEratosthenes {


    // naive solution

    // O(n*sqrt(n))
//    static void allPrimeTillN(int n){
//        for(int i= 2;i<=n;i++){
//            if(PrimeNumber.isPrime(i)){
//                System.out.print(i + ",");
//            }
//        }
//    }

    // sieve algorithm

    static void allPrimeTillN(int n){
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i = 2;i*i<=n;i++){
            if(arr[i] == true){
                int counter = 2;
//                System.out.println(i);
                    while (true) {
                        int val = i * counter;
//                        System.out.println(val);
                        if (val > n) {
                            break;
                        }
                        arr[val] = false;
                        counter+=1;
                    }
            }
        }
        for(int i =2;i< arr.length;i++){
            if(arr[i]){
                System.out.print(i);
            }
        }
    }
}
