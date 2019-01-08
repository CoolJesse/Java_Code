/*Project 28 from Java Master Class, OOP Part 1: Inheritance - Part 1*/
import repo.Animal;
import repo.Dog;

public class project_28{
	public static void main(String[] args){
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "short hair");
		
		dog.eat();
		dog.walk();
		dog.run();
	}
}