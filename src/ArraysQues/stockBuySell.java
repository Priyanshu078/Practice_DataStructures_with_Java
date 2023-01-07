package ArraysQues;

public class stockBuySell {
    static void stockbuysell(int[] price) {
        int buy = 0;
        int sell = 0;
        boolean reverseSorted = true;
        for (int i = 0; i < price.length - 1; i++) {
            if (price[i] < price[i + 1]) {
                reverseSorted = false;
            }
        }

        if (reverseSorted) {
            System.out.println("No Profit");
            return;
        }

        for (int i = 0; i < price.length - 1; i++) {

            if (price[i] < price[i + 1] && i == 0) {
                buy = i;
            } else if (price[i] > price[i + 1] && i == 0) {
                buy = i + 1;
            } else if (price[i] < price[buy]) {
                buy = i;
            }


            if (i + 1 == price.length - 1 && (price[i] < price[i + 1])) {
                sell = i + 1;
                System.out.print("(" + buy + " " + sell + ")");
                buy = i + 2;
                return;
            } else if (i != 0 && price[i] > price[i + 1] && price[i] > price[i - 1]) {
                sell = i;
                System.out.print("(" + buy + " " + sell + ") ");
                buy = i + 1;
            }
        }
        System.out.println();
    }
}
