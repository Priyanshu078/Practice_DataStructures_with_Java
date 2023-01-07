package recursion;

public class subsetsOfAString {
    static void subsets(String str,String curr,int index){
        if(index == str.length()){
            System.out.print(curr + " ");
            return;
        }
        subsets(str,curr,index + 1);
        subsets(str,curr + str.charAt(index),index + 1);
    }
}
