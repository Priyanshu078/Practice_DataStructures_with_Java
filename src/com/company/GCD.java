package com.company;

public class GCD {
    static int gcd(int a, int b){

        // naive solution

//        int res = Math.min(a,b);
//        while(res > 0){
//            if(a % res == 0 && b %res == 0){
//                break;
//            }
//            res --;
//        }
//        return res;


        // efficient solution

        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
