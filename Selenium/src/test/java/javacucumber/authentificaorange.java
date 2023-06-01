package javacucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class authentificaorange {

	WebDriver driver ;

	@Given("ouvrir Chrome")
	public void ouvrir_chrome() {
	    System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("ouvrir URL application {string}")
	public void ouvrir_url_application(String string) {
	    driver.get(string);
	}

	@When("saisir {string} dans le login")
	public void saisir_dans_le_login(String string) {
	    WebElement login ;
	    login = driver.findElement(By.name("username"));
	    login.sendKeys(string);
	}

	@When("saisir {string} dans mot de passe")
	public void saisir_dans_mot_de_passe(String string) {
	    WebElement password ;
	    password= driver.findElement(By.name("password"));
	    password.sendKeys(string);
	}

	@When("taper sur le bouton connexion")
	public void taper_sur_le_bouton_connexion() {
		WebElement connexion;
		connexion =driver.findElement(By.xpath("//button[@type='submit']"));
	    connexion.click();
	}

	@Then("verifier le resultat obtenu {string}")
	public void verifier_le_resultat_obtenu(String string) {
	    String URL ;
	    URL = driver.getCurrentUrl();
	    if (URL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
	    	WebElement profil;
	    	profil = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
	    	String text;
	    	text = profil.getText();
	    	Assert.assertEquals(text, string);
	    	System.out.println("cas passant OK");

	    }
	    else if (URL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")){
	    	WebElement messageerreur;
	    	messageerreur = driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"));
	    	String message ;
	    	message = messageerreur.getText();
	    	Assert.assertEquals(message, string);
	    	System.out.println("cas non passant OK");
	    }
	}
}