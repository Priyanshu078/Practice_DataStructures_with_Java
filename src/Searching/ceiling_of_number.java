package Searching;

public class ceiling_of_number {
    static int ceilingOfNumber(int target) {
        int[] arr = {2, 3,5,9,14,16,18};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
//            else{
//                return arr[start];
//            }
        }
        return arr[start];
    }
}
