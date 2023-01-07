package bitmagic;

public class MaximumAndSum {
    static void maxAndSum(){
        int arr[] = {4,8,12,16};
        int result = 0;
        for(int i = 31;i>=0;i--){
            int count = 0;
            for(int j = 0;j< arr.length;j++){
                if(arr[j] < result){
                    continue;
                }
                int AND = arr[j] & (1 << i);
                if(AND != 0){
                    count++;
                }
            }
            if(count > 1){
                result += Math.pow(2,i);
                System.out.println(result);
            }
        }
        System.out.println(result);
    }
}
