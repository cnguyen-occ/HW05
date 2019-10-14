/**
   The sort method of this class sorts an array, using the quick 
   sort algorithm.
 */
public class QuickSorter
{
	private static long comps = 0;
	private static long swaps = 0;
    /**
      Sorts an array, using quick sort.
      @param a the array to sort
     */
    public static void sort(int[] a)
    {  
        sort(a, 0, a.length - 1);
        System.out.println("comps: " + getCompareCounter());
        System.out.println("swaps: " + getVisitCounter());
        resetCompareCounter();
        resetVisitCounter();
    }

    /**
      Sorts a portion of an array, using quick sort.
      @param a the array to sort
      @param from the first index of the portion to be sorted
      @param to the last index of the portion to be sorted
     */
    public static void sort(int[] a, int from, int to)
    {
        if (from >= to) { return; }
        int p = partition(a, from, to);
        sort(a, from, p);
        sort(a, p + 1, to);
    }

    /**
      Partitions a portion of an array.
      @param a the array to partition
      @param from the first index of the portion to be partitioned
      @param to the last index of the portion to be partitioned
      @return the last index of the first partition
     */
    private static int partition(int[] a, int from, int to)
    {
        int pivot = a[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j)
        {
            i++; while (a[i] < pivot) { i++; comps++; }
            j--; while (a[j] > pivot) { j--; comps++; }
            if (i < j) 
            {
            	ArrayUtil.swap(a, i, j); 
            	swaps++;
            }
        }
        return j;
    }
    
    public static long getCompareCounter()
    {
    	return comps;
    }
    
    public static long getVisitCounter()
    {
    	return swaps;
    }
    
    public static void resetCompareCounter()
    {
    	comps = 0;
    }
    
    public static void resetVisitCounter()
    {
    	swaps = 0;
    }
}
