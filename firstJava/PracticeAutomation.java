package firstJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/locatorspractice/");
       driver.findElement(By.linkText("Forgot your password?")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("divyank");
       driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("thatsdivyank@123");
       driver.findElement(By.xpath("//form/input[3]")).sendKeys("6386980640");
       driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
       System.out.println(driver.findElement(By.cssSelector("form p")).getText());
       driver.findElement(By.cssSelector(".go-to-login-btn")).click();
       Thread.sleep(1000);
       driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Dg");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
       driver.findElement(By.id("chkboxOne")).click();
       driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();      

       
	
	}
}

