package objectcastingtopic;
//1. Standarization
//2. Multiple Inheritance
interface TV
{
	void display();
}
class Sony implements TV
{
	@Override
	public void display()
	{
		System.out.println("Sony LED Display");		
	}
	public void touchScreen()
	{
		System.out.println("touch screen");
	}
}
public class Tester6
{
	public static void main(String[] args) 
	{
		TV rv=new Sony();//Auto Upcasting
		rv.display();
//		rv.touchScreen();
		System.out.println("======================");
		Sony s=(Sony)rv;
		s.display();
		s.touchScreen();
	}
}
