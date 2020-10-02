import java.util.ArrayList;

public class MergeSort {
    long numComp = 0;

    void merge(ArrayList<Integer> arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create two arrays
        ArrayList<Integer> L = new ArrayList<Integer>();
        ArrayList<Integer> R = new ArrayList<Integer>();

        // Copy our data to necessary array
        for (int i = 0; i < n1; ++i) {
            L.add(arr.get(l + i));
        }
        for (int j = 0; j < n2; ++j) {
            R.add(arr.get(m + 1 + j));
        }

        // Merge two arrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;

        while (i < n1 && j < n2) {
            ++this.numComp;
            if (L.get(i) <= R.get(j)) {
                arr.set(k, L.get(i));
                i++;
            }
            else {
                arr.set(k, R.get(j));
                j++;
            }
            k++;
        }

        // Copy all remaining elements if they are there.
        while (i < n1) {
            arr.set(k, L.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k, R.get(j));
            j++;
            k++;
        }
    }

    long sort(ArrayList<Integer> arr, int l, int r) {
        if (l < r) {
            // Firstly find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge sorted parts
            merge(arr, l, m, r);
        }
        return this.numComp;
    }

    public static long main(ArrayList<Integer> arr) {
        MergeSort mergeSort = new MergeSort();
        return mergeSort.sort(arr, 0, arr.size() - 1);
    }

}
