package com.company;

public class multiples {
    static int multiplesOfn(int a){
        int m = 0;
        for(int i = 0;i<100;i++){
            if(i % a == 0){
                m++;
            }
        }
        int n = 0;
        for(int i = -6;i<35;i++){
            if(i % a == 0){
                n ++;
            }
        }
        return m-n;
    }
}
