package rescue_project;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class campaign_testTest {
	@Test
	public void campaign_list() throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the description");
		String des = sc.nextLine();
		System.out.println("Enter the date");
		String date = sc.nextLine();
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
		Thread.sleep(2000);
		cd.findElement(By.linkText("Campaign")).click();
		Thread.sleep(2000);
		cd.findElement(By.id("title")).sendKeys("Awareness");
		Thread.sleep(1000);
		cd.findElement(By.id("description")).sendKeys(des);
		Thread.sleep(1000);
		cd.findElement(By.id("goal_amount")).sendKeys("200");
		Thread.sleep(1000);
		cd.findElement(By.id("end_date")).sendKeys(date);
		Thread.sleep(1000);
		cd.findElement(By.xpath("/html/body/div/div[2]/div/form/button")).submit();
		Thread.sleep(1000);
		JavascriptExecutor ab = (JavascriptExecutor) cd;
		for (int i = 0; i < 50; i++) {
			ab.executeScript("window.scrollBy(0, 250)");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		for (int i = 0; i < 50; i++) {
			ab.executeScript("window.scrollBy(0, -250)");

			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

@Test
public void new1_campaign () throws InterruptedException{
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
	Thread.sleep(2000);
	cd.findElement(By.linkText("Campaign List")).click();
	Thread.sleep(2000);
	JavascriptExecutor ab= (JavascriptExecutor)cd;
	for (int i = 0; i < 50; i++) {
		ab.executeScript("window.scrollBy(0, 250)");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
}
	
	cd.findElement(By.xpath("/html/body/div/div[2]/div[2]/a")).click();
	

}
@Test
public void donate_test() throws InterruptedException {
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
	Thread.sleep(2000);
	cd.findElement(By.linkText("Campaign List")).click();
	Thread.sleep(2000);
	cd.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/div/div[1]/div/a")).click();
	cd.findElement(By.id("donationAmount")).sendKeys("200");
	JavascriptExecutor js1 = (JavascriptExecutor) cd;
	js1.executeScript(" window.scrollBy(0, 250)");
	cd.findElement(By.xpath("/html/body/div/div[2]/div/div/form/button")).submit();
}
}



