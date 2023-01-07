package bitmagic;

public class KThBitIsSET {
    static boolean kthBitIsSet(int n, int k){
//        int num = (int)Math.pow(2,k-1);
//        int and = n & num;
//        if(and > 0){
//            return  true;
//        }
//        else{
//            return false;
//        }

        // using left shift operator

//        if(((1 << (k-1)) & n) != 0){
//            return true;
//        }
//        else{
//            return false;
//        }

        // using right shift operator

        if(((n >> (k-1))&1) == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
