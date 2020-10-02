import java.util.ArrayList;

public class Shellsort {
    public static long sort(ArrayList<Integer> arr) {
        // start with gap
        int N = arr.size();
        int gap = N / 2;
        long numComp =0;

        while (gap > 0) {
            for (int i = gap; i < N; i++) {
                int key = arr.get(i);
                int j = i;
                while (j >= gap) {
                    numComp++;
                    if (arr.get(j - gap) > key) {
                        arr.set(j, arr.get(j-gap));
                        j -= gap;
                        arr.set(j, key);
                    }
                    else {break;}
                }
            }
            gap = gap / 2;
        }
        return numComp;
    }
}
