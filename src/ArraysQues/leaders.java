package ArraysQues;

import java.util.*;

public class leaders {
    static void leadersInArray(int[] arr){
        // brute force solution
        for(int i = 0;i<arr.length;i++){
            boolean isLeader = true;
            for(int j = i+1;j<arr.length;j++){
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();


        // efficient solution

        ArrayList<Integer> arrayList = new ArrayList<>();
        int currLeader = arr[arr.length-1];
        arrayList.add(currLeader);
//        System.out.println(currLeader);
        for(int i = arr.length-2;i>0;i--){
            if(currLeader < arr[i]){
                currLeader = arr[i];
                arrayList.add(currLeader);
//                System.out.println(currLeader);
            }
        }
        int start = 0;
        int end = arrayList.size()-1;
        while(start <= end){
            int temp = arrayList.get(start);
            arrayList.set(start,arrayList.get(end));
            arrayList.set(end,temp);
            start++;
            end--;
        }
        for(int i = 0;i< arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,2);
        ArrayList<Integer> arrayList1 = new ArrayList<>(map.keySet());
        for(int i = 0;i<arrayList1.size();i++){
            System.out.println(arrayList1.get(i));
        }

    }
}
