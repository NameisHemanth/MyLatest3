package abstractclasstopic;
abstract class C
{
	int a = 10;
	static int b = 20;
	static void test1(int a)
	{
		System.out.println("From test::"+a);
	}
	void test2()
	{
		System.out.println("From test2::");
	}
}
class D extends C
{
	
}
public class Tester4
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		C.test1(100);
		System.out.println(C.b);
//		C rv = new C();
		D d1 = new D();
		d1.test2();
		System.out.println(d1.a);
		System.out.println("The Main Ends...");
	}
}
