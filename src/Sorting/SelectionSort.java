package Sorting;

public class SelectionSort {
    static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            for (int a:
                 arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
