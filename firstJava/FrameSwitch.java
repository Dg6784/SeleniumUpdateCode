package firstJava;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class FrameSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 System.out.println(driver.findElements(By.tagName("iframe")).size());
		 driver.switchTo().frame(0);
//		 driver.findElement(By.)
		 Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		 a.dragAndDrop(source, target).build().perform();
		 driver.switchTo().defaultContent();

 
	}

} 
