package com.company;

import java.util.Scanner;

public class encriptedText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  text = sc.next();
        int key = sc.nextInt();
        String encriptedText = "";
        for(int i = 0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch == 'z'){
                ch = (char)(ch - 26);
            }
            char newChar = (char) (ch + key);
            encriptedText += String.valueOf(newChar);
        }
        System.out.println(encriptedText);
    }
}
