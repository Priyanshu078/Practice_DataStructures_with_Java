package com.company;

import java.util.Scanner;

public class costOfPainting {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int costInteriar = 18;
        int costExteriar = 12;
        double sumInteriarArea = 0;
        double sumExteriarArea = 0;
        int interiarWalls = in.nextInt();
        int exteriarWalls = in.nextInt();
        double[] interiarArr = new double[interiarWalls];
        double[] exteriarArr = new double[exteriarWalls];
        for (int i = 0;i<interiarWalls;i++){
            interiarArr[i] = in.nextDouble();
        }
        for (int i = 0;i<exteriarWalls;i++){
            exteriarArr[i] = in.nextDouble();
        }
        for (int i =0;i<interiarArr.length;i++){
            sumInteriarArea += interiarArr[i];
        }
        double moneyInteriar = sumInteriarArea*costInteriar;
        for (int i =0;i<exteriarArr.length;i++){
            sumExteriarArea += exteriarArr[i];
        }
        double moneyExteriar = sumExteriarArea*costExteriar;
        System.out.println("Total cost to paint the interiar and exteriar walls is " + (moneyInteriar + moneyExteriar));
    }
}
