package recursion;

public class sumOfDigits {
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n%10 + sum(n/10);
        }
    }
}
