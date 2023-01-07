package com.company;

public class PalindromeNumber {
    static boolean palindromeNumber(int n){
        int rev = 0;
        int original = n;
        while(n > 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return original == rev;
    }
}
