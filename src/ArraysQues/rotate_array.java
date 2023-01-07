package ArraysQues;

public class rotate_array {
    static int[] rotateArrayByOne(int[] arr){
        int num = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = num;
        return arr;
    }
}
