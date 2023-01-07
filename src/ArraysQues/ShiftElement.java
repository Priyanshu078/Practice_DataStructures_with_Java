package ArraysQues;

import java.util.ArrayList;

public class ShiftElement {
    static void shift(int arr[], int a, int index){
        ArrayList<Integer> arr1 = new ArrayList<>();
        int pos = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == a){
                pos = i;
            }
        }
        // left shift
//        for(int i = pos;i>index;i--){
//            arr[i] = arr[i-1];
//        }
//        arr[index] = a;

        // right shift
        for(int i = pos;i<index;i++){
            arr[i] = arr[i+1];
        }
        arr[index] = a;

        for (int m:
             arr) {
            System.out.print(m);
        }
    }
}
