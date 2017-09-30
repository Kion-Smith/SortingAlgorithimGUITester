import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SortingTechniques extends JFrame implements ActionListener
{
	private SortingButtons sortingPanel;
	private SortingProperties propertiesPanel;
	private SortingResults resultsPanel;
	private WinAlgorithm winPanel;
	
	public SortingTechniques()
	{
		
		 sortingPanel = new SortingButtons();
		 propertiesPanel = new SortingProperties();
		 resultsPanel = new SortingResults();
		 winPanel = new WinAlgorithm();
		 
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		//gc.fill = GridBagConstraints.BOTH;
		
		
		gc.weightx =  .1;
		gc.weighty =  .1;
		gc.gridheight = 3;
		gc.gridwidth = 0;
		gc.gridx = 0;
		gc.gridy = 0;
		
		add(sortingPanel,gc);
		
		
		//gc.fill = GridBagConstraints.REMAINDER;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.weightx = .5;
		gc.weighty = .5;
		gc.gridheight = 1;
		gc.gridwidth = 0;
		
		gc.fill = GridBagConstraints.BOTH;
		gc.gridx = 1;
		gc.gridy = 0;
		add(winPanel,gc);
	
		//gc.fill = GridBagConstraints.C;
		
		//gc.fill = GridBagConstraints.BOTH;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.gridheight = 1;
		gc.gridwidth = 0;
		//gc.ipady = 750;
		//gc.ipadx = 10;
		gc.gridx = 1;
		gc.gridy = 1;
		add(propertiesPanel,gc);

		//gc.fill = GridBagConstraints.REMAINDER;
		//gc.fill = GridBagConstraints.BOTH;
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
		
		
	}

}
