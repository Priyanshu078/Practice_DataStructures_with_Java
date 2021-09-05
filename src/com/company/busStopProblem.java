package com.company;
import java.util.*;
public class busStopProblem {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int distance = 0;
        double fareFor1Metre = 0.005;
        int[] path = {800,600,750,900,1400,1200,1100,1500};
        String [] stops = {"TH","GA","IC","HA","TE","LU","NI","CA"};
        String source = in.next();
        String destination = in.next();
        int sourceIndex = 0;
        int destinationIndex = 0;
        for(int i = 0;i<source.length();i++){
            boolean upperCase = Character.isUpperCase(source.charAt(i));
            if (upperCase){
                continue;
            }
            else{
                System.out.println("Invalid Input");
                return;
            }
        }
        for(int i = 0;i<destination.length();i++){
            boolean upperCase = Character.isUpperCase(destination.charAt(i));
            if (upperCase){
                continue;
            }
            else{
                System.out.println("Invalid Input");
                return;
            }
        }
        for (int i =0;i<stops.length;i++){
            if(source.equals(stops[i])){
                sourceIndex = i;
                System.out.println(sourceIndex);
            }
            if(destination.equals(stops[i])){
                destinationIndex = i;
                System.out.println(destinationIndex);
            }
        }
        if(sourceIndex < destinationIndex) {
            for (int i = sourceIndex; i <= destinationIndex; i++) {
                distance += path[i];
                System.out.println(distance);
            }
        }
        else{
            for (int i = destinationIndex; i<=sourceIndex; i++){
                distance += path[i];
                System.out.println(distance);
            }
        }
        System.out.println(distance);
        System.out.println("Fare is" + distance*fareFor1Metre);
    }
}
