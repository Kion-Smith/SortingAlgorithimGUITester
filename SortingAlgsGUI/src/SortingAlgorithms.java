import java.util.ArrayList;

public class SortingAlgorithms
{
	//add setters and getters
	private int comparison;
	private String dataType;//how it was implmented
	private String sortType;
	private int comparisons;
	private int movements;
	private long startTime;
	private long endTime;
	
	private String winAlg;
	
	public void insertSort(int[] list)
	{
		comparisons =0;
		movements = 0;
		startTime = System.currentTimeMillis();
		for (int i = 1; i < list.length; i++) 
		{
		  //Insert list[i] into a sorted sublist list[0..i-1] so that
		  //list[0..i] is sorted. 
		//comparisons++;
		  int currentElement = list[i];
		  int k;
		  for (k = i - 1; k >= 0 && list[k] > currentElement; k--) 
		  {
			 comparisons++;
			
			list[k + 1] = list[k];
			 
		  }

		 // Insert the current element into list[k + 1]
		 list[k + 1] = currentElement;
		 movements++;
		 
		 }
		endTime = System.currentTimeMillis() - startTime;
		
	
	}
	public void selectionSort(int[] list)
	{
		
		comparisons =0;
		movements = 0;
		startTime = System.currentTimeMillis();
		 for (int i = 0; i < list.length - 1; i++) 
		 {
			 //Find the minimum in the list[i..list.length-1]
			 int currentMin = list[i];
			 int currentMinIndex = i;
			 //comparisons++;
			 for (int j = i + 1; j < list.length; j++) 
			 {	comparisons++;
				 if (currentMin > list[j]) 
				 {
					 currentMin = list[j];
					 currentMinIndex = j;
				 }
			 }

			 // Swap list[i] with list[currentMinIndex] if necessary
			 if (currentMinIndex != i) 
			 {	
			 	movements++;
				 list[currentMinIndex] = list[i];
				 list[i] = currentMin;
			 }
		 }
		 endTime = System.currentTimeMillis() - startTime;
	}
	public void quickSortCaller(int[] list)
	{
		comparisons =0;
		movements = 0;
		startTime = System.currentTimeMillis();
		
		quickSort(list, 0, list.length - 1);
	}
	 public void quickSort(int[] list, int first, int last) 
	 {
		
		 if (last > first)
		 {
			 int pivotIndex = quickSortPartiton(list, first, last);
			 quickSort(list, first, pivotIndex - 1);
			 quickSort(list, pivotIndex + 1, last);
		 }
		 endTime = System.currentTimeMillis() - startTime;
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
	    		comparisons++;
	    	}

	    	// Search backward from right
	    	while (low <= high && list[high] > pivot)
	    	{
	    		high--;
	    		comparisons++;
	    	}

