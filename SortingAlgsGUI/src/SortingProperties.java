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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 */
//ELEMENT OF SORTING TECHNIQUES
public class SortingProperties extends JPanel
{
	//Variables for sorting properties JPanel
	
	private JPanel midPanel;
	private JTextField sliderNumber;
	private JSlider slider;
	private JRadioButton inOrder,reverseOrder,almostOrder,random;
	private JButton createButton;
	
	private ButtonGroup buttons;
	
	private TitledBorder sortingPropBorder;
	
	
	public SortingProperties()
	{
		midPanel = new JPanel();
		
		//Create etchedBorder with text
		sortingPropBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"List Properties");
		sortingPropBorder.setTitleJustification(TitledBorder.CENTER);// put text in the center
		setBorder(sortingPropBorder);//set border
		
		//Instantiate slider
		slider = new JSlider(JSlider.HORIZONTAL,0,30000,30000/2);
		
		slider.addChangeListener(new ChangeListener()//add action for slider, needed to make the slider display numbers
		{
				
				public void stateChanged(ChangeEvent e) 
				{
					int value = slider.getValue();//set the value of the slider to an int
					getSliderNumber().setText( value+"" );//set int to be value of text field
					
				}
		} );
		
		
		//Instantiate text area
		sliderNumber = new JTextField(10);
		
		//Instantiate radio button
		inOrder = new JRadioButton("InOrder");
		reverseOrder= new JRadioButton("ReverseOrder");
		almostOrder= new JRadioButton("AlmostOrder");
		random= new JRadioButton("Random");
		
		//Instantiate button
		createButton = new JButton("Create The List");
		
		
		//Instantiate group and add buttons to it
		buttons = new ButtonGroup();
		buttons.add(inOrder);
		buttons.add(almostOrder);
		buttons.add(reverseOrder);
		buttons.add(random);
		
		//create layout and gridbag constraints
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		//set it to start from the left hand corner
		
		gc.ipadx = 85;
		gc.gridx =0;
		gc.gridy =0;
		
			midPanel.setLayout(new GridBagLayout());
			GridBagConstraints gc1 = new GridBagConstraints();//create second panel to manage frames easier
		
			//The radio buttons
			gc1.insets = new Insets(0,10,0,15);
			gc1.anchor = GridBagConstraints.LINE_START;
			gc1.weightx =  .5;//set "priority" within the panel
			gc1.weighty =  .5;//set "priority" within the panel
			gc1.gridx = 0;
			gc1.gridy = 0;
			midPanel.add(inOrder,gc1);
			gc.weightx =  .6;
			gc.weighty =  .6;
			gc1.gridx = 0;
			gc1.gridy = 1;
			midPanel.add(almostOrder,gc1);
			gc1.insets = new Insets(0,20,0,0); // set space to behind to make radio buttons look lie picture
			gc1.weightx =  .7;
			gc1.weighty =  .7;
			gc1.gridx = 1;
			gc1.gridy = 0;
			midPanel.add(reverseOrder,gc1);
			gc1.weightx =  .8;
			gc1.weighty =  .8;
			gc1.gridx = 1;
			gc1.gridy = 1;
			midPanel.add(random,gc1);
			
			gc1.anchor = GridBagConstraints.LAST_LINE_START;
			gc1.insets = new Insets(0,10,0,0);
			gc1.ipadx = 150;//make slider longer
			gc1.gridx =0;
			gc1.gridy =2;
			gc1.gridwidth = 2;
			midPanel.add(slider,gc1);
		
			gc1.insets = new Insets(0,-40,0,-40);//changing size
			gc1.ipadx = 55;//change postion
			gc1.weightx = 10;
			gc1.gridx =2;
			gc1.gridy =2;
			midPanel.add(sliderNumber,gc1);
			
			gc1.weightx =  1;
			gc1.weighty =  1;
			gc1.gridx =0;
			gc1.gridy =3;
			gc1.ipadx = 140;
			gc1.insets = new Insets(10,10,10,10);//using insets to fix length
			gc1.gridwidth = 6;
			midPanel.add(createButton,gc1);
			
		add(midPanel,gc);//add the temp panel to the main one
	
		
	}
	
	
	
	
	//getters
	public JTextField getSliderNumber()
	{
		return sliderNumber;
	}
	public JSlider getSlider()
	{
		return slider;
	}
	public JRadioButton getInOrder()
	{
		return inOrder;
	}
	public JRadioButton getReverseOrder()
	{
		return reverseOrder;
	}
	public JRadioButton getAlmostOrder()
	{
		return almostOrder;
	}
	public JRadioButton getRandom()
	{
		return random;
	}
	public JButton getCreateButton()
	{
		return createButton;
	}
	public ButtonGroup getButtons()
	{
		return buttons;
	}
	public TitledBorder getSortingPropBorder()
	{
		return sortingPropBorder;
	}
	
	
	//setters
	public void setsliderNumber(JTextField j)
	{
		sliderNumber =j;
	}
	public void setSlider(JSlider j)
	{
		slider =j;
	}
	public void setInOrder(JRadioButton j)
	{
		inOrder =j;
	}
	public void setReverseOrder(JRadioButton j)
	{
		reverseOrder=j;
	}
	public void setAlmostOrder(JRadioButton j)
	{
		almostOrder=j;
	}
	public void setRandom(JRadioButton j)
	{
		random=j;
	}
	public void setCreateButton(JButton j)
	{
		createButton=j;
	}
	public void setButtons(ButtonGroup b)
	{
		buttons =b;
	}
	public void setSortingPropBorder(TitledBorder t)
	{
		 sortingPropBorder=t;
	}
}
