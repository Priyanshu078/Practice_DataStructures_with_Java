package SimpleProblems;

public class Fibonacci {
    static void fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        while(n > 0){
            System.out.print(n1 + " ");
            int sum = n1+ n2;
            n1 = n2;
            n2 = sum;
            n--;
        }
    }
}
