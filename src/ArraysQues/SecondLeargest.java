package ArraysQues;

public class SecondLeargest {
    static void secondLargest(int arr[]){
//        int maxIndex = 0;
//        int max = 0;
//        for(int i = 0;i< arr.length;i++){
//            if(arr[i] > max){
//                max = arr[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println(max);
//        max = 0;
//        for(int i = maxIndex;i< arr.length-1;i++){
//            arr[i] = arr[i+1];
//        }
//        for(int i = 0;i< arr.length;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//        int max = 0;
//        int secondLar = 0;
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i] > max){
//                secondLar = max;
//                max = arr[i];
//            }
//        }
//        System.out.println(secondLar);

        // 1 2 10 3 8
        int maxIndex = 0;
        int secondMaxIndex = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > arr[maxIndex]){
                secondMaxIndex = maxIndex;
                maxIndex = i;
            }
            else if(arr[i] != arr[maxIndex]){
                if(secondMaxIndex == -1 || arr[i] > arr[secondMaxIndex]){
                    secondMaxIndex = i;
                }
            }
        }
        System.out.println(secondMaxIndex);
    }
}
