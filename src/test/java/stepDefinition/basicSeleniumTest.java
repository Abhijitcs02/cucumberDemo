package stepDefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * Hello world!
 *
 */
public class basicSeleniumTest 
{
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I want to write a step with precondition test");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with precondition");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with precondition");
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with precondition");
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with precondition");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with precondition");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with precondition");
	}

	@Given("^I want to write a step with \"(.*)\"$")
	public void i_want_to_write_a_step_with_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with preconditionxxxx"+arg1);
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("value ==>>"+arg1);
	}

	@Then("^I verify the (.*) in step$")
	public void i_verify_the_success_in_step(String aa) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("status ==>>"+aa);
	}

//	@Then("^I verify the Fail in step$")
//	public void i_verify_the_Fail_in_step() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("I verify the Failuuuu in step");
////	    throw new PendingException();
//	}	
	

@Given("^I want to write a step with ram$")
public void i_want_to_write_a_step_with_ram() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("RAM");
}

@Given("^I want to write a step with mohan$")
public void i_want_to_write_a_step_with_mohan() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("mohan");
}
}
