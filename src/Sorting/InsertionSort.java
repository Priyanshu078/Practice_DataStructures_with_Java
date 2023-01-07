package Sorting;

public class InsertionSort {
    static void insertionSort(int arr[]) {
        int n = arr.length;
        int j;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            j=i-1;
            while(j >= 0 && key < arr[j]){
                System.out.println(j);
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            for (int a :
                    arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
