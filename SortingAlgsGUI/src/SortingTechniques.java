import java.awt.GridBagConstraints;
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 */
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
//START OF GUI
public class SortingTechniques extends JFrame implements ActionListener
{
	//the Panels
	private SortingButtons sortingPanel;
	private SortingProperties propertiesPanel;
	private SortingResults resultsPanel;
	private WinAlgorithm winPanel;
	
	private GenerateLists gl;
	private SortingAlgorithms sa;
	private int[] temp;
	
	private String bestName;
	private long totalEfficiency;
	
	public SortingTechniques()
	{
		//All the panels instantiated
		 sortingPanel = new SortingButtons();
		 propertiesPanel = new SortingProperties();
		 resultsPanel = new SortingResults();
		 winPanel = new WinAlgorithm();
		 
		 gl = new GenerateLists();
		 sa = new SortingAlgorithms();
		 
		 
		 //Adding sorting buttons
		 
		 sortingPanel.getInsetSort().addActionListener(this);
		 sortingPanel.getSelecSort().addActionListener(this);
		 sortingPanel.getQuickSort().addActionListener(this);
		 sortingPanel.getMergeSort().addActionListener(this);
		 sortingPanel.getHeapSort().addActionListener(this);
		 sortingPanel.getRadixSort().addActionListener(this);
		 
		 propertiesPanel.getInOrder().addActionListener(this);
		 propertiesPanel.getAlmostOrder().addActionListener(this);
		 propertiesPanel.getReverseOrder().addActionListener(this);
		 propertiesPanel.getRandom().addActionListener(this);
		 
		 
		 //propertiesPanel.getSlider().addActionListener(this);
		 
		 propertiesPanel.getSliderNumber().addActionListener(this);
		 propertiesPanel.getCreateButton().addActionListener(this);
		 
		// resultsPanel.getNumberLabel().addActionListener(this);
		 
		 
		 //Some things without  a direct state dont work like the others
		 winPanel.getwinningField().addActionListener(this);
		 
		 
		 //set the grid bag layout
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		//sorting buttons panel
		//lesser weight to place it the left
		//gc.fill = GridBagConstraints.HORIZONTAL;
		gc.insets = new Insets(6,2,0,0);
		gc.ipady = 4;
		gc.weightx =  .1;
		gc.weighty =  .1;
		gc.gridheight = 3;
		gc.gridwidth = 3;
		gc.gridx = 0;
		gc.gridy = 0;
		add(sortingPanel,gc);
		
		//win panel
		gc.insets = new Insets(0,0,0,0);
		gc.ipadx = 263;//when resize is off
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.weightx = .5;
		gc.weighty =  .11;
		gc.gridheight = 1;
		gc.gridwidth = 0;
		gc.gridx = 1;
		gc.gridy = 0;
		add(winPanel,gc);
	
		//properties panel
		
		gc.weightx = 1;
		gc.weighty = 0;
		gc.gridheight = 1;
		gc.gridwidth = 0;
		gc.ipadx = -86;//offsets used to fit border
		gc.gridx = 1;
		gc.gridy = 1;
		add(propertiesPanel,gc);

		//results Panel
		gc.ipadx = 193;//offsets used to fit border
		gc.ipady = 20;
		gc.weightx = 1.5;
		gc.weighty = 1.5;
		gc.gridheight = 1;
		gc.gridwidth = 1;
		gc.gridx = 1;
		gc.gridy = 2;
		add(resultsPanel,gc);
		
	}
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
			
			///first panel selection maybe change to an array of selection buttons
		
		
			if(e.getSource() == getPropertiesPanel().getInOrder())
			{
				//System.out.println("selected inOrder");
				resultsPanel.getDataTypeField().setText("InOrder");
			}
			else if(e.getSource() == getPropertiesPanel().getAlmostOrder())
			{
				//System.out.println("selected almost order");
				resultsPanel.getDataTypeField().setText("AlmostOrder");

			}
			else if(e.getSource() == getPropertiesPanel().getReverseOrder())
			{
				//System.out.println("selected reverse order");
				resultsPanel.getDataTypeField().setText("ReverseOrder");

			}
			else if(e.getSource() == getPropertiesPanel().getRandom())
			{
				//System.out.println("selected Random");
				resultsPanel.getDataTypeField().setText("Random");
				
			}
			
