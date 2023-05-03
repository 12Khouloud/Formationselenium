package Testcase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropEx {

	public static void main(String[] args) {
		// chemin drive 
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe ") ;
		//ouvrir chrome
		WebDriver driver =new ChromeDriver();
		//maximiser la fenetre 
		driver.manage().window().maximize();
		//Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//ouvrir url
		driver.get("https://demoqa.com/droppable/");
		//identificationwebelement
		WebElement from ; 
		 from = driver.findElement(By.id("draggable"));
		 WebElement to ;
		 to= driver.findElement(By.id("droppable"));
		 //action
		 Actions action =new Actions(driver);
		 action.dragAndDrop(from, to).perform();
		 
		 //assert : verification 
		 String texte ;
		 texte=to.getText();
		 //assert
		 Assert.assertEquals(texte, "Dropped!");
		 
		 System.out.println("texte ok ");
		 
		 
		 

	}

}
