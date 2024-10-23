package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
	// open the empty browser
		// ctrl + shift + o --- for import
		ChromeDriver driver = new ChromeDriver();
//	    EdgeDriver dr = new EdgeDriver();
//		load the url  by get method(object.get)
			driver.get("https://www.testleaf.com");
//			maximize the screen
			driver.manage().window().maximize();
//			java wait- thread.sleep
			Thread.sleep(5000);
//			close the browser (object.close())
		driver.close();

	}
}
