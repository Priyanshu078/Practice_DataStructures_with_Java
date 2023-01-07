package com.company;

public class PrimeFactors {

    // naive solution

    // O(n*sqrt(n)*log(n))

    static void primeFactors(int n){
        int originalNUmber = n;
//        for(int i = 2; i*i<=originalNUmber;i++){
//            if(PrimeNumber.isPrime(i)) {
//                while (a % i == 0) {
//                    a = a / i;
//                    System.out.print(i + ",");
//                }
//            }
//        }

        // better solution

        // O(sqrt(n)*log(n))
//        for(int i = 2;i*i<=originalNUmber;i++){
//            while(n%i == 0){
//                n = n/ i;
//                System.out.print(i + " ");
//            }
//        }

        // more better solution

        // O(sqrt(n))
        while(n % 2 == 0){
            n  = n / 2;
            System.out.print(2+ " " );
        }
        while(n%3 == 0){
            n  = n/3;
            System.out.print(3 + " ");
        }
        for(int i = 5;i*i<=originalNUmber;i+=6){
            while(n % i == 0){
                n = n/i;
                System.out.print(i + " ");
            }
            while(n % (i+2) == 0){
                n = n/(i+2);
                System.out.print(i + " ");
            }
        }
    }
}
