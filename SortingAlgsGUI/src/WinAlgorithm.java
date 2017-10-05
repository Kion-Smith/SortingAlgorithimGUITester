import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 */
//ELEMENT OF SORTING TECHNIQUES
public class WinAlgorithm extends JPanel
{
	//variables for elements of the panel
	private JTextField winningField;
	private TitledBorder winBorder;
	
	//winner can be any parameter
	public WinAlgorithm()
	{	
		//Create etchedBorder
		winBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Winning Algorithm");
		winBorder.setTitleJustification(TitledBorder.CENTER); // put text in the center
		setBorder(winBorder);//setting border
		
		winningField = new JTextField(23);//set text field size
		
		//create layout and gridbag constraints
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		//add spaces to both side to fill space
		gc.insets = new Insets(0,13,0,13);
		
		gc.gridx = 0;//set location within the panel
		gc.gridy = 0;//set location within the panel
		add(winningField,gc);//add to the JFrame panel
		

	}
	//getter
	public JTextField getwinningField()
	{
		return winningField;
	}
	public TitledBorder getWinBorder()
	{
		return winBorder;
	}
	
	//setter
	public void setwinningField(JTextField j)
	{
		winningField =j;
	}
	public void setWinBorder(TitledBorder t)
	{
		winBorder=t;
	}
}
