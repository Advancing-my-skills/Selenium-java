package week3.Day1;

public class Overloading {

	public void driver(int noOfDriver) {
		System.out.println(noOfDriver);
	}
	
	public void driver(int taps, String name) {
		System.out.println(taps + " " + name);
	}
	
	public void driver(String url,boolean status, int count) {
		System.out.println(url + " " + count + " " + status);
	}

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.driver(5);
		ol.driver(2, "Chrome");
		ol.driver("htpps://www.testleaf.com", true, 1);
	}
	}
	

