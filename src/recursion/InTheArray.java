package recursion;

public class InTheArray {
    static boolean present(int[] arr,int l,int r,int x){
        if(l > r){
            return false;
        }
        if(arr[l] == x){
            return true;
        }
        if(arr[r] == x){
            return true;
        }
        else{
            return present(arr,l+1,r-1,x);
        }
    }
}
