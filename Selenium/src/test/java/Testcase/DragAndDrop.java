package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragAndDrop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// chemin chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		// ouvrir chrome
		WebDriver driver =new  ChromeDriver();
		
		// maximiser la fenetre 
		
		driver.manage().window().maximize() ;
		
		//timeout
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		// ouvrir url
		driver.get("https://demoqa.com/droppable/") ;
		
		//identification webelement
		WebElement from ;
		from=driver.findElement(By.id("draggable"));
		WebElement to ;
		to= driver.findElement(By.id("droppable"));
		
		//action 
		Actions action =new Actions(driver) ;
		action.dragAndDrop(from, to).perform();
		String texte ; 
		texte=to.getText();
		
		//assert 
		Assert.assertEquals(texte,"Dropped!");
		
		System.out.println("texte ok");
		
		//fermer driver 
		driver.close();
		


}
}