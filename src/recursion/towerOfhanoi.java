package recursion;

public class towerOfhanoi {
    static void TOH(int n, char A,char B,char C){
        if(n == 0){
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("Move " + n +"th disk from " + A  + " To " + C);
        TOH(n-1,B,A,C);
    }
}
