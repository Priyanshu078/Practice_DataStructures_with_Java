package SimpleProblems;

public class AlikeStrings {
    static boolean alikeStrings(String str){
        char[] charArray = str.toCharArray();
        int mid = charArray.length/2;
        int count1half = 0;
        int count2half = 0;
        for(int i = 0;i<mid;i++){
            switch (charArray[i]) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> count1half += 1;
            }
        }
        for(int i = mid;i<charArray.length;i++){
            switch (charArray[i]){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> count2half += 1;
            }
        }
        System.out.println(count1half +" "+ count2half);
        return count1half == count2half;
    }
}
