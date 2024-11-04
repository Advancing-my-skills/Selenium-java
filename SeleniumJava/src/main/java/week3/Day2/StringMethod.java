package week3.Day2;

import java.util.Iterator;

public class StringMethod {

	public static void main(String[] args) {
		
		String input = "Selenium Motherhood Language is Java";
		
		// o/p - "SeleniumMotherhoodLanguageisJava" --- split method

		String[] output = input.split(" ");
		System.out.println(output);
		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}
		
		System.out.println();
		
		// replace
		
		String value = "Java";
		String replace = value.replace('a', '@');
		
		System.out.println(replace);
		
		System.out.println();
		
		// replaceAll
		
		String val = "Amazon have Launched 1000 new Product %";
		//String replaceAll = val.replaceAll("[a-z]", "@#");
		String replaceAll = val.replaceAll("[^0-9a-zA-Z]", "@#");
		// use ^ to retain
		// [0-9] - replace numbers
		// [A-Z] - replace capital letters
		System.out.println(replaceAll);
		
		System.out.println();
		
		// subString method
		
		String name = "take screenshot";
		String substring = name.substring(5);  // 4 - space 5-s
		System.out.println(substring);
		
		String substring2 = name.substring(5, 10); // 10 -1 = 9 till 9 will be printed
		System.out.println(substring2);
		
		String uppercase = name.toUpperCase();
		System.out.println(uppercase);
		
		String lowercase = name.toLowerCase();
		System.out.println(lowercase);
		
		// parseInt method
		
		String amt = "4000";
		// string value to integer
		int parseInt = Integer.parseInt(amt);
		System.out.println(parseInt);
		
		//Double.parse. method 
		
				
	}

}
