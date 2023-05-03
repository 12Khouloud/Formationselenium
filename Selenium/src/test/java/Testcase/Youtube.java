package Testcase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe") ;
		//ouvrir chrome 
		WebDriver driver = new ChromeDriver() ;
		//maximiser fenetre 
		driver.manage().window().maximize();
		// ouvrir Url
		driver.get("https://www.youtube.com/");
		//sleep
		Thread.sleep(5000);
		//identification de webelement
		WebElement rechercher ;
		rechercher = driver.findElement(By.name("search_query"));
		//action
		rechercher.sendKeys("tunisie");
		WebElement bouton ;
		bouton= driver.findElement(By.id("search-icon-legacy"));
		//action
		bouton.click();
		//sleep
		Thread.sleep(5000) ;
		//verification assert 
		//identification
		WebElement actualites ;
		actualites =driver.findElement(By.xpath("//*[@id=\"title\"]")) ;

		
	    // récupération texte
		String texte ;
		texte = actualites.getText();
		//assert 
		Assert.assertEquals("actualites", texte);
		//affichage 
		System.out.println("texte ok" );
		//delete cookies
		driver.manage().deleteAllCookies();
		
				
		
		

	}

}
