package Mathematics;

import java.util.Scanner;

public class CountElements {
    //recursive
    int countelements(int n){
        if(n == 0)
            return 0;
        return 1 + countelements(n/10);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        CountElements countElements = new CountElements();
        int n = sc.nextInt();
        int count = 0;
        // iterative solution

//        while(n!= 0){
//            n /= 10;
//            count ++;
//        }
        System.out.println(countElements.countelements(n));
    }
}
