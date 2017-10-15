/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 * 
 * Create lists
 */

public class GenerateLists 
{
	public GenerateLists()
	{
		
	}
	
	public void generateInorder(int [] list) 
	{
		// Iterate Forwards
		for(int i =0;i<list.length;i++)
		{
			list[i] = i;// Add to array
		}
    }

    public void reverseOrder(int [] list) 
    {
    	// Iterate backwards
    	for(int i = list.length-1;i>=0;i--)
		{
			list[i] = i;// Add to array
		}
    }

    public void almostOrder(int [] list) 
    {
    	generateInorder(list);//create default list
    	double randomizer = Math.random();//set a random offset
		for(int i=0; i<list.length*randomizer; i++)//chooses random place to do split an mess indexs up
		{
			int loc1 = (int) (Math.random()*list.length);//get random location
			int loc2 = (int) (Math.random()*list.length);// get random location
			
			///Swap the values of the random locations
			int temp = list[loc1];
			list[loc1] = list[loc2];
			list[loc2] = temp;
		}
    }

    public void randomOrder(int [] list) 
    {
    	generateInorder(list);//create default list
    	for(int i = list.length-1;i>0;i--) // Iterate backwards
		{
    		
    		int random = (int)(Math.random()*(i + 1));//get a random number to swap
    		
    		//swap random number with i
			int temp = list[i];
			list[i] = list[random];
			list[random] = temp;
 		
		}
    }
}
