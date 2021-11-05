package Mathematics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class primeNUmber {

    // time complexity O(n)
//    static boolean checkPrime(int n){
//        if(n == 1)
//            return false;
//        else
//            for(int i = 2; i<n;i++) {
//                if (n%i == 0) {
//                    return false;
//                }
//            }
//            return true;
//    }


    // time complexity O(√n)
    static boolean checkPrime(int n){
        int sqrN = (int)(Math.pow(n,0.5));
        if(n == 1)
            return false;
        else
            for(int i = 2;i<=sqrN;i++){
                if(n%i ==0){
                    return false;
                }
            }
            return true;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = checkPrime(n);
        System.out.println(isprime? "Yes" : "No");
    }
}
