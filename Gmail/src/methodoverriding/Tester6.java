package methodoverriding;
final class E
{
	public void test1()
	{
		System.out.println("super class Implementation for test1");
	}
	public void test2()
	{
		System.out.println("super class Implementation for test2");
	}
}
class F //extends E
{
	
}
public class Tester6
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		E e1 = new E();
		e1.test1();
		e1.test2();
		System.out.println("The Main Ends...");
	}
}
