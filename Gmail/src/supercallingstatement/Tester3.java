package supercallingstatement;
class F
{
	F(int a)
	{
		System.out.println("Running F(int a) Constructor");
	}
}
class G extends F
{
	G()
	{
		super(90);
		System.out.println("Running G Class Constructor");
	}
}
public class Tester3
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		G rv = new G();
		System.out.println("The Main Ends...");
	}
}
