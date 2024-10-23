package week1.Day2;

public class Method {

//	accessModifier returnType methodName(input arguments)
//	If you creating an input argument, pass the value in main method
	
	public void browserVersion() {
    System.out.println("BV : 129.02");
}
	
//	default
	void browserName (String name) {
		System.out.println(name);
	}
    
// private
	private int cardPinNo() {
		return 1234;
	}
	
 public static void main(String[] args) {
//	 ClassName objectName = new ClassName(); 
      Method learning = new Method();
      
//    objectName.methodName();
      learning.browserName("Chrome");
      learning.browserVersion();
      
//  if you have declared a datatype; store it in the local variable or syso(obj.method())
      System.out.println(learning.cardPinNo());
      
 }


}
