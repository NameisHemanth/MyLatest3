package inheritance;
class BasicCalci
{
	public void add()
	{
		System.out.println("add method");
	}
	public void sub()
	{
		System.out.println("sub method");
	}
}
class ScientifiCalci extends BasicCalci
{
	public void sinTheta()
	{
		System.out.println("sinTheta method");
	}
	public void cosTheta()
	{
		System.out.println("cosTheta method");
	}
}
public class Tester1 
{
	public static void main(String[] args) 
	{
		ScientifiCalci rv = new ScientifiCalci();
		rv.add();
		rv.sub();
		rv.sinTheta();
		rv.cosTheta();
		System.out.println(rv.hashCode());
	}
}
