package recursion;

public class PrintNTo1 {
//    static void printNto1(int n){
//        if(n == 0){
//            return;
//        }
//        System.out.print(n + " ");
//        printNto1(n-1);
//    }

    static void printNto1(int i,int n){
        if(i > n){
            return;
        }
        else{
            System.out.println(n);
            printNto1(1,n-1);
        }
    }
}
