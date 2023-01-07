package recursion;

public class TowerOfHanoi1 {
    static int towerOfHanoi1(int n, int sou, int des, int aux){
        if(n == 1){
            System.out.println();
        }
        towerOfHanoi1(n-1,1,3,2);
        System.out.println("Move disk "+n+" from " + sou +" to " + des);
        towerOfHanoi1(n-1,2,3,1);
        return 1;
    }
}
