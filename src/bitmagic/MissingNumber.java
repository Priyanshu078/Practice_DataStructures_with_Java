package bitmagic;

public class MissingNumber {
    static int missingNumber(int n){

        int[] arr = {1,3,4,5,2,6,8};
        int xorOfarr = 0;
        int xorOfNumber = 0;
        for(int i = 0;i<arr.length;i++){
            xorOfarr = xorOfarr ^ arr[i];
        }
        for(int i = 1;i<=n;i++){
            xorOfNumber = xorOfNumber ^ i;
        }
        System.out.println(xorOfarr);
        System.out.println(xorOfNumber);
        return xorOfarr ^ xorOfNumber;
    }
}
