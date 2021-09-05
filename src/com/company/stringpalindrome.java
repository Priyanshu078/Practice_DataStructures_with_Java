package com.company;

import java.util.Scanner;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int first = 0;
        int last = str.length()-1;
        int flag = 0;
        while(first < last){
            if(str.charAt(first) != str.charAt(last)){
                flag = 1;
            }
            first++;
            last--;
        }
        if(flag == 0){
            System.out.println("palindrome");
        }
        else{
            System.out.println("non palindrome");
        }
    }
}
