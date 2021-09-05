package com.company;

import java.util.Scanner;

public class primeArmstrong {

//    static void isprime(int n){
//        int flag = 1;
//        for(int i = 2;i<n;i++){
//            if(n%i == 0){
//                flag = 0;
//            }
//        }
//        if(flag == 1){
//            System.out.println("Prime");
//        }
//        else{
//            System.out.println("non prime");
//        }
//    }

//    static void isArmstrong(int n){
//        int number = n;
//        int sum = 0;
//        while (n>0){
//            int last = n%10;
//            sum += Math.pow(last,3);
//            n = n/10;
//        }
////        System.out.println(sum);
//        if(sum == number){
//            System.out.println("Amstrong");
//        }
//        else{
//            System.out.println("not Armstrong");
//        }
//    }

    static void armstrongNumbers(int a, int b){
        for(int i = a;i<=b;i++){
            int sum = 0;
            int num = i;
            while(i>0){
                int last = i%10;
                sum += Math.pow(last, 3);
                i = i/10;
            }
            if(sum == num){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
//        isprime(n);
//        isArmstrong(n);
        armstrongNumbers(n1,n2);
    }
}
