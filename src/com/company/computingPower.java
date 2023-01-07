package com.company;

public class computingPower {

    // recursive solution

//    static int computingPow(int x,int n){
//         int result = 1;
//        if(n % 2 == 0){
//            for(int i =0;i<n/2;i++){
//                result *= x;
//            }
//            return result*result;
//        }
//        else{
//            return x * computingPow(x,n-1);
//        }
//    }

    // iterative

    // O(log(n))

    static int computingPow(int x, int n){
        int result = 1;
        while(n > 0){
            if(n%2 == 1){
                // bit is 1
                result = result * x;
            }
            else{
                // bit is 0
            }
            n = n/2;
            x = x*x;
        }
        return result;
    }
}
