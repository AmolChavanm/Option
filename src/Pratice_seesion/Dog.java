package Pratice_seesion;

public class Dog implements Animal
{
	public void sound()
	{
		System.out.println("Dogs bark");
	}
	public void eat()
	{
		System.out.println("Dog eat bones");
	}

	public static void main(String[] args) 
	{
		Dog g = new Dog();
		g.sound();
		g.eat();
		
	}
	
}
