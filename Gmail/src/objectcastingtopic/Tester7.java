package objectcastingtopic;
class Simple1
{
	public void test1()
	{
		System.out.println("test1 of Simple1 class");
	}
}
class Simple2 extends Simple1
{
	public void test2()
	{
		System.out.println("test2 of Simple2 class");
	}
}
public class Tester7 
{
	public static void main(String[] args)
	{
		Simple2 s2 =(Simple2)new Simple1();//ClassCastException
		s2.test1();
		s2.test2();
	}
}