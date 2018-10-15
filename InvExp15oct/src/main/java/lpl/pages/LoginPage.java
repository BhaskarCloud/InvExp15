package lpl.pages;

//import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lpl.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(xpath="//label[contains(text(),'Username')]")
	private WebElement usernameLable;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath="//label[contains(text(),'Password')]")
	private WebElement passwordLable;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement signInBtn;
	
	@FindBy(xpath="//ng-component/div/div/h1")
	WebElement accountViewLable;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public String validateLoginPageURL(){
		return driver.getCurrentUrl();
	}
	
	public boolean validateusername(){
		return username.isDisplayed();
	}
	
	public boolean validateusernameLable(){
		return usernameLable.isDisplayed();
	}
	public boolean validatepassword(){
		return password.isDisplayed();
	}
	public boolean validatepasswordLable(){
		return passwordLable.isDisplayed();
	}
	public boolean validatesignInBtn(){
		return signInBtn.isDisplayed();
	}
	public boolean validateaccountViewLable(){
		return accountViewLable.isDisplayed();
	}

	
	public DashboardPage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		signInBtn.click();
		//    	JavascriptExecutor js = (JavascriptExecutor)driver;
		  //  	js.executeScript("arguments[0].click();", submitButton);
		    	 	
		    
		
		return new DashboardPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
