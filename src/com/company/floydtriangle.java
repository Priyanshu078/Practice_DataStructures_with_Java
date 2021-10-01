package com.company;

public class floydtriangle {
    public static void main(String[] args) {
        int n = 0;
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<i+1;j++){
                n+=1;
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
