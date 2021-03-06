package stepDefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * Hello world!
 *
 */
public class basicSeleniumTest2 
{
	private static WebDriver driver = null;
    
    @Given("^I am on Facebook login page$") 
	
    public void goToFacebook() { 
       driver = new FirefoxDriver(); 
       driver.navigate().to("https://www.facebook.com/"); 
    }
 	
    @When("^I enter username as \"(.*)\"$") 
    public void enterUsername(String arg1) {   
       driver.findElement(By.id("email")).sendKeys(arg1); 
    }
 	
    @When ("^I enter password as \"(.*)\"$") 
    public void enterPassword(String arg1) {
       driver.findElement(By.id("pass")).sendKeys(arg1);
       driver.findElement(By.id("u_0_v")).click(); 
    } 
 	
    @Then("^Login should fail$") 
    public void checkFail() {  
       if(driver.getCurrentUrl().equalsIgnoreCase(
          "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
             System.out.println("Test1 Pass"); 
       } else { 
          System.out.println("Test1 Failed"); 
       } 
       driver.close(); 
    }
 	
    @Then("^Relogin option should be available$") 
    public void checkRelogin() { 
       if(driver.getCurrentUrl().equalsIgnoreCase(
          "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
             System.out.println("Test2 Pass"); 
       } else { 
          System.out.println("Test2 Failed"); 
       } 
       driver.close(); 
    }
}
