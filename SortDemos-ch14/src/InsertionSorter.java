/**
   The sort method of this class sorts an array, using the insertion 
   sort algorithm.
 */
public class InsertionSorter
{
	public static long comps = 0;
	public static long swaps = 0;
    /**
      Sorts an array, using insertion sort.
      @param a the array to sort
     */
    public static void sort(int[] a)
    {
    	//boolean check = false;	
        for (int i = 1; i < a.length; i++)
        {
            int next = a[i];
            // Move all larger elements up
            int j = i -1;
            //while (j > 0 && a[j - 1] > next)
            while(j >= 0 && a[j] > next)
            {
            	comps++;
            	a[j + 1] = a[j];
            	
            	
            	j--;
            	
            }
            if(a[j + 1] != next)
            	swaps++;
            a[j + 1] = next;
            
            
            
            
        }
        System.out.println("comps: " + getCompareCounter());
        System.out.println("Swaps: " + getVisitCounter());
        resetCompareCounter();
        resetVisitCounter();
      
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
