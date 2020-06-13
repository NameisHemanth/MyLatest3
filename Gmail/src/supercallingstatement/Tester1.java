package supercallingstatement;
class A
{
	A()
	{
		System.out.println("Running A class Constructor");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Running B class Constructor");
	}
}
class C extends B
{
	C()
	{
		super();
		System.out.println("Running C class Constructor");
	}
}
public class Tester1
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		C c1 = new C();
		System.out.println("The Main Ends...");
	}
}















