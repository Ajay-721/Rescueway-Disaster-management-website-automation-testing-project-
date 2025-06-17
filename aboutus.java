package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class aboutus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver cd = new ChromeDriver();
		cd.get("https://rescueway.pythonanywhere.com/");
		cd.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[2]")).click();
		JavascriptExecutor ab = (JavascriptExecutor) cd;
		for (int i = 0; i < 10; i++) {
			ab.executeScript("window.scrollBy(0, 150)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		JavascriptExecutor ab1 = (JavascriptExecutor) cd;
		for (int i = 0; i < 10; i++) {
			ab.executeScript("window.scrollBy(0, -150)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		Actions actions = new Actions(cd);
		WebElement image = cd.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div/img"));
		actions.moveToElement(image).perform();
		Thread.sleep(2000);
		WebElement image1 = cd.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[2]/div/img"));
		actions.moveToElement(image1).perform();
		Thread.sleep(2000);
		WebElement image2 = cd.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[3]/div/img"));
		actions.moveToElement(image2).perform();
		Thread.sleep(2000);
		cd.close();
		
		
	}
}
