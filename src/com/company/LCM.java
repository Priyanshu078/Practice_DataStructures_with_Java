package com.company;

public class LCM {

    // naive solution
    // O(a*b)
//    static int lcm(int a, int b){
//        for(int i = Math.max(a,b);i<=a*b;i++){
//            if(i % a == 0 && i%b == 0){
//                return i;
//            }
//        }
//        return Math.max(a,b);
//    }

    // efficient solution

    // this solution uses the formula which is a*b = lcm(a,b) * gcd(a,b)

    // O(log(min(a,b)))
    static int lcm(int a, int b){
        int A = a;
        int B = b;
        if(a< b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b!=0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return A*B/a;
    }
}
