package javafinal;

import java.util.Scanner;

public class TakingInputfromUser {
public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int x=sc.nextInt();
			System.out.println(x);
			
			System.out.println("Enter decimal number");
			double d=sc.nextDouble();
			System.out.println(d);
			
			System.out.println("Enter a String:");
			String s=sc.next();
			System.out.println(s);
		}
		
	}

}
	
