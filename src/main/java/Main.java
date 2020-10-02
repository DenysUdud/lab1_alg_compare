import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.concurrent.TimeUnit;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            // Firstly make experiment for 2 in power of 7
            // Generate simple array of size 2^7

            // Create arrays with results
            double[] timesSelection = new double[5];
            double[] numSelection = new double[5];

            double[] timesInsertions = new double[5];
            double[] numInsertions = new double[5];

            double[] timesMerge = new double[5];
            double[] numMerge = new double[5];


            double[] timesShell = new double[5];
            double[] numShell = new double[5];

            // make 5 iterations
            for (int i=0; i<5; ++i) {
                // CHANGE THERE POWER AND TYPE
                ArrayList<Integer> arr = ArrayGenerator.random123(15);

                // Selection sort
                ArrayList<Integer> arrCopy = (ArrayList<Integer>) arr.clone();
                long numComp;
                long startTime = System.nanoTime();
                numComp = SelectionSort.sort(arrCopy);
                long endTime = System.nanoTime();
                long timeElapsed = endTime - startTime;
                // Write to array results
                timesSelection[i] = timeElapsed;
                numSelection[i] = numComp;

                // Insertion sort
                arrCopy = (ArrayList<Integer>) arr.clone();
                startTime = System.nanoTime();
                numComp = InsertionSort.sort(arrCopy);
                endTime = System.nanoTime();
                timeElapsed = endTime - startTime;
                // Write to array results
                timesInsertions[i] = timeElapsed;
                numInsertions[i] = numComp;

                // Merge sort
                arrCopy = (ArrayList<Integer>) arr.clone();
                startTime = System.nanoTime();
                numComp = MergeSort.main(arrCopy);
                endTime = System.nanoTime();
                timeElapsed = endTime - startTime;
                // Write to array results
                timesMerge[i] = timeElapsed;
                numMerge[i] = numComp;

                // Shell sort
                arrCopy = (ArrayList<Integer>) arr.clone();
                startTime = System.nanoTime();
                numComp = Shellsort.sort(arrCopy);
                endTime = System.nanoTime();
                timeElapsed = endTime - startTime;
                // Write to array results
                timesShell[i] = timeElapsed;
                numShell[i] = numComp;
            }
            // CHANGE THERE
            System.out.println("Random power 7");
            System.out.println("Selection sort");
            String output1 =  String.format("Average time: %f", average(timesSelection));
            String output2 =  String.format("Average num of comparisons: %f", average(numSelection));
            System.out.println(output1);
            System.out.println(output2);

            System.out.println("Insertion sort");
            output1 =  String.format("Average time: %f", average(timesInsertions));
            output2 =  String.format("Average num of comparisons: %f", average(numInsertions));
            System.out.println(output1);
            System.out.println(output2);

            System.out.println("Merge sort");
            output1 =  String.format("Average time: %f", average(timesMerge));
            output2 = String.format("Average num of comparisons: %f", average(numMerge));
            System.out.println(output1);
            System.out.println(output2);

            System.out.println("Shell sort");
            output1 =  String.format("Average time: %f", average(timesShell));
            output2 = String.format("Average num of comparisons: %f", average(numShell));
            System.out.println(output1);
            System.out.println(output2);
    }

    private static double average(double[] arr) {
        long sum=0;
        for (double v : arr) {
            sum += v;
        }
        double result = (double) sum / (double) arr.length;
        return result;
    }
}
