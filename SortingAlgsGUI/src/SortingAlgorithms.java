
public class SortingAlgorithms
{
	public void insertSort(int[] list)
	{
		for (int i = 1; i < list.length; i++) 
		{
		  //Insert list[i] into a sorted sublist list[0..i-1] so that
		  //list[0..i] is sorted. 
		  
		  int currentElement = list[i];
		  int k;
		  for (k = i - 1; k >= 0 && list[k] > currentElement; k--) 
		  {
			list[k + 1] = list[k];
		  }

		 // Insert the current element into list[k + 1]
		 list[k + 1] = currentElement;
		 }
		 
	}
	public void selectionSort(int[] list)
	{
		  
		 for (int i = 0; i < list.length - 1; i++) 
		 {
			 //Find the minimum in the list[i..list.length-1]
			 int currentMin = list[i];
			 int currentMinIndex = i;
	 
			 for (int j = i + 1; j < list.length; j++) 
			 {
				 if (currentMin > list[j]) 
				 {
					 currentMin = list[j];
					 currentMinIndex = j;
				 }
			 }

			 // Swap list[i] with list[currentMinIndex] if necessary
			 if (currentMinIndex != i) 
			 {
				 list[currentMinIndex] = list[i];
				 list[i] = currentMin;
			 }
		 }
	}
	 public void quickSort(int[] list, int first, int last) 
	 {
		 if (last > first)
		 {
			 int pivotIndex = quickSortPartiton(list, first, last);
			 quickSort(list, first, pivotIndex - 1);
			 quickSort(list, pivotIndex + 1, last);
		 }
	}
	public int quickSortPartiton(int[] list, int first, int last)
	{
	    int pivot = list[first]; // Choose the first element as the pivot
	    int low = first + 1; // Index for forward search
	    int high = last; // Index for backward search

	    while (high > low) 
	    {
	      // Search forward from left
	    	while (low <= high && list[low] <= pivot)
	    	{
	    		low++;
	    	}

	    	// Search backward from right
	    	while (low <= high && list[high] > pivot)
	    	{
	        high--;
	    		}

	      // Swap two elements in the list
	    	if (high > low)
	    	{
	    		int temp = list[high];
	    		list[high] = list[low];
	    		list[low] = temp;
	    	}
	    }

	    while (high > first && list[high] >= pivot)
	    {
	      high--;
	    }

	    // Swap pivot with list[high]
	    if (pivot > list[high]) 
	    {
	      list[first] = list[high];
	      list[high] = pivot;
	      return high;
	    }
	    else 
	    {
	      return first;
	    }
	}
	
	public void mergeSort(int[] list)
	{
		if (list.length > 1)
		{
		      // Merge sort the first half
		      int[] firstHalf = new int[list.length / 2];
		      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
		      mergeSort(firstHalf);

		      // Merge sort the second half
		      int secondHalfLength = list.length - list.length / 2;
		      int[] secondHalf = new int[secondHalfLength];
		      System.arraycopy(list, list.length / 2,secondHalf, 0, secondHalfLength);
		      mergeSort(secondHalf);

		      // Merge firstHalf with secondHalf into list
		      merge(firstHalf, secondHalf, list);
		}
	}
	public  void merge(int[] list1, int[] list2, int[] temp) 
	{
	    int current1 = 0; // Current index in list1
	    int current2 = 0; // Current index in list2
	    int current3 = 0; // Current index in temp

	    while (current1 < list1.length && current2 < list2.length) 
	    {
	      if (list1[current1] < list2[current2])
	      {
	        temp[current3++] = list1[current1++];
	      }
	      else
	      {
	        temp[current3++] = list2[current2++];
	      }
	    }

	    while (current1 < list1.length)
	    {
	      temp[current3++] = list1[current1++];
	    }

	    while (current2 < list2.length)
	    {
	      temp[current3++] = list2[current2++];
	    }
	}
	public void heapSort() 
	{
		
	}
	public void radixSort()
	{
		
	}
}
