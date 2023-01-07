package Sorting;

public class MergeSort {
    static int mergeSort(int[] arr, int low, int high, int k){
        if(low < high){
            int mid = (low+high)/2;
            k = mergeSort(arr,low,mid, k);
            k = mergeSort(arr,mid+1,high, k);
            k = merge(arr,low,mid,high,k);
        }
        for (int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
        return k;
    }

    static int merge(int[] arr, int low, int mid, int high, int k){
        int[] arr1 = new int[mid+1-low];
        int[] arr2 = new int[high - mid];
        for(int i = 0;i< arr1.length;i++){
            arr1[i] = arr[low+i];
        }
        for(int i =0;i< arr2.length;i++){
            arr2[i] = arr[i + mid + 1];
        }
        for(int a: arr1){
            System.out.print(a + " ");
        }
        int i = 0,j= 0;
        System.out.println(k);
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length){
            arr[k] = arr1[i];
            i++;
        }
        while (j < arr2.length){
            arr[k] = arr2[j];
            j++;
        }
        return k;
    }
}
