package com.company;

import java.util.ArrayList;

public class socks {
    public static void main(String[] args) {
        int pairs = 0;
        int oddSocks = 0;
        int socksColors[] = {1,2,1,2,1,3,2};
        int count = 1;
        for(int i = 0;i<socksColors.length;i++){
            for(int j = i+1;j<socksColors.length;j++){
                if(socksColors[i] > socksColors[j]){
                    int temp = socksColors[i];
                    socksColors[i] = socksColors[j];
                    socksColors[j] = temp;
                }
            }
        }
        ArrayList<Integer> arrayListColor = new ArrayList<>();
        ArrayList<Integer> countList = new ArrayList<>();
        for(int i = 0;i<socksColors.length;i++){
            count = 1;
            if(!arrayListColor.contains(socksColors[i])){
                arrayListColor.add(socksColors[i]);
            }
            else{
                continue;
            }
            for(int j = i+1;j< socksColors.length;j++){
                if (socksColors[i] == socksColors[j]){
                    count ++;
                }
            }
            countList.add(count);
        }
        for(int i = 0;i<countList.size();i++){
//            System.out.println(countList.get(i)/2 +  " pair of color " + arrayListColor.get(i) + " and " + countList.get(i)%2+ "odd socks left");
            pairs += countList.get(i)/2;
            oddSocks += countList.get(i)%2;
        }
        System.out.println("Pairs of socks are " + pairs + " and " + "odd socks are " + oddSocks);
    }
}
