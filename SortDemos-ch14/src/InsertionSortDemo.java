import java.util.Arrays;

/**
   This program demonstrates the insertion sort algorithm.
 */
@SuppressWarnings("unused")
public class InsertionSortDemo
{  
    public static void main(String[] args)
    {  
    	
    		//StopWatch watch = new StopWatch();
    		int[] a = new int[10000];
    		int[] b = new int [10000];
    		for(int i = 0; i < 10000; i++)
    		{
    			a[i] = i + 1;
    		}
    		for(int i = 9999; i >= 0; i--)
    		{
    			b[i] = i + 1;
    		}
            int[] c = ArrayUtil.randomIntArray(10000, 10000);
            //System.out.println(i + ": " + Arrays.toString(a));
            //watch.start();
            InsertionSorter.sort(a);
            InsertionSorter.sort(b);
            InsertionSorter.sort(c);
            //watch.stop();
            //System.out.println(i + ": " + watch.getElapsedTime());

            //System.out.println(Arrays.toString(a));
    	
    }
}
