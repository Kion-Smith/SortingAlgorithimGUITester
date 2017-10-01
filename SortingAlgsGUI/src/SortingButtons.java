import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 */
//ELEMENT OF SORTING TECHNIQUES
public class SortingButtons extends JPanel
{
	//need to add setters and getters

	//Variables 
	private JButton insertSort,selecSort,quickSort,mergeSort,heapSort,radixSort;
	private Border sortingBorder;
	private CompoundBorder combinedSortingBorder;
	
	
	/* 
	 ////////////INSERTION SORT/////////////////////////////////////
	 
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
	 
	 ////////////SELECTION SORT/////////////////////////////////////
	  
	 for (int i = 0; i < list.length - 1; i++) 
{
   Find the minimum in the list[i..list.length-1]
  double currentMin = list[i];
  int currentMinIndex = i;
 
	for (int j = i + 1; j < list.length; j++) 
	{
		if (currentMin > list[j]) 
		{
			currentMin = list[j];
			currentMinIndex = j;
		}
	}

  Swap list[i] with list[currentMinIndex] if necessary
	if (currentMinIndex != i) 
	{
		list[currentMinIndex] = list[i];
		list[i] = currentMin;
	}
 }
 
 ////////////QUICK SORT/////////////////////////////////////
  * 
 private static void quickSort(int[] list, int first, int last) {
    if (last > first) {
      int pivotIndex = partition(list, first, last);
      quickSort(list, first, pivotIndex - 1);
      quickSort(list, pivotIndex + 1, last);
    }
  }


  private static int partition(int[] list, int first, int last) {
    int pivot = list[first]; // Choose the first element as the pivot
    int low = first + 1; // Index for forward search
    int high = last; // Index for backward search

    while (high > low) {
      // Search forward from left
      while (low <= high && list[low] <= pivot)
        low++;

      // Search backward from right
      while (low <= high && list[high] > pivot)
        high--;

      // Swap two elements in the list
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }

    while (high > first && list[high] >= pivot)
      high--;

    // Swap pivot with list[high]
    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      return high;
    }
    else {
      return first;
    }
  }
 
  ////////////MERGE SORT/////////////////////////////////////
   * 
  public static void mergeSort(int[] list) {
    if (list.length > 1) {
      // Merge sort the first half
      int[] firstHalf = new int[list.length / 2];
      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
      mergeSort(firstHalf);

      // Merge sort the second half
      int secondHalfLength = list.length - list.length / 2;
      int[] secondHalf = new int[secondHalfLength];
      System.arraycopy(list, list.length / 2,
        secondHalf, 0, secondHalfLength);
      mergeSort(secondHalf);

      // Merge firstHalf with secondHalf into list
      merge(firstHalf, secondHalf, list);
    }
  }

  
  public static void merge(int[] list1, int[] list2, int[] temp) {
    int current1 = 0; // Current index in list1
    int current2 = 0; // Current index in list2
    int current3 = 0; // Current index in temp

    while (current1 < list1.length && current2 < list2.length) {
      if (list1[current1] < list2[current2])
        temp[current3++] = list1[current1++];
      else
        temp[current3++] = list2[current2++];
    }

    while (current1 < list1.length)
      temp[current3++] = list1[current1++];

    while (current2 < list2.length)
      temp[current3++] = list2[current2++];
  }
	 
	  ////////////HEAP SORT/////////////////////////////////////
	   
	   public static <E extends Comparable<E>> void heapSort(E[] list) 
{

  Heap<E> heap = new Heap<>();
 

  // Add elements to the heap
  for (int i = 0; i < list.length; i++)
  heap.add(list[i]);

 // Remove elements from the heap
 for (int i = list.length - 1; i >= 0; i--)
 list[i] = heap.remove();
 }
	   
	*/
	
	////////////RADIX SORT/////////////////////////////////////
	
	public SortingButtons()
	{
		
		//Instantiate buttons
		insertSort = new JButton("Insertion Sort");
		selecSort = new JButton("Selection Sort");
		quickSort = new JButton("Quick Sort");
		mergeSort = new JButton("Merge Sort");
		heapSort = new JButton("Heap Sort");
		radixSort = new JButton("Radix Sort");
		
		//Instantiate border, and combined to create the compound border
		sortingBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		combinedSortingBorder= new CompoundBorder(sortingBorder, new EmptyBorder(10,10,10,10));
		//set the border
		
		//set the layout to Grid bag and and the constraints object
		setBorder(combinedSortingBorder);
		setLayout(new GridBagLayout() );
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.fill = GridBagConstraints.BOTH;//set all elements to fill the horizontal elements
		gc.ipadx = 60;//set the size of the buttons
		gc.ipady = 30;//set the size of the buttons
	
		//Insertion sort button
		gc.gridx = 1;//set location within the panel
		gc.gridy = 0;//set location within the panel
		add(insertSort,gc);
		
		//Selection sort button
		gc.gridx = 1;
		gc.gridy = 1;
		add(selecSort,gc);
		
		//quick sort button
		gc.gridx = 1;
		gc.gridy = 2;
		add(quickSort,gc);
		
		//merge sort button
		gc.gridx = 1;
		gc.gridy = 3;
		add(mergeSort,gc);
		
		//heap sort button
		gc.gridx = 1;
		gc.gridy = 4;
		add(heapSort,gc);
		
		//radix sort button
		gc.gridx = 1;
		gc.gridy = 5;
		add(radixSort,gc);

		
	}
	//Getters
	public JButton getInsetSort()
	{
		return insertSort;
	}
	public JButton getSelecSort()
	{
		return selecSort;
	}
	public JButton getQuickSort()
	{
		return quickSort;
	}
	public JButton getMergeSort()
	{
		return mergeSort;
	}
	public JButton getHeapSort()
	{
		return heapSort;
	}
	public JButton getRadixSort()
	{
		return radixSort;
	}
	public Border getBorder()
	{
		return sortingBorder;
	}
	public CompoundBorder getCompBorder()
	{
		return combinedSortingBorder;
	}

	//setters
	public void setInsetSort(JButton j)
	{
		 insertSort = j;
	}
	public void setSelecSort(JButton j)
	{
		 selecSort = j;
	}
	public void setQuickSort(JButton j)
	{
		 quickSort = j;
	}
	public void setMergeSort(JButton j)
	{
		 mergeSort = j;
	}
	public void setHeapSort(JButton j)
	{
		 heapSort = j;
	}
	public void setRadixSort(JButton j)
	{
		 radixSort = j;
	}
	public void getBorder(Border j)
	{
		 sortingBorder = j;
	}
	public void setCompBorder(CompoundBorder j)
	{
		combinedSortingBorder = j;
	}
}
