package bitmagic;

public class powerSet {
    static void powerset(String str){
        int count = (int)(Math.pow(2,str.length()));
        int n = str.length();
        for(int i = 0;i<count;i++){
            for(int j = 0;j<n;j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(str.charAt(j));
                } else{
                    System.out.print("");
            }
            }
            System.out.println();
        }
    }
}
