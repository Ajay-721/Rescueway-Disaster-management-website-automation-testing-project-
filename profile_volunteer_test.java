package rescue_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class profile_volunteer_test {
	static String [][] register= {
			{"swimming","24hrs","9037105608"},
			{"jumping","",""},
			{"","full time",""},
			{"runinng","24hrs","903710dg09"},//invalid phone number
			{"","",""}
			
	};
   
	
	
	public void volunteer_register(String skill, String avail,String phn  ) throws InterruptedException {
		
		WebDriver cd = new ChromeDriver();
		cd.get("https://rescueway.pythonanywhere.com/");
		WebElement signin = cd.findElement(By.linkText("Sign In"));
		signin.click();
		JavascriptExecutor js = (JavascriptExecutor) cd;
		js.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
		cd.findElement(By.id("loginEmail")).sendKeys("god123@gmail.com");// correct user name
		cd.findElement(By.id("loginPassword")).sendKeys("oxygen@123");
		cd.findElement(By.xpath("/html/body/div/div/form/button")).click();
		cd.findElement(By.id("userDropdown")).click();
		Thread.sleep(3000);
		cd.findElement(By.linkText("Volunteer")).click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) cd;
		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 100)");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
// volunteer register
			
			cd.findElement(By.id("skills")).sendKeys(skill);
			Thread.sleep(1000);
			cd.findElement(By.id("availability")).sendKeys(avail);
			Thread.sleep(1000);
			cd.findElement(By.id("phone_number")).sendKeys(phn);
			Thread.sleep(1000);
			cd.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/form/button")).submit();
			//view volunteer registered page
			JavascriptExecutor js2=(JavascriptExecutor)cd;
			for (int j = 0; j< 20; j++) {
				js.executeScript("window.scrollBy(0, 250)");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			

			}
	}
	}
		@Test
		public void vol_reg1() throws InterruptedException{//valid register
			volunteer_register(register [0][0],register[0][1],register[0][2]);
		}
		@Test
		public void vol_reg2() throws InterruptedException{
			//invalid register with entering skill value only
			volunteer_register(register [1][0],register[1][1],register[1][2]);
		}
		@Test
		public void vol_reg3() throws InterruptedException{
			//invalid register with entering availability value only
			volunteer_register(register [2][0],register[2][1],register[2][2]);
		}
		@Test
		public void vol_reg4() throws InterruptedException{
			//invalid register with entering invalid phn number
			volunteer_register(register [3][0],register[3][1],register[3][2]);
		}
		@Test
		public void vol_reg5() throws InterruptedException{
			//invalid register with entering blank value 
			volunteer_register(register [4][0],register[4][1],register[4][2]);
		}
		

	}

