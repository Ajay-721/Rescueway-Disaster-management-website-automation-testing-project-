package rescue_project;




import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rescue_LoginpageTest {
	// Define login credentials as 2D array
	static String[][] credentials = {
	        {"ajaydevan901@gmail.com", "ajay@098"},     // index 0: valid
	        {"ajaydevan901@gmail.com", "nova123"},    // index 1: invalid password
	        {"ajaydevan.com", "ajay@098"}, // index 2: invalid username
	        {"", ""}                   // index 3: empty fields
	    };
  
  public void login_test(String loginEmail, String loginPassword  ) {
   
	 
		WebDriver wb= new ChromeDriver();
		
		wb.get("https://rescueway.pythonanywhere.com/");
		WebElement signin=wb.findElement(By.linkText("Sign In"));
		signin.click();
		JavascriptExecutor js= (JavascriptExecutor) wb;
		js.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
	    wb.findElement(By.id("loginEmail")).sendKeys( loginEmail);//correct user name
		wb.findElement(By.id("loginPassword")).sendKeys(loginPassword );
		wb.findElement(By.xpath("/html/body/div/div/form/button")).click();
		
  }
  @Test
  public void testValidLogin() throws InterruptedException{
	  login_test(credentials[0][0], credentials[0][1]);
  }
  @Test
  public void testInValid_password() throws InterruptedException{
	  login_test(credentials[1][0], credentials[1][1]);
  }
  @Test
  public void testInValid_Username() throws InterruptedException{
	  login_test(credentials[2][0], credentials[2][1]);
  }
  @Test
  public void testEmptyCredentials() throws InterruptedException {
      login_test(credentials[3][0], credentials[3][1]);

}
@Test
public void logout() {
	//logout
		WebDriver cd = new ChromeDriver();
		cd.get("https://rescueway.pythonanywhere.com/");
		WebElement signin = cd.findElement(By.linkText("Sign In"));
		signin.click();
		JavascriptExecutor js = (JavascriptExecutor) cd;
		js.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
		cd.findElement(By.id("loginEmail")).sendKeys("ajaydevan901@gmail.com");// correct user name
		cd.findElement(By.id("loginPassword")).sendKeys("ajay@098");
		cd.findElement(By.xpath("/html/body/div/div/form/button")).click();
		cd.findElement(By.id("userDropdown")).click();
		cd.findElement(By.linkText("Logout")).click();
		
}
}


		
		
		
	
  
  
