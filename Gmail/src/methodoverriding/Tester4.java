package methodoverriding;
class Person
{
	String name;
	int age;
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("The Name="+name);
		System.out.println("The Age="+age);
	}
}
class Trainer extends Person
{
	double salary;
	String subject;
	public Trainer(String name, int age, double salary, String subject) 
	{
		super(name, age);
		this.salary=salary;
		this.subject=subject;
	}
	
	public void display()
	{
		super.display();
		System.out.println("The Salary="+salary);
		System.out.println("The Subject="+subject);
	}
}
public class Tester4 
{
	public static void main(String[] args)
	{
		Person p = new Person("Vijay", 90);
		p.display();
		System.out.println("=================");
		Trainer t = new Trainer("Mohan", 30, 999.99, "Java");
		t.display();
	}
}
