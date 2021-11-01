package Mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class HCF {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        int num1 = in.nextInt();
        int num2 = in.nextInt();
//        if(num1 < num2){
//            for(int i = 1 ;i<=num1;i++){
//                if(num1 % i == 0 && num2 % i ==0){
//                    arrayList1.add(i);
//                }
//            }
//        }
//        else{
//            for(int i = 1 ;i<=num2;i++){
//                if(num1 % i == 0 && num2 % i ==0){
//                    arrayList1.add(i);
//                }
//            }
//        }
//        int max = 0;
//        for(int i = 0;i<arrayList1.size();i++){10
//            if(arrayList1.get(i) > max){
//                max = arrayList1.get(i);
//            }
//        }
//        System.out.println(max);
        int min = Math.min(num1,num2);
        while(min > 0){
            if(num1 % min == 0 && num2 % min == 0){
                System.out.println(min);
                break;
            }
            min --;
        }
    }
}
