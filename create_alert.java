package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class  create_alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver cd=new ChromeDriver();
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
		cd.findElement(By.linkText("Create Alert")).click();
		Thread.sleep(1000);
		WebElement dropdown=cd.findElement(By.className("form-control"));
		Select drpdwn= new Select(dropdown);
		drpdwn.selectByVisibleText("flood");
		Thread.sleep(1000);
		cd.findElement(By.name("alert_message")).sendKeys("back to camp");
		Thread.sleep(1000);
		cd.findElement(By.xpath("/html/body/div/div[2]/form/button")).click();
		
		JavascriptExecutor ab= (JavascriptExecutor)cd;
		for (int i = 0; i < 50; i++) {
			ab.executeScript("window.scrollBy(0, 350)");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
		cd.close();
		

	}

}
