package programs;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Sourcemash";
		String rev = "";
		for(int i = 0;i<str.length();i++) {
			rev = str.charAt(i)+rev;
		}
		System.out.println(rev);
		System.out.println("===============");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
