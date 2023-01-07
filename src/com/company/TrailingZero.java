package com.company;

public class TrailingZero {

    // naive solution
    // this has a overflow problem it overflows when n value is higher like 20
//    static int trailingzero(int n){
//        int factorial = 1;
//        while(n > 1){
//            factorial *= n;
//            System.out.println( n +" " + factorial);
//            n -= 1;
//        }
//        System.out.println(factorial);
//        int lastDigit = 0;
//        int count =0;
//        while(lastDigit == 0){
//            lastDigit = factorial % 10;
//            factorial /= 10;
//            if(lastDigit == 0){
//                count++;
//            }
//        }
//        return count;
//    }

    // efficient solution

    static int trailingzero(int n){
        int count = 0;
        for(int i = 5;i<=n;i *= 5){
            count += n/i;
        }
        return count;
    }
}
