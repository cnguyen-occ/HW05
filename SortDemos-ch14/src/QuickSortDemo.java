import java.util.Arrays;

/**
   This program demonstrates the quick sort algorithm by
   sorting an array that is filled with random numbers.
 */
@SuppressWarnings("unused")
public class QuickSortDemo
{  
    public static void main(String[] args)
    {  
    	for(int i = 1; i < 10; i++)
    	{
    		StopWatch watch = new StopWatch();
            int[] a = ArrayUtil.randomIntArray(i * 10000, 100);
            //System.out.println(i + ": " + Arrays.toString(a));
            watch.start();
            QuickSorter.sort(a);
            watch.stop();
            System.out.println(i + ": " + watch.getElapsedTime());

            //System.out.println(Arrays.toString(a));
    	}
    }
}

