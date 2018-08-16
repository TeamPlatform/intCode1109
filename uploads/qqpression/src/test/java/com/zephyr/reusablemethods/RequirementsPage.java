package com.zephyr.reusablemethods;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zephyr.common.AutomationConstants;
import com.zephyr.pom.RequirementsPage_POM;

public class RequirementsPage extends RequirementsPage_POM {

	WebDriver driver=null;
	   public Logger log;
	   BasePage bp;
	   
	   public RequirementsPage(WebDriver driver)
	   {
	   	super(driver);
	   	this.driver=driver;
	   	log=Logger.getLogger(this.getClass());
	       Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
	   }
	   
	   public boolean validateRequirementPage() throws Exception
		{
			try
			{
		
		String requirementPage=driver.getTitle();
		System.out.println(requirementPage);
	    String expmsg="Test Planning";
	    if(requirementPage.equals(expmsg))
	   {
	    	System.out.println("Successfully Landed on Requirement Page");
	//    
		}
	    return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
		}
	   
	   public boolean addRequirement() throws Exception 
	   {
		   try
		   {
	   	 bp=new BasePage();
	 
	   	int bcnt=requirementCount();
	   	addRequirement.click();
	   	bp.waitForElement();
	   	int acnt=requirementCount();
	   	
	   	
	   	if((bcnt+1)==acnt)
	   	{
	   		
	   		 System.out.println("Pass-Requirement Successfully Added");
	   		 System.out.println("Pass-Requirement Present in the node-"+acnt);
	   	}
	   
	   	return true;
		   
		  
	  	  } 
	  	   catch (Exception e) 
	  	   {
	  	   e.printStackTrace();
	  	   throw e;
	  	  }
	   }
	   
	   
	   
	    public boolean navigateToNode(String releaseName, String[] navigation) throws Exception {
		  	  try {
		  	   bp = new BasePage();
		  	   String releasename4;
		  	   bp.waitForElement();
		  	   String releasename3 = releasename1 + releaseName + releasename2;
		  	   WebElement ele = driver.findElement(By.xpath(releasename3));
		  	   Actions act = new Actions(driver);
		  	   
		  	 WebElement releaseExpand= driver.findElement(By.xpath(releasename11+releaseName+expandNode));
			   String text=releaseExpand.getAttribute("aria-expanded");
		  	   
		  	   
		  	    System.out.println(text);
		  	   if(text.equals("false"))
		  	   {
		  	   
		  	    
		  	   act.doubleClick(ele).build().perform();
		  	   bp.waitForElement();
		  	   System.out.println("Pass - Double click on'" + releaseName + "' Successfull");
		  	   Thread.sleep(3000);
		  	   }
		  	   
		  	  
		  	   

		  	   for (int i = 0; i <= navigation.length - 1; i++) 
		  	   {

		  	    releasename4 = releasename1 + navigation[i] + releasename2;

		  	    WebElement nodeElement = driver.findElement(By.xpath(releasename4));
		  	    
		  	    if(navigation.length>1 && i<navigation.length-1)
		  	    {
		  	    String nodeExpandCheck= releasename11+navigation[i]+releasename2+expandNode;
		  	    System.out.println(nodeExpandCheck);
		  	    WebElement nodeExp=driver.findElement(By.xpath(nodeExpandCheck));
		  	    boolean ww=nodeExp.isDisplayed();
		  	    System.out.println(ww);
		  	    bp.waitForElement();
		  	    String check=driver.findElement(By.xpath(nodeExpandCheck)).getAttribute("aria-expanded");
		  	      System.out.println(check);
		  	    	if(check.equals("false"))
		  	    	{
		  	          nodeExp.click();
		  	       
		  	    act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
		  	    
		  	    String Nodename = driver.findElement(By.xpath(releasename4)).getText();
		  	    System.out.println(Nodename);
		  	    System.out.println("Pass - Double click on'" + navigation[i] + "' Successfull");
		  	    bp.waitForElement();
		  	    	}
		  	    }
		  	    	else
		  	    	{
		  	    		
		  	    		act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
		  	    	
		  		    
		  		    String Nodename = driver.findElement(By.xpath(releasename4)).getText();
		  		    System.out.println(Nodename);
		  		   
		  	    		
		  	    	}
		  	    	
		  	   }

		  	   return true;
		  	  } 
		  	   catch (Exception e) 
		  	   {
		  	   e.printStackTrace();
		  	   throw e;
		  	  }
		  	 }
		    
	
	   

	   
	   public boolean verifyRequirementTitle() throws Exception
	   {
		   try
		   {
	   	String requirementtitle=driver.getTitle();
	   	 System.out.println(requirementtitle);
	  
	   	return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   throw e;
		   }
	   }
	   
	 
	   public boolean addNode(String Name,String Desc) throws Exception
	   {
	   	try
	   	{
	   		BasePage bp=new BasePage();
	   		bp.waitForElement();
			
			
			bp.waitForElement();
	   		options.click();
	   		System.out.println("Pass - Clicked on Options");
	   		bp.waitForElement();
	   		 
	   		addNode.click();
	   		 System.out.println("Pass -Clicked on Add Button");
	   		bp.waitForElement();
	   		nodeName.sendKeys(Name);
	   		nodeDesc.sendKeys(Desc);
	   		saveNode.click();
	   		 System.out.println("Pass - Clicked on Save Button");
	   		bp.waitForElement();
	   		
	   		 System.out.println("Pass - created with name and description");
	   		return true;
	   		
	   		
	   	}
	   	catch(Exception e)
	   	{
	   		e.printStackTrace();
	   		throw e;
	   	}
	   }


	   
		   
	 
	   public int requirementCount() throws InterruptedException
	   {
	   	try
	   	{
	   	int count=0;
	   	boolean sp=requirementCount.isEnabled();
	   	
	   	if(sp==true)
	   	{
	   	 String requirementsCount=requirementCount.getText();
	   	  count= Integer.parseInt(requirementsCount);
	   	 
	   	
	   	}
	   	return count;
	   	}
	       catch(Exception e)
	       {
	       	 System.out.println("Currently No Requirement Present in the Node");
	   		return 0;
	       }
	   }

	   
	   
	 
	   

     public boolean MapRequirements() throws Exception
	   {
		try{
		  
			bp=new BasePage();
		   bp.waitForElement();
//		   bp.explicitWait(clickOnMapRequirements);
//		   clickOnMapRequirements.click();
		   bp.waitForElement();
		   bp.explicitWait(clickOnMapReq);
		   clickOnMapReq.click();
		   bp.waitForElement();
		   return true;
		}
	   catch(Exception e)
		{
		   e.printStackTrace();
		   throw e;
		}

	   }


//For Requirement Mapping
	   
	   public boolean ExpandRelease(String releaseName) throws Exception 
	   {
		   try
		   {
			   BasePage bp=new BasePage();   
	   	String releasename3=expandreleasename1+releaseName+expandreleasename2;
	   	Actions act=new Actions(driver);
	   	WebElement ele=driver.findElement(By.xpath(releasename3));
	   	bp.waitForElement();
	   	bp.waitForElement();
	   	act.moveToElement(ele).doubleClick().perform();
	   	 System.out.println("Pass - double click on'"+releaseName+"' Successfull");
	   	
	   	bp.waitForElement();
	   	return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   throw e;
		   }
	   }


//For Saving Requirement//
	   public boolean saveRequirement() throws Exception
	   {
		   try
		   {
		   bp=new BasePage();
		   bp.waitForElement();
		   bp.explicitWait(clickSave);
		   clickSave.click();
		   bp.waitForElement();
		   return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   throw e;
		   }
	   }
	   
//For Selecting Requirement//
	   public boolean selectRequirement(String requirementNum) throws Exception
		{
		   try
		   {
		   bp=new BasePage();
		   bp.waitForElement();
//			String s3=requirement1+requirementNum+requirement2;
//			System.out.println(s3);
//			driver.findElement(By.xpath(s3)).click();
//			bp.waitForElement();
			driver.findElement(By.xpath(checkRequirement1+requirementNum+clickOnPages2)).click();
			bp.waitForElement();
			return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   throw e;
		   }
		}
	   
//For Selecting Import and Jira requirement
	   
	   
	   public boolean clickOnImport() throws Exception 
	   {
		   try
		   {
		   bp=new BasePage();
		   bp.waitForElement();
		   bp.explicitWait(import_Requirement);
		   Actions act=new Actions(driver);
		   act.moveToElement(import_Requirement).click().perform();
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   throw e;
		   }
		   return true;
	   }
	   
	   public boolean exportRequirement() throws Exception
	   {
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		bp.explicitWait(export_Requirement);
	   	export_Requirement.click();
	   	return true;
		}
		catch(Exception e)
		   {
			   e.printStackTrace();
			   throw e;
		   }
	   }
	   
