package SimpleProblems;

public class ArmstrongNumber {
    static boolean armstrong(int n){
        int ori = n;
        int result = 0;
        while(n>0){
            int last = n % 10;
            result += (int) Math.pow(last,3);
            n/=10;
        }
        System.out.println(result);
        return result == ori;
    }
}
