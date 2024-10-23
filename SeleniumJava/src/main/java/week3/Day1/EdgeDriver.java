package week3.Day1;

// method overriding

public class EdgeDriver extends ChromeDriver{

	
	public void launchBrowser() {
		System.out.println("www.google.com");
	}
	
	public static void main(String[] args) {
		EdgeDriver ed = new EdgeDriver();
		ed.launchBrowser();
	}
}
