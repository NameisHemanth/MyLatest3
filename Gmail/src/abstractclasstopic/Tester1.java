package abstractclasstopic;
//Rules==> 1.Inheritance 2. Non-static 3.Signature
abstract class A extends Object
{
	public abstract void test1();
	public abstract void test2();
}
class B extends A
{
	public void test1()
	{
		System.out.println("test1 method implemented in Class B");
	}
	public void test2()
	{
		System.out.println("test2 method implemented in Class B");
	}
}
public class Tester1
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
//		A rv = new A();
		B b1 = new B();
		b1.test1();
		b1.test2();
		System.out.println("The Main Ends...");
	}
}
