package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();

        // count digits

//        int count = CountDigits.countDigits(n);
//        System.out.println(count);

        // is palindrome

//        boolean isPalindrome = PalindromeNumber.palindromeNumber(n);
//        System.out.println("Is palindrome " + isPalindrome);

        // factorial

//        int factorial = Factorial.factorial(n);
//        System.out.println(factorial);

        // trailing zeroes in a factorial

//        int trailingZeroes = TrailingZero.trailingzero(n);
//        System.out.println(trailingZeroes);


        // gcd of two numbers

//        int gcd = GCD.gcd(n,n1);
//        System.out.println(gcd);
//
//        System.out.println(Math.abs(-32));

        // check prime

//        boolean prime = PrimeNumber.isPrime(n);
//        System.out.println(prime ? n + " is Prime" : n + " is not prime");

        // lcm of 2 numbers

//        int lcm = LCM.lcm(n,n1);
//        System.out.println("LCM of 2 numbers is " + lcm);

        //prime factors of a number

//        PrimeFactors.primeFactors(n);

        // divisors of a numbers

//        Divisors.divisors(n);

        // printing all prime numbers till n

//        SieveOfEratosthenes.allPrimeTillN(n);

        // digits in factorial

//        double a = DigitsInFactorial.digitsInFactorial(n);
//        System.out.println(a);

        // computing Power

//        int a = computingPower.computingPow(n,n1);
//        System.out.println(a);

        // computing Power interative solution

//        int a = computingPower.computingPow(n,n1);
//        System.out.println(a);

        // multiples

        int count = multiples.multiplesOfn(6);
        System.out.println(count);
    }
}
