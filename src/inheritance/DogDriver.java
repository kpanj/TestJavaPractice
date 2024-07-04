package inheritance;

public class DogDriver {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		System.out.println("==================");
		BabyDog b = new BabyDog();
		b.bark();
		b.eat();
		b.weep();
		System.out.println("==================");
		Cat c = new Cat();
		c.eat();
		c.meow();

	}

}
