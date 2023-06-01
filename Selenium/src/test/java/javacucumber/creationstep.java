package javacucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class creationstep {
	    WebDriver driver ;

	
		@Given("ouvrir navigateur chrome")
		public void ouvrir_navigateur_chrome() {
			System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
			
			driver = new ChromeDriver() ;
			
			driver.manage().window().maximize();
			
			driver.get("https://fr-fr.facebook.com/");
			
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
				
;
		  
		}

		@Given("saisir URL {string}")
		public void saisir_url(String string) {
		   driver.get(string);
		  // WebElement cookie;
			 driver.findElement(By.className("_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy")).submit();
			//cookie.click();
		}

		@When("cliquer sur le bouton creer un compte")
		public void cliquer_sur_le_bouton_creer_un_compte() {
			/*WebElement cookie;
			cookie = driver.findElement(By.xpath("//a[normalize-space()='Autoriser tous les cookies']"));
			cookie.click();*/
			WebElement nouveaucompte ;
			nouveaucompte=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
			nouveaucompte.click();
		   
		}

		@When("remplir prenom {string}")
		public void remplir_prenom(String string) {
			WebElement prenon ;
			prenon=driver.findElement(By.name("firstname"));
			prenon.sendKeys(string); 
		}

		@When("remplir nom {string}")
		public void remplir_nom(String string) {
			WebElement nondefamille ;
			nondefamille=driver.findElement(By.name("lastname"));
			nondefamille.sendKeys(string);  
		}

		@When("remplir num de mobile ou e mail {string}")
		public void remplir_num_de_mobile_ou_e_mail(String string) {
			WebElement adressemail ;
			adressemail=driver.findElement(By.name("reg_email__"));
			adressemail.sendKeys(string);
		}

		@When("remplir  mail de confirmation {string}")
		public void remplir_mail_de_confirmation(String string) {
			WebElement adressemail2 ;
			adressemail2=driver.findElement(By.name("reg_email_confirmation__"));
			adressemail2.sendKeys(string);   
		}

		@When("remplir nouveau mot de passe {string}")
		public void remplir_nouveau_mot_de_passe(String string) {
			WebElement motdepasse ;
			motdepasse=driver.findElement(By.name("reg_passwd__"));
			motdepasse.sendKeys(string);
		}

		@When("remplir date de naissance jours {string}")
		public void remplir_date_de_naissance_jours(String string) {
			WebElement listejour ;
			listejour=driver.findElement(By.name("birthday_day"));
			Select liste = new Select(listejour);
			liste.selectByValue(string) ;  
		}

		@When("remplir date da naissance mois {string}")
		public void remplir_date_da_naissance_mois(String string) {
			WebElement listemois ;
			listemois=driver.findElement(By.id("month"));
		     //creation select 
			Select liste1 = new Select(listemois);
			liste1.selectByValue(string) ;  
		}

		@When("remplir date de naissance annee {string}")
		public void remplir_date_de_naissance_annee(String string) {
			WebElement listeyear ;
			listeyear = driver.findElement(By.name("birthday_year"));
			
			Select liste2 =new Select(listeyear);
			liste2.selectByValue(string); 
		}

		@When("remplir genre {string}")
		public void remplir_genre(String string) {   
			WebElement genrefemme ;
			genrefemme= driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
			WebElement genrehomme ;
			genrehomme= driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
			if ( string.equals("homme")) {
				genrehomme.click();
			}
			else if (string.equals("femme")) {
				genrefemme.click();
			}
		}

		@When("remplir s inscrire")
		public void remplir_s_inscrire() {
			WebElement sinscrire ;
			sinscrire =driver.findElement(By.xpath("//button[@name='websubmit']"));
			sinscrire.click();
		}

		@Then("verifier l inscription")
		public void verifier_l_inscription() {
		    
		}
		@When("remplir genre {string} et selectionner {string}")
		public void remplir_genre_et_selectionner(String string, String string2) {
		if (string.equals("Personnalise")) {
			WebElement bouttonPerso;
			bouttonPerso = driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
			bouttonPerso.click();
				}
				
			WebElement listeperso = driver.findElement(By.name("preferred_pronoun"));
			Select select = new Select(listeperso);
			select.selectByValue(string2);
			    
			}

	}


