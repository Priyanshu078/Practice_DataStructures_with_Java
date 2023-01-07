package Sorting;

import java.util.Arrays;

public class MergeSortedArrays {
    static void mergeSortedArrays(int arr1[], int arr2[]){

        // naive solutipm
//        int arr[] = new int[arr1.length + arr2.length];
//        Arrays.fill(arr,Integer.MAX_VALUE);
//        for(int i = 0;i< arr2.length;i++){
//            arr[i] = arr2[i];
//        }
//        for (int a:
//                arr) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//        int j = 0;
//        for(int i = 0;i<arr1.length;i++){
//            int key = arr1[i];
//            j = arr.length-1;
//           for(j = arr.length-1;j>0;j--){
//               if(key < arr[j-1]){
//                   arr[j] = arr[j-1];
//               }
//               else{
//                   break;
//               }
//           }
//           arr[j] = key;
//            for (int a:
//                    arr) {
//                System.out.print(a + " ");
//            }
//            System.out.println();
//        }
//        for (int a:
//             arr) {
//            System.out.print(a + " ");
//        }


        int i= 0,j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
            }
            else{
                System.out.print(arr2[i] + " ");
                j++;
            }
        }
        while(i < arr1.length || j< arr2.length){
            if(i< arr1.length){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else{
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

    }
}
