package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class NonrepeatingDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int counter = 0;
        int repetetivCounter = 0;
        boolean flag = true;
        ArrayList<String> repetitive = new ArrayList<>();
        for(int i = a;i<=b;i++){
            String str = String.valueOf(i);
            for (int j = 0;j<str.length()-1;j++){
                for(int k = j+1;k<str.length();k++){
                    if(str.charAt(j) == str.charAt(k)){
                        if(!repetitive.contains(str)) {
                            System.out.println(str);
                            repetitive.add(str);
                            repetetivCounter += 1;
                        }
                        break;
                    }
                }
            }
            counter +=1;
        }
        System.out.println(counter-repetetivCounter);


    }
}
