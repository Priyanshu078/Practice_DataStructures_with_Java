package bitmagic;

public class PowerOf2 {
    static boolean powerOftwo(int n){
        if(n == 0){
            return false;
        }
        while(n > 1){
            if(n % 2 != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
}
