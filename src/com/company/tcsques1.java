package com.company;

import java.util.Scanner;

public class tcsques1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 1 way
//        String coded = "";
//        if(n>=0 && n<=1000000){
//            String num = String.valueOf(n);
//            for(int i = 0;i<num.length();i++){
//               int number = 9 - Integer.parseInt(String.valueOf(num.charAt(i)));
//               coded += String.valueOf(number);
//            }
//            System.out.println(coded);
//        }
        //2nd way
        int number = 0;
        if(n>=0 && n<=1000000){
            int factor = 1;
            while(n!=0) {
                int last = n %10 ;
                last = 9 - last;
                number += last * factor;
                factor *= 10;
                n = n/10;

            }
            System.out.println(number);
        }
        else {
            System.out.println("Wrong Input!");
        }
    }
}
