package recursion;

public class digitalRoot {

    static int digitalRoot(int n){
        if(n < 10){
            return n;
        }
        else{
            return n%10 + digitalRoot(n/10);
        }
    }

    static int digitalRootOfNum(int n){

        if(n<10){
            return n;
        }
        else{
            return digitalRoot(n%10 + digitalRootOfNum(n/10));
        }
//        if(n <= 9){
//            return n;
//        }
//        else{
//            return digitalRootOfNum(n%10 + digitalRootOfNum(n/10));
//        }


//        if(n < 10){
//            return n;
//        }
//        else{
//            int ans = n%10 + digitalRootOfNum(n/10);
//            if(ans < 10){
//                return ans;
//            }
//            else{
//                ans = ans%10 + digitalRootOfNum(ans/10);
//                return ans;
//            }
//        }
    }
}
