package week1.Day2;

import java.util.Arrays;

public class FindDuplicateValueinArray {

	public static void main(String[] args) {
		int[] data = {3, 5, 6, 10, 15, 3, 4, 7, 12, 10,10};  //this is applicable for one duplicate element
//        for(int i=0; i<data.length; i++) {
//        for (int j = i+1; j < data.length; j++) {
//        if(data[i]==data[j]) {
//        System.out.println("Duplicate values : " + data[j]);
//        }	
//		}	
//        }  
		Arrays.sort(data);
		for(int i=0; i<data.length-1; i++) {
			if(data[i]==data[i+1]) {
				System.out.println("Duplicate value : " + data[i+1]);
		}
}}
}
