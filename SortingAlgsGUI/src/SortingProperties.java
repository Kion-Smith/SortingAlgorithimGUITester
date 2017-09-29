import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
		
		slider = new JSlider(JSlider.HORIZONTAL,0,3000,0);
		sliderNumber = new JTextField(10);
		
		inOrder = new JRadioButton("InOrder");
		reverseOrder= new JRadioButton("ReverseOrder");
		almostOrder= new JRadioButton("AlmostOrder");
		random= new JRadioButton("Random");
		
		createButton = new JButton("Create The List");
		
		buttons = new ButtonGroup();
		buttons.add(inOrder);
		buttons.add(reverseOrder);
		buttons.add(almostOrder);
		buttons.add(random);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx =0;
		gc.gridy =0;
		
		add(inOrder,gc);
		
		gc.gridx =0;
		gc.gridy =1;
		
		add(reverseOrder,gc);
		
		gc.gridx =1;
		gc.gridy =0;
		
		add(almostOrder,gc);
		
		gc.gridx =1;
		gc.gridy =1;
		
		add(random,gc);
		
		gc.gridx =0;
		gc.gridy =2;
		
		add(slider,gc);
		
		gc.gridx =1;
		gc.gridy =2;
		
		add(sliderNumber,gc);
		gc.gridx =0;
		gc.gridy =3;
		
		add(createButton,gc);
		
		
		
		
		
	}
}
