import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class WinAlgorithm extends JPanel
{
	JTextField winningField;
	TitledBorder  winBorder;
	public WinAlgorithm()
	{
		winBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Winning Algorithm");
		winBorder.setTitleJustification(TitledBorder.CENTER);
		setBorder(winBorder);
		
		winningField = new JTextField(23);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.insets = new Insets(0,8,0,8);
		
		//gc.weightx =1;
		//gc.weighty =1;
		
		//gc.ipadx = 275;
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		add(winningField,gc);
		

	}
}
