package ArraysQues;

public class move_zero_to_end {
    static int[] moveZeroToEnd(int[] arr){
//        int swappingPoint = 0;
//        for(int i = 1;i<arr.length;i++){
//            if(arr[i] == 0 && arr[i-1] > 0){
//                swappingPoint = i;
//            }
//            else if(arr[i] > 0 && arr[i-1] == 0){
//                int temp = arr[swappingPoint];
//                arr[swappingPoint] = arr[i];
//                arr[i] = temp;
//                swappingPoint = swappingPoint + 1;
//            }
//        }


        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }
}
