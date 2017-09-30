import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class SortingButtons extends JPanel
{
	//need to add setters and getters

	JButton insertSort;
	JButton selecSort;
	JButton	quickSort;
	JButton mergeSort;
	JButton heapSort;
	JButton radixSort; 
	
	Border sortingBorder;
	
	public SortingButtons()
	{
		
		
		insertSort = new JButton("Insertion Sort");
		selecSort = new JButton("Selection Sort");
		quickSort = new JButton("Quick Sort");
		mergeSort = new JButton("Merge Sort");
		heapSort = new JButton("Heap Sort");
		radixSort = new JButton("Radix Sort");
		
		
	
		
		sortingBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		CompoundBorder s = new CompoundBorder(sortingBorder, new EmptyBorder(10,10,10,10));
		setBorder(s);
		
		
		setLayout(new GridBagLayout() );
		GridBagConstraints gc = new GridBagConstraints();

		gc.fill = GridBagConstraints.HORIZONTAL;
		//gc.gridheight =0;
		//gc.gridwidth = -10;
		//gc.fill = GridBagConstraints.VERTICAL;
		gc.ipadx = 60;
		gc.ipady = 30;
	
		gc.gridx = 1;
		gc.gridy = 0;
		
		add(insertSort,gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		
		add(selecSort,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		
		add(quickSort,gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		
		add(mergeSort,gc);
		gc.gridx = 1;
		gc.gridy = 4;
		
		add(heapSort,gc);
		
		gc.gridx = 1;
		gc.gridy = 5;
		add(radixSort,gc);
		
		
		
		
		
		//sortingAlgs.add(quickSort);
		//sortingAlgs.add(mergeSort);
	//	sortingAlgs.add(heapSort);
	//	sortingAlgs.add(radixSort);
		
	}

}
