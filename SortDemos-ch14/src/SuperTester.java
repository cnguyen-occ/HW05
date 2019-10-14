
public class SuperTester 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a = new int[10000];
		int[] b = new int [10000];
		for(int i = 0; i < 10000; i++)
		{
			a[i] = i + 1;
		}
		int j = 0;
		int i = 10000;
		for(j = 0; j < a.length; j++)
		{
			b[j] = i;
			i--;
		}
        int[] c = ArrayUtil.randomIntArray(10000, 10000);
        
        System.out.println("Selection Sort:");
        //SelectionSorter.sort(a);
        //SelectionSorter.sort(b);
        //SelectionSorter.sort(c);
        System.out.println("Insertion Sort: ");
        //InsertionSorter.sort(a);
        //InsertionSorter.sort(b);
        //InsertionSorter.sort(c);
        System.out.println("Quicksort: ");
        QuickSorter.sort(a);
        QuickSorter.sort(b);
        QuickSorter.sort(c);

	}

}
