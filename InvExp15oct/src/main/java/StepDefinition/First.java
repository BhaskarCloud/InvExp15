package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lpl.base.TestBase;
import lpl.pages.ActivityPage;
import lpl.pages.DashboardPage;
import lpl.pages.LoginPage;
import lpl.util.TestUtil;

public class First  extends TestBase {
	LoginPage loginPage;
	DashboardPage dashboardPage;

	public First() {
		super();
	}

	@Before
	public void StartUp() {
		System.out.println("----This will run before scenario--");
	}
	
	
	@After
	public void TearDoen() {
		System.out.println("----This will run after scenario--");
		driver.quit();
	}


@Given("^URL is given into Browser$")
public void url_is_given_into_Browser() throws Throwable {
	initialization();
	loginPage = new LoginPage();
	String expectedURL = "https://qa.myaccountviewonline.com/newaccountview/login";
	Assert.assertEquals("URL is not as Expected !!!", expectedURL, loginPage.validateLoginPageURL());
	System.out.println("validateLoginPageURL assertion is true.");
	 
}

@When("^I cosmatic check for login Page$")
public void i_cosmatic_check_for_login_Page() throws Throwable {

	String expectedTitle = "Investor Experience";
	Assert.assertEquals("Page Title is not as Expected !!!", expectedTitle, loginPage.validateLoginPageTitle());
	System.out.println("validateLoginPageTitle assertion is true.");
	
}

@Then("^all locators are verified$")
public void all_locators_are_verified() throws Throwable {
	
	Assert.assertTrue("Username TextBox is not available", loginPage.validateusername());
	System.out.println("validateusername assertion is true.");
	Assert.assertTrue("Username label is not available", loginPage.validateusernameLable());
	System.out.println("validateusernameLable assertion is true.");
	Assert.assertTrue("password TextBox is not available", loginPage.validatepassword());
	System.out.println("validatepassword assertion is true.");
	Assert.assertTrue("Username TextBox is not available", loginPage.validatepasswordLable());
	System.out.println("validatepasswordLable assertion is true.");
	Assert.assertTrue("Username label is not available", loginPage.validatesignInBtn());
	System.out.println("validatesignInBtn assertion is true.");
	Assert.assertTrue("password TextBox is not available", loginPage.validateaccountViewLable());
	System.out.println("validateaccountViewLable assertion is true.");
	
}
}
/*
	public void takefoto() throws IOException {
	 File scrFile = ((TakesScreenshot) driver)
             .getScreenshotAs(OutputType.FILE);
     //FileUtils.copyFile(scrFile, new File("pathTOSaveFile"));  001
     
	 //String currentDir = System.getProperty("user.dir"); // 002
		
	//	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".jpg")); //002
		
		String ResultsFolderPath =TestUtil.createresultsfolder() ; //003
		
		System.out.println(ResultsFolderPath);
		FileUtils.copyFile(scrFile, new File(ResultsFolderPath + "\\screenshots\\"+ TestUtil.CurrentDateAndTime+".jpg")); //003
		
	}
}
*/