package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDeroulante {

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
			driver.get("https://demoqa.com/select-menu");
			WebElement liste ; 
			liste = driver.findElement(By.id("oldSelectMenu"));
			//creation fonction selecte 
			Select listeD = new Select(liste);
			listeD .selectByValue("5");
			System.out.println("test ok ");
			
			
			

	}

}
