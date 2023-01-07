package ArraysQues;

public class ReverseAnArray {

    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        // int[] dummy= new int[d];
        // for(int i = 0;i<d;i++){
        //     dummy[i] = arr[i];
        // }

        // for(int i = d;i<n;i++){
        //     arr[i-d] = arr[i];
        // }

        // for(int i = 0;i<d;i++){
        //     arr[n-d+i] = dummy[i];
        // }
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int arr[], int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
//    static int[] reverse(int arr[]){
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        for (int a:
//             arr) {
//            System.out.print(a + " ");
//        }
//        return arr;
//    }
}
