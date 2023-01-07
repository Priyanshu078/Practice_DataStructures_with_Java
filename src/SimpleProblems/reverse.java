package SimpleProblems;

public class reverse {
    static int reverseNumber(int n){
        int reverse = 0;
        while(n > 0){
            int last = n % 10;
            reverse = reverse * 10 + last;
            n /= 10;
        }
        return reverse;
    }
}
