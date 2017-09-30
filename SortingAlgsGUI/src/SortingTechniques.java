import java.awt.GridBagConstraints;
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 */
import java.awt.GridBagLayout;

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
		 
		 //set the grid bag layout
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		//sorting buttons panel
		//lesser weight to place it the left
		gc.weightx =  .1;
		gc.weighty =  .1;
		gc.gridheight = 3;
		gc.gridwidth = 3;
		gc.gridx = 0;
		gc.gridy = 0;
		add(sortingPanel,gc);
		
		//win panel
		gc.fill = GridBagConstraints.VERTICAL;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.weightx = .5;
		gc.weighty =  1;
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
		gc.ipadx = -95;//offsets used to fit border
		gc.gridx = 1;
		gc.gridy = 1;
		add(propertiesPanel,gc);

		//results Panel
		gc.ipadx = 76;//offsets used to fit border
		gc.weightx = 1.5;
		gc.weighty = 1.5;
		gc.gridheight = 1;
		gc.gridwidth = 0;
		gc.gridx = 1;
		gc.gridy = 2;
		add(resultsPanel,gc);
	}
	public void actionPerformed(ActionEvent e) 
	{
		
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
