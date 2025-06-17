package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

	public static void main(String[] args) throws InterruptedException {
		WebDriver cd = new ChromeDriver();
		cd.get("https://rescueway.pythonanywhere.com/");
	    cd.manage().window().maximize();
		
		JavascriptExecutor ab= (JavascriptExecutor)cd;
		for (int i = 0; i < 25; i++) {
			ab.executeScript("window.scrollBy(0, 200)");

			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
		JavascriptExecutor ab1= (JavascriptExecutor)cd;
		for (int i = 0; i < 25; i++) {
			ab.executeScript("window.scrollBy(0, -300)");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


	}
		JavascriptExecutor js1= (JavascriptExecutor) cd;
		js1.executeScript(" window.scrollBy(0, 500)");
		JavascriptExecutor js2= (JavascriptExecutor) cd;
		WebElement jk=cd.findElement(By.cssSelector("body > div > div:nth-child(4) > div > div.col-lg-6.py-6.px-5 > a"));
		js2.executeScript("arguments[0].click();",jk);
		cd.findElement(By.linkText("Learn More")).click();
		cd.findElement(By.xpath("/html/body/div/div[7]/div[2]/div[1]/div/img")).click();
}
}