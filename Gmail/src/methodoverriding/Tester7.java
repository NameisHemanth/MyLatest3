package methodoverriding;
class G
{
	public void test1()
	{
		System.out.println("test1() - Implementation");
	}
}
class H extends G
{
	public void test1(int a)
	{
		System.out.println("test1(int a) - Implementation");
	}
}
public class Tester7
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		H h1 = new H();
		h1.test1();
		h1.test1(90);
		System.out.println("The Main Ends...");
	}
}
