package MiHCM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	 WebDriver driver;

	  //  By user99GuruName = By.name("uid");

	 //   By password99Guru = By.name("password");

	  //  By titleText =By.className("barone");

	    //By login = By.name("btnLogin");
	    
	    By Submit = By.xpath("//input[@src='images/submit.gif']");
	    
	    

	    public LoginPage(WebDriver driver){
	    	this.driver = driver;

	
	    }

	 
	 //   public void setUserName(String strUserName){
	    	
	   // 	driver.findElement(user99GuruName).sendKeys(strUserName);

	 //   }

	 
	//    public void setPassword(String strPassword){
//
	   //      driver.findElement(password99Guru).sendKeys(strPassword);

	  //  }

	    public void ClickSubmittoResister(){

           driver.findElement(Submit).click();

    }
	 
	 /*   public void clickLogin(){

	    	driver.findElement(login).click();

	 
	    }*/
	    
	
	    /*  public String getLoginTitle(){

	     return    driver.findElement(titleText).getText();

	    }*/
	    
	   public void setUserName(String firstName,String lastName,	String phone,String	userName,String	address1,
	   	String	city,String	state,String	postalCode,String	country,String	email,String	password,String	confirmPassword)
	    	
	    	//public void setUserName(String firstName,String lastName,String phone,String	userName,String address1,String city,String state,String postalCode)
	    	//public void setUserName(String firstName,String lastName,String phone)
	    	
	    	{
		    By firstNameMurcry = By.name("firstName");
		    By lastNameMurcry = By.name("lastName");
		    By PhoneMurcury = By.name("phone");
		    By userNameMurcury = By.name("userName");
		    By address1Murcury = By.name("address1");
		    By cityMurcury = By.name("city");
		    By stateMurcury = By.name("state");
		    By postalCodeMurcury = By.name("postalCode");
		 //  By countryMurcury = By.name("country");
		    By emailMurcury = By.name("email");
		    By passwordMurcury = By.name("password");
		    By confirmPasswordMurcury = By.name("confirmPassword");
		    
		    
		    
		  
		//    driver.findElement(countryMurcury).By.xpath("//select[@name='country'],'SRI LANKA')]");
	    	
	    	driver.findElement(firstNameMurcry).sendKeys(firstName);
	    	driver.findElement(lastNameMurcry).sendKeys(lastName);
	    	driver.findElement(PhoneMurcury).sendKeys(phone);
	    	driver.findElement(userNameMurcury).sendKeys(userName);
	    	driver.findElement(address1Murcury).sendKeys(address1);
	    	driver.findElement(cityMurcury).sendKeys(city);
	    	driver.findElement(stateMurcury).sendKeys(state);
	    	driver.findElement(postalCodeMurcury).sendKeys(postalCode);
	    	//driver.findElement(countryMurcury).selectByVisibleText (country);
	    	Select countryMurcury = new Select(driver.findElement(By.name("country")));
	    	countryMurcury.selectByValue (country); 	
	    	driver.findElement(emailMurcury).sendKeys(email);
	    	driver.findElement(passwordMurcury).sendKeys(password);
	    	driver.findElement(confirmPasswordMurcury).sendKeys(confirmPassword);
	    	
	    }
	    
	    
	   public void RegisterUser(String firstName,String lastName,	String phone,String	userName,String	address1,
	    	String	city,String	state,String	postalCode,String	country,String	email,String	password,String	confirmPassword){
//

	      this.setUserName(firstName, lastName,phone,userName,address1,city,state,postalCode,country,email,password,confirmPassword);

	      //

	        this.ClickSubmittoResister();        
	    }


	   
	}