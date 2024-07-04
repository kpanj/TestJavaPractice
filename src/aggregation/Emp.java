package aggregation;

public class Emp {
	int id;
	String name;
	Address address;
	
	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		Address a1 = new Address("Madhubani", "Bihar" ,"India");
		Address a2 = new Address("Darbhanga", "Bihar" ,"India");
		Emp e = new Emp(392, "Manish",a1);
		Emp e1 = new Emp(420, "Manish",a2);
		e.display();
		e1.display();
		
	}

}
