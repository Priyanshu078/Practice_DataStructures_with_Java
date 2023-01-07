package SimpleProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
public class HashTableUse {
    static boolean hashtableuse(int[] arr) {
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            if (ht1.contains(arr[i])) {
                ht1.put(arr[i], ht1.get(arr[i]) + 1);
            } else {
                ht1.put(arr[i], 1);
            }
        }
        ArrayList<Integer> aa = new ArrayList<>(ht1.values());
        Collections.sort(aa);
        return true;
    }
}
