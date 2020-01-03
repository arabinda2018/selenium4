package nov12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Actions action = new Actions(driver);
		action.contextClick(username);
		action.perform();
	}
}
