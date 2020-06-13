package supercallingstatement;
class H
{
	H()
	{
		System.out.println("Running H Class Constructor");
	}
}
class I extends H
{
	
}
public class Tester4 
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		I rv = new I();
		System.out.println("The Main Ends...");
	}
}
