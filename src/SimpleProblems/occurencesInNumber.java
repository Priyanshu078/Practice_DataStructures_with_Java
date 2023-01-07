package SimpleProblems;

public class occurencesInNumber {
    static int occurences(int n, int k){
        int count = 0;
        while(n > 0){
            int last = n%10;
            if(last == k){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
