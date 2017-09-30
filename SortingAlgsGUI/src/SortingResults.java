import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SortingResults extends JPanel
{
	JLabel numberLabel,dataTypeLabel,sortLabel,compareLabel,movementsLabel,timeLabel;
	JTextField numberField,dataTypeField,sortField,compareField,movementsField,timeField;
	
	TitledBorder experimentalBorder;

	public SortingResults()
	{
		experimentalBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Experimental Results");
		experimentalBorder.setTitleJustification(TitledBorder.CENTER);
		
		
		numberLabel = new JLabel("N: ");
		dataTypeLabel = new JLabel("DataType: ");
		sortLabel = new JLabel("Sort: ");
		compareLabel = new JLabel("Comparisons: ");
		movementsLabel = new JLabel("Movements: ");
		timeLabel = new JLabel("Total time: ");
		
		numberField = new JTextField(10);
		dataTypeField = new JTextField(10);
		sortField = new JTextField(10);
		compareField = new JTextField(10);
		movementsField = new JTextField(10);
		timeField = new JTextField(10);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		
		gc.gridx =0;
		gc.gridy =0;
		setBorder(experimentalBorder);
		add(numberLabel,gc);
		
		gc.gridx =0;
		gc.gridy =1;
		
		add(dataTypeLabel,gc);
		
		gc.gridx =0;
		gc.gridy =2;
		
		add(sortLabel,gc);
		gc.gridx =0;
		gc.gridy =3;
		
		add(compareLabel,gc);
		gc.gridx =0;
		gc.gridy =4;
		
		add(movementsLabel,gc);
		gc.gridx =0;
		gc.gridy =5;
		
		add(timeLabel,gc);
		
		//the next col
		
		gc.gridx =1;
		gc.gridy =0;
		
		add(numberField,gc);
		
		gc.gridx =1;
		gc.gridy =1;
		
		add(dataTypeField,gc);
		
		gc.gridx =1;
		gc.gridy =2;
		
		add(sortField,gc);
		gc.gridx =1;
		gc.gridy =3;
		
		add(compareField,gc);
		gc.gridx =1;
		gc.gridy =4;
		
		add(movementsField,gc);
		gc.gridx =1;
		gc.gridy =5;
		
		add(timeField,gc);
		
		
		
		
	}
}
