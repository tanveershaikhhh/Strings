package Strings;

import java.util.Scanner;

public class ReplaceA_Letter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.next();
		
		String result = "";
		
		for (int i = 0; i <name.length(); i++) {
			
			if (name.charAt(i) == 'e' ) {
				result += 'c';
			}else {
				result += name.charAt(i);
			}
			
		}
		System.out.println(result);
		
	}
	
	

}
