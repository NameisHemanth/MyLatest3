package abstractclasstopic;
abstract class E
{
	abstract void test1();
	abstract void test2();
}
abstract class F extends E
{
	void test1()
	{
		System.out.println("test1 Overridden in class F");
	}
}
class G extends F
{
	void test2()
	{
		System.out.println("test2 Overridden in class G");
	}
}
public class Tester5
{
	public static void main(String[] args)
	{
		G g1 = new G();
		g1.test1();
		g1.test2();
	}
}
