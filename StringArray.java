package Strings;
import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names you want to store");
		int size = sc.nextInt();
		
		String[] name = new String[size];
		System.out.println("Enter Names");
		for (int i = 0; i < size ; i++) {
			name[i]= sc.next();
			
		}
		
		System.out.println("Stored Names are");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			
		}
		
	}

}
