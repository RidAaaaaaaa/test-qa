package selenium_rida;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestQA {
	public static void main(String[] args) throws InterruptedException {
		// Setup WebDriver1
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				// Open the webpage
				driver.get("https://demoqa.com/");
				
				// Wait for 1 seconds to allow the page to load fully
				System.out.println("Waiting for the page to load...");
				Thread.sleep(1000);
				
				// Maximize the browser window
				System.out.println("Maximizing the browser window...");
				driver.manage().window().maximize();
				
				//Click form
				driver.findElement(By.xpath("//div[@class='card mt-4 top-card']//h5[text()='Forms']")).click();
				System.out.println("Form click");
				Thread.sleep(1000);
				
				//click on practice form
				driver.findElement(By.xpath("//span[normalize-space()='Practice Form']")).click();
				System.out.println("Form click");
				
				//enter name 
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("rida");
				System.out.println("Name Entered");
				//enter last name
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Khan");
				System.out.println("last Name Entered");
				Thread.sleep(1000);
				
				//enter email
				driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ridakhan@test.com");
				System.out.println("email entered");
				
				//select gender
				driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
				System.out.println("gender selected");
				Thread.sleep(1000);
				
				//enter number
				driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567891");
				System.out.println("email entered");
				
				 // Create a WebDriverWait instance using Duration
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		        // Scroll to the subject field and click
		        WebElement subjectField = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subjectField);
		        
		        // Wait for the subject input to be clickable
		        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait2.until(ExpectedConditions.elementToBeClickable(subjectField));
		        
		        // Click the subject field
		        subjectField.click();
		        System.out.println("Subject field clicked");

		        // Enter letter 'e' and wait for dropdown
		        subjectField.sendKeys("e");
		        System.out.println("Letter 'e' entered");

		        // Wait for the dropdown options to appear
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='react-select-2-option-0' and text()='English']")));

		        // Select the "English" option from the dropdown
		        WebElement englishOption = driver.findElement(By.xpath("//div[@id='react-select-2-option-0' and text()='English']"));
		        englishOption.click();
		        System.out.println("English option selected");
		        Thread.sleep(1000);
				
				//select reading option
				driver.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
				System.out.println("reading selected");
				Thread.sleep(1000);
				
				//enter address
				driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Johar Town");
				System.out.println("address entered");
				
				//select state
				driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]")).click();
				System.out.println("dropdown clicked");
				Thread.sleep(1000);
				
				//select state value
				driver.findElement(By.xpath("//div[contains(text(),'NCR')]")).click();
				System.out.println("NCR");
				Thread.sleep(1000);
				
				//Select city 
				driver.findElement(By.xpath("//div[@id='city']//div[contains(@class,'css-tlfecz-indicatorContainer')]")).click();
				System.out.println("city dropdown");
				Thread.sleep(1000);
				
				//select city value
				driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
				System.out.println("delhi selected");
				Thread.sleep(1000);
				
				
				//click submit
				driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
				System.out.println("form submited");
				
	}
}
