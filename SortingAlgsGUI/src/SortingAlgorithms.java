
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
		startTime = System.nanoTime();
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
		startTime = System.nanoTime();
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
		 startTime = System.nanoTime();
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
		startTime = System.nanoTime();
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
		startTime = System.nanoTime();
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
		 /** Heap sort method */
	public  <E extends Comparable<E>> void heapSort(E[] list) 
	{
		  // Create a Heap of integers
		  Heap<E> heap = new Heap<>();
		 
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
		
	}
	public <E extends Comparable<E>>  void radixSort(E[] list)
	{ /*
		E[] bucket = (E[])new java.util.ArrayList[t+1];
		// Distribute the elements from list to buckets
		for (int i = 0; i < list.length; i++) 
		{
			int key = list[i].getKey(); // Assume element has the getKey() method
			if (bucket[key] == null)
				bucket[key] = new java.util.ArrayList<>();
			bucket[key].add(list[i]);
		 }
		
		// Now move the elements from the buckets back to list
		int k = 0; // k is an index for list
		for (int i = 0; i < bucket.length; i++) 
		{
			if (bucket[i] != null) 
			{
				for (int j = 0; j < bucket[i].size(); j++)
					list[k++] = bucket[i].get(j);
			}
		 }
		}
		*/
	}
	
	
	public class Heap<E extends Comparable<E>> {
		  private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		 
		  /** Create a default heap */
		  public Heap() {
		  }
		 
		  /** Create a heap from an array of objects */
		  public Heap(E[] objects) 
		  {
			for (int i = 0; i < objects.length; i++)
			add(objects[i]);
		  }

		 /** Add a new object into the heap */
		 public void add(E newObject) {
		 list.add(newObject); // Append to the heap
		 int currentIndex = list.size() - 1; // The index of the last node

		 while (currentIndex > 0) {
		 int parentIndex = (currentIndex - 1) / 2;
		  // Swap if the current object is greater than its parent
		 if (list.get(currentIndex).compareTo(
		 list.get(parentIndex)) > 0) {
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
		 public E remove() {
		 if (list.size() == 0) return null;

		 E removedObject = list.get(0);
		 list.set(0, list.get(list.size() - 1));
		 list.remove(list.size() - 1);

		 int currentIndex = 0;
		 while (currentIndex < list.size()) {


		 int leftChildIndex = 2 * currentIndex + 1;
		 int rightChildIndex = 2 * currentIndex + 2;

		 // Find the maximum between two children
		 if (leftChildIndex >= list.size()) break; // The tree is a heap
		 int maxIndex = leftChildIndex;
		 if (rightChildIndex < list.size()) {
		 if (list.get(maxIndex).compareTo(
		 list.get(rightChildIndex)) < 0) {
		 maxIndex = rightChildIndex;
		 }
		 }

		 // Swap if the current node is less than the maximum
		 if (list.get(currentIndex).compareTo(
		 list.get(maxIndex)) < 0) {
		 E temp = list.get(maxIndex);
		 list.set(maxIndex, list.get(currentIndex));
		 list.set(currentIndex, temp);
		 currentIndex = maxIndex;
		 }
		 else
		 break; // The tree is a heap
		 }

		 return removedObject;
		 }

		 /** Get the number of nodes in the tree */
		 public int getSize() {
		 return list.size();
		 }
		 }
	
}
