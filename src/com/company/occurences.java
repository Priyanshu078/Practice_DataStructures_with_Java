package com.company;

import java.util.Scanner;

public class occurences {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c = sc.next().trim().charAt(0);
        int count = 0;
        for (int i = 0;i<a.length();i++){
                if(a.charAt(i) == c){
                    count += 1;
                }
            }
        System.out.println(count);
        }
    }
