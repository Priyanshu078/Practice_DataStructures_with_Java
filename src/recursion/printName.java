package recursion;

public class printName {
//    int count = 0;
    void printname(int i,int n){
        if(i > n){
            return;
        }
        else{
            System.out.println("Paliwal");
            printname(i+1,n);
        }
    }
}
