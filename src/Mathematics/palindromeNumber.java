package Mathematics;

import java.util.Scanner;

public class palindromeNumber {
    boolean checkpalindrome(int n){
        boolean ispalindrome = false;
        int number = n;
        int reverse = 0;
        while(n>0){
            int last = n%10;
            reverse = reverse*10 + last ;
            n /=10;
        }
        if(reverse == number){
            ispalindrome = true;
        }
        else{
            ispalindrome = false;
        }
        return ispalindrome;
    }

    public static void main(String[] args) {
        palindromeNumber palindromeNumber = new palindromeNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindromeNumber.checkpalindrome(n));
    }
}
