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
	
	public SortingTechniques()
	{
		//All the panels instantiated
		 sortingPanel = new SortingButtons();
		 propertiesPanel = new SortingProperties();
		 resultsPanel = new SortingResults();
		 winPanel = new WinAlgorithm();
		 
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
		 
		// propertiesPanel.getSlider().addActionListener(this);
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
		gc.ipadx = -85;//offsets used to fit border
		gc.gridx = 1;
		gc.gridy = 1;
		add(propertiesPanel,gc);

		//results Panel
		gc.ipadx = 51;//offsets used to fit border
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
			if(e.getSource() == sortingPanel.getInsetSort())
			{
				System.out.println("pressed insert");
			}
			else if(e.getSource() == sortingPanel.getSelecSort())
			{
				System.out.println("pressed Selec");
			}
			else if(e.getSource() == sortingPanel.getQuickSort())
			{
				System.out.println("pressed quick");
			}
			else if(e.getSource() == sortingPanel.getMergeSort())
			{
				System.out.println("pressed Merge");
			}
			else if(e.getSource() == sortingPanel.getHeapSort())
			{
				System.out.println("pressed Heap");
			}
			else if(e.getSource() == sortingPanel.getRadixSort())
			{
				System.out.println("pressed Radix");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		//adding actions to buttons
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
