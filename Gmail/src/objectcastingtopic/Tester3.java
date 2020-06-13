package objectcastingtopic;
class C //extends Object
{
	public void test1()
	{
		System.out.println("Running test1 of Class C");
	}
}
class D extends C
{
	public void test2()
	{
		System.out.println("Running test2 of Class D");
	}
}
class E extends D
{
	public void test3()
	{
		System.out.println("Running test3 of Class E");
	}
}
public class Tester3 
{
	public static void main(String[] args)
	{
		System.out.println("======1st Level Upcasting======");
		D d1=new E();//Auto Upcasting
		System.out.println(d1.hashCode());
		d1.test1();
		d1.test2();
//		d1.test3();
		
		E e1=(E)d1;//Explicit Downcasting
		e1.test1();
		e1.test2();
		e1.test3();
		
		System.out.println("======2nd Level Upcasting======");
		C c1=new E();//Auto Upcasting
		System.out.println(c1.hashCode());
		c1.test1();
//		c1.test2();
//		c1.test3();
		
		E e2=(E)c1;//Explicit Downcasting
		e2.test1();
		e2.test2();
		e2.test3();
	}
}
