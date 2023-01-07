package ArraysQues;

public class LragestINAraay {
    static void largest(int arr[]){
        int lar = -1;
        int secLar = -1;
        for(int i = 0;i< arr.length;i++){
            if(lar == -1){
                lar = 0;
            }
            if(arr[i] > arr[lar]){
                secLar = lar;
                lar = i;
            }
            else if(arr[i] < arr[lar]){
                if(arr[i] > arr[secLar]){
                    secLar = i;
                }
            }
        }
        System.out.println(secLar);
    }
}
