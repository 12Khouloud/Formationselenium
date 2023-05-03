package Testcase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homework {

	public static void main(String[] args) {
		// chemin driver
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		//ouvrir chrome
		
		WebDriver driver = new ChromeDriver() ;
		//maximiser la fenetre 
		
		driver.manage().window().maximize();
		//timeout
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//ouvrir url
		
		driver.get("https://demoqa.com/buttons");
		//identification webelement
		
		WebElement bouton ;
		bouton=driver.findElement(By.id("doubleClickBtn"));
		//action 
		
		Actions action = new Actions(driver);
		action.doubleClick(bouton).perform();
		
		//assert
		WebElement msg ;
		msg = driver.findElement(By.id("doubleClickMessage"));
		String texte ;
		texte = msg.getText();
		Assert.assertEquals(texte,"You have done a double click");
		
		//affichage texte
		
		System.out.println("texte ok");
		
		//identification de web element
		WebElement bouton2 ;
		bouton2 = driver.findElement(By.id("rightClickBtn"));
		
		//action
		Actions action2 =new Actions (driver);
		action2.contextClick(bouton2).perform();
		
		//assert 
		WebElement msg2 ;
		msg2 =driver.findElement(By.id("rightClickMessage"));
		String texte2;
		texte2=msg2.getText();
		Assert.assertEquals(texte2,"You have done a right click");
		
		System.out.println("texte 2 ok") ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
