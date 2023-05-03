package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Fonctionclic {

	public static void main(String[] args) {
		// chemin de chrome
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver = new ChromeDriver();
		//maximiser la fenetre
		driver.manage().window().maximize();
		//timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//ouvrir url
		driver.get("https://demoqa.com/buttons");
		// identification webelement
		WebElement bouton1 ;
		bouton1= driver.findElement(By.id("doubleClickBtn"));
		//action
		bouton1.click();
		Actions action = new Actions (driver);
		action.doubleClick(bouton1).perform();
		
		//assert 
		WebElement msg ;
		msg =driver.findElement(By.id("doubleClickMessage"));
		String text ;
		text =msg.getText();
		Assert.assertEquals(text,"You have done a double click");
		
		// affichage
		System.out.println("test ok") ;
		
		
		// identification webelement
		WebElement bouton2 ;
		bouton2= driver.findElement(By.id("rightClickBtn"));
		//action
		
		Actions action2 = new Actions (driver);
		action2.contextClick(bouton2).perform();
				
		//assert 
		WebElement msg2 ;
		msg2 =driver.findElement(By.id("rightClickMessage"));
		String text1 ;
		text1 =msg2.getText();
		Assert.assertEquals(text1,"You have done a right click");
				
		// affichage
		System.out.println("test ok") ;
		
		//boutton3.click();
				WebElement message;		
		        message=driver.findElement(By.id("dynamicClickMessage"));
		        String text3;
		        text3=message.getText();
		        Assert.assertEquals("You have done a dynamic click", text3);
		        System.out.println("test ok");
		
		
		

		
		
		

	}

}
