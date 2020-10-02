import java.util.ArrayList;
// algorithm works correctly comparisons num

public class InsertionSort {
    public static long sort(ArrayList<Integer> arr) {
        int N = arr.size();
        long numComp = 0;
        // p - partition element
        for (int p = 1; p < N; p++) {
            int key = arr.get(p);
            int i = p - 1;
            while(i >= 0) {
                // use this form for easier calculating of comparisons
                numComp++;
                if (arr.get(i) > key) {
                    arr.set(i+1, arr.get(i));
                    i--;
                }
                else {break;}
            }
            arr.set(i+1, key);
        }
        return numComp;
    }
}