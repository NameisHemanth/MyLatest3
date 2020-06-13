package interfacetopic;
interface H
{
	void test1();
}
interface I
{
	void test2();
}
interface J extends I,H
{
	void test3();
}
public class Tester8
{
	public static void main(String[] args) 
	{
		System.out.println("DONE");
	}
}
