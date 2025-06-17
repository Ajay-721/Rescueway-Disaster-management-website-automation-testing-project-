package rescue_project;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pages_report_disaster {

	public static void main(String[] args) throws InterruptedException {

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
		cd.findElement(By.linkText("Report Disaster")).click();
		Thread.sleep(2000);
		WebElement dropdown = cd.findElement(By.className("form-control"));
		Select drpdwn = new Select(dropdown);
		drpdwn.selectByValue("Earthquake");
		cd.findElement(By.id("name")).sendKeys("building damage");
		JavascriptExecutor js1 = (JavascriptExecutor) cd;
		js1.executeScript(" window.scrollBy(0,500)");// scroll down by 400 pixel
		
		WebElement xz = cd.findElement(By.id("current-location"));
		js.executeScript("arguments[0].click();",xz);
		cd.findElement(By.id("date")).sendKeys("11-05-00202509:40");
		cd.findElement(By.id("description")).sendKeys("heavy rain in trivandrum");
		WebElement dropdown1 = cd.findElement(By.id("status"));
		Select drpdwn1 = new Select(dropdown1);
		drpdwn1.selectByValue("Resolved");
		WebElement imageupload = cd.findElement(By.id("photo"));
		imageupload.sendKeys("C:\\Users\\ELCOT\\Pictures\\camaro.jpg");
		cd.findElement(By.xpath("/html/body/div/div[2]/form/button")).submit();
		JavascriptExecutor ab = (JavascriptExecutor) cd;
		for (int i = 0; i < 50; i++) {
			ab.executeScript("window.scrollBy(0, 500)");

			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
