package DSA;

import java.util.Scanner;

public class sumOfNnaturealnumbers {
    static int sumOfNnaturalNumbers(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){  // by loop
            sum += i;
        }
        return sum;
//        return n*(n+1)/2;    // by formula
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfNnaturalNumbers(n);
        System.out.println(sum);
    }
}
