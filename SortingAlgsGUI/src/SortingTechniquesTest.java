import javax.swing.JFrame;
/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 */

/*GUI PROGRAM TO RUN SORTING ALGS*/

//The main class

public class SortingTechniquesTest 
{
	public static void main(String args [])
	{
		// creating the JFrame
		SortingTechniques sT  = new SortingTechniques();
		sT.setTitle("Sorting Techniques");
		sT.setSize(500,400);
		sT.setVisible(true);
		sT.setLocationRelativeTo(null);
		sT.setResizable(false);//need this to run on laptop, for some reason? Maybe higher resolution...
		sT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
