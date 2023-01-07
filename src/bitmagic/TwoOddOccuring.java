package bitmagic;
public class TwoOddOccuring {
    static void twoOddOccuring(){
        int xor = 0;
        int sn = 0;
        int res1 = 0;
        int res2 = 0;
        int arr[] = {1,1,2,2,2,3,4,4,5,5};
        for(int i = 0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        sn = xor & ~(xor-1);
        for(int i = 0;i< arr.length;i++) {
            if ((arr[i] & sn) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println(res1);
        System.out.println(res2);
    }
}
