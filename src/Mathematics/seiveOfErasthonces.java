package Mathematics;

import java.util.Scanner;

public class seiveOfErasthonces {
    public static boolean isPrimeNumber(int n){
        if(n == 1) return false;
        else
            for(int i = 2;i<=Math.pow(n,0.5);i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            boolean isPrime = isPrimeNumber(i);
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
