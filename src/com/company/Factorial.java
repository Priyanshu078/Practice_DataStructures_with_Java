package com.company;

public class Factorial {
    static int factorial(int n){

        // iterative solution
//        int facto = 1;
//        while(n > 0){
//            facto *= n;
//            n--;
//        }
//        return facto;

        // recursive solution
        if(n == 0){
            return 1;
        }
        return  n * factorial(n-1);
    }
}
