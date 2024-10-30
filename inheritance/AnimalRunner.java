public class AnimalRunner
{
	public static void main(String[] args)
	{
	Puppy pup=new Puppy();
	pup.makeSound();
	pup.name="Dora";
	pup.dogBark();
	pup.sleep();
	Cat cat=new Cat();
	cat.color="black";
	cat.displayColor();
	Rabbit rab=new Rabbit();
	rab.makeSound();
	}
}