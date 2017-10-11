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
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 */
//ELEMENT OF SORTING TECHNIQUES
public class SortingProperties extends JPanel
{
	//Variables for sorting properties JPanel
	private JTextField sliderNumber;
	private JSlider slider;
	private JRadioButton inOrder,reverseOrder,almostOrder,random;
	private JButton createButton;
	
	private ButtonGroup buttons;
	
	private TitledBorder sortingPropBorder;
	
	public SortingProperties()
	{
		//Create etchedBorder with text
		sortingPropBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"List Properties");
		sortingPropBorder.setTitleJustification(TitledBorder.CENTER);// put text in the center
		setBorder(sortingPropBorder);//set border
		
		//Instantiate slider
		slider = new JSlider(JSlider.HORIZONTAL,0,30000,30000/2);
		
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
		
		// Make all objects fill up areas
		gc.fill = GridBagConstraints.HORIZONTAL;
		
		//set it to start from the left hand corner
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		//In order radio button
		gc.weightx =  .5;//set "priority" within the panel
		gc.weighty =  .5;//set "priority" within the panel
		gc.gridx =0;//set location within the panel
		gc.gridy =0;//set location within the panel
		add(inOrder,gc);
		
		//almost order radio button
		gc.weightx =  .6;
		gc.weighty =  .6;
		gc.gridx =0;
		gc.gridy =1;
		add(almostOrder,gc);
		
		//Reverse Order radio button
		gc.anchor = GridBagConstraints.FIRST_LINE_END;// set the other elements to anchor to the right
		gc.weightx =  .7;
		gc.weighty =  .7;
		gc.gridx =1;
		gc.gridy =0;
		gc.gridwidth = 1;//expand into another panel(width)
		add(reverseOrder,gc);
		
		//random  radio button
		gc.ipadx = 0;
		gc.weightx =  .8;
		gc.weighty =  .8;
		gc.gridx =1;
		gc.gridy =1;
		add(random,gc);
		
		//Slider
		gc.weightx =  .9;
		gc.weighty =  .9;
		gc.gridx =0;
		gc.gridy =2;
		gc.gridwidth = 2;
		add(slider,gc);
		
		//Slider text area
		gc.gridwidth = 0;
		gc.ipadx = 50;//add padding for the label
		gc.gridx =4;
		gc.gridy =2;
		add(sliderNumber,gc);
		
		//create button
		gc.weightx =  1;
		gc.weighty =  1;
		gc.gridx =0;
		gc.gridy =3;
		gc.insets = new Insets(10,10,10,10);//using insets to fix length
		gc.gridheight = 1;
		gc.gridwidth = 5;
		add(createButton,gc);
		
		
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
