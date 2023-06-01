package Testcase;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// chemin driver
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		// ouvrir chrome
		WebDriver driver = new ChromeDriver() ;
		//maximiser fenetre
		driver.manage().window().maximize();
		// ouvrir url
		driver.get("https://fr-fr.facebook.com/");
		//timeout
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
	    //identification webelement
		WebElement cookies ;
				
		cookies=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")); 
		//action 
		cookies.click();
		
		//identification webelement
		WebElement nouveaucompte ;
		nouveaucompte=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		
		//action 
		nouveaucompte.click();
	
		//Actions action2 = new Actions (driver);
		//action2.click(nouveaucompte).perform();
		
		
		//identification webelements
		WebElement prenon ;
		prenon=driver.findElement(By.name("firstname"));
		prenon.sendKeys("khouloud");
		
		WebElement nondefamille ;
		nondefamille=driver.findElement(By.name("lastname"));
		nondefamille.sendKeys("Hedhli");
		
		WebElement adressemail ;
		adressemail=driver.findElement(By.name("reg_email__"));
		adressemail.sendKeys("khouloudhedhli.pro@gmail.com");
		
		WebElement adressemail2 ;
		adressemail2=driver.findElement(By.name("reg_email_confirmation__"));
		adressemail2.sendKeys("khouloudhedhli.pro@gmail.com");
		
		WebElement motdepasse ;
		motdepasse=driver.findElement(By.name("reg_passwd__"));
		motdepasse.sendKeys("AZERTY123");
		
		WebElement listejour ;
		listejour=driver.findElement(By.name("birthday_day"));
		
		//creation select 
		Select liste = new Select(listejour);
		liste.selectByValue("6") ;
		
		WebElement listemois ;
		listemois=driver.findElement(By.id("month"));
	     //creation select 
		Select liste1 = new Select(listemois);
		liste1.selectByValue("5") ;
		
		WebElement listeyear ;
		listeyear = driver.findElement(By.name("birthday_year"));
		
		Select liste2 =new Select(listeyear);
		liste2.selectByValue("1992");
		
		WebElement genre ;
		genre= driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		genre.click();
		
		WebElement sinscrire ;
		sinscrire =driver.findElement(By.xpath("//button[@name='websubmit']"));
		sinscrire.click();
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		

	}

}
