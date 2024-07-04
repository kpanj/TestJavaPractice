package programs;

import java.util.Scanner;

public class Fibonacci0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;//1st series of no
		int b = 1;//2nd series of no
		int c = 0;
		//int n = 10;
		System.out.println("Enter the 8th no : ");
		System.out.print(a+" "+b);
		for(int i = 2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		
	}
}
