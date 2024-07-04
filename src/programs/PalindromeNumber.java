package programs;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		sc.close();
		while(num!=0) {
			int digit = num%10;
			rev = rev*10+digit;
			num = num/10;
		}
		if(rev==temp) 
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}
}
