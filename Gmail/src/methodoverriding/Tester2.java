package methodoverriding;
class Father
{
	public void smoking()
	{
		System.out.println("Normal Smoker");
	}
}
class Son extends Father
{
	public void smoking()
	{
		System.out.println("Chain Smoker");
	}
}
public class Tester2
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		Son s = new Son();
		s.smoking();
		System.out.println("The Main Ends...");
	}
}
