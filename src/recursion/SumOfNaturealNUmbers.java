package recursion;

public class SumOfNaturealNUmbers {
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        else{
            System.out.print(n + " ");
            return n + sum(n-1);
        }
    }
}
