import java.util.ArrayList;

// algorithm works correctly

public class SelectionSort
{
    public static long sort(ArrayList<Integer> arr)
    {
        int N = arr.size();
        long numCompare = 0;
        for (int i = 0; i < N; i++)
        {
            int min = i;
            int min_el = arr.get(i);
            
            for (int j = i+1; j < N; j++)
            {
                numCompare ++;
                if (arr.get(j) < arr.get(min))
                {
                    min = j;
                }
            }
            arr.set(i, arr.get(min));
            arr.set(min, min_el);
        }
        return numCompare;
    }
}