package week3.Day1;

public class ChromeDriver extends ChromiumDriver{

	public void launchBrowser() {
		System.out.println("It is coming from chromeDriver");
	}
	
	public static void main(String[] args) {
		ChromeDriver C = new ChromeDriver();
		C.chromedriver();
		C.driver();
		C.launchBrowser();
	}
}
