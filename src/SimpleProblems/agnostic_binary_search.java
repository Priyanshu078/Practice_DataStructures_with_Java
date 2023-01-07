package SimpleProblems;

public class agnostic_binary_search {
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean ascendingSorted = (arr[start] < arr[end]);
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] > target){
                if(ascendingSorted) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(arr[mid] < target){
                if(ascendingSorted) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
