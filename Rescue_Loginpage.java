package rescue_project;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rescue_Loginpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb= new ChromeDriver();
		
		wb.get("https://rescueway.pythonanywhere.com/");
		
		WebElement signin=wb.findElement(By.linkText("Sign In"));
		signin.click();
		JavascriptExecutor js= (JavascriptExecutor) wb;
		js.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
	    wb.findElement(By.id("loginEmail")).sendKeys("ajaydevan901@gmail.com");
		wb.findElement(By.id("loginPassword")).sendKeys("ajay@098");
		//remember me
		WebElement checkbox= wb.findElement(By.id("rememberMe"));
		checkbox.click();
		wb.findElement(By.xpath("/html/body/div/div/form/button")).click();
		
		
		//logout
		wb.findElement(By.id("userDropdown")).click();
		Thread.sleep(1000);
		wb.findElement(By.linkText("Logout")).click();

	}
	

}
