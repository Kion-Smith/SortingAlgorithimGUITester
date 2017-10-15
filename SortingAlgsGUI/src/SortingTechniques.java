
import java.awt.GridBagConstraints;
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 * 
 * create gui
 */
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class SortingTechniques extends JFrame implements ActionListener
{
	//the Panels
	private SortingButtons sortingPanel;
	private SortingProperties propertiesPanel;
	private SortingResults resultsPanel;
	private WinAlgorithm winPanel;
	
	//getting info for array of ints
	private GenerateLists gl;
	private SortingAlgorithms sa;
	
	//variables used to get best Alg
	private String bestName;
	private long totalEfficiency;
	
	//array used for sorting
	private int[] temp;
	
	public SortingTechniques()
	{
		//All the panels instantiated
		 sortingPanel = new SortingButtons();
		 propertiesPanel = new SortingProperties();
		 resultsPanel = new SortingResults();
		 winPanel = new WinAlgorithm();
		 
		 //methods for generating list and sorting
		 gl = new GenerateLists();
		 sa = new SortingAlgorithms();
		 
		 
		 //Adding sorting buttons to action listener to interact with
		 sortingPanel.getInsetSort().addActionListener(this);
		 sortingPanel.getSelecSort().addActionListener(this);
		 sortingPanel.getQuickSort().addActionListener(this);
		 sortingPanel.getMergeSort().addActionListener(this);
		 sortingPanel.getHeapSort().addActionListener(this);
		 sortingPanel.getRadixSort().addActionListener(this);
		 
		//Adding properties radio buttons to action listener to interact with
		 propertiesPanel.getInOrder().addActionListener(this);
		 propertiesPanel.getAlmostOrder().addActionListener(this);
		 propertiesPanel.getReverseOrder().addActionListener(this);
		 propertiesPanel.getRandom().addActionListener(this);
		//Adding properties button to action listener to interact with
		 propertiesPanel.getCreateButton().addActionListener(this);
		 
		
		 
		 
		 //set the grid bag layout
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		//sorting buttons panel
		//lesser weight to place it the left
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
		try// try catch to handle user input errors
		{
			
			if(e.getSource() == propertiesPanel.getCreateButton())// get when the create button is pressd
			{
				//set all results fields to defaults
				resultsPanel.getSortField().setText("");
				resultsPanel.getCompareField().setText("");
				resultsPanel.getTimeField().setText("");
				resultsPanel.getMovementsField().setText("");
				//rest the wining alg on every run
				resetBestAlg();
				
				//Setting the text field from slider to create array
				resultsPanel.getNumberField().setText(propertiesPanel.getSlider().getValue()+"");
				temp = new int[propertiesPanel.getSlider().getValue()];
				
				//Selecting radio buttons  functionality and adding name to text field
				if(getPropertiesPanel().getInOrder().isSelected())
				{
					resultsPanel.getDataTypeField().setText("InOrder");
					gl.generateInorder(temp);
				}
				else if(getPropertiesPanel().getAlmostOrder().isSelected())
				{
					resultsPanel.getDataTypeField().setText("AlmostOrder");
					gl.almostOrder(temp);
				}
				else if(getPropertiesPanel().getReverseOrder().isSelected())
				{
					resultsPanel.getDataTypeField().setText("ReverseOrder");
					gl.reverseOrder(temp);
				}
				else if(getPropertiesPanel().getRandom().isSelected())
				{
					resultsPanel.getDataTypeField().setText("Random");
					gl.randomOrder(temp);
				}
			}
			
			//Check for when the sort buttons are pressed
			if(e.getSource() == sortingPanel.getInsetSort() )
			{
				sa.insertSort(temp);//go to sort method and sort array
				resultsPanel.getSortField().setText("Insertion");//set the name  field
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");//set the num of compares field
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");//set the time field
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");// set movment field
				
				checkBestAlg("Insertion Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());//check to see against other algs to s which is the winner
			}
			else if(e.getSource() == sortingPanel.getSelecSort())//checking for selection
			{
				sa.selectionSort(temp);
				resultsPanel.getSortField().setText("Selection");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Selection Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getQuickSort())//checking for Quick
			{

				sa.quickSortCaller(temp);
				resultsPanel.getSortField().setText("Quick");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Quick Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getMergeSort())//checking for Merge
			{
				sa.mergeSortCaller(temp);
				resultsPanel.getSortField().setText("Merge");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Merge Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getHeapSort())//Heap sort
			{
				sa.heapSort(temp);
				resultsPanel.getSortField().setText("Heap");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Heap Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			else if(e.getSource() == sortingPanel.getRadixSort())//radix sort
			{
				sa.radixSort(temp, temp.length);
				resultsPanel.getSortField().setText("Radix");
				resultsPanel.getCompareField().setText(sa.getComparisons()+"");
				resultsPanel.getTimeField().setText(sa.getEndTime()+"ms");
				resultsPanel.getMovementsField().setText(sa.getMovements()+"");
				
				checkBestAlg("Radix Sort", sa.getComparisons(),sa.getMovements(),sa.getEndTime());
			}
			
			//Setting value of slider from text box
			int input = Integer.parseInt(propertiesPanel.getSliderNumber().getText() );
			propertiesPanel.getSlider().setValue(input);
		}
		catch(Exception ex)//exception handling
		{
			
		}

	}
	
	//makes which ever alg has the smallest combined number to be the best alg
	public void checkBestAlg(String name, int c,int m,long time)
	{
		
		long temp  = c+m+time;//add up all the numbers
		if(totalEfficiency >= temp && totalEfficiency != 0)
		{
			totalEfficiency = temp;//set old to be the new best
			bestName = name;//set name to be new best
			
			winPanel.getwinningField().setText(bestName);//setting name
		}
		else if(totalEfficiency == 0)//if first run then make alg the best by default
		{
			totalEfficiency = temp;
			bestName = name;
			
			winPanel.getwinningField().setText(bestName);//setting name
		}
		
	}
	//used to rest the alg on new runs of create button
	public void resetBestAlg()
	{
		totalEfficiency =0;
		bestName = "";
		
		winPanel.getwinningField().setText(bestName);//setting name
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
