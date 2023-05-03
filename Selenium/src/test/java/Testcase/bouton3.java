package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class Fonctionclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement boutton1;
		boutton1=driver.findElement(By.id("doubleClickBtn"));
        Actions action=new Actions(driver) ;
        action.doubleClick(boutton1).perform();
        
        WebElement msg;
        msg=driver.findElement(By.id("doubleClickMessage"));
        String text;
        text=msg.getText();
        Assert.assertEquals(text, "You have done a double click");
		System.out.println("test ok");
		WebElement boutton2;
		boutton2=driver.findElement(By.id("rightClickBtn"));
        Actions action1=new Actions(driver) ;
        action1.contextClick(boutton2).perform();
        WebElement msgg;
        msgg=driver.findElement(By.id("rightClickMessage"));
        String text2;
		text2=msgg.getText();
		Assert.assertEquals("You have done a right click", text2);
		System.out.println("test ok");
		WebElement boutton3;
		boutton3=driver.findElement(By.xpath("//div[3]//button[1]"));
		Actions action2=new Actions(driver);
		action2.click(boutton3).perform();
		//boutton3.click();
		WebElement message;		
        message=driver.findElement(By.id("dynamicClickMessage"));
        String text3;
        text3=message.getText();
        Assert.assertEquals("You have done a dynamic click", text3);
        System.out.println("test ok");
        
	}

}