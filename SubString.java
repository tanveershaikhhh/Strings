package Strings;

public class SubString {
	
	public static void main(String[] args) {
		
		String sentence = "My name is Tanveer Javed Shaikh";
		
		//This will print only the index you give
		// for eg you can extract a name from sentence
						//    starting index    End index
		System.out.println(sentence.substring( 11         ,          18)); // always give +1 index cause it is by default set at -1
		System.out.println(sentence.substring(11, sentence.length()));
	}

}
