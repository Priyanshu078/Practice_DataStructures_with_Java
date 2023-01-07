package ArraysQues;

public class maximumDifference {
    static int maximumdifference(int[] arr){
        // naive solution
//        int maxDiff = arr[1] - arr[0];
//        for(int i = 0;i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                maxDiff = Math.max(maxDiff, arr[j] - arr[i]);
//            }
//        }
//        return maxDiff;


        // efficient solution
        int maxDiff = arr[1] - arr[0];
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            maxDiff = Math.max(maxDiff,arr[i] - min);
            min = Math.min(min,arr[i]);
        }
        return maxDiff;
    }
}
