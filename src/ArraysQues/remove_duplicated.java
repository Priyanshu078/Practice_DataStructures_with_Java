package ArraysQues;

public class remove_duplicated {
    static int remove_duplicates(int[] arr){
        // 10 20 20 30 30 30
        int res = 1;
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] > arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        for (int a:
             arr) {
            System.out.print( a + " ");
        }
        return res;
    }
}
