package recursion;

public class Factorial {
    static int factoroial(int n){
        if(n <= 0){
            return 1;
        }
        else{
            return n * factoroial(n-1);
        }
    }
}
