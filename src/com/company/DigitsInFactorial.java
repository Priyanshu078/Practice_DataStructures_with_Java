package com.company;

public class DigitsInFactorial {
    static double digitsInFactorial(int n){
        double count = 0;
        for(int i = 1;i<=n;i++){
            count += Math.log10(i);
        }
        return Math.floor(count) + 1;
    }
}
