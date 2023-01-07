package SimpleProblems;

public class Palindrome {
    static void palindrome(String str){
        int start = 0;
        int end = str.length()-1;
        boolean isPalindrome = true;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("Not palindrome");
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("Is palindrome");
        }
    }
}
