package StepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import loginpageobjects.loginpage;

public class loginExamplefunctionality{

	WebDriver driver;
	
			
	@Given("User in website url Swag Lab")
	public void user_in_website_url_swag_lab() {
	    driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
		
	@Given("User enter username as {string} and password as {string}")
	public void user_enter_username_as(String username, String password) {
	
	loginpage.user.sendKeys(username);
	loginpage.pass.sendKeys(password);
	    
	}
	
	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	   loginpage.loginbtn.click();
	}
	
	
	@Then("Login should happen")
	public void login_should_happen() {
		
		String title=loginpage.Headertext.getText();
	    Assert.assertTrue("Swag Labs", true);
	    System.out.println(title);
	}


	
	
}
