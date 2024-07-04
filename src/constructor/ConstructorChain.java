package constructor;

public class ConstructorChain {
	ConstructorChain() {
		this("This is test this method.");
		System.out.println("Default constructor called.");
	}
	ConstructorChain(String str) {
		System.out.println("Parameterised constructor called.");
	}
	
	public static void main(String[] args) {
		ConstructorChain cc = new ConstructorChain();
	}
	
}
