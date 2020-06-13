package interfacetopic;
//1.public
//2.implements
//3.abstract
//4.interface
//5.public
interface TV
{
	void display();
	void sound();
	void remote(int channel);
}
class Sony implements TV
{
	public void display()
	{
		System.out.println("Sony LED Display");
	}
	public void sound()
	{
		System.out.println("Sony DTS Sound System");
	}
	public void remote(int channel)
	{
		System.out.println("Sony TV is in Channel Number::"+channel);
	}
}
class Onida implements TV
{
	public void display()
	{
		System.out.println("Sony Karab Display");
	}
	public void sound()
	{
		System.out.println("Sony Karab Sound System");
	}
	public void remote(int channel)
	{
		System.out.println("Sony TV is in Karab Channel Number::"+channel);
	}
}

public class Tester1
{
	public static void main(String[] args) 
	{
		System.out.println("The Main Starts...");
//		TV rv = new TV();
		Sony s = new Sony();
		s.display();
		s.sound();
		s.remote(100);
		System.out.println("====================");
		Onida o = new Onida();
		o.display();
		o.sound();
		o.remote(100);
		System.out.println("The Main Ends...");
	}
}
