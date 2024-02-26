package zzzscore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneTo50 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zzzscore.com/1to50/en/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		for (int i = 1; i <= 50; i++) {
			WebElement path = driver.findElement(By.xpath("//span[@class='box']/parent::div[text()=" + i + "]"));

			wait.until(ExpectedConditions.elementToBeClickable(path)).click();

		}

	}

}
