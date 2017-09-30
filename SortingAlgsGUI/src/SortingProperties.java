import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SortingProperties extends JPanel
{
	JTextField sliderNumber;
	JSlider slider;
	JRadioButton inOrder,reverseOrder,almostOrder,random;
	
	JButton createButton;
	
	ButtonGroup buttons;
	
	TitledBorder sortingPropBorder;
	
	public SortingProperties()
	{
		sortingPropBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"List Properties");
		sortingPropBorder.setTitleJustification(TitledBorder.CENTER);
		setBorder(sortingPropBorder);
		
		slider = new JSlider(JSlider.HORIZONTAL,0,3000,3000/2);
		sliderNumber = new JTextField(10);
		
		inOrder = new JRadioButton("InOrder");
		reverseOrder= new JRadioButton("ReverseOrder");
		almostOrder= new JRadioButton("AlmostOrder");
		random= new JRadioButton("Random");
		
		createButton = new JButton("Create The List");
		
		buttons = new ButtonGroup();
		buttons.add(inOrder);
		buttons.add(almostOrder);
		buttons.add(reverseOrder);
		buttons.add(random);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.weightx =  .5;
		gc.weighty =  .5;
		gc.gridx =0;
		gc.gridy =0;
		add(inOrder,gc);
		
		gc.weightx =  .6;
		gc.weighty =  .6;
		gc.gridx =0;
		gc.gridy =1;
		add(almostOrder,gc);
		
		
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.weightx =  .7;
		gc.weighty =  .7;
		//gc.ipadx  = -200;
		//gc.gridwidth =2;
		gc.gridx =1;
		gc.gridy =0;
		//gc.insets = new Insets(0,10,0,00);
		gc.gridwidth = 1;
		add(reverseOrder,gc);
		
		gc.weightx =  .8;
		gc.weighty =  .8;
		gc.gridx =1;
		gc.gridy =1;
	//	gc.gridwidth = 2;
		add(random,gc);
		
	
		gc.ipadx  = 0;
		gc.weightx =  .9;
		gc.weighty =  .9;
		gc.gridx =0;
		gc.gridy =2;
		gc.gridwidth = 2;
		//gc.ipadx = 200;
		//gc.insets = new Insets(0,0,0,10);
		add(slider,gc);
		
		
		//gc.weightx =  .1;
		//gc.weighty =  .1;
		gc.gridwidth = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.ipadx = 50;
		gc.gridx =4;
		gc.gridy =2;
		add(sliderNumber,gc);
		
		gc.fill = GridBagConstraints.BOTH;
		gc.weightx =  1.5;
		gc.weighty =  1.5;
		gc.gridx =0;
		gc.gridy =3;
		
		gc.anchor = GridBagConstraints.LAST_LINE_END;
		//gc.ipadx =100;
		gc.insets = new Insets(10,10,10,10);
		gc.gridheight = 1;
		gc.gridwidth = 5;
		add(createButton,gc);
		
		
		
		
		
	}
}
