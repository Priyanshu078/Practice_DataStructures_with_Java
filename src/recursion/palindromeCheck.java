package recursion;

public class palindromeCheck {
    static boolean checkPalindrome(int start,int end,String a){
        if(start >= end) {
            return true;
        }
        else{
            return ((a.charAt(start) == a.charAt(end))&& checkPalindrome(start + 1, end - 1, a));
        }
    }
}
