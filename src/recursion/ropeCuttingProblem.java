package recursion;

public class ropeCuttingProblem {

    static int max(int a,int b, int c){
        int max = Math.max(a,b);
        return Math.max(max, c);
    }

    static int ropeCutting(int n, int a,int b, int c){
        if(n == 0) return 0;
        if(n < 0) return -1;
        int res = max(
                ropeCutting(n-a,a,b,c),
                ropeCutting(n-b,a,b,c),
                ropeCutting(n-c,a,b,c));
        if (res == -1) return -1;
        return res + 1;
    }
}
