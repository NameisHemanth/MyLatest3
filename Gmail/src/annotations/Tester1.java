package annotations;
class A
{
	public void test1()
	{
		System.out.println("Super class Implementation");
	}
}

class B extends A
{
	@Override
	public void test1()
	{
		System.out.println("Sub class Implementation");
	}
}
public class Tester1
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		b1.test1();
	}
}
