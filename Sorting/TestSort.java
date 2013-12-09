public class TestSort
{

	private static int[] array ;

	public static void main(String[] args)
	{
		initArray() ;

		SelectionSort s = new SelectionSort(array) ;
		s.sort() ;
		
		printArray() ;
	}

	private static void printArray()
	{
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ") ;
		}
		System.out.print("\n") ;
	}

	private static void initArray()
	{
		array = new int[] {3, 15, 23, 75, 2, 4, 1, 46, 26, 34, 2, 199,9} ;
	}

}		
