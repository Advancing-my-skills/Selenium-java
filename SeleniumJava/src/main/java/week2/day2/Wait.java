package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
		driver.findElement(By.name("firstname")).sendKeys("Vinetha");
		driver.findElement(By.name("lastname")).sendKeys("R");
	
		
//		WebDriver methods
//		to get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("FaceBook")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
			}
			
//	get the current Url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
//		text from application
		String text =driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		//TestLeaf(10731)
		
		if (text.contains("TestLeaf")) {
			System.out.println("Lead is created");
		}
		else {
			System.out.println("lead is not created");
		}
		driver.close();
			
		}
	}


 