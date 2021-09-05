package com.company;
import java.util.Scanner;

public class words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        String word3 = in.next();
        String word1Output = "";
        String word2Output = "";
        String word3Output = "";
        for(int i = 0;i<word1.length();i++){
            if(word1.charAt(i) == 'a'|| word1.charAt(i) == 'e'||word1.charAt(i) == 'i'||word1.charAt(i) == 'o'||word1.charAt(i) == 'u'){
                word1Output +="%";
            }
            else{
                word1Output += String.valueOf(word1.charAt(i));
            }
        }
        for(int i = 0;i<word2.length();i++){
            if(!(word2.charAt(i) == 'a'|| word2.charAt(i) == 'e'||word2.charAt(i) == 'i'||word2.charAt(i) == 'o'||word2.charAt(i) == 'u')){
                word2Output += "#";
            }
            else{
                word2Output += String.valueOf(word2.charAt(i));
            }
        }
        for(int i = 0;i<word3.length();i++){
            word3Output = word3.toUpperCase();
            }
        System.out.println(word1Output+word2Output+word3Output);
    }
}
