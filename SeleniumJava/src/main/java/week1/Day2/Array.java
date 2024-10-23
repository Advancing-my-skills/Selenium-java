package week1.Day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[]age = {20, 15, 25, 10, 5, 6, 12, 16, 18};
//ctrl + 2 = assigning to a local variable
       int length = age.length;
       System.out.println("Array Length : " + length);
// finding the last value in the array - length -1
       System.out.println(age[length-1]);
// finding the first value
       System.out.println(age[0]);
//find the 2nd largest value  -- sort
       Arrays.sort(age);
       System.out.println("2nd Largest number : " + age[length-2]);
      
       for (int i = 0; i < age.length; i++) {
	   System.out.println(age[i]);
		
	}
	}
     
}

