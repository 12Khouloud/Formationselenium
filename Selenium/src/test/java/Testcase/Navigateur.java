package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {
		// chemin de chromedriver (path)
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		//ouverture de chrome 
		WebDriver driver = new ChromeDriver() ; 
		//maximiser la fenetre 
		driver.manage().window().maximize() ;
		//delete cookies
		driver.manage().deleteAllCookies();
		//ouvrir url
		//driver.get("https://www.google.fr/");
		driver.navigate().to("https://www.google.fr/");
		
		
		

	}

}
