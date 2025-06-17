package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pages_NEDF {
  @Test
  public void news() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://rescueway.pythonanywhere.com/");
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
		driver.findElement(By.linkText("News")).click();
		JavascriptExecutor ab= (JavascriptExecutor)driver;
		for (int i = 0; i < 10; i++) {
			ab.executeScript("window.scrollBy(0, 130)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

	}
		driver.close();

  }
  @Test
  public void events() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://rescueway.pythonanywhere.com/");
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
		driver.findElement(By.linkText("Events")).click();
		JavascriptExecutor ab= (JavascriptExecutor)driver;
		for (int i = 0; i < 10; i++) {
			ab.executeScript("window.scrollBy(0, 150)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

	}
		driver.close();


  }
  @Test
  public void disaster() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://rescueway.pythonanywhere.com/");
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
		driver.findElement(By.linkText("Disasters")).click();
		JavascriptExecutor ab= (JavascriptExecutor)driver;
		for (int i = 0; i < 10; i++) {
			ab.executeScript("window.scrollBy(0, 150)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

	}
		driver.close();

  }
  @Test
  public void features() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://rescueway.pythonanywhere.com/");
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
		driver.findElement(By.linkText("Features")).click();
		JavascriptExecutor ab= (JavascriptExecutor)driver;
		for (int i = 0; i < 10; i++) {
			ab.executeScript("window.scrollBy(0, 150)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

	}
		driver.close();

  }
}
