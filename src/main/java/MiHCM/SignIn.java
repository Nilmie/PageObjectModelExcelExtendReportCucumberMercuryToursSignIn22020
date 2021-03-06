package MiHCM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	
	 WebDriver driver;
	
	 By usernameLogin = By.name("userName");

	 By passwordLogin = By.name("password");
	 
	 By Btnsubmit = By.name("submit");
	 
	 By LoginTitle = By.xpath("//h3[text()='Login Successfully']");
	 
	 
	    public SignIn(WebDriver driver)
	    {
	    	this.driver = driver;

	
	    }

	    
		  public void setUserName(String username)
		  {
    	
		   driver.findElement(usernameLogin).sendKeys(username);

		  }
		 
		  public void setPassword(String password){
			
			   driver.findElement(passwordLogin).sendKeys(password);
			
		  }
		  
		  
			 
		public void clickLogin()
		{

			    	driver.findElement(Btnsubmit).click();
		}
			 
		
		public void SignInToPage(String username,String password)
		{
			
			this.setUserName(username);
			this.setPassword(password);
			
			this.clickLogin();  
			
		}
		
        public String LoginSuccessfully(){

   		 

	         return    driver.findElement(LoginTitle).getText();

	 

	        }
			
	}
