package com.company;

import java.util.Scanner;

public class geometricProgressionQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        int n = sc.nextInt();
        double ratio = n3/n2;
        double n1 = n2/ratio;
        for(int i = 1;i<=n;i++){
            if(n == 1){
                break;
            }
            else if(i == 1){
                continue;
            }
            else{
                n1 = n1*ratio;
            }
        }
        System.out.println(n1);
    }
}
