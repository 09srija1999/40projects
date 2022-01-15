


public class Constructor {

	public int length;
	public int width;
	// default constructor
	Constructor()
	{
		System.out.println("default constructor");
	}
	// Parameterized constructor
	Constructor(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public void getArea()
	{
		 System.out.println(" Rectangle Area is : "+length*width);
	}
	public static void main(String[] args) 
	{
		// this 2 objects are called parameterized constructors
		Constructor r1=new Constructor(20,12);
		Constructor r2=new Constructor(6,2);
		
		// this obj is called default constructor
		Constructor r3 = new Constructor();
		r1.getArea();
		r2.getArea();

		
	}
}