package ArraysQues;

import java.util.Arrays;

public class trappingRainWater {
    static int trappedAmount(int[] arr){
        if(Sorted(arr) || reverseSorted(arr)){
            return 0;
        }
        else{
            int total = 0;
            int lMax = arr[0];
            int rMax = arr[0];
            for(int i = 0;i<arr.length;i++){
                if(lMax > arr[i]){
                    lMax = arr[i];
                }
                for(int j = i+1;j< arr.length;j++){
                    if(arr[i] > rMax){
                        rMax = arr[i];
                    }
                }
                total += Math.min(lMax,rMax) - arr[i];
            }
            return total;
        }
    }

    static boolean Sorted(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1] < arr[i]){
                return false;
            }
        }
        return true;
    }
    static boolean reverseSorted(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
