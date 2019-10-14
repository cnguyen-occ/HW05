/**
   The sort method of this class sorts an array, using the selection 
   sort algorithm.
 */
public class SelectionSorter
{
	private static long comps = 0;
	private static long swaps = 0;
    /**
      Sorts an array, using selection sort.
      @param a the array to sort
     */
    public static void sort(int[] a)
    {  
        for (int i = 0; i < a.length - 1; i++)
        {  
            int minPos = minimumPosition(a, i);
            ArrayUtil.swap(a, minPos, i);
            
            
        }
        System.out.println("comps: " + getCompareCounter());
        System.out.println("swaps: " + getVisitCounter());
        resetCompareCounter();
        resetVisitCounter();
    }

    /**
      Finds the smallest element in a tail range of the array.
      @param a the array to sort
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
     */
    private static int minimumPosition(int[] a, int from)
    {  
        int minPos = from;
        for (int i = from + 1; i < a.length; i++)
        {
            if (a[i] < a[minPos]) 
            { 
            	minPos = i; 
            	comps++;
            	
            }
        }
        if(minPos != from)
            swaps++;
        return minPos;
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
