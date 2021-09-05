package com.company;

import java.util.Scanner;

public class geometricSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int term1 = 1, term2 = 1;
        for(int i = 1;i<=n;i++){
            if(i == 1){
//                System.out.print(1);
            }
            else if(i == 2){
//                System.out.print(1);
            }
            else{
                if(i%2==0){
                    term1 *= 2;
                }
                else{
                    term2 *= 3;
                }
            }
        }
        if(n%2 == 0){
            System.out.println(term2);
        }
        else{
            System.out.println(term1);
        }
    }
}
