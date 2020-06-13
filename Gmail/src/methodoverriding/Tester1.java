package methodoverriding;
class Sample
{
	public void test()
	{
		System.out.println("Super Class Implementation");
	}
}
class Simple extends Sample
{
	public void test()
	{
		System.out.println("Sub Class Implementation");
	}
}
public class Tester1
{
	public static void main(String[] args)
	{
		Simple s = new Simple();
		s.test();
	}
}
