package encapsulation;

public class BikeDriver {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.setName("Hunter");
		b.setPrice(300000);
		b.setColor("Blue");
		b.setVersion('c');
		
		System.out.println("Bike name is : "+b.getName());
		System.out.println("Bike name is : "+b.getPrice());
		System.out.println("Bike name is : "+b.getColor());
		System.out.println("Bike name is : "+b.getVersion());

	}

}
