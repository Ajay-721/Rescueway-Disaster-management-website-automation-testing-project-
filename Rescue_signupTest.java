package rescue_project;






import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;


public class Rescue_signupTest {
	static String [][] credentials = {
			{"Ajay Devan M","ajay720@gmail.com","9037105608","nova@321","nova@321"},// valid signup
			{"ajaydevan M","","","",""},// only entering name and click signup
			{"","ajaydevan721@gmail.com","","",""},//only entering email and click signup
			{"","","9037105608","",""},//only entering phn and click signup
			{"","","","ajay@345",""},//only entering psw and click signup
			{"","","","",""},//Blank data and click signup
			{"","ajaydevan777@gmail.com","9605856747","",""},//only entering email and phn
			{"Ajay Devan M","ajaydevan#$%_%@gmail.com","9037105608","nova@321","nova@321"},//entering email with special characters
			{"Ajay Devan M","ajaydevan890@gmail.com","903710560885678","nova@321","nova@321"}//entering unlimited phone number
			
	};
	
	


 
	
  public void signup_test(String signUpName,String signUpEmail,String signUpPhone, String  signUpPassword,String signUpConfirmPassword ) {
	 
		
	WebDriver ab= new ChromeDriver();
	ab.get("https://rescueway.pythonanywhere.com/");
	ab.manage().window().maximize();
	JavascriptExecutor js= (JavascriptExecutor) ab;
	js.executeScript(" window.scrollBy(0, 300)");// scroll down by 300 pixel
	ab.findElement(By.xpath("//*[@id=\"header-carousel\"]/div/div[1]/div/div/a[1]")).click();
	ab.findElement(By.id("signUpName")).sendKeys(signUpName);
	ab.findElement(By.id("signUpEmail")).sendKeys(signUpEmail);
	ab.findElement(By.id("signUpPhone")).sendKeys(signUpPhone);
	ab.findElement(By.id("signUpPassword")).sendKeys(signUpPassword);
	ab.findElement(By.id("signUpConfirmPassword")).sendKeys(signUpConfirmPassword);
	JavascriptExecutor js1= (JavascriptExecutor) ab;
	js1.executeScript(" window.scrollBy(0, 300)");// scroll down by 300 pixel
	ab.findElement(By.xpath("/html/body/div/div/form/button")).submit();


  }
  @Test
  public void signup_entering_valid_details() throws InterruptedException {
		signup_test(credentials[0][0], credentials[0][1], credentials[0][2], credentials[0][3], credentials[0][4]);
	}

	@Test
	public void signup_entering_name() throws InterruptedException {
		signup_test(credentials[1][0], credentials[1][1], credentials[1][2], credentials[1][3], credentials[1][4]);
	}

	@Test
	public void signup_entering_email() throws InterruptedException {
		signup_test(credentials[2][0], credentials[2][1], credentials[2][2], credentials[2][3], credentials[2][4]);
	}

	@Test
	public void signup_entering_phn() throws InterruptedException {
		signup_test(credentials[3][0], credentials[3][1], credentials[3][2], credentials[3][3], credentials[3][4]);
	}

	@Test
	public void signup_entering_psw() throws InterruptedException {
		signup_test(credentials[4][0], credentials[4][1], credentials[4][2], credentials[4][3], credentials[4][4]);
	}

	@Test
	public void signup_entering_cpsw() throws InterruptedException {
		signup_test(credentials[5][0], credentials[5][1], credentials[5][2], credentials[5][3], credentials[5][4]);
	}
	@Test
	public void signup_entering_invalid_em_phn() throws InterruptedException {
		signup_test(credentials[6][0], credentials[6][1], credentials[6][2], credentials[6][3], credentials[6][4]);
	}
	@Test
	public void signup_entering_email_with_special_characters() throws InterruptedException {
		signup_test(credentials[7][0], credentials[7][1], credentials[7][2], credentials[7][3], credentials[7][4]);
	}
	@Test
	public void signup_entering_unlimited_phn()throws InterruptedException {
		signup_test(credentials[8][0], credentials[8][1], credentials[8][2], credentials[8][3], credentials[8][4]);
	}



	
	
}
