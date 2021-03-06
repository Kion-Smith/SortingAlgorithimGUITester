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
 * CS3345-501
 * 
 * REVISED FROM CS2336
 * ELEMENT OF GUI
 */

public class SortingButtons extends JPanel
{
	//need to add setters and getters

	//Variables 
	private JButton insertSort,selecSort,quickSort,mergeSort,heapSort,radixSort;//have to make this like this
	private Border sortingBorder;
	private CompoundBorder combinedSortingBorder;
	
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
