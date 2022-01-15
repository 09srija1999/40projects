
public class Threadscreation extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Threadscreation mt = new  Threadscreation();
  		mt.start();
 	}
}
