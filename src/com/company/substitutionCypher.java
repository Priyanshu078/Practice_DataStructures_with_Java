// Priyanshu Paliwal
// Rollno: 52
// Batch : A2
package com.company;
import java.util.Scanner;

public class substitutionCypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to convert");
        String str = sc.nextLine();
        System.out.println("Enter the shifting value");
        int key = sc.nextInt();
        String cipherText = "";
        System.out.println("Enter the choice");
        System.out.println("1 : Ceaser cipher");
        System.out.println("2 : addative cipher");
        int num = sc.nextInt();
        switch (num) {
            case 1: {
                cipherText = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != ' ') {
                        int askii = (int) (str.charAt(i) + key);
                        if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                            if (askii > 122) {
                                cipherText += String.valueOf((char) (askii - 26));
                            } else {
                                cipherText += String.valueOf((char) (askii));
                            }
                        } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                            if (askii > 90) {
                                cipherText += String.valueOf((char) (askii - 26));
                            } else {
                                cipherText += String.valueOf((char) (askii));
                            }
                        }
                    } else {
                        cipherText += " ";
                    }
                }
                System.out.print("Encripted text : ");
                System.out.println(cipherText);
                System.out.print("Decripted text : ");
                str = "";
                for(int j = 0;j<cipherText.length();j++){
                    if (cipherText.charAt(j) >= 'a' && cipherText.charAt(j) <= 'z') {
                        if ((int)(cipherText.charAt(j)) < 97) {
                            str += String.valueOf((char) ((int)(cipherText.charAt(j)) + 26));
                        } else {
                            str += String.valueOf((char) ((int)(cipherText.charAt(j) - key)));
                        }
                    } else if (cipherText.charAt(j) >= 'A' && cipherText.charAt(j) <= 'Z') {
                        if ((int)(cipherText.charAt(j)) < 65) {
                            str += String.valueOf((char) ((int)(cipherText.charAt(j)) + 26));
                        } else {
                            str += String.valueOf((char) ((int)(cipherText.charAt(j) - key)));
                        }
                    }
                    else{
                        str+=" ";
                    }
                }
                System.out.println(str);
                break;
            }
            case 2: {
                cipherText = "";
                for (int i = 0; i < str.length(); i++) {
                    int askii = (int) (str.charAt(i) + key);

                    if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                        if (askii > 122) {
                            cipherText += String.valueOf((char) (askii - 26));
                        } else {
                            cipherText += String.valueOf((char) (askii));
                        }
                    } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                        if (askii > 90) {
                            cipherText += String.valueOf((char) (askii - 26));
                        } else {
                            cipherText += String.valueOf((char) (askii));
                        }
                    } else {
                        cipherText += String.valueOf((char) (askii));
                    }

                }
                System.out.print("Encripted text : ");
                System.out.println(cipherText);
                break;
            }

        }

    }
}
