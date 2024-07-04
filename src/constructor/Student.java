package constructor;

public class Student {
//	String name;
//	int id;
//	Student() {
//		System.out.println("This is default constructor");
//	}
//	
//	Student(String n, int i) {
//		name = n;
//		id = i;
//	}
//	public static void main(String[] args) {
//		Student s = new Student();
//		System.out.println("Default Constructor information");
//		System.out.println("Student name : "+s.name+" "+s.id);
//		System.out.println("==============================");
//		Student s1 = new Student("Manish", 789);
//		System.out.println("Parameterised constructor information");
//		System.out.println("student name : "+s1.name+" "+s1.id);
//	}
	int id, passoutYear;
	String Name, contactNo, collegeName;
	
	Student(String contactNo, int passoutYear, String collegeName) {
		this.contactNo = contactNo;
		this.passoutYear = passoutYear;
		this.collegeName = collegeName;
	}
	
	Student(int id, String name) {
		this("7896541236", 2020, "BM College");
		this.id = id;
		this.Name = name;
	}
	
	public static void main(String[] args) {
		Student s = new Student(392, "Manish");
		System.out.println("Student information : ");
		System.out.println("Student name : "+s.Name);
		System.out.println("Student name : "+s.id);
		System.out.println("Student name : "+s.collegeName);
		System.out.println("Student name : "+s.passoutYear);
		System.out.println("Student name : "+s.contactNo);
		System.out.println("========*=========");
	}
	
	
	
}
