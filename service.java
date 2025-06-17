package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class service {

	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		cd.get("https://rescueway.pythonanywhere.com/");
		cd.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[3]")).click();
		JavascriptExecutor ab= (JavascriptExecutor)cd;
		for (int i = 0; i < 10; i++) {
			ab.executeScript("window.scrollBy(0, 150)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
		JavascriptExecutor ab1= (JavascriptExecutor)cd;
		for (int i = 0; i < 10; i++) {
			ab.executeScript("window.scrollBy(0, -150)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


	}
		//get a qoute test
		cd.findElement(By.id("form-floating-1")).sendKeys("god");
		cd.findElement(By.id("form-floating-2")).sendKeys("god123@gmail.com");
		WebElement dropdown=cd.findElement(By.id("floatingSelect"));
		Select drpdwn= new Select(dropdown);
		drpdwn.selectByIndex(1);
		cd.findElement(By.xpath("/html/body/div/div[4]/div/div[1]/form/div/div[4]/button")).click();

}
}
