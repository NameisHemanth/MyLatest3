package methodoverriding;
//1.Overriding=Jyothi,Manisha,Pushpa,Shwetha
//2.Overloading=Ali,Anjana,Gayatri,Shruthi
//3.Both
//4.Error==Adi,Poonam,Pradnya,Shilpa
class I
{
	public int test1()
	{
		System.out.println("super class Implementation");
		return 90;
	}
}
class J extends I
{
	/*public double test1()
	{
		System.out.println("sub class Implementation");
		return 90.5;
	}*/
}
public class Tester8
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		J j1 = new J();
		j1.test1();
		System.out.println("The Main Ends...");
	}
}
