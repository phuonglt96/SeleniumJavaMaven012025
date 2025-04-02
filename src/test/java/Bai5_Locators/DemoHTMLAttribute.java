package Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHTMLAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Locator HTML Attribute.");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://cms.anhtester.com/login");

        driver.findElement(By.id("email"));
        

        Thread.sleep(2000);
        driver.quit();
    }
}
