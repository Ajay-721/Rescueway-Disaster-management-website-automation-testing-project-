package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gallery {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rescueway.pythonanywhere.com/");

		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 750);");

		driver.findElement(By.id("loginEmail")).sendKeys("ajaydevan701@gmail.com");
		driver.findElement(By.id("loginPassword")).sendKeys("ajay@098");
		driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
		driver.findElement(By.linkText("Gallery")).click();
		WebElement dropdown = driver.findElement(By.name("category"));
		Select drpdwn = new Select(dropdown);
		drpdwn.selectByVisibleText("Tsunami");
		WebElement dropdown1 = driver.findElement(By.name("category"));
		Select drpdwn1 = new Select(dropdown1);
		drpdwn1.selectByVisibleText("Flood");
		WebElement dropdown2 = driver.findElement(By.name("category"));
		Select drpdwn2 = new Select(dropdown2);
		drpdwn2.selectByVisibleText("Earthquake");
		WebElement dropdown3 = driver.findElement(By.name("category"));
		Select drpdwn3 = new Select(dropdown3);
		drpdwn3.selectByVisibleText("Fire");

	}

}
