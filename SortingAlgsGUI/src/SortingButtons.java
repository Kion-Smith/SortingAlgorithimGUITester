import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
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
		setBorder(sortingBorder);
		
		setLayout(new GridBagLayout() );
		GridBagConstraints gc = new GridBagConstraints();
		//gc.insets = new Insets(50,50,50,50);
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.ipadx = 60;
		gc.ipady = 35;
		
		gc.weightx =1;
		gc.weighty =1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		insertSort.setSize(100,100);
		add(insertSort,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		
		add(selecSort,gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		
		add(quickSort,gc);
		
		gc.gridx = 0;
		gc.gridy = 3;
		
		add(mergeSort,gc);
		gc.gridx = 0;
		gc.gridy = 4;
		
		add(heapSort,gc);
		
		gc.gridx = 0;
		gc.gridy = 5;
		
		add(radixSort,gc);
		
		
		
		
		
		//sortingAlgs.add(quickSort);
		//sortingAlgs.add(mergeSort);
	//	sortingAlgs.add(heapSort);
	//	sortingAlgs.add(radixSort);
		
	}
}
