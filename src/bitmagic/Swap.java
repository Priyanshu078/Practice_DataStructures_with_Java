package bitmagic;

public class Swap {



    static void swapOddEven(int n){

        // O(log(n)) solution


//        int binary = 0;
//        int count = 0;
//        while(n > 0){
//            int remainder = n % 2;
//            remainder = remainder << count;
//            binary = binary | remainder;
//            count++;
//            n /= 2;
//        }
//        int evenBits = 0;
//        int oddBits = 0;
//        count = 0;
//        while(binary > 0){
//            int remainder = binary%2;
//            if((count + 1)%2 != 0){
//                remainder = remainder << count;
//                oddBits = oddBits | remainder;
//            }
//            else{
//                remainder = remainder << count;
//                evenBits = evenBits | remainder;
//            }
//            count++;
//            binary /=2;
//        }
//        System.out.println(evenBits);
//        evenBits = evenBits >> 1;
//        System.out.println(evenBits);
//        System.out.println(oddBits);
//        oddBits = oddBits << 1;
//        System.out.println(oddBits);
//        System.out.println(evenBits | oddBits);

        // O(1) solution

        int evenbits = n & 0xAAAAAAAA;
        int oddbits = n & 0x55555555;

        oddbits = oddbits << 1;
        evenbits = evenbits >> 1;

        int evenOddSwaped = evenbits | oddbits;
        System.out.println(evenOddSwaped);
    }




}