	   public boolean chooseImportType(String importType)throws Exception
	   {
		   try
		   {
		   bp=new BasePage();
		   bp.waitForElement();
			String s3=importtype1+importType+importtype2;
			System.out.println(s3);
			WebElement ele=driver.findElement(By.xpath(s3));
			bp.explicitWait(ele);
			Actions act=new Actions(driver);
			act.moveToElement(ele).click().build().perform();
			 bp.waitForElement();
			 System.out.println("Pass - Selection of'" + importType + "' Successfull");
		 return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   throw e;
		   }
	   }
	   
	   //selecting access type and Folder Name//
	   public boolean selectAccessTypeAndFolderName(String accessType,String folderName) throws Exception
	   {
		   try
		   {
		   bp=new BasePage();
		   bp.waitForElement();
		   bp.explicitWait(chooseAccessTypes);
		   chooseAccessTypes.click();
			String s3=accessType1+accessType+accessType2;
			System.out.println(s3);
			driver.findElement(By.xpath(s3)).click();
			System.out.println("Pass - accessType'" + accessType + "' choosen Successfull");
			bp.explicitWait(clickjiraTopLevelFolderName);
			clickjiraTopLevelFolderName.click();
			clickjiraTopLevelFolderName.sendKeys(folderName);
			System.out.println("Pass- folderName'" + folderName + "'entered successfully");
			
			return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   throw e;
		   }
	   }

