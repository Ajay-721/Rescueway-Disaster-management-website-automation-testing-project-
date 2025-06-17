package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pages_test {
	static String[] pages = { "Resources", "Gallery", "Features", "The Team", "News", "Disasters", "Events" };

	@Test
	public void page_test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rescueway.pythonanywhere.com/");

		for (String page : pages) {
			try {

				driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
				Thread.sleep(500); //

				driver.findElement(By.linkText(page)).click();
				System.out.println("Clicked on: " + page);
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Error on page: " + page + " -> " + e.getMessage());
			}
		}

		driver.quit();
	}

@Test
public void pagetest2() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rescueway.pythonanywhere.com/");
	driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
	driver.findElement(By.linkText("Resources")).click();
	


}
}

