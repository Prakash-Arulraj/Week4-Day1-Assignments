package week3.day1.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		//setup the chomedriver
		WebDriverManager.chromedriver().setup();
		
		//launch the chromedriver
		ChromeDriver driver = new ChromeDriver();

		// 1. load the URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximize the browser
		driver.manage().window().maximize();                      //------------>maximize
		
		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");  //----->username
		driver.findElement(By.id("password")).sendKeys("crmsfa");           //-------->password
		
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();

		// 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();

		// 7. Click on Widget of From Contact
		driver.findElementByXPath("//span[text()='From Contact']/following::img").click();

		// 8. Click on First Resulting Contact
		Set<String> nextwindow = driver.getWindowHandles();
		List<String> secondwindow = new ArrayList<String>(nextwindow);
		driver.switchTo().window(secondwindow.get(1));
		Thread.sleep(3000);
		driver.findElement(By.linkText("ca1")).click();
		driver.switchTo().window(secondwindow.get(0));

		// 9. Click on Widget of To Contact
		driver.findElementByXPath("//span[text()='To Contact']/following::img").click();
		nextwindow = driver.getWindowHandles();
		secondwindow = new ArrayList<String>(nextwindow);
		driver.switchTo().window(secondwindow.get(1));
		Thread.sleep(2000);
		
		// 10. Click on Second Resulting Contact
		driver.findElement(By.linkText("ca2")).click();
		driver.switchTo().window(secondwindow.get(0));

		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.linkText("Merge")).click();
		

		// 12. Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// 13. Verify the title of the page
		System.out.println(driver.getTitle());
		

	}

}
