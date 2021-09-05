package com.company;

import java.util.Scanner;

public class commision {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int schemeAmount = 5000;
        int totalMemebrs = 1;
        String parent = in.next();
        String hasChild = in.next();
        if(hasChild.equals("Y")){
            String members = in.next();
            String[] membersName = members.split(",");
            double parentCommision = (membersName.length)*10;
            totalMemebrs += membersName.length;
            System.out.println("Total members : "+totalMemebrs);
            System.out.println("Commision Details");
            System.out.println(parent + " : " + (parentCommision/100)*schemeAmount);
            for (int i = 0; i<membersName.length; i++){
                System.out.println(membersName[i] + " : " + 0.05*schemeAmount);
            }
        }
        else{
            System.out.println("Total members : "+totalMemebrs);
            System.out.println("Commision Details");
            System.out.println(parent + " : " + 0.05*schemeAmount);
        }
    }
}