			if(e.getSource() == propertiesPanel.getCreateButton())
			{
				//System.out.println("pressed create");
				
				resultsPanel.getSortField().setText("");
				resultsPanel.getCompareField().setText("");
				resultsPanel.getTimeField().setText("");
				resultsPanel.getMovementsField().setText("");
				
				resetBestAlg();
				
				resultsPanel.getNumberField().setText(propertiesPanel.getSlider().getValue()+"");
				temp = new int[propertiesPanel.getSlider().getValue()];
				
				
				if(getPropertiesPanel().getInOrder().isSelected())
				{
					//System.out.println("selected inOrder");
					resultsPanel.getDataTypeField().setText("InOrder");
					gl.generateInorder(temp);
				}
				else if(getPropertiesPanel().getAlmostOrder().isSelected())
				{
					//System.out.println("selected almost order");
					resultsPanel.getDataTypeField().setText("AlmostOrder");
					gl.almostOrder(temp);
				}
				else if(getPropertiesPanel().getReverseOrder().isSelected())
				{
					//System.out.println("selected reverse order");
					resultsPanel.getDataTypeField().setText("ReverseOrder");
					gl.reverseOrder(temp);
				}
				else if(getPropertiesPanel().getRandom().isSelected())
				{
					//System.out.println("selected Random");
					resultsPanel.getDataTypeField().setText("Random");
					gl.randomOrder(temp);
					
				}
				
			}
			
			if(e.getSource() == sortingPanel.getInsetSort() )
			{
				//System.out.println("pressed insert");
				sa.insertSort(temp);
				resultsPanel.getSortField().setText("Insertion");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Insertion Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getSelecSort())
			{
				sa.selectionSort(temp);
				//System.out.println("pressed Selec");
				resultsPanel.getSortField().setText("Selection");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Selection Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getQuickSort())
			{
				//System.out.println("pressed quick");
				sa.quickSortCaller(temp);
				resultsPanel.getSortField().setText("Quick");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Quick Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getMergeSort())
			{
				//System.out.println("pressed Merge");
				sa.mergeSortCaller(temp);
				resultsPanel.getSortField().setText("Merge");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Merge Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getHeapSort())
			{
				//System.out.println("pressed Heap");
				sa.heapSort(temp);
				resultsPanel.getSortField().setText("Heap");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Heap Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getRadixSort())
			{
				//System.out.println("pressed Radix");
				sa.radixSort(temp, temp.length);
				resultsPanel.getSortField().setText("Radix");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Radix Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			
			int input = Integer.parseInt(propertiesPanel.getSliderNumber().getText() );
			propertiesPanel.getSlider().setValue(input);
		}
		catch(Exception ex)
		{
			
		}
		//adding actions to buttons
	}
	
	public void checkBestAlg(String name, int c,int m,long time)
	{
		long temp  = c+m+time;
		if(totalEfficiency > temp && totalEfficiency != 0)
		{
			totalEfficiency = temp;
			bestName = name;
			
			winPanel.getwinningField().setText(bestName);
		}
		else if(totalEfficiency == 0)
		{
			totalEfficiency = temp;
			bestName = name;
			
			winPanel.getwinningField().setText(bestName);
		}
	}
	public void resetBestAlg()
	{
		totalEfficiency =0;
		bestName = "";
		
		winPanel.getwinningField().setText(bestName);
	}
	
	//getters
	public SortingButtons getSortingPanel() 
	{
		return sortingPanel;
	}
	public SortingProperties getPropertiesPanel()
	{
		return propertiesPanel;
	}
	public SortingResults getResultsPanel()
	{
		return resultsPanel;
	}
	public WinAlgorithm getWinPanel()
	{
		return winPanel;
	}
	
	//setters
	public void setSortingPanel(SortingButtons s) 
	{
		sortingPanel =s;
	}
	public void setPropertiesPanel(SortingProperties s)
	{
		propertiesPanel =s;
	}
	public void setResultsPanel(SortingResults s)
	{
		resultsPanel =s;
	}
	public void setWinPanel(WinAlgorithm w)
	{
		winPanel =w;
	}

}
