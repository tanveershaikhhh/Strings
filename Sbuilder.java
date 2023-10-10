package Strings;
import java.util.*;

public class Sbuilder {
	

	public static void main(String args[]) {
	
		StringBuilder sb = new StringBuilder ("Tanveer");
		System.out.println(sb);
		
		
		// print char at index 1
		System.out.println(sb.charAt(1));
		
		//set char at index 0
		sb.setCharAt(0, 'R');
		System.out.println(sb);
		
		sb.setCharAt(0, 'T');
		
		// insert
		sb.insert(0, 'S');
		System.out.println(sb);
		
		//DELETE S
		sb.delete(0,1 );	
		System.out.println(sb);
		
		//DELETE TAN
		sb.delete(0,3 );	
		System.out.println(sb);
		
		// Again insert TAN
		sb.insert(0, 'T');
		sb.insert(1, 'a');
		sb.insert(2, 'n');
		
		//APPEND --> Adding value at last
		sb.append("Shaikh");
		System.out.println(sb);
	}

}
