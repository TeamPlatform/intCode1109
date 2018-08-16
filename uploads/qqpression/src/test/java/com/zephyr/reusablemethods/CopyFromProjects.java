package com.zephyr.reusablemethods;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.zephyr.pom.CopyFromProjects_POM;

public class CopyFromProjects extends CopyFromProjects_POM
{

	WebDriver driver;
	BasePage bp;
	 public Logger log;
	 
	public CopyFromProjects(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		log=Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);

	}


	public boolean dragAndDropTestCase(WebElement ele,String node) throws Exception
	{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		WebElement nodes=driver.findElement(By.xpath(localNode1+node+localNode2));
		String text=nodes.getText();
		System.out.println(text);
		Actions a1=new Actions(driver);
		a1.moveToElement(ele).clickAndHold(ele).perform();
		a1.release(nodes).perform();
		
		log.info("Test case moved to the node");
		
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		
	}
	
	public boolean dragAndDropNodes(String nodeName1,String nodeName2) throws Exception
	{
		try
		{
			bp=new BasePage();
			bp.waitForElement();
		WebElement ele1=driver.findElement(By.xpath(globalNode1+nodeName1+globalNode2));
		WebElement ele2=driver.findElement(By.xpath(localNode1+nodeName2+localNode2));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(ele1, ele2).perform();
		
		log.info("Nodes moved sucessfully");
		return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public boolean copyFromProjectReleasesOption() throws Exception
	{
		 try
		   {
			   bp=new BasePage();
			   bp.waitForElement();
		   options.click();
		   copyFromProjectReleasesOption.click();
		   log.info("Copy from project release option is clicked");
		   bp.waitForElement();
		   return true;
		   }
		   catch(Exception e)
			{
	  	    e.printStackTrace();
	  	     throw e;
			}
	}
	
	public boolean verifyCopyFromProjectPage() throws Exception
	   {
		   try
		   {
			   bp=new BasePage();
			   bp.waitForElement();
			   
			   String validateCopyFromProjectReleasesPageTitle=validateCopyFromProjectReleasesPage.getText();
			   System.out.println(validateCopyFromProjectReleasesPageTitle);
			  if(validateCopyFromProjectReleasesPageTitle.equals("Copy from Project Releases"))
			  {
				  log.info("Pass-Successfully navigated to Copy From Project Releases Page");
			  }
			  else
			  {
				  log.info("Fail-You are not navigated to Copy From Project Releases Page");
			  }
			  
			  return true;
		   }
		   catch(Exception e)
			{
	 	    e.printStackTrace();
	 	     throw e;
			}
	   }
	
	public boolean selectProjectFromGlobalArea(String projectName) throws Exception
	{
		try
		{
			bp=new BasePage();
			bp.waitForElement();
		
		Actions a2=new Actions(driver);
		a2.doubleClick(project).build().perform();
		bp.waitForElement();
		String globalProject=globalProject1+projectName+globalProject2;
		WebElement ele=driver.findElement(By.xpath(globalProject));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		
		log.info(projectName+" is selected");
		return true;
		}
		 catch(Exception e)
		{
 	    e.printStackTrace();
 	     throw e;
		}
		
	}
	
	public boolean selectNodeFromGlobalArea(String releaseName,String[] nodes) throws Exception
	{
		try
		{
			bp=new BasePage();
			bp.waitForElement();
		String globalRelease=globalNode1+releaseName+globalNode2;
		WebElement ele=driver.findElement(By.xpath(globalRelease));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		
		log.info("Pass - Double click on'"+releaseName+"' Successfull");
		bp=new BasePage();
		bp.waitForElement();
		
		
		for(int i=0;i<=nodes.length-1;i++)
		{
			bp.waitForElement();
			String allnodes=globalNode1+nodes[i]+globalNode2;
			
			WebElement nodeElement=driver.findElement(By.xpath(allnodes));
			act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
			
			log.info("Pass - Double click on'"+nodes[i]+"' Successfull");
			
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
	public boolean selectMultipleTestCaseFromGlobalNode(String[] no) throws Exception
	{
		try
		{
		for(int i=0;i<=no.length-1;i++)
		{
		bp.waitForElement();
		WebElement ele=driver.findElement(By.xpath(globalTestCase1+no[i]+globalTestCase2));
		ele.click();
		}
		
		return true;
		} 
		catch(Exception e)
		{
	 	    e.printStackTrace();
	 	     throw e;
			}
	}
	
	
	public boolean selectingNodeFromLocalArea(String releaseName,String[] nodes) throws Exception
	{
		try
		{ 
			bp=new BasePage();
			bp.waitForElement();
		String localRelease=localNode1+releaseName+localNode2;
		WebElement ele=driver.findElement(By.xpath(localRelease));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		log.info("Pass - Double click on'"+releaseName+"' Successfull");
		for(int i=0;i<=nodes.length-1;i++)
		{
			bp.waitForElement();
			String allnodes=localNode1+nodes[i]+localNode2;
			
			WebElement nodeElement=driver.findElement(By.xpath(allnodes));
			act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
			
			log.info("Pass - Double click on'"+nodes[i]+"' Successfull");
			
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
	
	public boolean testCaseCountInCopyfromProjectReleases() throws Exception
	{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		String testCase=driver.findElement(By.xpath(testCaseCount)).getText();
		System.out.println("Total Test Case present in Node-"+testCase);
		
		return true;
		}
		 catch(Exception e)
		{
 	    e.printStackTrace();
 	     throw e;
		}
	}
  public boolean closeCopyFromProjectReleasesPage() throws Exception
  {
	  try
	  {
		  bp=new BasePage();
		  bp.waitForElement();
		  bp.waitForElement();
	      closeCopyFromProjectReleasesPage.click();
	      bp.waitForElement();
	      
	  return true;
	  }
	  catch(Exception e)
		{
	    e.printStackTrace();
	     throw e;
		}
	  
  }

  public boolean selectingLocalRelease(String releaseName) throws Exception
  {
	  try
	  {
	    bp=new BasePage();
	    bp.waitForElement();
		String localRelease=localNode1+releaseName+localNode2;
		WebElement ele=driver.findElement(By.xpath(localRelease));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		
		
		return true;
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		  throw e;
	  }
  }
  
  //14-08-17
  public boolean selectNodeFromImportedArea(String[] nodes) throws Exception
  {
   bp=new BasePage();
   bp.waitForElement();
      Actions act=new Actions(driver);
    act.doubleClick(doubleClickOnImported).build().perform();
   try
   {
    
   
   bp.waitForElement();
   //bp.waitForElement();
   for(int i=0;i<=nodes.length-1;i++)
   {
    String allnodes=globalIMportedNode1+nodes[i]+globalIMportedNode2;
    
    WebElement nodeElement=driver.findElement(By.xpath(allnodes));
    
    act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
    
    
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
  
  public boolean dragAndDropNodes2(String nodeName1,String nodeName2,WebDriver driver2) throws Exception
	{
		try
		{
			this.driver=driver2;
			bp=new BasePage();
			bp.waitForElement();
			String globalNode1="//*[@class='tree-view global-tcr no-child js-global-wrapper expanded-on-hover tree-docked']//*[text()='";
			String globalNode2="']";
			String localNode1="//*[@id='zephyr-tree-localTree']/ul//*[text()='";
			String localNode2="']";
		WebElement ele1=driver.findElement(By.xpath(globalNode1+nodeName1+globalNode2));
		WebElement ele2=driver.findElement(By.xpath(localNode1+nodeName2+localNode2));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(ele1, ele2).perform();
		
		log.info("Nodes moved sucessfully");
		return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
  
  public boolean selectProjectFromGlobalArea2(String projectName,WebDriver driver2) throws Exception
	{
		try
		{
			this.driver=driver2;
			bp=new BasePage();
			String globalProject1="//a[text()='";
			String globalProject2="']";
			bp.waitForElement();
		Actions a2=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//*[@data-name='Projects']"));
		
		
		//WebElement ele1=driver.findElement(By.xpath("(//*[@data-name='Projects']//preceding-sibling::i)[1]"));
		ele1.click();
		
		a2.doubleClick(ele1).build().perform();
		bp.waitForElement();
		
		String globalProject=globalProject1+projectName+globalProject2;
		WebElement ele=driver.findElement(By.xpath(globalProject));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		
		log.info(projectName+" is selected");
		return true;
		}
		 catch(Exception e)
		{
	    e.printStackTrace();
	     throw e;
		}
		
	}
		
	
  
  public boolean selectNodeFromGlobalArea2(String releaseName,String[] nodes,WebDriver driver2) throws Exception
	{
		try
		{
			this.driver=driver2;
			bp=new BasePage();
			String globalNode1="//*[@class='tree-view global-tcr no-child js-global-wrapper expanded-on-hover tree-docked']//*[text()='";
			String globalNode2="']";
			bp.waitForElement();
		String globalRelease=globalNode1+releaseName+globalNode2;
		WebElement ele=driver.findElement(By.xpath(globalRelease));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		
		log.info("Pass - Double click on'"+releaseName+"' Successfull");
		bp=new BasePage();
		bp.waitForElement();
		//bp.waitForElement();
		
		for(int i=0;i<=nodes.length-1;i++)
		{
			bp.waitForElement();
			
			String allnodes=globalNode1+nodes[i]+globalNode2;
			
			WebElement nodeElement=driver.findElement(By.xpath(allnodes));
			
			act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
			
			log.info("Pass - Double click on'"+nodes[i]+"' Successfull");
			
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
  public boolean closeCopyFromProjectReleasesPage2(WebDriver driver2) throws Exception
  {
	  try
	  {
		  this.driver=driver2;
		  bp=new BasePage();
		  bp.waitForElement();
		  bp.waitForElement();
		  driver.findElement(By.xpath("//*[@id='zee-global-tcr-tree-modal']/div/div/div[1]/div[2]/button")).click();
	      
	      bp.waitForElement();
	      
	  return true;
	  }
	  catch(Exception e)
		{
	    e.printStackTrace();
	     throw e;
		}
	  
  }
	
}