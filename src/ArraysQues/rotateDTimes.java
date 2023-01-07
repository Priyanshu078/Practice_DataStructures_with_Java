package ArraysQues;

public class rotateDTimes {
    static int[] rotateArrayDTimes(int[] arr, int d) {
//        ArrayList<Integer> arr1 = new ArrayList<>(1);
//        for(int i = 0;i<d;i++){
//            arr = rotate_array.rotateArrayByOne(arr);
//        }
//        return arr;

//        int[] dummy = new int[d];
//        for (int i = 0; i < d; i++) {
//            dummy[i] = arr[i];
//        }
//
//        for (int i = d; i < arr.length; i++) {
//            arr[i - d] = arr[i];
//        }
//
//        for (int i = 0; i < dummy.length; i++) {
//            arr[arr.length - d + i] = dummy[i];
//        }
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }
    static int[] reverse(int[] arr, int start,int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
