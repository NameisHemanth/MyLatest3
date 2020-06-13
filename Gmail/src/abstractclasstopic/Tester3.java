package abstractclasstopic;
abstract class College
{
	abstract void gridView();
	final void logo()
	{
		System.out.println("College Logo");
	}
}
class Faculty extends College
{
	void gridView()
	{
		System.out.println("Faculty Details");
	}
}
class Course extends College
{
	void gridView()
	{
		System.out.println("Course Details");
	}
}
public class Tester3
{
	public static void main(String[] args)
	{
//		College c = new College();
		Faculty f = new Faculty();
		f.gridView();
		f.logo();
		Course c = new Course();
		c.gridView();
		c.logo();
	}
}
