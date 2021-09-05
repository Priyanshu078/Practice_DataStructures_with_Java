package com.company;

public class series {
    public static void main(String[] args) {
        int term1 = 0;
        int term2 = 0;
//        System.out.print(term1 +">>");
//        System.out.print(term2+">>");
        for(int i = 1;i<=15;i++){
            if(i==1){
//                System.out.print(term1 +">>");
            }
            else if(i==2){
//                System.out.print(term2 +">>");
            }
            else {
                if (i % 2 == 0) {
                    term2 += 6;
//                    System.out.print(term2 + ">>");
                } else {
                    term1 += 7;
//                    System.out.print(term1 + ">>");
                }
            }
        }
        System.out.println(term1);

//        int a = 7, b = 0, c=0 ;
//        System.out.println("Series");
//        for(int i = 1;i<8;i++){
//            c = a*b;
//            System.out.print(c + "," + (c-b) + ",");
//            b++;
//        }
//        c= a*b;
//        System.out.println(c);
    }
}
