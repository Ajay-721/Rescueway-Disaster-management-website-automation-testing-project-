package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Change_password {
	public static void main(String[] args) throws InterruptedException {
		WebDriver cd = new ChromeDriver();
		cd.get("https://rescueway.pythonanywhere.com/");
		WebElement signin = cd.findElement(By.linkText("Sign In"));
		signin.click();
		JavascriptExecutor js = (JavascriptExecutor) cd;
		js.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
		cd.findElement(By.id("loginEmail")).sendKeys("ajaydevan901@gmail.com");
		cd.findElement(By.id("loginPassword")).sendKeys("ajay@098");
		cd.findElement(By.xpath("/html/body/div/div/form/button")).click();
		cd.findElement(By.id("userDropdown")).click();
		Thread.sleep(2000);
		cd.findElement(By.linkText("Change Password")).click();
		cd.findElement(By.id("email")).sendKeys("ajaydevan901@gmail.com");
		cd.findElement(By.xpath("/html/body/div/div[2]/div/form/button")).click();
		

	}

}
