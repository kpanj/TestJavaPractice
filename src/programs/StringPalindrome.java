package programs;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "manam";
		String rev = "";
		String temp=rev;
		
		for(int i = 1;i<str.length();i++) {
			rev = str.charAt(i)+rev;
		}
		if(temp.equals(rev))
			System.out.println("String is palindrome");
		else 
			System.out.println("String is not palindrome");

	}

}
