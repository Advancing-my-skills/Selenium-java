package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	private static WebElement webElement;

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();			
    
    driver.manage().window().maximize();
    
    driver.get("http://leaftaps.com/opentaps/control/login");
    
    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//    WebElement user = driver.findElement(By.id("username"));
//    user.sendKeys("DemoSalesManager");
//    Thread.sleep(3000);
//    user.clear();
//    
//    user.sendKeys("DemoCsr");
//    NoSuchElementException - if attribute name and attribute value mismatches
    
    	
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
//    ctrl + 2 -- assigning to a local variable 
//    returnType for findElement is -- WebElement
    
    WebElement login = driver.findElement(By.className("decorativeSubmit"));
    login.click();
    
    driver.findElement(By.linkText("CRM/SFA")).click(); // linkText
 //   driver.findElement(By.partialLinkText("CRM")).click(); //partialLinkText "CRM/SFA" can be used as M/SFA   
	}

}
