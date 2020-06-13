package abstractclasstopic;
abstract class Animal
{
	abstract void move();
	abstract void sound();
}
class Cat extends Animal
{
	void move()
	{
		System.out.println("Cat Walks");
	}
	void sound()
	{
		System.out.println("Meow Meow");
	}
}
class Dog extends Animal
{
	void move()
	{
		System.out.println("Dog Walks");
	}
	void sound()
	{
		System.out.println("Baw Baw");
	}
}
public class Tester2
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		//Animal rv = new Animal();
		Cat c = new Cat();
		c.move();
		c.sound();
		System.out.println("===============");
		Dog d = new Dog();
		d.sound();
		d.move();
		System.out.println("The Main Ends...");
	}
}
