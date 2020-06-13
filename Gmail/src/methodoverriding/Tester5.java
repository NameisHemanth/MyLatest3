package methodoverriding;
class C
{
	final public void test1()
	{
		System.out.println("super class Implementation");
	}
}
class D extends C
{
	/*public void test1()
	{
		System.out.println("sub class Implementation");
	}*/
}
public class Tester5
{
	public static void main(String[] args) 
	{
		System.out.println("The Main Starts...");
		D d1 = new D();
		d1.test1();
		System.out.println("The Main Ends...");
	}
}
