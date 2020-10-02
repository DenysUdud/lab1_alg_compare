import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class SortTest {

    @Test
    public void testSelection() {
        int[] arr = {4, 6, 2, 3, 4};
        // 10 comparisons
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i<5; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println("Selection Test");
        long num = SelectionSort.sort(arrayList);
        System.out.println(arrayList);
        // (n*(n-1))/2 gives no. of comparisons for selection sort
        System.out.println(num);

    }

    @Test
    public void testInsertion() {
        int[] arr = {4, 6, 2, 3, 4};
        // 1 2 3 2 - 8 comparisons
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println("Insertion Test");
        long num = InsertionSort.sort(arrayList);
        System.out.println(arrayList);
        // N*(N-1)/2
        System.out.println(num);
    }

    @Test
    public void testShell() {
        int[] arr = {4, 6, 2, 3, 5};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println("Shell Test");
        long num = Shellsort.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(num);
    }

    @Test
    public void testMerge() {
        int[] arr = {4, 6, 2, 3, 5};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println("Merge Test");
        long num = MergeSort.main(arrayList);
        System.out.println(arrayList);
        System.out.println(num);
    }

}
