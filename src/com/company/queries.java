package com.company;

public class queries {
    public static void main(String[] args) {
        String input[] = {"abc", "ab", "abc"};
        String queries[] = {"abc","ab"};
        for(int i = 0;i<queries.length;i++){
            int count = 0;
            for(int j = 0;j<input.length;j++){
                if(input[j] == queries[i]) {
                    count += 1;
                }
            }
            System.out.print(count + " ");
        }
    }
}
