package methodoverriding;
class Z
{
	public void test()
	{
		System.out.println("Z Class Implementation");
	}
}
class A extends Z
{
	public void test()
	{
		super.test();
		System.out.println("Super Class Implementation");
	}
}
class B extends A
{
	public void test()
	{
		super.test();
		System.out.println("Sub Class Implementation");
	}
}
public class Tester3
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		B b1 = new B();
		b1.test();
		System.out.println("The Main Ends...");
	}
}
