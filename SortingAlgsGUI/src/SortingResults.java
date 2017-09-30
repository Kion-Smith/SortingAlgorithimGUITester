import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 */
//ELEMENT OF SORTING TECHNIQUES
public class SortingResults extends JPanel
{
	//variables for this panel
	private JLabel numberLabel,dataTypeLabel,sortLabel,compareLabel,movementsLabel,timeLabel;
	private JTextField numberField,dataTypeField,sortField,compareField,movementsField,timeField;
	
	TitledBorder experimentalBorder;

	public SortingResults()
	{
		//Create etchedBorder
		experimentalBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Experimental Results");
		experimentalBorder.setTitleJustification(TitledBorder.CENTER);// put text in the center
		setBorder(experimentalBorder);//setting border
		
		//Instantiate JLables
		numberLabel = new JLabel("N: ");
		dataTypeLabel = new JLabel("DataType: ");
		sortLabel = new JLabel("Sort: ");
		compareLabel = new JLabel("Comparisons: ");
		movementsLabel = new JLabel("Movements: ");
		timeLabel = new JLabel("Total time: ");
		
		//Instantiate JTextField
		numberField = new JTextField(10);
		dataTypeField = new JTextField(10);
		sortField = new JTextField(10);
		compareField = new JTextField(10);
		movementsField = new JTextField(10);
		timeField = new JTextField(10);
		
		//create layout and gridbag constraints
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		//Number Label
		gc.anchor = GridBagConstraints.FIRST_LINE_END;//set anchor to right, needed to put all the Labels centered to lthe left
		gc.gridx =0;//set location within the panel
		gc.gridy =0;//set location within the panel
		add(numberLabel,gc);

		//Data Label
		gc.gridx =0;
		gc.gridy =1;
		add(dataTypeLabel,gc);

		//sort Label
		gc.gridx =0;
		gc.gridy =2;
		add(sortLabel,gc);

		//Comparison Label
		gc.gridx =0;
		gc.gridy =3;
		add(compareLabel,gc);
		
		//Movements Label
		gc.gridx =0;
		gc.gridy =4;
		add(movementsLabel,gc);

		//time Label
		gc.gridx =0;
		gc.gridy =5;
		add(timeLabel,gc);
		
		//the next column///
		

		//Number Field
		gc.gridx =1;
		gc.gridy =0;
		add(numberField,gc);

		//data Field
		gc.gridx =1;
		gc.gridy =1;
		add(dataTypeField,gc);

		//sort Field
		gc.gridx =1;
		gc.gridy =2;
		add(sortField,gc);

		//comparison Field
		gc.gridx =1;
		gc.gridy =3;
		add(compareField,gc);

		//movements Field
		gc.gridx =1;
		gc.gridy =4;
		add(movementsField,gc);

		//Time Field
		gc.gridx =1;
		gc.gridy =5;
		add(timeField,gc);	
	}
	//GETTERS
	public JLabel getNumberLabel()
	{
		return numberLabel; 
	}
	public JLabel getDataTypeLabel ()
	{
		return dataTypeLabel; 
	}
	public JLabel getSortLabel ()
	{
		return numberLabel; 
	}
	public JLabel getCompareLabel()
	{
		return sortLabel ; 
	}
	public JLabel getMovementsLabel()
	{
		return movementsLabel; 
	}
	public JLabel getTimeLabel()
	{
		return timeLabel; 
	}
	public JTextField getNumberField()
	{
		return numberField; 
	}
	public JTextField getDataTypeField ()
	{
		return dataTypeField; 
	}
	public JTextField getSortField ()
	{
		return numberField; 
	}
	public JTextField getCompareField()
	{
		return sortField ; 
	}
	public JTextField getMovementsField()
	{
		return movementsField; 
	}
	public JTextField getTimeField()
	{
		return timeField; 
	}
	
	//setters
	
	public void setNumberLabel(JLabel j)
	{
		 numberLabel =j; 
	}
	public void setDataTypeLabel (JLabel j)
	{
		 dataTypeLabel =j; 
	}
	public void setSortLabel (JLabel j)
	{
		 numberLabel=j; 
	}
	public void setCompareLabel(JLabel j)
	{
		 sortLabel=j; 
	}
	public void setMovementsLabel(JLabel j)
	{
		 movementsLabel=j; 
	}
	public void setTimeLabel(JLabel j)
	{
		 timeLabel=j; 
	}
	public void setNumberField(JTextField j)
	{
		 numberField=j; 
	}
	public void setDataTypeField (JTextField j)
	{
		 dataTypeField=j;  
	}
	public void setSortField (JTextField j)
	{
		 numberField=j;  
	}
	public void setCompareField(JTextField j)
	{
		 sortField=j;  
	}
	public void setMovementsField(JTextField j)
	{
		 movementsField=j;  
	}
	public void setTimeField(JTextField j)
	{
		 timeField=j; 
	}
}
