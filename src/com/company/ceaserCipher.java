package com.company;

import java.util.Scanner;
public class ceaserCipher {
    public String encriptString(String text, int key){
        String encriptedText = "";
        char encoded = ' ';
        for (int i = 0;i<text.length();i++){
            char character = text.charAt(i);
            if(character == ' '){
                encoded = ' ';
            }
            else{
                encoded = (char) (character + key);
            }
            encriptedText += encoded;
        }
        return encriptedText;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int key = sc.nextInt();
        ceaserCipher ceaserCipher = new ceaserCipher();
        System.out.println(ceaserCipher.encriptString(text,key));
    }
}