		public boolean selectMultipleTestCaseFromGrid(String[] testCaseNo) throws InterruptedException
		{
			BasePage bp=new BasePage();
			bp.waitForElement();

			for(int i=0;i<=testCaseNo.length-1;i++)
			{
			WebElement ele=driver.findElement(By.xpath(selectTestCase1+testCaseNo[i]+selectTestCase2));
			Actions a1=new Actions(driver);
			a1.moveToElement(ele).click().perform();
			}
			
			return true;
		}
		public boolean verifySearchRequirementCount() throws InterruptedException
		{
			try
			{
			int count=0;
			boolean sp=serachRequirementCount.isEnabled();
			
			if(sp==true)
			{
			 String requirementsCount=requirementCount.getText();
			  count= Integer.parseInt(requirementsCount);
			  bp.waitForElement();
			  System.out.println("Total Searched Requirements-"+count);
			 //Thread.sleep(3000);
			}
			
			}
		    catch(Exception e)
		    {
		    	 System.out.println("Currently No Requirement Present in the Node");
				//return false;
		    }
			return true;
		}

		
	/**********************************************************************************/	
		//select querry//
		public boolean selectQuerry(String selectQuerry,String enterQuerry) throws Exception
		{
			try
			{
			bp=new BasePage();
			   bp.explicitWait(searchChoiceContainer);
			   searchChoiceContainer.click();
				String s4=selectquerry1+selectQuerry+selectquerry2;
				WebElement ele=driver.findElement(By.xpath(s4));
				bp.explicitWait(ele);
				ele.click();
				bp.explicitWait(enterJiraSearchDefectsJQLQuerry);
				enterJiraSearchDefectsJQLQuerry.sendKeys(enterQuerry);
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
				
		}

		 public boolean searchJiraRequirements() throws Exception
		   {
			   try
			   {
				   bp=new BasePage();
				   bp.explicitWait(clickjiraSearchButton);
				   clickjiraSearchButton.click();
				   return true;   
			   }
			   catch (Exception e) 
		  	   {
		  	   e.printStackTrace();
		  	   throw e;
		  	  }
			   
		   }
		
		//select querry//
				public boolean selectFilterQuerry(String selectQuerry,String selectFilter) throws Exception
				{
					try
					{
					bp=new BasePage();
					   bp.waitForElement();
					   bp.explicitWait(searchChoiceContainer);
					   searchChoiceContainer.click();
						String s4=selectquerry1+selectQuerry+selectquerry2;
						System.out.println(s4);
						driver.findElement(By.xpath(s4)).click();
						bp.waitForElement();
						bp.explicitWait(selectJiraSearchDefectsFilterQuerry);
						selectJiraSearchDefectsFilterQuerry.click();
						
						String ele=selectFilter1+selectFilter+selectFilter2;
						System.out.println(ele);
						driver.findElement(By.xpath(ele)).click();
						
						return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						throw e;
					}
						
				}
		
		public boolean selectMultipleTestCaseFromGrids(String[] testCaseNo) throws InterruptedException
		{
			BasePage bp=new BasePage();
			bp.waitForElement();
//			String s3=testcase1+testCaseName+testcase2;
//			driver.findElement(By.xpath(s3)).click();
			for(int i=0;i<=testCaseNo.length-1;i++)
			{
			WebElement ele=driver.findElement(By.xpath(checkTestCase1+testCaseNo[i]+checkTestCase2));
			Actions a1=new Actions(driver);
			a1.moveToElement(ele).click().perform();
			}
			
			return true;
		}
		
		
		public boolean selectMultipleRequirementFromGrids(String[] testCaseNo) throws Exception
		{
			try
			{
			BasePage bp=new BasePage();
			bp.waitForElement();
//			String s3=testcase1+testCaseName+testcase2;
//			driver.findElement(By.xpath(s3)).click();
			for(int i=0;i<=testCaseNo.length-1;i++)
			{
			WebElement ele=driver.findElement(By.xpath(checkRequirement1+testCaseNo[i]+checkRequirement2));
			Actions a1=new Actions(driver);
			a1.moveToElement(ele).click().perform();
			bp.waitForElement();
			driver.findElement(By.xpath(checkRequirement1+testCaseNo[i]+clickOnPages2)).click();
			bp.waitForElement();
			}
			
			return true;
			}
			catch(Exception e)
		     {
		      e.printStackTrace();
		      throw e;
		     }
		}

	    
	    public boolean MapTestCases() throws Exception
	    {
	    	try
	    	{
	    	bp=new BasePage();
	    	bp.waitForElement();
	    	//clickOnMappedTestCases.click();
	    	bp.waitForElement();
	    	System.out.println("Pass-successfully clicked on Mapped TestCases");
	    	bp.waitForElement();
	    	clickOnMapTestCase.click();
	    	bp.waitForElement();
	    	System.out.println("Pass-successfully clicked on MapTestCase");
	    	bp.waitForElement();
	    	return true;
	    	}
	    	catch(Exception e)
		     {
		      e.printStackTrace();
		      throw e;
		     }
	    }
	    
	    public boolean DTSLoginDetails(String Password,String ReenterPassword) throws Exception
	    {
	    	try
	    	{
	    	clickOnResetUser.click();
	    	bp=new BasePage();
	    	bp.waitForElement();
	    	password.click();
	    	bp.waitForElement();
	    	password.sendKeys(Password);
	    	bp.waitForElement();
	    	//reEnterPassword.click();
	    	bp.waitForElement();
	    	reEnterPassword.sendKeys(ReenterPassword);
	    	bp.waitForElement();
	    	update.click();
	    	return true;
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    		throw e;
	    	}
	    }
	    
	    public boolean DTSLoginDetail(String Username,String Password,String ReenterPassword) throws Exception
	    {
	    	try
	    	{
	    	bp=new BasePage();
		    bp.explicitWait(clickOnResetUser);
	    	clickOnResetUser.click();
	    	 bp.waitForElement();
	    	bp.eraseText(username);
	    	//username.click();
	    	bp.waitForElement();
	    	username.sendKeys(Username);
	    	bp.explicitWait(password);
	    	password.click();
	    	bp.waitForElement();
	    	password.sendKeys(Password);
	    	bp.waitForElement();
	    	//reEnterPassword.click();
	    	bp.waitForElement();
	    	reEnterPassword.sendKeys(ReenterPassword);
	    	bp.waitForElement();
	    	bp.explicitWait(update);
	    	update.click();
	    	bp.waitForElement();
	    	bp.waitForElement();
	    	//updateUser.click();
	    	boolean res=updateUser.isDisplayed();
	    	if(res==true)
	    	{
	    		bp.explicitWait(updateUser);
	    		updateUser.click();
	    	}
	    	bp.waitForElement();
	    	return true;
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    		throw e;
	    	}
	    }
	    
	    
	   
	    public boolean deleteOrDeallocateRequirements(String type) throws Exception
		   {
	    	try
	    	{
	    		bp=new BasePage();
	    		bp.explicitWait(delete_Requirement);
		   	   delete_Requirement.click();
		   	
		   	if(type.equals("Delete"))
		   	{
		   		bp.explicitWait(deleteButton);
		   		deleteButton.click();
		   		bp.waitForElement();
		   	//driver.findElement(By.xpath("//*[@id='zee-delete-modal-requirement_4']//button[3]")).click();
		   	System.out.println("Requirements Deleted successfully");
		   }
		   	
		   	else if(type.equals("Deallocate"))
		   		  {
		   		  bp.explicitWait(deallocateButton);
		   		   deallocateButton.click();
		   		   bp.waitForElement();
		   		//driver.findElement(By.xpath("//*[text()='Deallocate']")).click();
		   		System.out.println("Requirements Deallocated successfully");
		   			}
		   	
		   	return true;
	    	}
		   	
		    catch (Exception e) 
		  	   {
		  	   e.printStackTrace();
		  	   throw e;
		  	  }
		   }
	    
	    
	    public boolean deleteOrDeallocateRequirementNode(String type) throws Exception
	    {
	    	try
	    	
	    	{
	    		bp=new BasePage();
	    		  bp.waitForElement();
					options.click();
					 System.out.println("Node options is clicked");
					bp=new BasePage();
					bp.waitForElement();
					 bp.explicitWait(deleteNode);
					deleteNode.click();
					 System.out.println("delete node option is clicked");
					bp.waitForElement();
					if(type.equals("Deallocate"))
				   	{
						bp.explicitWait(deallocateNode);
				   	deallocateNode.click();
				   	//driver.findElement(By.xpath(" //*[@id='reqDeleteNodeModal']//button[2]")).click();
				   	System.out.println("Node Deallocated successfully");
				   }
				   	
				   	else if(type.equals("Delete"))
				   			{
				   		bp.explicitWait(deleteNode1);
				   		deleteNode1.click();
				   		//driver.findElement(By.xpath(" //*[@id='reqDeleteNodeModal']//button[3]")).click();
				   		System.out.println("Node Deleted successfully");
				   			}
				   	
				   	return true;
			    	}
					
					
					
					
					catch(Exception e)
					{
						System.out.println("Node is not deleted or deallocated");
						e.printStackTrace();
						throw e;
					}
				}
                
	    	

	    public boolean allocateRequirements() throws Exception
	    {
	    	try
	    	{
	    		bp=new BasePage();
	    		bp.explicitWait(allocateReq);
	    	   allocateReq.click();
	    	
	    	//driver.findElement(By.xpath("//*[text()='Allocate']")).click();
	    	
	    	
	    	return true;
	    	}
	    	catch(Exception e)
			{
				System.out.println("Requirement is not Allocated");
				e.printStackTrace();
				throw e;
			}
	    }
	    
	    
	    
	    public boolean allocateRequirementNode() throws Exception
	    {
	    	try
	    	{
	    	
	    		bp=new BasePage();
	    		bp.waitForElement();
	    		options.click();
	    		bp.waitForElement();
	    		bp.explicitWait(allocateNode);
	    		allocateNode.click();
	    		bp.waitForElement();
	    	//driver.findElement(By.xpath("//a[text()='Allocate']")).click();
	    	
	    	
	    	return true;
	    	}
	    	catch(Exception e)
			{
				System.out.println("Node is not Allocated");
				e.printStackTrace();
				throw e;
			}
	    }
	    
	    
	    
	    public boolean selectRequirementsFromGrids(String[] testCaseNo) throws Exception
	    {
	    	try
	    	{
	     BasePage bp=new BasePage();
	     bp.waitForElement();
	  //   String s3=testcase1+testCaseName+testcase2;
	  //   driver.findElement(By.xpath(s3)).click();
	     for(int i=0;i<=testCaseNo.length-1;i++)
	     {
	     WebElement ele=driver.findElement(By.xpath(checkRequirement1+testCaseNo[i]+checkRequirement2));
	     Actions a1=new Actions(driver);
	     a1.moveToElement(ele).click().perform();
	     
	     
	     }
	     System.out.println(testCaseNo.length+" requirement selected successfully");
	     
	     return true;
	    }
	    
	    	catch(Exception e)
			{
				System.out.println("Requirement selection is failed");
				e.printStackTrace();
				throw e;
			}
	    
	    
	    }



public boolean clickOnGo() throws Exception
{
	try
	{
		bp=new BasePage();
		bp.waitForElement();
		bp.explicitWait(goLinkButton);
	goLinkButton.click();
	System.out.println("Link Go button clicked successfully");
	bp.waitForElement();
	return true;
	}

     catch(Exception e)
		{
			e.printStackTrace();
			 System.out.println("Link Go button is not clicked ");
			throw e;
		}
	
}




public boolean enterRequirementDetails(String name,String altID,String link,String priority,String Description) throws Exception
{
 
 try
{
bp=new BasePage();
bp.waitForElement();

Actions a2=new Actions(driver);
a2.sendKeys(Keys.TAB).perform();
bp.waitForElement();
if(name!="")
{
	bp.explicitWait(requirementName);
bp.eraseText(requirementName);
Actions a1=new Actions(driver);
   a1.sendKeys(name).sendKeys(Keys.TAB).perform();
}
bp.waitForElement();
if(altID!="")
{
bp.eraseText(requirementAltID);
Actions a1=new Actions(driver);
    a1.sendKeys(altID).sendKeys(Keys.TAB).perform();
}
bp.waitForElement();
if(link!="")
{
bp.eraseText(requirementLink);
Actions a1=new Actions(driver);
    a1.sendKeys(link).sendKeys(Keys.TAB).perform();
}
bp.waitForElement();
if(priority!="")
{
Actions a1=new Actions(driver);
a1.moveToElement(requirementPriority).click().pause(2000).sendKeys(priority).sendKeys(Keys.ENTER).perform();

}
bp.waitForElement();
if(Description!="")
{
bp.switchToFrame(frameDescription);
bp.eraseText(requirementDescription);
Actions a1=new Actions(driver);
    a1.sendKeys(Description).sendKeys(Keys.TAB).perform();
    bp.waitForElement();
    
    driver.switchTo().defaultContent();
  //  saveRequirementDetail.click();  
bp.waitForElement();
}
return true;
}
catch(Exception e)
{
e.printStackTrace();
throw e;
}
}



public boolean requirementCoverageDetails(int tcNo) throws Exception
{
 try
 {
  bp=new BasePage();
  bp.waitForElement();
  WebElement ele=driver.findElement(By.xpath(coverage1+tcNo+coverage2));
  bp.waitTillElementIsVisible(ele);
  ele.click();
  bp.waitForElement();
  boolean status=coverageMsg.isDisplayed();
if(status==true)
{
String msg=coverageMsg.getText();
System.out.println(msg);
}
  closeRequirementCoverageDetails.click();
  bp.waitForElement();
     return true;
 }
 catch(Exception e)
{
e.printStackTrace();
throw e;
}
}



public boolean VerifyRequirementCount() throws InterruptedException
{
	try
	{
	int count=0;
	boolean sp=requirementCount.isEnabled();
	
	if(sp==true)
	{
	 String requirementsCount=requirementCount.getText();
	  count= Integer.parseInt(requirementsCount);
	  bp.waitForElement();
	  System.out.println("Requirement present in the node-"+count);
	 //Thread.sleep(3000);
	}
	
	}
    catch(Exception e)
    {
    	 System.out.println("Currently No Requirement Present in the Node");
		//return false;
    }
	return true;
}


public boolean selectAllRequirements() throws Exception
{
	try
	{
		bp=new BasePage();
		bp.waitForElement();
		//bp.explicitWait(selectAll);
		Actions a1=new Actions(driver);
		a1.moveToElement(selectAll).click().perform();
		System.out.println("All Requirements are selected successfully");
		
		bp.waitForElement();
		//selectAll.click();
		return true;
	}
	
	catch(Exception e)
    {
		System.out.println("Requirements are not selected");
		e.printStackTrace();
		throw e;
		
    }
}


public boolean cloneRequirement() throws Exception
{
	try
	{
	BasePage bp=new BasePage();
	bp.waitForElement();
	bp.explicitWait(clone_Requirement);
	clone_Requirement.click();
	bp.waitForElement();
	return true; 
	
	}catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean minimizeFolderNode(String folderName) throws Exception
{
	 try {
		   bp = new BasePage();
		   bp.waitForElement();
		   String releasename3 = releasename1 + folderName + releasename2;
		   WebElement ele = driver.findElement(By.xpath(releasename3));
		   bp.explicitWait(ele);
		   WebElement releaseExpandcheck=driver.findElement(By.xpath(releasename11+folderName+expandNode));
		   String text=releaseExpandcheck.getAttribute("aria-expanded");
		 //  String text=releaseExpand.getAttribute("aria-expanded");
		   
		   System.out.println(text);
		   if(text.equals("true"))
		   {
		   Actions act = new Actions(driver);
		   
		   act.moveToElement(ele).doubleClick().perform();
		   bp.waitForElement();
		   System.out.println("Pass - double click on'" + folderName + "' Successfull");
		   bp.waitForElement();}
		   else
		   {
		    bp=new BasePage();
		    //String releasename3 = releasename1 + releaseName + releasename2;
		     driver.findElement(By.xpath(releasename3)).click();
		    System.out.println(folderName+" Folder already in Minimized mode");
		    bp.waitForElement();

		   
		  }
		   return true;
}
	 
	 catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
}



public boolean validateDeletedOrDeallocatedNode(String nodeName) throws Exception
{
	   String name;
		try
		{
			  bp=new BasePage();
			
				name=releasename1+nodeName+releasename2;
				//WebElement nodeElement=driver.findElement(By.xpath(cycle4));
				
				
				
				if(driver.findElements(By.xpath(name)).size() != 0)
				   {
					System.out.println("Node is not deleted");
					}
				else
					{
					System.out.println(nodeName+" Node is not present in the folder");
					}
			
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Fail-Node deleted unsucessful");
			e.printStackTrace();
			throw e;
		}
}

 public boolean chooseExportType(String exportType) throws Exception
		{
			try
			{
			bp=new BasePage();

			
			//Verification Page
			   String verifyEntireTraceability=entireTraceability.getText();
			   String verifyRequirementOnly=requirementOnly.getText();
			if(exportType.equals(verifyEntireTraceability))
			{
		   bp=new BasePage();
		   entireTraceability.click();
		   System.out.println("Pass-Successfully clicked on Entire Traceability");
		   bp.waitForElement();
			}
			else if(exportType.equals(verifyRequirementOnly))
			{
			
				bp=new BasePage();
				requirementOnly.click();
				System.out.println("Pass-Successfully clicked on Requirement Only");
				   bp.waitForElement();
			}
			
		   //Verification Page
		   String verifyexportPage=exportPage.getText();
		 
		     Assert.assertEquals(exportPageTitle,verifyexportPage); 
		      System.out.println("Successfully landed on Export page");
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				 System.out.println("You are not navigated to Export Page");
				throw e;
			}
		}
	    
 public boolean selectFilterBy(String[] priority,String[] creator) throws Exception
		{
			
		try
		{
		  bp=new BasePage();
			if(priority[0]!=(""))
			{
		    priorityOption.click();
			bp.waitForElement();
		    //Thread.sleep(2000);
			driver.findElement(By.xpath(priorityField)).click();
			
			
			for(int k=0;k<=priority.length-1;k++)
			{
				Actions a1=new Actions(driver);
				System.out.println(priority[k]);
				a1.sendKeys(priority[k]).sendKeys(Keys.ENTER).perform();
				
				bp.waitForElement();
			}
			Actions a2=new Actions(driver);
			a2.sendKeys(Keys.ENTER).perform();
			a2.sendKeys(Keys.ENTER).perform();
			
			}
			
			if(creator[0]!="")///////Changed
			{
				creatorOption.click();
			
			bp.waitForElement();
			//Thread.sleep(2000);
			driver.findElement(By.xpath(creatorField)).click();
			//WebElement ele=driver.findElement(By.xpath(creatorField));
			String ele_1="//li[text()='";
			String ele_2="']";
				
			
			
			for(int j=0;j<=creator.length-1;j++)
			{
			WebElement ele1=driver.findElement(By.xpath(ele_1+creator[j]+ele_2));
			String p=ele1.getText();
			System.out.println(p);
			if(creator[j].equalsIgnoreCase(p))
			{
				Thread.sleep(2000);
				ele1.click();
				Actions a3=new Actions(driver);
				a3.sendKeys(Keys.SPACE).perform();
			}
			}
			
			
			Actions a4=new Actions(driver);
			a4.sendKeys(Keys.ENTER).perform();
	}

			return true;
		}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
		}

 public boolean editJiraSummaryDetails(String summary,String[] labels,String[] priority,String[] linkedIssue,String[] LinkedIssuesArea,String[] jiraAssignee,String editJiraContent) throws Exception
	    {
	    	try
	    	{
	    	bp=new BasePage();
	    	bp.waitForElement();
	    	editJira.click();
	    	System.out.println("Pass-Successfully clicked on Edit Field");
	    	if(summary!="")
			{
				 bp.eraseText(enterJiraSummary);
				 Actions a1=new Actions(driver);
			     a1.sendKeys(summary).sendKeys(Keys.TAB).perform();
			}
		  bp.waitForElement();
			if(labels[0]!="")
			{
				bp.eraseText(enterJiraLabels); 
				Actions a1=new Actions(driver);
				 a1.sendKeys(labels).sendKeys(Keys.TAB).perform();
				 //a1.moveToElement(enterJiraLabels).click().pause(2000).sendKeys(labels).sendKeys(Keys.TAB).perform();
			}
			bp.waitForElement();
			if(priority[0]!="")
			{
				bp.eraseText(enterJiraPriority); 
				Actions a1=new Actions(driver);
				a1.sendKeys(priority).sendKeys(Keys.TAB).perform();
				//a1.moveToElement(enterJiraPriority).click().pause(2000).sendKeys(priority).sendKeys(Keys.TAB).perform();
			}
			bp.waitForElement();
			if(linkedIssue[0]!="")
			{
				 Actions a1=new Actions(driver);
				 a1.moveToElement(enterJiraLinkedIssues).click().pause(2000).sendKeys(linkedIssue).sendKeys(Keys.TAB).perform();
			}
			bp.waitForElement();
			if(LinkedIssuesArea[0]!="")
			{
				bp.eraseText(enterJiraLinkedIssuesArea);
				 Actions a1=new Actions(driver);
				 //a1.moveToElement(enterJiraLinkedIssuesArea).click().pause(2000).sendKeys(linkedIssue).sendKeys(Keys.TAB).perform();
			     a1.sendKeys(LinkedIssuesArea).sendKeys(Keys.TAB).perform();
			}
			bp.waitForElement();
			if(jiraAssignee[0]!="")
			{
				bp.eraseText(enterJiraAssignee);
				 Actions a1=new Actions(driver);
				 //a1.moveToElement(enterJiraAssignee).click().pause(2000).sendKeys(linkedIssue).sendKeys(Keys.TAB).perform();
			     a1.sendKeys(jiraAssignee).sendKeys(Keys.TAB).perform();
			}
			bp.waitForElement();
			if(editJiraContent!="")
			{
				bp.eraseText(enterJiraEditContent);
				 Actions a1=new Actions(driver);
				 //a1.moveToElement(enterJiraEditContent).click().pause(2000).sendKeys(linkedIssue).sendKeys(Keys.TAB).perform();
			     a1.sendKeys(editJiraContent).sendKeys(Keys.TAB).perform();
			}
			driver.findElement(By.xpath(enterJiraEditUpdate)).click();
			bp.waitForElement();
			
			
			//validation
			bp.waitForElement();
			String summaryVal=summaryValue.getText();
			String priorityVal=priorityValue.getText();
			String labelsVal=labelsValue.getText();
			
			if((summaryVal.equals(summary))||(priorityVal.equals(priority))|| (labelsVal.equals(labels)))
			{
				 System.out.println("Pass- Summary Value and Priority Value and Labels Value is Added Succssfully");
			}
			else
			{
				 System.out.println("Summary Value  or Priority Value or Labels Value is not Added");	
			}
		
	    	return true;
	    	}
	    	catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
	    }

 
//Import All Jira Requirements
 public boolean importAllJiraRequirements() throws Exception
 {
 	try
 	{
 		bp=new BasePage();
 		bp.waitForElement();
 		WebDriverWait wait=new WebDriverWait(driver,AutomationConstants.EXPLICIT);
 		wait.until(ExpectedConditions.elementToBeClickable(importAll));
 		importAll.click();
 		System.out.println("Pass-Successfully import all jira requirements");
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
 
 
 
 public boolean validateMapedTestcase() throws Exception 
 
 {
	  try
	  {
		  try
		  {
	     bp=new BasePage();
	     bp.waitForElement();
//	     bp.explicitWait(clickOnMappedTestCases);
//	     clickOnMappedTestCases.click();
		 WebElement map=driver.findElement(By.xpath(map1));
		 String Map=map.getText();
		 System.out.println(Map);
		 //clickOnMappedTestCases.click();
		 bp.waitForElement();
		
		  }
		  catch(Exception e)
		  {
			  System.out.println("testcase is not mapped to requirement");
			  throw e;
			  
		  }
	  }
	catch(Exception e)
	  {
		e.printStackTrace();
		throw e;
	  }
	  return true;	  
 } 
 
 
 public boolean mapTestCasesToRequirementsFromGrids(String[] testCaseNo) throws Exception
 {
	 try
	 {
   bp=new BasePage();
  bp.waitForElement();
//   String s3=testcase1+testCaseName+testcase2;
//   driver.findElement(By.xpath(s3)).click();
  for(int i=0;i<=testCaseNo.length-1;i++)
  {
   bp.waitForElement();
  WebElement ele=driver.findElement(By.xpath(mapTestCaseRequirement1+testCaseNo[i]+mapTestCaseRequirement2));
  Actions a1=new Actions(driver);
  a1.moveToElement(ele).click().perform();
  bp.waitForElement();
  }
System.out.println(testCaseNo.length+" Testcase selcted Successfully");  
  
  return true;
  
  
 }
  catch (Exception e)
  {
  e.printStackTrace();
  throw e;
   
  }
 }	    

 
 public boolean validateDetailsInRequirementGrid(int testcase,String type,String typeValue) throws Exception
 {
  
  
  try
  {
  if(type.equals("Name"))
  {
   String nameField=validateGridColumn1+testcase+validateGridColumn2+"3"+validateGridColumn3;
   String validateName=driver.findElement(By.xpath(nameField)).getText();
   
   if(validateName.equals(typeValue))
   {
    System.out.println("");
   }
  }
  
  else if(type.equals("AltId"))
  {
   String nameField=validateGridColumn1+testcase+validateGridColumn2+"4"+validateGridColumn3;
   String validateAltId=driver.findElement(By.xpath(nameField)).getText();
   
   if(validateAltId.equals(typeValue))
   {
    System.out.println("");
   }
  }
  
  else if(type.equals("Priority"))
  {
   String nameField=validateGridColumn1+testcase+validateGridColumn2+"6"+validateGridColumn3;
   String validatePriority=driver.findElement(By.xpath(nameField)).getText();
   
   if(validatePriority.equals(typeValue))
   {
    System.out.println("");
   }
  }
  
   return true;
 }

  catch(Exception e)
   {
  System.out.println("Fail-Validation Unsuccessful");
  e.printStackTrace();
  throw e;
 }
  
 }		 


 public boolean doubleClickOnRelease(String releaseName) throws Exception {
	  try {
	   bp = new BasePage();
	   bp.waitForElement();
	   String releasename3 = releasename1 + releaseName + releasename2;
	   WebElement ele = driver.findElement(By.xpath(releasename3));
	   
	   WebElement releaseExpandCheck=driver.findElement(By.xpath(releasename11+releaseName+expandNode));
	   String text=releaseExpandCheck.getAttribute("aria-expanded");
	   //String text=releaseExpandInReq.getAttribute("aria-expanded");
	   
	   System.out.println(text);
	   if(text.equals("false"))
	   {
	   Actions act = new Actions(driver);
	   act.moveToElement(ele).doubleClick().perform();
	   bp.waitForElement();
	   System.out.println("Pass - double click on'" + releaseName + "' Successfull");
	   bp.waitForElement();}
	   else
	   {
	    bp=new BasePage();
	    //String releasename3 = releasename1 + releaseName + releasename2;
	     driver.findElement(By.xpath(releasename3)).click();
	    System.out.println("Release already in Expanded mode");
	    bp.waitForElement();

	   
	  }
	   return true;  }
	   catch (Exception e)
	  {
	  e.printStackTrace();
	  throw e;
	   
	  }
	
	 }
 public boolean clickOnChecKBox(String NodeName) throws Exception
 {
  try
  {
   driver.findElement(By.xpath(check1+NodeName+check2)).click();
   bp.waitForElement();
   return true;
  }
  catch(Exception e)
  {
   e.printStackTrace();
   throw e;
  }
 }
 
 public boolean saveJiraRequirement() throws Exception
 {
 	try
 	{
 		bp=new BasePage();
 		bp.waitForElement();
 		clickOnSavejirareq.click();
 		  System.out.println("Save options is clicked");
	      // bp.explicitWait(clickOnSavejirareq);
 		//clickOnSavejirareq.click();
 		bp.waitForElement();
 		return true;
 	}
 	catch(Exception e)
 	{
 		e.printStackTrace();
 		throw e;
 	}
 }
 
 public boolean saveAndDownload() throws Exception
	{
		try
		{
		bp=new BasePage();
		Actions a1=new Actions(driver);
		a1.sendKeys(Keys.DOWN).perform();
		a1.sendKeys(Keys.DOWN).perform();
		bp.waitForElement();
		//bp.waitForElement();
		//Thread.sleep(2000);
		WebDriverWait wait1 = new WebDriverWait(driver, AutomationConstants.EXPLICIT);
	    wait1.until(ExpectedConditions.elementToBeClickable(exportSave));
		exportSave.click();
		 System.out.println("Save button is clicked sucessfully");
		
		bp.waitForElement();
		WebDriverWait wait2 = new WebDriverWait(driver, AutomationConstants.MAX_EXPLICIT);
	    wait2.until(ExpectedConditions.elementToBeClickable(exportDownload));
		exportDownload.click();
		 System.out.println("Export download button is clicked successfully");
		
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
	} 
 
 public boolean enterStartDatAndEndDate(String syear,String smonth,String sday,String eyear,String emonth,String eday) throws Exception
		 {
	 try{
			bp=new BasePage();
		  startDateOption.click();
		  bp.waitForElement();
		  WebElement ele=driver.findElement(By.xpath(startDateHeader));
		  Actions a2=new Actions(driver);
		  a2.moveToElement(ele).click().perform();
		  //driver.findElement(By.xpath(startDateHeader)).click();
		  //a2.moveToElement(ele).click().perform();
		  bp.waitForElement();
		  //driver.findElement(By.xpath(year1+syear+year2)).click();
		  bp.waitForElement();
		  bp.waitForElement();
		  driver.findElement(By.xpath(month1+smonth+month2)).click();
		  bp.waitForElement();
		  //driver.findElement(By.xpath(day1+sday+day2)).click();*/
		  //bp.waitForElement();
		  bp.waitForElement();
		  
		  
		  endDateOption.click();
		  bp.waitForElement();
		  WebElement ele1=driver.findElement(By.xpath(endDateHeader));
		  /*Actions a3=new Actions(driver);
		  a3.moveToElement(ele1).click().perform();
		  bp.waitForElement();
		  bp.waitForElement();
		  //driver.findElement(By.xpath(endDateHeader)).click();
		  //bp.waitForElement();
		  //bp.waitForElement();
		  //driver.findElement(By.xpath(year1+eyear+year2)).click();
		  bp.waitForElement();
		 // bp.waitForElement();
		  //driver.findElement(By.xpath(month1+emonth+month2)).click();
		  bp.waitForElement();
		  //bp.waitForElement();*/
		  driver.findElement(By.xpath(day_1+eday+day_2)).click();
		  System.out.println("eday");
		  bp.waitForElement();
		  return true;
		 }
 
     catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
}  
 
 

public boolean enterCustomFieldInRequirementPage(String text,String longText,String number,String checkBox,String pickupList,String date) throws Exception
{
	
	
	try
	{
		bp=new BasePage();
		 bp.waitForElement();
		
		customFieldHeading.click();
		System.out.println("Custom Field heading clicked");//h5[text()='Custom Fields']
	
	 bp.waitForElement();
	if(text!="")
	{
		 bp.eraseText(customReqText);
		 Actions a1=new Actions(driver);
	     a1.sendKeys(text).sendKeys(Keys.TAB).perform();
	     bp.waitForElement();
	}
  bp.waitForElement();
	if(longText!="")
	{
		bp.eraseText(customReqLongText);
		 Actions a1=new Actions(driver);
	      a1.sendKeys(longText).sendKeys(Keys.TAB).perform();
	      bp.waitForElement();
		//longTextField.sendKeys(longText);
	}
  bp.waitForElement();
	if(number!="")
	{
		bp.eraseText(customReqNumber);
		 Actions a1=new Actions(driver);
	      a1.sendKeys(number).sendKeys(Keys.TAB).perform();
	      bp.waitForElement();
	   //numberField.sendKeys(number);
	}
    bp.waitForElement();
	if(checkBox!="")
	{
		
		 Actions a1=new Actions(driver);
		 a1.moveToElement(customReqCheckbox).click().perform();
		  bp.waitForElement();
	}
  bp.waitForElement();
	if(pickupList!="")
	{
		  Actions a1=new Actions(driver);
	   a1.moveToElement(customReqPicklist).click().pause(1200).sendKeys(pickupList).sendKeys(Keys.ENTER).perform();
	   bp.waitForElement();
		//pickuplistField.sendKeys(pickupList);
	}
	bp.waitForElement();
  if(date!="")
   {
	  CustomReqDateField.click();
	  String a="(//span[text()='";
	  String b="'])[1]";
	  String dateNum=a+date+b;
	  driver.findElement(By.xpath(dateNum)).click();  
	  bp.waitForElement();
   }
 
//  
	return true;
	
	}
 
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	

}



public boolean clickOnCustomFieldHeader() throws Exception
{
	try
	{
	bp=new BasePage();
	bp.waitForElement();
   customFieldHeading.click();
  bp.waitForElement();
System.out.println("Custom Field heading clicked");//h5[text()='Custom Fields']);
  
  return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}
 
 
public boolean selectTestCasesPerPage(String pageNumber) throws Exception 
{
	try
	{
	BasePage bp=new BasePage();
	bp.waitForElement();
	String releasename3=pagenumber1+pageNumber+pagenumber2;
	bp.explicitWait(clickOnOptions);
	clickOnOptions.click();
	bp.waitForElement();
	String testCaseNo=driver.findElement(By.xpath(releasename3)).getText();
	//WebElement ele=driver.findElement(By.xpath("//*[@id='pagination-page-size-req']"));
	//bp.explicitWait(ele);
	Select s1=new Select(clickOnOptions);
	

	
	if(pageNumber.equals(testCaseNo))
	{
	   s1.selectByVisibleText(pageNumber);
	}
	
	

	 System.out.println("Pass - click on'"+pageNumber+"' Successfull");
	 bp.waitForElement();
	
	
    
    return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
    
}	

public boolean selectPageNumbers(int pageNo) throws Exception
{
	try
	{
		bp=new BasePage();
		bp.waitForElement();
		WebElement ele=driver.findElement(By.xpath(clickOnPages1+pageNo+clickOnPages2));
		bp.explicitWait(ele);
		ele.click();
		bp.waitForElement();
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean chooseImportType1(String importType)throws Exception
{
	   try
	   {
		   bp=new BasePage();
		   bp.waitForElement();
		   import_Requirement.click();
		   System.out.println("clicked on Import");
		   bp.waitForElement();
			String s3=importtype1+importType+importtype2;
			System.out.println(s3);
			driver.findElement(By.xpath(s3)).click();
			bp.waitForElement();
			System.out.println("Import type "+importType+"selected sucessfully");
			return true;
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   throw e;
	   }
}

public boolean copyNode() throws Exception
{
	try
	{
		bp=new BasePage();
		bp.waitTillElementIsVisible(options);
		options.click();
		System.out.println("pass-clicked on options");
		bp.waitTillElementIsVisible(copyNode);
		copyNode.click();
		System.out.println("Pass-selected Copy Option");
	return true;
	}
	catch(Exception e)
	{
		System.out.println("Node is not Copied");
		e.printStackTrace();
		throw e;
	}
}

public boolean moveNode() throws Exception
{
	try
	{
		bp=new BasePage();
		bp.waitTillElementIsVisible(options);
		options.click();
		System.out.println("pass-clicked on options");
		bp.waitTillElementIsVisible(moveNode);
		moveNode.click();
		System.out.println("Pass-selected Move Option");
	return true;
	}
	catch(Exception e)
	{
		System.out.println("Failed to select move Option");
		e.printStackTrace();
		throw e;
	}
}

public boolean pasteNode() throws Exception
{
	try
	{
		bp=new BasePage();
		bp.waitTillElementIsVisible(options);
		options.click();
		System.out.println("pass-clicked on options");
		bp.waitTillElementIsVisible(pasteNode);
		pasteNode.click();
		System.out.println("Pass-selected Move Option");
	return true;
	}
	catch(Exception e)
	{
		System.out.println("Node is not Pasted");
		e.printStackTrace();
		throw e;
	}
}

public boolean advancedSearch() throws Exception{
	try
	{
//		bp=new BasePage();
//        bp.waitForElement();
//        
//        bp.explicitWait(advancedSearch);
//        
//		advancedSearch.click();
//		System.out.println("Pass-Successfully clicked on advanced search");
		return true;
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean advancedSearch1() throws Exception{
	try
	{
		bp=new BasePage();
        bp.waitForElement();
        bp.explicitWait(advancedSearch);
		advancedSearch.click();
		bp.waitForElement();
		System.out.println("Pass-Successfully clicked on advanced search");
		return true;
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}


public boolean quickSearch() throws Exception
{
try
{
 bp=new BasePage();
 WebDriverWait wait2 = new WebDriverWait(driver, 200);
 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(".//span[text()='Quick']")));
 //bp.explicitWait(quickSearch);
 quickSearch.click();
 bp.waitForElement();
 System.out.println("Pass-Successfully clicked on Quick search button");
}
 catch(Exception e)
   {
     System.out.println("not clicked on Quick search button");
    throw e;
 //return false;
   }
return true;

}

//public boolean quickSearch() throws Exception
//{
//try
//{
// bp=new BasePage();
// bp.explicitWait(quickSearch);
// quickSearch.click();
// bp.waitForElement();
// System.out.println("Pass-Successfully clicked on Quick search button");
//}
// catch(Exception e)
//   {
//     System.out.println("not clicked on Quick search button");
//    throw e;
// //return false;
//   }
//return true;
//
//}


public boolean searchAndAdd(String searchOption) throws Exception
{
	try
	{
	bp=new BasePage();
	bp.explicitWait(advancedSearch);
	advancedSearch.click();
	System.out.println("Pass-Successfully clicked on Advanced search");
	WebDriverWait wait2=new WebDriverWait(driver, AutomationConstants.EXPLICIT);
	wait2.until(ExpectedConditions.elementToBeClickable(advancedSearch));
	bp.explicitWait(enterZql);
	enterZql.sendKeys(searchOption);
	System.out.println("Pass - searchOption'" + searchOption + "' entered Successfull");
	bp.waitForElement();
	bp.explicitWait(clickOnGo);
	clickOnGo.click();
	System.out.println("Pass - Successfully clicked on go option");
	bp.waitForElement();
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
}



public boolean cancelRequirementDetails(String altID,String link) throws Exception
{
 
 try
{
bp=new BasePage();
bp.waitForElement();
if(altID!="")
{
bp.eraseText(requirementAltID);
Actions a1=new Actions(driver);
a1.sendKeys(altID).build().perform();
 bp.waitForElement();
Cancel.click();
}
bp.waitForElement();
if(link!="")
{
bp.eraseText(requirementLink);
Actions a1=new Actions(driver);
a1.sendKeys(link).build().perform();
bp=new BasePage();
bp.waitForElement();
Cancel.click();
}
bp.waitForElement();
return true;
}
catch(Exception e)
{
e.printStackTrace();
throw e;
}
}

public String ValidaterequirementGridSize() throws Exception
{
	try
	{
		WebElement ele1=driver.findElement(By.xpath("//test-requirements-component/div[1]//div/div[3]/i/.."));
		String width=ele1.getAttribute("style");
		//System.out.println("Current width-"+width);
		String[] res=width.split(" ");
		for(int i=0;i<=res.length-1;i++)
			{
			//System.out.println(i+"-"+res[i]);
		 }
		String size=res[1].substring(0, 3);
		System.out.println("Current Width:-"+size);	
		return size;

//		String source=driver.findElement(By.xpath("")).getText();
//		WebElement src=driver.findElement(By.xpath("//test-requirements-component/div[1]//div/div[3]/i"));
//		//text.startsWith
//		String val=src.getAttribute("style");
//	     System.out.println(val);
//		bp.dragAndDrop(src, 20, 30);
//		String valWidth=ele1.getAttribute("style");
//		System.out.println("After changing width-"+valWidth);
//		String[] res1=valWidth.split(" ");
//		for(int i=0;i<=res1.length-1;i++)
//			{
//			System.out.println(i+"-"+res1[i]);
//		 }
//		String exact=res1[1].substring(0, 3);
//		System.out.println("after change :- "+exact);
//		
////		String val1=src.getAttribute("style");
//		String[] res2=val1.split(" ");
//		for(int i=0;i<=res2.length-1;i++)
//		{
//		System.out.println(i+"-"+res2[i]);
//		}	
		
	}
	catch(Exception e)
	{
		System.out.println("Node is not Allocated");
		e.printStackTrace();
		throw e;
	}
	
	
	}

public boolean resetRequirementGrid() throws Exception
{
	try
	{
		resetRequirementGrid.click();
		bp.waitForElement();
		System.out.println("Pass- clicked on Reset Button");
		clickResetYes.click();
		bp.waitForElement();
		return true;
	}
	catch(Exception e)
	{
		System.out.println("Node is not Allocated");
		e.printStackTrace();
		throw e;
	}
}



public boolean selectAllRequirementsFormGrid() throws Exception
{
 try
 {
  bp=new BasePage();
  bp.waitForElement();
  bp.explicitWait(selectAllRequirements);
  Actions a1=new Actions(driver);
  a1.moveToElement(selectAllRequirements).click().perform();
  System.out.println("All Requirements are selected successfully from grid");
  
  bp.waitForElement();
  //selectAll.click();
  return true;
 }
 
 catch(Exception e)
    {
  System.out.println("Requirements are not selected");
  e.printStackTrace();
  throw e;
}

}





public boolean clickOnRelease(String releaseName) throws Exception
{
	try
	{
		bp=new BasePage();
		String releasename3=releasename1+releaseName+releasename2;
		driver.findElement(By.xpath(releasename3)).click();
		bp.waitForElement();
		//System.out.println("Pass - double click on'"+releaseName+"' Successfull");
		log.info("Pass - double click on'"+releaseName+"' Successfull");
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
}


public boolean validateSearchedDefect(String defectType,String defectValue) throws Exception{
    
	  try
	  {
	   bp=new BasePage();
	   String lastResult=searchCount.getText();
	   
	   int remainder=(Integer.parseInt(lastResult))%50;
	   int lastPage=0;
	   if(remainder>0)
	   {
	    lastPage=(Integer.parseInt(lastResult))/50+1;
	   }
	   else
	   {
	   lastPage=(Integer.parseInt(lastResult))/50; 
	   }
	   int no=0;
	   //3-IssueType,4-summary,5-priority,6-Status,7-TestCycles,8-Testcases,9-components,10-version,11-fix version,12-Assignee,13-filed By
	   String t1="//*[@id='grid-table-IMPORT_JIRA']/div[2]/div[";
	   String t2="]/div[";
	   String t3="]/div/div";
	   
	   if(defectType.equals("Project"))
	   {
	    no=3;
	   }
	   else if(defectType.equals("Status"))
	   {
	    no=4;
	   }
	   else if(defectType.equals("Summary"))
	   {
	    no=5;
	   }
	   else if(defectType.equals("Assigned To"))
	   {
	    no=7;
	   }
	   else if(defectType.equals("Priority"))
	   {
	    no=8;
	   }
	   
	   for(int i=1;i<=lastPage;i++)
	   {
	    
	   if(i<lastPage)
	   {
	      for(int j=1;j<=50;j++)  
	      {
	     WebElement defect_Value=driver.findElement(By.xpath(t1+j+t2+no+t3));  
	     String text=defect_Value.getText();
	     if(!defectType.equals("Version")||!defectType.equals("Component"))
	     {
	     
	            if(text.equals(defectValue))
	            {
	            System.out.println("Pass-Defect Value successfully validated");
	            }
	     }
	        else
	        {    
	       if(text.contains(defectValue))
	      {
	         System.out.println("Pass-Defect Value successfully validated");
	        }
	   }
	   }
	      
	      nextButton.click();
	    for(int k=1;k<10;k++)
	    {
	    bp.waitForElement();
	    }
	   } 
	    else if(i==lastPage)
	   {
	      for(int j=1;j<=remainder;j++)  
	       {
	     WebElement defect_Value=driver.findElement(By.xpath(t1+j+t2+no+t3));  
	     String text=defect_Value.getText();
	         if(!defectType.equals("Version")||!defectType.equals("Component"))
	        {
	     
	               if(text.equals(defectValue))
	                {
	                  System.out.println("Pass-Defect Value successfully validated");
	                 }
	        }
	           else
	              {    
	             if(text.contains(defectValue))
	             {
	               System.out.println("Pass-Defect Value successfully validated");
	             }
	         }
	   }
	   
	      }
	   }
	   
	return true;
	   
	  }
	 catch(Exception e)
	 {
	  e.printStackTrace();
	  throw e;
	 }
	}

public boolean clickOnCancelJiraSearchWindow() throws Exception
{
	try
	{
		bp=new BasePage();
		bp.waitForElement();
		bp.explicitWait(jiraCancelButton);
		jiraCancelButton.click();
		System.out.println("Pass-Jira cancel button is clicked successfully");
		bp.waitForElement();
		return true;
	}
	catch(Exception e)
	 {
	  e.printStackTrace();
	  throw e;
	 }
}


public boolean clickOnJiraSearchButton() throws Exception
{
	try
	{
		bp=new BasePage();
		bp.explicitWait(clickjiraSearchButton);
		clickjiraSearchButton.click();
		System.out.println("Pass-Jira search button is clicked successfully");
		bp.waitForElement();
		return true;
	}
	catch(Exception e)
	 {
	  e.printStackTrace();
	  throw e;
	 }
}

public boolean dtsLoginDetail(String Username,String Password,String ReenterPassword) throws Exception
{
	try
	{
	bp=new BasePage();
    bp.explicitWait(clickOnResetUser);
	clickOnResetUser.click();
	 bp.waitForElement();
	bp.eraseText(username);
	//username.click();
	bp.waitForElement();
	username.sendKeys(Username);
	bp.explicitWait(password);
	password.click();
	bp.waitForElement();
	password.sendKeys(Password);
	bp.waitForElement();
	//reEnterPassword.click();
	bp.waitForElement();
	reEnterPassword.sendKeys(ReenterPassword);
	bp.waitForElement();
	bp.explicitWait(update);
	update.click();
	//updateUser.click();
////	boolean res=updateUser.isDisplayed();
//	if(res==true)
//	{
//		bp.explicitWait(updateUser);
//		updateUser.click();
//	}
	//bp.waitForElement();
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}


}