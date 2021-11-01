package Mathematics;

import java.util.Scanner;

public class factorial {
    //recursive
    int factorial(int n){
        if( n == 0)
            return 1;
        return n * factorial(n-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        factorial fact = new factorial();
        int n = sc.nextInt();
        long factorial = 1;
        // iterative
//        while(n > 1){
//            factorial *= n;
//            n -= 1;
//        }
        System.out.println(fact.factorial(n));
    }
}
