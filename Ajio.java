package week3.day2.assignments;


	import java.time.Duration;
import java.util.List;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Ajio {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			// Step 2: Instantiate the ChromeDriver
			ChromeDriver driver = new ChromeDriver();
			// Loads a new web page in the current browser window
			driver.get("https://www.ajio.com/");
			// Maximize the screen
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			WebElement search=driver.findElement(By.xpath("//div/input[@name='searchVal']"));
			WebElement searchIcon=driver.findElement(By.xpath("//div/button/span[@class='ic-search']"));
			Actions action = new Actions(driver) ;
			Action searchResult = action
					.moveToElement(search)
			        .click()
			        .sendKeys("Bags")
			        .moveToElement(searchIcon)
			        .click()
			        .build();
			searchResult.perform();
			//Under "Category" click "Fashion Bags"
			driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
			Thread.sleep(2000);
			// Print the count of the items Found.
			String totalItems = driver.findElement(By.className("length")).getText();
			System.out.println("Total number of items : " + totalItems);
	        //Get the list of brand of the products displayed in the page and print the list.
			System.out.println(" List of Brands");
					List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
			System.out.println(" Size :" + bagBrandList.size());

			for (WebElement webElement : bagBrandList) {
				String text = webElement.getText();
				System.out.println(text);
			}
			// Get the list of names of the bags and print it
			List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
			System.out.println(" Size :" + bagNameList.size());
			System.out.println(" Names of the Bags");
			for (WebElement webElement : bagNameList) {
				String text = webElement.getText();
				System.out.println(text);
			}			

		}

	}

