package ArraysQues;

public class OperationInArray {


    // searching
//    static void searchingAnElement(int arr[], int k){
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i] == k){
//                System.out.println(i);
//            }
//        }
//    }

    // inserting in an array at any index

//    static void insertingAtIndex(int arr[], int k, int a){
//        for(int i = arr.length-1;i>k;i--){
//            arr[i] = arr[i-1];
//        }
//        arr[k] = a;
//        for (int e:
//             arr) {
//            System.out.print(e + " ");
//        }
//    }

    // delete from an array

    static void deleteFromArray(int arr[], int k){
        int index = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == k){
                index = i;
                break;
            }
        }
        for(int i = index;i< arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        for (int i:
             arr) {
            System.out.print(i+" ");
        }
    }

}
