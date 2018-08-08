package com.zephyr.reusablemethods;




import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zephyr.pom.LoginPage_POM;

public class LoginPage extends LoginPage_POM 
{	
	WebDriver driver;
	BasePage bp;
	public Logger log;
	

	public LoginPage(WebDriver driver)
   {   
		super(driver);
		this.driver=driver;
		log=Logger.getLogger(this.getClass());
	    Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
//	    BasicConfigurator.configure();
	
	}	
	
	/* ****************************************************
	   * Method Name   :  enterUname(String userName) 
	  * Purpose    : To  enter Username
	  * Author    : OPAL1
	  * Date Created   : 27/07/17
	  * Date Modified  :
	  * Reviewed By   : Opal4
	  * ******************************************************
	  */
	public boolean enterUname(String userName) throws Exception
	{
		try
		{
			  bp=new BasePage();
	  username.sendKeys(userName);
	
		 
		 bp.waitForElement();
      return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		 
    }
	
	/* ****************************************************
	   * Method Name   :enterPass(String passWord) 
	  * Purpose    : To enter Password 
	  * Author    : OPAL1
	  * Date Created   : 27/07/17
	  * Date Modified  :
	  * Reviewed By   : Opal4
	  * ******************************************************
	  */
	public boolean enterPass(String passWord) throws Exception
	{
		try
		{
	  password.sendKeys(passWord);
	  bp=new BasePage();
		 bp.waitForElement();
		 bp.waitForElement();
	  return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	  
	}
	/* ****************************************************
	   * Method Name   :clickOnLogin()
	  * Purpose    : To click On Login
	  * Author    : OPAL1
	  * Date Created   : 27/07/17
	  * Date Modified  :
	  * Reviewed By   : Opal4
	  * ******************************************************
	  */
	public boolean clickOnLogin() throws Exception 
	{
		try
		{
	 loginButton.click();
	
	 bp=new BasePage();
	 bp.waitForElement();
	 log.info("Successfully Landed in Project Page");
	 return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	/* ****************************************************
	   * Method Name   :enterUnameAndPassword(String name,String passWord)
	  * Purpose    : To enter Username And Password
	  * Author    : OPAL1
	  * Date Created   : 27/07/17
	  * Date Modified  :
	  * Reviewed By   : Opal4
	  * ******************************************************
	  */
	public boolean enterUnameAndPassword(String name,String passWord) throws Exception
	{
		try
		{bp=new BasePage();
		username.sendKeys(name);
		bp.waitForElement();
		password.sendKeys(passWord);
		bp.waitForElement();
		loginButton.click();
		bp.waitForElement();
		log.info("Successfully Landed in Project Page");
		return true;	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
  
	}
	
	/* ****************************************************
	   * Method Name   : verifyLoginTitle()
	  * Purpose    : To verify Login Title
	  * Author    : OPAL1
	  * Date Created   : 27/07/17
	  * Date Modified  :
	  * Reviewed By   : Opal4
	  * ******************************************************
	  */
	public boolean verifyLoginTitle() throws Exception
	{
		try
		{
	    String titleLogin=driver.getTitle();
	    log.info(titleLogin);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public boolean enterUname2(String userName,WebDriver driver2) throws Exception
	{
		try
		{
			this.driver=driver2;
			driver.findElement(By.xpath("(//*[@id='zee-login-username'])[2]")).sendKeys(userName);
	  //username.sendKeys(userName);
	  return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}

	public boolean enterPass2(String passWord,WebDriver driver2) throws Exception
	{
		try
		{
			this.driver=driver2;
			driver.findElement(By.xpath("(//*[@id='zee-login-password'])[2]")).sendKeys(passWord);
	  //password.sendKeys(passWord);
	  bp=new BasePage();
		 bp.waitForElement();
	  return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	  
	}
	public boolean clickOnLogin2(WebDriver driver2) throws Exception 
	{
		try
		{
			this.driver=driver2;
			driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
	 //loginButton.click();
	 bp=new BasePage();
	 bp.waitForElement();
	 log.info("Successfully Landed in Project Page");
	 return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
}
