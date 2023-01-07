package ArraysQues;

public class frequency {
    static void frequencyInArray(int[] arr){
        int curr = arr[0];
        int count = 1;
        for(int i = 0;i<arr.length-1;i++){
            if(curr == arr[i+1]) {
                curr = arr[i];
                count++;
            }
            else{
                System.out.println(curr + " " + count);
                curr = arr[i+1];
                count = 1;
            }
        }
        System.out.println(curr + " " + count);
    }
}
