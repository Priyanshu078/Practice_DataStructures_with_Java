package Searching;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int arr[], int k){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int mid = -1;
        while (start <= end){
            mid = (start+end)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
