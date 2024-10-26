package week3.Day1;

import java.util.Iterator;

public class Learnstring {

	public static void main(String[] args) {
		String name = "TestLeaf";   // string literal
		String cName = new String("Testleaf");  //String object
		
		// length of the string
		
		int Charcount = name.length();
        System.out.println("Number of characters : " + Charcount);
        
        // equals   -  check the case sensitivity
        
        if(name.equals(cName)) {
        	System.out.println("It is equal");
        }
        else {
        	System.out.println("It is not equal"); 
        }
        
        // equalIgnoreCase  --- compares the string content ignoring case
        
        if(name.equalsIgnoreCase(cName)){
       System.out.println("It's equalIgnoreCase");
        }
        else {
        	System.out.println("It's not equalIgnorecase");
        }
        
        // difference b/w == and .equals()
        // == --> checks the memory address of the string value
        
        if(name==cName) {
        	System.out.println("It's ==");
        }
        else {
        	System.out.println("It's not ==");
        }
        
        String n = "TestLeaf";
        if(name == n) {
        	System.out.println("==");
        }
        else {
        	System.out.println("!=");
        }
        
        // contains  -- case sensitive  and sequential 
        boolean contains = n.contains("leaf");
        System.out.println(contains);
        
         // charAt
        
        char charAt = n.charAt(5);
        
        System.out.println(charAt);
        
        // tocharArray
        String value = "Selenium";
        char[] ch = value.toCharArray();
        for(int i=0;i<value.length(); i++){
        	System.out.print(ch[i]);
        }
        
        // Reverse the string
        String data = "Selenium";
        
        char[] ch1 = data.toCharArray();
        
        for(int i = ch1.length - 1; i>=0; i--) {
        	
        	System.out.println(ch1[i]);
        }

        
	}

}
