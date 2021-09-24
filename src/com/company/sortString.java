package com.company;

public class sortString {
    public static void main(String[] args) {
        String str = "competitive";
        char arr[] = new char[str.length()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = str.charAt(i);
        }
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String string = "";
        for(int i = 0;i<arr.length;i++){
            string += String.valueOf(arr[i]);
        }
        System.out.println(string);
    }
}
