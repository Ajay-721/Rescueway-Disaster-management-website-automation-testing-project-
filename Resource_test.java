package rescue_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Resource_test {

    @Test
    public void clickResourceLinks() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rescueway.pythonanywhere.com/");

        
        driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 750);");

        driver.findElement(By.id("loginEmail")).sendKeys("ajaydevan701@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("ajay@098");
        driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
        Thread.sleep(1000);

        // Navigate to Resources
        driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div[1]/a")).click();
        driver.findElement(By.linkText("Resources")).click();
        Thread.sleep(2000);

        String[] links = {
            "National Disaster Management Authority (India)",
            "United Nations Office for Disaster Risk Reduction (UNDRR)",
            "Ready.gov (U.S. Emergency Preparedness)",
            "World Health Organization (WHO) - Emergency Preparedness and Response",
            "International Federation of Red Cross and Red Crescent Societies (IFRC)",
            "Federal Emergency Management Agency (FEMA)",
            "Global Disaster Alert and Coordination System (GDACS)",
            "ReliefWeb",
            "Sphere Handbook",
            "National Institute of Disaster Management (NIDM) - India"
        };

        // Store original tab
        String originalTab = driver.getWindowHandle();

        
        for (String linkText : links) {
            WebElement link = driver.findElement(By.linkText(linkText));
            js.executeScript("arguments[0].click();", link);
            Thread.sleep(2000); // allow tab to open

            // Switch to new tab
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalTab)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            System.out.println("Opened Tab Title: " + driver.getTitle());

            // Close new tab and go back to original
            driver.close();
            driver.switchTo().window(originalTab);
        }

        driver.quit();
    }
}