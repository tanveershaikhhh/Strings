package Strings;

import java.util.Scanner;

public class ReverseString {
	
	
	public static void main(String args[] ){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String you want to reverse");
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder(str);
		
		for (int i=0; i<sb.length()/2; i++) {
			int front = i;
			int back = sb.length()-1-i;    // max length -1 - 0  // i will increase by loop and so will index will shift 
			
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt( front, backChar) ;
			sb.setCharAt(back, frontChar) ;
		}
		System.out.println(sb);
	}
		
	}
	