package com.company;

public class CountDigits {
    static int countDigits(int n){
        int count = 0;
        while(n > 0){
            count += 1;
            n /= 10;
        }
        return count;
    }
}
