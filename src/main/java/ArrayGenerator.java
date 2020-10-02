import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayGenerator {

    public static ArrayList<Integer> random (int power) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < Math.pow(2, power); i++) {
            arr.add(random.nextInt());
        }
        return arr;
    }

    public static ArrayList<Integer> sorted_random (int power) {
        ArrayList<Integer> arr = ArrayGenerator.random(power);
        Collections.sort(arr);
        return arr;
    }

    public static ArrayList<Integer> sorted_reverse (int power) {
        ArrayList<Integer> arr = ArrayGenerator.sorted_random(power);
        Collections.reverse(arr);
        return arr;
    }

    public static ArrayList<Integer> random123 (int power) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        Integer[] ss = {1, 2, 3};
        for (int i = 0; i < Math.pow(2, power); i++) {
            int randomNumber = random.nextInt(ss.length);
            arr.add(ss[randomNumber]);
        }
        return arr;

    }
}
