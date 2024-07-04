package methodOverloading;

public class Adder {

	static int add(int a, int b) {
		return a+b;
	}
	static int add(int x, int y, int z) {
		return x+y+z;
	}
}
