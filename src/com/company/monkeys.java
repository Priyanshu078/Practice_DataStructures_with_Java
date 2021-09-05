package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class monkeys {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int monkeyDown = 0;
        int totalMonkeys = in.nextInt();
        int bananaEat1monkey = in.nextInt();
        int peanutEat1monkey = in.nextInt();
        int totalBanana = in.nextInt();
        int totalPeanuts = in.nextInt();
        int monkeyEatingBanana = totalBanana/bananaEat1monkey;
        int bananaLeft = totalBanana%bananaEat1monkey;
        int monkeyEatingPeanuts = totalPeanuts/peanutEat1monkey;
        int peanutsLeft = totalPeanuts%peanutEat1monkey;
        monkeyDown = monkeyEatingBanana + monkeyEatingPeanuts;
        if(bananaLeft > 0 || peanutsLeft > 0){
            monkeyDown += 1;
        }
        System.out.println("Monkey left on the tree are : " + (totalMonkeys - monkeyDown));
    }
}
