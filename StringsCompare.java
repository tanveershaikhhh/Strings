package Strings;

public class StringsCompare {
	public static void main(String[] args) {
		String name1 = "TANVEER";
		String name2 = "TANVEER";
		
		if (name1.compareTo(name2)== 0) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are NOT equal");
		}
		for (int i=0; i<=name1.length(); i++)
		System.out.println(name1.charAt(i));
	}

}
