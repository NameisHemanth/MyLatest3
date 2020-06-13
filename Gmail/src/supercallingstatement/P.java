package supercallingstatement;
public class P
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		P rv = new P();
		System.out.println(rv.hashCode());
		System.out.println("The Main Ends...");
	}
}
