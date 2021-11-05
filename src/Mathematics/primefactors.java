package Mathematics;

import java.util.Scanner;

public class primefactors {
    static boolean checkPrime(int n) {
        if (n == 1) return false;
        else
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }   
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNUmber = n;
        for (int i = 2; i <= originalNUmber; i++) {
            n = originalNUmber;
            while (n != 0) {
                if (n % i == 0) {
                    boolean isPrime = checkPrime(i);
                    if(isPrime)
                        System.out.print(i);
                }
                else{
                    break;
                }
                n = n / i;
            }
        }
        }

}
