package Strings;
import java.util.Iterator;
import java.util.Scanner;


public class LengthOfString {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter size of String");
			int size = sc.nextInt();
			
			String arr[] = new String[size];
			int toLength = 0;
			//
				for (int i = 0; i < size ; i++) {
					arr[i] = sc.next();
					
					toLength +=arr[i].length();
		
	
				}			System.out.println(toLength);

		}
}
