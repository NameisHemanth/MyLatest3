package supercallingstatement;
class M
{
	M()
	{
		System.out.println("Running M class Constructor");
	}
}
class N extends M
{
	N(int a)
	{
//		super();
		System.out.println("Running N(int a) Constructor");
	}
	N()
	{
		this(90);
		System.out.println("Running N Class COnstructor");
	}
}
class O extends N
{
	O()
	{
//		super();
		System.out.println("Running O Class Constructor");
	}
}
public class Tester6
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		O rv = new O();
		System.out.println("The Main Ends...");
	}
}
