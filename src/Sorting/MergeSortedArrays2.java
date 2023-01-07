package Sorting;

public class MergeSortedArrays2 {
    static void mergeSortedArrays(int arr[], int low, int mid,int high) {
        int arr1[] = new int[mid + 1];
        int arr2[] = new int[high - mid];
        for (int i = 0; i <=mid; i++) {
                arr1[i] = arr[i];
        }
        for(int i = 0;i< arr2.length;i++){
            arr2[i] = arr[mid+1+i];
        }
        int i = 0,j=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[i+j] = arr1[i];
                i++;
            }
            else{
                arr[i+j] = arr2[j];
                j++;
            }
        }
        while(i < arr1.length){
            arr[i+j] = arr1[i];
            i++;
        }
        while (j < arr2.length){
            arr[i+j] = arr2[j];
            j++;
        }
        for (int a:
             arr) {
            System.out.print(a + " ");
        }
    }
}
