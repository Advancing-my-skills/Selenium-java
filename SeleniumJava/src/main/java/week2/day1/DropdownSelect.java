package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
//		create an object for select class
		Select obj = new Select(dd);
//		object.method
//		obj.selectByIndex(2);   //Index
		obj.selectByVisibleText("Selenium");  //visible text
       
	}

}
