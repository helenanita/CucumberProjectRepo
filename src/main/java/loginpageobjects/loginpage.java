package loginpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
	  public void loginfunctionexample(WebDriver driver) {
	  PageFactory.initElements(driver,this); }
	 
	
     @FindBy(id="user-name")
	public static WebElement user;
     
     @FindBy(id="password")
     public static WebElement pass;
     
     @FindBy(id="login-button")
     public static  WebElement loginbtn;
     
     @FindBy(xpath="//*[@id=\"header_container\"]/div[1]/div[2]/div")
     public static WebElement Headertext;

	
	
	
	
}
