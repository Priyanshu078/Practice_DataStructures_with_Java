package ArraysQues;

public class prefixSum {
    static int rangeSumQuery(int[] arr, int start, int end){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        if(start == 0){
            return prefixSum[end];
        }
        else{
            return prefixSum[end] - prefixSum[start-1];
        }
    }
}
