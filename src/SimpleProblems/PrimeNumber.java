package SimpleProblems;

public class PrimeNumber {
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        else{
            for(int i = 2;i<Math.sqrt(n);i++){
                if(n % 2 == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
