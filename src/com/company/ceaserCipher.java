package com.company;

import java.util.Scanner;
public class ceaserCipher {
    public String encriptString(String text, int key){
        String encriptedText = "";
        char encoded = ' ';
        if(key < 0){
            return "Invalid Input";
        }
        for (int i = 0;i<text.length();i++){
            char character = text.charAt(i);
            if((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
                encoded = (char) (character + key);
            }
            else if(character == ' '){
                encoded = ' ';
            }
            else{
                return "Invalid Input";
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
