package supercallingstatement;
class D
{
	D()
	{
		System.out.println("Running D class Constructor");
	}
}
class E extends D
{
	E()
	{
		//super();-->default super() calling statement
		System.out.println("Running E class Constructor");
	}
}
public class Tester2
{
	public static void main(String[] args) 
	{
		System.out.println("The Main Starts...");
		E e1 = new E();
		System.out.println("The Main Ends...");
	}
}
