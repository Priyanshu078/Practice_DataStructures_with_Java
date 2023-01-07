package SimpleProblems;

import java.util.Arrays;

public class ReverseArray {
    static void reverseArray(int[] arr){
        int start = 0;
        int last = arr.length-1;
        while(start < last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
