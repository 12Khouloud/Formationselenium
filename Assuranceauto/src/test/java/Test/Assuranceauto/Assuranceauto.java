package Test.Assuranceauto;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assuranceauto {
         WebDriver  driver;
	      @Given("ouvrir navigateur chrome")
		public void ouvrir_navigateur_chrome() {
			System.setProperty("webdriver.chrome.driver","src/test/java/src/test/resspirce/chromedriver.exe");
			
			driver = new ChromeDriver() ;
			
			driver.manage().window().maximize();
			
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
			//WebElement cookies ;
			
			//cookies=driver.findElement(By.id("axeptio_btn_acceptAll"));
			//cookies.click();
	     }
				
		@Given("ouvrir URL {string}")
		public void ouvrir_url(String string) throws InterruptedException {
			driver.get(string);
			Thread.sleep(5000);
             WebElement cookies ;
			
			cookies=driver.findElement(By.id("axeptio_btn_acceptAll"));
			cookies.click();
			
		   
		}

		@When("cliquer sur le bouton j obtiens mon tarif")
		public void cliquer_sur_le_bouton_j_obtiens_mon_tarif() {
			WebElement tarif ;
			tarif = driver.findElement(By.xpath("//a[@class='button is-heroe w-button']"));
			tarif.click();
		  
		}

		@When("cliquer sur le bouton non")
		public void cliquer_sur_le_bouton_non() {
			WebElement non ;
			non = driver.findElement(By.xpath("//div[contains(text(),'Non')]"));
			non.click();
		   
		}

		@When("cliquer sur le bouton rechercher par plaque")
		public void cliquer_sur_le_bouton_rechercher_par_plaque() {
			WebElement plaque ;
			plaque = driver.findElement(By.xpath("//div[normalize-space()='Rechercher par plaque']"));
			plaque.click();

		 
		}

		@When("remplir le champ plaque d immatriculation {string}")
		public void remplir_le_champ_plaque_d_immatriculation(String string) {
			WebElement matricul ;
			matricul = driver.findElement(By.id("vehiculeImmatriculation"));
			matricul.sendKeys(string);
		    
		}

		@When("cliquer sur le bouton confirmer")
		public void cliquer_sur_le_bouton_confirmer() {
			WebElement confirmer ;
			confirmer = driver.findElement(By.xpath("//button[@type='submit']//div[@class='kitt_Content_LGs5p']"));
			confirmer.click();
		   
		}

		@Then("verifier le resultat obtenu {string}")
		public void verifier_le_resultat_obtenu (String string) { 
			WebElement vehicule ;
			vehicule =driver.findElement(By.xpath("//h5[contains(@class,'')]"));
			String text;
	    	text = vehicule.getText();
	    	Assert.assertEquals(text, string);
	    	System.out.println("ok");
		    
		

		
	}

}
