package ArraysQues;

public class minimumAdjacentDifference {
    static void minimumAdjacentDifferenc(int[] arr){

        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            int diff = Math.abs(arr[i] - arr[i-1]);
            if(min > diff) {
                min = diff;
            }
        }
        int diff = Math.abs(arr[arr.length-1] - arr[0]);
        if(diff > min){
            System.out.println(min);
        }
        else{
            System.out.println(diff);
        }
    }
}
