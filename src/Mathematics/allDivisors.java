package Mathematics;

import java.util.Scanner;

public class allDivisors {
    public static  void allDivisor(int n){
        // O(n)
//        for(int i = 1;i<=n;i++){
//            if(n%i == 0){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();

        // O(√n)
//        for(int i = 1;i*i<=n;i++){
//            if(n%i == 0){
//                System.out.print(i + " ");
//                if(n/i != i){
//                    System.out.print(n/i + " ");
//                }
//            }
//        }
//        System.out.println();
//        // sorted order of the divisors
        for(int i = 1;i*i<=n;i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
        for(int i = (int)(Math.pow(n,0.5));i>=1;i++){
            if(n%i == 0){
                if(n/i != i) {
                    System.out.print(i + " ");
                }
            }
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        allDivisor(n);
    }
}