	      // Swap two elements in the list
	    	if (high > low)
	    	{
	    		movements++;
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
	    	movements++;
	      list[first] = list[high];
	      list[high] = pivot;
	      return high;
	    }
	    else 
	    {
	      return first;
	    }
	}
	public void mergeSortCaller(int[] list)
	{
		comparisons =0;
		movements = 0;
		
		startTime = System.currentTimeMillis();
		mergeSort(list);
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
		endTime = System.currentTimeMillis() - startTime;
	}	
	public void merge(int[] list1, int[] list2, int[] temp) 
	{
	
	    int current1 = 0; // Current index in list1
	    int current2 = 0; // Current index in list2
	    int current3 = 0; // Current index in temp

	    while (current1 < list1.length && current2 < list2.length) 
	    {
	    	comparisons++;
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
	    	comparisons++;
	    	 movements++;
	      temp[current3++] = list1[current1++];
	    }

	    while (current2 < list2.length)
	    {
	    	comparisons++;
	    	 movements++;
	      temp[current3++] = list2[current2++];
	    }
	}
		 /** Heap sort method */
	public void heapSort(int[] list) 
	{	
		comparisons =0;
		movements = 0;
		  // Create a Heap of integers
		startTime = System.currentTimeMillis();
		  Heap<Integer> heap = new Heap<>();
		 
		 // Add elements to the heap
		 for (int i = 0; i < list.length; i++) 
		 {
			   heap.add(list[i]);
		 }

		 // Remove elements from the heap
		 for(int i = list.length - 1; i >= 0; i--)
		 {
			 list[i] = heap.remove();
		 }
		 endTime = System.currentTimeMillis() - startTime;
	}
	public void radixSort(int[] list, int max)
	{ 
		comparisons =0;
		movements = 0;
		startTime = System.currentTimeMillis();
		  for (int order = 1; order < max; order *= 10) 
		  {
			   ArrayList<Integer>[] bucket = new ArrayList[10];
			   
			   for (int i = 0; i < bucket.length; i++) 
			   {
				   bucket[i] = new java.util.ArrayList<>();
			   }
			   
			   for (int i = 0; i < list.length; i++) 
			   {
				   bucket[(list[i] / order) % 10].add(list[i]);
				   comparisons++;
			   }
			   
			   int k = 0;
			   for (int i = 0; i < bucket.length; i++) 
			   {
				   if(bucket[i] != null) 
				   {
					   
					   for (int j = 0; j < bucket[i].size(); j++)
					   {
						   comparisons++;
						   list[k++] = bucket[i].get(j);
						   movements++;
					   }
				   }
			   }
		  }
		  
		  endTime = System.currentTimeMillis() - startTime;
	}

	public class Heap<E extends Comparable<E>> 
	{
		  private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		 
		  /** Create a default heap */
		  public Heap() 
		  {
			  
		  }
		 
		  /** Create a heap from an array of objects */
		  public Heap(E[] objects) 
		  {
			for (int i = 0; i < objects.length; i++)
			add(objects[i]);
		  }

		 /** Add a new object into the heap */
		 public void add(E newObject) 
		 {
			 list.add(newObject); // Append to the heap
			 int currentIndex = list.size() - 1; // The index of the last node

			 while (currentIndex > 0) 
			 {
				 comparisons++;
				 int parentIndex = (currentIndex - 1) / 2;
		  // Swap if the current object is greater than its parent
				 if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) 
				 {
					 movements++;
					 E temp = list.get(currentIndex);
					 list.set(currentIndex, list.get(parentIndex));
					 list.set(parentIndex, temp);
				 }
				 else
					 break; // The tree is a heap now

				 currentIndex = parentIndex;
			 }
		 }

		 /** Remove the root from the heap */
		 public E remove() 
		 {
			 if (list.size() == 0) 
				 return null;

			 E removedObject = list.get(0);
			 list.set(0, list.get(list.size() - 1));
			 list.remove(list.size() - 1);

			 int currentIndex = 0;
			 while (currentIndex < list.size()) 
			 {
				 comparisons++;
				 int leftChildIndex = 2 * currentIndex + 1;
				 int rightChildIndex = 2 * currentIndex + 2;

				 // Find the maximum between two children
				 if (leftChildIndex >= list.size()) 
					 break; // The tree is a heap
				 int maxIndex = leftChildIndex;
				 if (rightChildIndex < list.size()) 
				 {
					 if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) 
					 {
						 maxIndex = rightChildIndex;
						 movements++;
					 }
				 }

		 // Swap if the current node is less than the maximum
				 if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) 
				 {
					 E temp = list.get(maxIndex);
					 list.set(maxIndex, list.get(currentIndex));
					 list.set(currentIndex, temp);
					 currentIndex = maxIndex;
					 movements++;
				 }
				 else
					 break; // The tree is a heap
			 }	

			 return removedObject;
		 }

		 /** Get the number of nodes in the tree */
		 public int getSize() 
		 {
			 return list.size();
		 }
	}
	
	public long getStartTime()
	{
		return startTime;
	}
	public long getEndTime()
	{
		return endTime;
	}
	public int getComparisons()
	{
		return comparisons;
	}
	public int getMovements()
	{
		return movements;
	}
	
	
}
