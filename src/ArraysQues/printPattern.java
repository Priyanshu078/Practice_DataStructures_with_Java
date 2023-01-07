package ArraysQues;

import java.util.ArrayList;

public class printPattern {
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> printPattern(int n){
        ArrayList<Integer> arr;
//        if(n == 0){
//            return new ArrayList<>();
//        }
//        arr = printPattern(n-1);
//        arr.add(n);
//        return arr;

        if(n < 0){
            arr = new ArrayList<>(list);
            arr.add(n);
            return arr;
        }
        list.add(n);
        arr = printPattern(n-5);
        arr.add(n);
        return arr;
    }
}
