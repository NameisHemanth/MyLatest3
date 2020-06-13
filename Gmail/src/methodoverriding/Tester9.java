package methodoverriding;
//Overriding
//Overloading
//both
//error
class K
{
	public void test1(int a)
	{
		System.out.println("super class Implementation");
	}
}
class L extends K
{
	public void test1(int b)
	{
		System.out.println("sub class Implementation");
	}
}
public class Tester9
{
	public static void main(String[] args) 
	{
		L l1 = new L();
		l1.test1(90);
	}
}
