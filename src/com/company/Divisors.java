package com.company;

public class Divisors {
    static void divisors(int n){

        // naive solution

        // O(n)
//        for(int i = 1;i<=n;i++){
//            if(n % i == 0){
//                System.out.print(i+" ");
//            }
//        }

        // efficient solution

        // O(sqrt(n))
        //printed in unsorted order

//        for(int i = 1;i*i<=n;i++){
//            if(n % i == 0) {
//                System.out.print(i + "," + n / i + " ");
//            }
//        }
//        System.out.println();

        // printed in sorted order sorted order
        for(int i = 1;i*i<=n;i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        for(int i = (int)Math.sqrt(n)-1; i >=1;i--){
            if(n % i == 0){
                System.out.print(n/i + " ");
            }
        }
    }
}
