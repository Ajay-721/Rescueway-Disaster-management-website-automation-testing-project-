package rescue_project;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rescue_userprofile_test {
	static String [][]credential= {
			{"Ajay Devan M","ajaydevan701@gmail.com","","i am rescuer",""}
	};
	
		public void profile_test_login (String name,String email,String bio,String phn,String dob) throws InterruptedException {
			WebDriver cd= new ChromeDriver();
			cd.get("https://rescueway.pythonanywhere.com/");
			WebElement signin = cd.findElement(By.linkText("Sign In"));
			signin.click();
			JavascriptExecutor js = (JavascriptExecutor) cd;
			js.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
			cd.findElement(By.id("loginEmail")).sendKeys("ajaydevan901@gmail.com");// correct user name
			cd.findElement(By.id("loginPassword")).sendKeys("ajay@098");
			cd.findElement(By.xpath("/html/body/div/div/form/button")).click();
			cd.findElement(By.id("userDropdown")).click();
			cd.findElement(By.linkText("Profile")).click();
			WebElement namefield=cd.findElement(By.id("username"));
			namefield.clear();
			cd.findElement(By.id("username")).sendKeys(name);
			WebElement emailfield=cd.findElement(By.id("email"));
			emailfield.clear();
			cd.findElement(By.id("email")).sendKeys(email);
			WebElement biofield =cd.findElement(By.id("bio"));
			biofield.clear();
			cd.findElement(By.id("bio")).sendKeys(bio);
			cd.findElement(By.id("dob")).sendKeys(dob);
			WebElement uploadphoto = cd.findElement(By.id("image"));
			uploadphoto.clear();
			WebElement uploadphoto1 = cd.findElement(By.id("image"));
			uploadphoto1.sendKeys("C:\\Users\\ELCOT\\Pictures\\bentley-coupe-hdtv-1920x1080.jpg");
			cd.findElement(By.xpath("/html/body/div/div[2]/form/button")).submit();
			JavascriptExecutor ab= (JavascriptExecutor)cd;
			for (int i = 0; i < 5; i++) {
				ab.executeScript("window.scrollBy(0, 100)");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}	
			cd.findElement(By.id("userDropdown")).click();
			Thread.sleep(1000);
			cd.findElement(By.linkText("Logout")).click();
			WebElement signin2 = cd.findElement(By.linkText("Sign In"));
			signin2.click();
			JavascriptExecutor js1 = (JavascriptExecutor) cd;
			js1.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
			//login by using new email and old password
			cd.findElement(By.id("loginEmail")).sendKeys("ajaydevan701@gmail.com");
			cd.findElement(By.id("loginPassword")).sendKeys("ajay@098");
			cd.findElement(By.xpath("/html/body/div/div/form/button")).click();
			
		}
			
			
		@Test
		public void profiletest () throws InterruptedException{
			profile_test_login(credential [0][0],credential[0][1],credential[0][2],credential[0][3],credential[0][4]);
		}
		
		
		// dob field test
		static String [][]credentials= {
				{"Ajay devan M","","","",""}
		};
		
			public void profile_test2 (String name,String email,String phn,String bio,String dob) throws InterruptedException {
				
				WebDriver cd= new ChromeDriver();
				cd.get("https://rescueway.pythonanywhere.com/");
				WebElement signin = cd.findElement(By.linkText("Sign In"));
				signin.click();
				JavascriptExecutor js = (JavascriptExecutor) cd;
				js.executeScript(" window.scrollBy(0, 750)");// scroll down by 750 pixel
				cd.findElement(By.id("loginEmail")).sendKeys("ajaydevan701@gmail.com");// correct user name
				cd.findElement(By.id("loginPassword")).sendKeys("ajay@098");
				cd.findElement(By.xpath("/html/body/div/div/form/button")).click();
				cd.findElement(By.id("userDropdown")).click();
				cd.findElement(By.linkText("Profile")).click();
				WebElement namefield=cd.findElement(By.id("username"));
				namefield.clear();
				cd.findElement(By.id("username")).sendKeys(name);
				WebElement emailfield=cd.findElement(By.id("email"));
				emailfield.clear();
				cd.findElement(By.id("email")).sendKeys(email);
				WebElement biofield =cd.findElement(By.id("bio"));
				biofield.clear();
				cd.findElement(By.id("bio")).sendKeys(bio);
				cd.findElement(By.id("dob")).sendKeys(dob);
				WebElement uploadphoto = cd.findElement(By.id("image"));
				uploadphoto.clear();
				WebElement uploadphoto1 = cd.findElement(By.id("image"));
				uploadphoto1.sendKeys("C:\\Users\\ELCOT\\Pictures\\bentley-coupe-hdtv-1920x1080.jpg");
				cd.findElement(By.xpath("/html/body/div/div[2]/form/button")).submit();
				JavascriptExecutor ab= (JavascriptExecutor)cd;
				for (int i = 0; i < 5; i++) {
					ab.executeScript("window.scrollBy(0, 100)");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}	
			}
				
				
			@Test
			public void profiletest2 () throws InterruptedException{
				profile_test2(credentials [0][0],credentials[0][1],credentials[0][2],credentials[0][3],credentials[0][4]);
			}
		
			
			 
	
	
       
	
	@Test
	public void profile_test1()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date");
		String date= sc.nextLine();
		System.out.println("enter the month");
		String month= sc.nextLine();
		System.out.println("enter the year");
		String year= sc.nextLine();
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
		
		cd.findElement(By.linkText("Profile")).click();
		
		cd.findElement(By.id("dob")).sendKeys(date);
		cd.findElement(By.id("dob")).sendKeys(month);
		cd.findElement(By.id("dob")).sendKeys(year);
		WebElement uploadphoto = cd.findElement(By.id("image"));
		uploadphoto.sendKeys("C:\\Users\\ELCOT\\Pictures\\IMG20190301154214.jpg");
		cd.findElement(By.xpath("/html/body/div/div[2]/form/button")).submit();
		JavascriptExecutor ab= (JavascriptExecutor)cd;
		for (int i = 0; i < 5; i++) {
			ab.executeScript("window.scrollBy(0, 100)");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}	
	}
       
       
        
	}
	
	
	

	

			
	
	                       
	



