package interfacetopic;
interface A
{
	void test1();
}
interface B
{
	void test2();
}
class C /*extends Object*/ implements A,B
{
	@Override
	public void test1()
	{
		System.out.println("Test1 Implemented in C");
	}
	@Override
	public void test2()
	{
		System.out.println("Test2 Implemented in C");
	}
}
public class Tester2
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test1();
		c1.test2();
	}
}
