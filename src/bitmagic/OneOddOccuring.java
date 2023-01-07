package bitmagic;


public class OneOddOccuring {
    static int oddOccuring(int n){

        int[] arr = {1,1,2,3,3,3,3,4,4,5,5,5,5};
        // naive solution
//        O(n2)
//        for(int i = 0;i< arr.length;i++){
//            int count = 0;
//            for(int j = 0;j< arr.length;j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count % 2 != 0){
//                return i;
//            }
//        }
//        return -1;

        // better solution

        // O(n)
        int res = 0;
        for(int i = 0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
