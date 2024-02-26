package zzzscore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColorSense {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zzzscore.com/color/en/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


		// using for
		for (;;) {
			WebElement path = driver.findElement(By.xpath("//div[@class='main']"));
			wait.until(ExpectedConditions.elementToBeClickable(path));
			if (path.isDisplayed()) {
				path.click();
			} else {
				driver.quit();
			}
		}

		// using while
//		while (true) {
//			try {
//				WebElement path = driver.findElement(By.xpath("//div[@class='main']"));
//				
//				wait.until(ExpectedConditions.elementToBeClickable(path)).click();
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//				break;
//			}
//		}
//		
//		driver.quit();

	}

}
