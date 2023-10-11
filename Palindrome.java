package Strings;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String you want to check");
	String str = sc.next();
	String rev = "";
	int len = str.length();
	
	for (int i=len-1; i>=0; i--) {
		rev = rev+str.charAt(i);
	}
	System.out.println(rev);
	
	if (rev.equals(str)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
