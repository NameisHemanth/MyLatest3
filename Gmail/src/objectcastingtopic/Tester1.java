package objectcastingtopic;
class A
{
	public void test1()
	{
		System.out.println("test1 method of parent");
	}
}
class B extends A
{
	public void test2()
	{
		System.out.println("test2 method of Child");
	}
}
public class Tester1
{
	public static void main(String[] args) 
	{
		A a1=(A)new B();
		a1.test1();
//		a1.test2();
		System.out.println("=================");
		B b1=(B)a1;//Explicit Downcasting
		b1.test1();
		b1.test2();
	}
}