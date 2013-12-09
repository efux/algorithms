/**
 * This class represents the SelectionSort in java. It represents just how the sorting algorithm could
 * be implemented, without further optimizations. O(n^2)
 *
 * @author	Etienne Fux
 */
public class SelectionSort
{
	private int[] sort ;

	public SelectionSort(int[] sort)
	{
		this.sort = sort ;
	}

	private int findMinimum(int from)
	{
		int min = from ;

		for(int i = from; i < sort.length; i++) {
			if(sort[i] < sort[min]) {
				min = i ;
			}
		}

		return min ;
	}

	private void exchange(int a, int b)
	{
		int tmp = sort[a] ;
		sort[a] = sort[b] ;
		sort[b] = tmp ;
	}

	public int[] sort()
	{
		for(int i = 0; i < sort.length; i++) {
			exchange(i, findMinimum(i)) ;
		}

		return sort ;		
	}

}
