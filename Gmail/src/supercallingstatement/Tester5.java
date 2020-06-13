package supercallingstatement;
//1.it should be first statement
//2.maximum one super calling is allowed
//3.Can be written only inside constructor
//4.Can be used only to call parent constructor
class J
{
	J()
	{
		System.out.println("Running J Class Constructor");
	}
}
class K extends J
{
	K(int a)
	{
		System.out.println("Running K(int a) Class Constructor");
	}
}
class L extends K
{
	L()
	{
		super(10);
//		super(90);
		System.out.println("Running L Class Constructor");
	}
}
public class Tester5
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		
		System.out.println("The Main Ends...");
	}
}
