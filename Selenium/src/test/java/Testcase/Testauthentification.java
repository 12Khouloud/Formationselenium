package Testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class Testauthentification {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		//ouvrir chrome 
		WebDriver driver = new ChromeDriver();
		//maximiser la fenetre 
		driver.manage().window().maximize();
		//ouvrir l url 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//sleep
		Thread.sleep(5000) ;
		//identification de web element
		WebElement user ;
		user=driver.findElement(By.name("username"));
		//action
		user.sendKeys("Admin");
		//identification web element password 
		WebElement password ;
		password = driver.findElement(By.name("password")) ;
		//action
		password.sendKeys("admin123");
		//identification bouton
		WebElement bouton ;
		bouton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		bouton.click() ;
		//sleep
		Thread.sleep(5000) ;
		
		//verification ( assert)
		//identification 
		WebElement profil ;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		//recuperation texte
		String text ; 
		text = profil.getText();
		//assert 
		
		Assert.assertEquals("Paul Collings", text) ;
		//affichage
		System.out.println("test ok") ;
		
		
		
		
		
		
		
	

	}

}
