package week3.day1.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	/*
	 * @SuppressWarnings("unused") public static void main(String[] args) throws
	 * InterruptedException { // TODO Auto-generated method stub //1) Go to
	 * https://www.nykaa.com/ WebDriverManager.chromedriver().setup(); ChromeDriver
	 * driver= new ChromeDriver(); //1. Launch URL
	 * "http://leaftaps.com/opentaps/control/login" driver. get
	 * ("https://www.nykaa.com/"); driver .manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //2)
	 * Mouseover on Brands and Mouseover on Popular // Mouse over on Brands
	 * WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
	 * Actions bran = new Actions(driver);
	 * bran.moveToElement(brand).build().perform();
	 * 
	 * //Mouse Over on Popular WebElement popular =
	 * driver.findElement(By.xpath("//a[text()='Popular']")); Actions action = new
	 * Actions(driver); bran.moveToElement(popular).build().perform(); //3) Click
	 * L'Oreal Paris driver.findElement(By.xpath(
	 * "//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']"
	 * )).click(); // 4) Go to the newly opened window and check the title contains
	 * L'Oreal Paris Set<String> allWindows =driver.getWindowHandles(); List<String>
	 * listOfWindows = new ArrayList<String>(allWindows);
	 * driver.switchTo().window(listOfWindows.get(1)); String title =
	 * driver.getTitle(); if(title.contains("L'Oreal Paris")) {
	 * System.out.println(".getTitle"); } //5) Click sort By and select customer top
	 * rated driver.findElement(By.xpath("//span[text()='Sort By : ']")).click();
	 * driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	 * //6) Click Category and click Shampoo
	 * driver.findElement(By.xpath("//div[text()='Category']")).click();
	 * driver.findElement(By.xpath("//span[text()='Hair']")).click();
	 * driver.findElement(By.xpath("(//div[@class='category-wrap-top']//li)[3]")).
	 * click();
	 * driver.findElement(By.xpath("//label[@for='chk_Shampoo_undefined']")).click()
	 * ;
	 * 
	 * //7) check whether the Filter is applied with Shampoo String filterapplied =
	 * driver.findElement(By.xpath(
	 * "//div[@id='sortComponent']/div[1]/div[1]/ul[1]/li[1]")) .getText();
	 * 
	 * if (!filterapplied.contains("Shampoo")) { System.out.println(filterapplied +
	 * " no "); } else { System.out.println(filterapplied + " filterapplied ");
	 * 
	 * }
	 * 
	 * // 8) Click on L'Oreal Paris Colour Protect Shampoo WebElement textbox =
	 * driver.findElement(By.
	 * xpath("//input[@class='header__search-input form-control']"));
	 * textbox.sendKeys("L'Oreal Paris Colour Protect Shampoo");
	 * textbox.sendKeys(Keys.ENTER);
	 * 
	 * driver.findElement(By.xpath(
	 * "//div[@class='m-content__product-list__title']//span")).click();
	 * 
	 * //9) GO to the new window and select size as 175ml ArrayList<String>
	 * newwindow = new ArrayList<String>(driver.getWindowHandles());
	 * driver.switchTo().window(newwindow.get(2));
	 * 
	 * System.out.println("Page Navigated - Product detailed information");
	 * 
	 * WebElement size = driver.findElement(By.tagName("select")); new
	 * Select(size).selectByVisibleText("175ml"); //10) Print the MRP of the product
	 * String MRP = driver.findElement(By.xpath("//span[text()='MRP:']")).getText();
	 * String rate =
	 * driver.findElement(By.xpath("//span[@class='post-card__content-price-offer']"
	 * )).getText(); System.out.println(MRP + rate); // 11) Click on ADD to BAG
	 * driver.findElement(By.
	 * xpath("//div[text()='DELIVERY OPTIONS']//preceding::button[1]")).click();
	 * Thread.sleep(2000); //12) Go to Shopping Bag
	 * driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
	 * Thread.sleep(2000); //13) Print the Grand Total amount
	 * driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
	 * Thread.sleep(2000); String grandtotal = driver.findElement(By.
	 * xpath("(//div[text()='Grand Total:']//following::div[1])[1]")).getText();
	 * grandtotal = grandtotal.replaceAll("\\D", ""); int grandtotal1 =
	 * Integer.parseInt(grandtotal); System.out.println("total:" +grandtotal1);
	 * 
	 * //14) Click Proceed
	 * driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	 * Thread.sleep(2000);
	 * 
	 * //15) Click on Continue as Guest
	 * driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
	 * Thread.sleep(2000);
	 * 
	 * //16) Check if this grand total is the same in step 13 String grandtotal3 =
	 * driver.findElement(By.xpath("(//div[@class='value']//span)[2]")).getText();
	 * grandtotal3 = grandtotal3.replaceAll("\\D", ""); int grandtotal4 =
	 * Integer.parseInt(grandtotal3); System.out.println("Grand totalamount:"
	 * +grandtotal4);
	 * 
	 * if(grandtotal1==grandtotal4) { System.out.println("grand total is same"); }
	 */

	// 17) Close all windows
	// driver.quit();

	public static void main(String[] args) throws InterruptedException {

		// step 1: setup chromedriver
		WebDriverManager.chromedriver().setup();

		// step 2: launch the chrome
		ChromeDriver driver = new ChromeDriver();

		// step 3: load the url
		driver.get("https://www.nykaa.com/");

		// step 4: maximize the browser
		driver.manage().window().maximize();

		// step 5: set implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// 2 : MouseOver on Brands MouseOver on Popular
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@class='css-38r9y0'])[2]"))).perform(); // -------------->brand
		action.moveToElement(driver.findElement(By.xpath("//div[@class='BrandsCategoryHeading']//a[1]"))).perform();// ---------->popular
		// Thread.sleep(500);

		// 3 :click Oreal Paris
		driver.findElement(By.xpath("//div[@id='brandCont_Popular']/ul[1]/li[5]/a[1]/img[1]")).click();

		// get the title to print
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//div[@class='m-content__product-list__title']//span")).click();

		// 4 : GO to the new window
		Set<String> nextwindow = driver.getWindowHandles();
		List<String> secondwindow = new ArrayList<String>(nextwindow);
		driver.switchTo().window(secondwindow.get(1));
		Thread.sleep(2000);

		// 5 : click sortby and select customer top rated
		driver.findElement(By.xpath("//div[@id='sortComponent']/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//div[@id='sortComponent']/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]")).click();

		// 6 : click category and click shampoo
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		driver.findElement(By.xpath(
				"//div[@id='listingContainer']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/div[1]/li[1]"))
				.click();
		driver.findElement(By.xpath("(//div[@class='category-wrap-top']//li)[3]")).click();
		driver.findElement(By.xpath("//label[@for='chk_Shampoo_undefined']")).click();

		// 7 : check whether the filter is applied with shamPoo
		String text = driver.findElement(By.xpath("//div[@id='sortComponent']/div[1]/div[1]/ul[1]/li[1]")).getText();
		if (text.contains("Shampoo")) {
			System.out.println("success. shampoo was founted.");
		} else {
			System.out.println("failure. shampoo not found");
		}
		Thread.sleep(5000);

		// 8 : click on L'Oreal Paris colour protect shamPoo
		WebElement textbox = driver.findElement(By.xpath("//input[@class='header__search-input form-control']"));
		textbox.sendKeys("L'Oreal Paris Colour Product Shampoo");
		textbox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//div[@class='m-content__product-list__title']//span")).click();

		// 9) GO to the new window and select size as 175ml
		ArrayList<String> newwindow = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newwindow.get(2));
		System.out.println(driver.getTitle());

		WebElement size = driver.findElement(By.tagName("select"));
		new Select(size).selectByVisibleText("175ml");

		// 10 : print the MRP
		String MRP = driver.findElement(By.xpath("//span[text()='MRP:']")).getText();
		String Rate = driver.findElement(By.xpath("//span[text()='150']")).getText();
		System.out.println(MRP + Rate);

		// 11 : click on add to bag
		driver.findElement(By.xpath("//button[contains(@class,'combo-add-to-btn prdt-des-btn')]")).click();
		Thread.sleep(2000);

		// 12 : go to shopping bag
		driver.findElement(By.className("AddBagIcon")).click();

		// 13 : print the grand total amount
		String grandtotal = driver.findElement(By.xpath("//div[text()='Grand Total']")).getText();
		String amount = driver.findElement(By.xpath("//div[text()='220']")).getText();
		System.out.println(grandtotal + amount);

		// 14 : click proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		Thread.sleep(2000);

		// 15 : click on continue as guest
		driver.findElement(By.xpath("(//button[contains(@class,'btn full')])[2]")).click();

		// 16 : check if this grand total is the same in step 13
		String GT = driver.findElement(By.xpath("(//div[@class='value']//span)[2]")).getText();
		GT = GT.replaceAll("\\D", "").trim();
		int GTfinal = Integer.parseInt(GT);
		System.out.println(GTfinal);
		
		if(GT == grandtotal) {
			System.out.println("the final amount is same");
			
		}
		
		// 17 : close all browser
		driver.quit();
		
		

		

	}
}
