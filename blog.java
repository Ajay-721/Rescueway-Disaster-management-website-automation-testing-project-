package rescue_project;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blog {

	public static void main(String[] args) throws InterruptedException {
		Scanner nm= new Scanner(System.in);
		System.out.println("enter the description");
		String des= nm.nextLine();
		WebDriver cd = new ChromeDriver();
		cd.get("https://rescueway.pythonanywhere.com/");
		WebElement signin = cd.findElement(By.linkText("Sign In"));
		signin.click();
		JavascriptExecutor js = (JavascriptExecutor) cd;
		js.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
		cd.findElement(By.id("loginEmail")).sendKeys("ajaydevan701@gmail.com");// correct user name
		cd.findElement(By.id("loginPassword")).sendKeys("ajay@098");
		cd.findElement(By.xpath("/html/body/div/div/form/button")).click();
		cd.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
		cd.findElement(By.linkText("Blog")).click();
		WebElement button= cd.findElement(By.xpath("/html/body/div/div[2]/div[2]/a"));
		JavascriptExecutor xy= (JavascriptExecutor)cd;
		xy.executeScript("arguments[0].click();", button);
		cd.findElement(By.id("title")).sendKeys("new blog");
		cd.findElement(By.id("content")).sendKeys(des);
		cd.findElement(By.xpath("/html/body/div/div[2]/form/button")).submit();
		Thread.sleep(2000);
		// click readmore 
		cd.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/div/div/a")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) cd;
		js1.executeScript(" window.scrollBy(0, 300)");
		cd.findElement(By.name("content")).sendKeys("help");
		cd.findElement(By.xpath("/html/body/div/div[2]/form/button")).submit();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) cd;
		js2.executeScript(" window.scrollBy(0, 500)");
		//back to blog list
		cd.findElement(By.xpath("/html/body/div/div[2]/div[2]/a")).click();


	}

}
