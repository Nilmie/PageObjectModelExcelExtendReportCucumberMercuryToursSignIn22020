package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import MiHCM.HomePage;
import MiHCM.LoginPage;
import MiHCM.SignIn;
import Utility.ReadExcel;
import Utility.ExtendReport;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	
	WebDriver driver;

    LoginPage objLogin;
    HomePage objHomePage;
    ReadExcel excel = new ReadExcel();
    SignIn objsignin;
    
	

	@Given("^I have user Details$")
	public void i_have_user_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\seldrv\\chromedriver.exe");
		
	    driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/newtours/");
        //driver.findElement(By.xpath("(//form[@name='home' ]//table)[5]")).click();
        driver.findElement(By.linkText("Register here")).click();
	    
	}
	
	@When("^I successfully submit$")
	public void i_successfully_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		objLogin = new LoginPage(driver);
		
	//	String loginPageTitle = objLogin.getLoginTitle();
	    objLogin.RegisterUser(excel.readExcel(1,1, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,2, ".\\Data\\data.xlsx","Sheet1"),excel.readExcel(1,3, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,4, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,5, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,6, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,7, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,8, ".\\Data\\data.xlsx","Sheet1"),excel.readExcel(1,9, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,10, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,11, ".\\Data\\data.xlsx","Sheet1"), excel.readExcel(1,12, ".\\Data\\data.xlsx","Sheet1"));
	    //
	
	}
	
	@Then("^I should successfully registered$")
	public void i_should_successfully_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objHomePage = new HomePage(driver);

		   //Verify home page

		    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().contains("sign-in"));
		    
	    
	}

	@Then("^Login with registed login$")
	public void login_with_registed_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.linkText("sign-in")).click();
		
		objsignin = new SignIn(driver);
		objsignin.SignInToPage(excel.readExcel(1,1, ".\\Data\\dataLogin.xlsx","Sheet2"), excel.readExcel(1,2, ".\\Data\\dataLogin.xlsx","Sheet2"));
		Assert.assertTrue(objsignin.LoginSuccessfully().contains("Login Successfully"));
		//driver.close();
		
	    
	}

}
