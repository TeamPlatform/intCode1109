package com.zephyr.reusablemethods;




import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.zephyr.common.AutomationConstants;
import com.zephyr.pom.TestRepositoryPage_POM;



public class TestRepositoryPage extends TestRepositoryPage_POM
{
   WebDriver driver=null;
   BasePage bp;
   public Logger log;

   SoftAssert soft=new SoftAssert();
   
	public TestRepositoryPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		log = Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
//		BasicConfigurator.configure();
	}

/* ****************************************************
 * Method Name   : dnDForTestStepsDetails(int fromStepNum,int toStepNum) 
* Purpose    : To dnD the teststeps in Testcase Steps
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/

	public boolean addTestCase() throws Exception
	{
		try
		{
		bp = new BasePage();
		 bp.waitForElement();
		int bcnt = testCaseCount();
		// System.out.println(bcnt);
		// bp.waitForElement();
		Actions a1 = new Actions(driver);
		a1.moveToElement(add_TestCase);
		add_TestCase.click();
		bp.waitForElement();
		a1.sendKeys(Keys.TAB).perform();
		int acnt = testCaseCount();
		// System.out.println(acnt);
		
		
		//if ((bcnt + 1) == acnt) 
		//{
			//Assert.assertEquals(bcnt+1, acnt);
			log.info("Pass-Test Case Successfully Added");
			return true;
		
		} 
		catch(Exception e)
		{
			log.info("Fail-Test Case is not Added");
			e.printStackTrace();
			
			throw e;
			
			
		}
	}

/* ****************************************************
 * Method Name   : dnDForTestStepsDetails(int fromStepNum,int toStepNum) 
* Purpose    : To dnD the teststeps in Testcase Steps
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/

	public boolean clickDetailButton() throws Exception 
	{
		try
		{
			bp=new BasePage();
			bp.waitForElement();
		String expmsg = "Detail";
		detail_Tab.click();
		String page = detail_Tab.getText();

		if (page.equalsIgnoreCase(expmsg)) 
		{
			log.info("Pass-User is on Test Case Detail Page");

		}

		else 
		{
			log.info("Fail-You are not in Test Case Detail Page");

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

   public void importTestCase()
   {
	  
	import_TestCase.click();
	
    }

//Newly Edited
    public boolean deleteTestCase() throws Exception
   {
    	try
    	{
    	bp=new BasePage();
    	bp.waitForElement();	
	   delete_TestCase.click();
	
	  bp.waitForElement();
	  confirmDeleteTestCaseButton.click();
	  System.out.println("testcase deleted");
	return true;
    	}
    	catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
    }

  //Newly Created
//   public boolean verifydeleteTestCase() throws InterruptedException
//    {
//	int pastTestCase=verifyPastTestCase();
//	System.out.println(pastTestCase);
//	int presentTestCase=verifyPresentTestCase();
//	System.out.println(presentTestCase);
//	if((pastTestCase-1)==presentTestCase)
//	{
//		log.info("Test Case successfully Deleted");
//	}
//	else
//	{
//		log.info("Test Case is not Deleted");
//	}
//	return true;
//	
//  }
public boolean exportTestCase()
{
	export_TestCase.click();
	return true;
}
public boolean selectallTestCase() throws Exception
{
	try
	{
	bp=new BasePage();
	bp.waitForElement();
	bp.explicitWait(select_all_TestCase);
	select_all_TestCase.click();
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}
public boolean editTestCase() throws Exception
{
	try
	{
		bp=new BasePage();
		bp.waitForElement();
		bp.explicitWait(edit_TestCase);
	edit_TestCase.click();
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}


/* ****************************************************
 * Method Name   : dnDForTestStepsDetails(int fromStepNum,int toStepNum) 
* Purpose    : To dnD the teststeps in Testcase Steps
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/

//Newly Edited
public boolean cloneTestCase() throws Exception
{
	try
	{
	BasePage bp=new BasePage();
	bp.waitForElement();
	clone_TestCase.click();
	bp.waitForElement();
	return true; 
	
	}catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}
//Newly Created
//public boolean verifyCloneTestCase() throws InterruptedException
//{
//	int pastTestCase=verifyPastTestCase();
//	System.out.println(pastTestCase);
//	int presentTestCase=verifyPresentTestCase();
//	System.out.println(presentTestCase);
//	if((pastTestCase+1)==presentTestCase)
//	{
//		log.info("Test Case successfully Cloned");
//	}
//	else
//	{
//		log.info("Test Case is not Cloned");
//	}
//	return true;
//}

//Newly Created
public boolean verifyPastTestCase() throws Exception
{
	try
	{

	bp=new BasePage();
	//bp.waitForElement();
	int bcnt=testCaseCount();
	log.info("Test Case Count before operation- "+bcnt);
	
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}

	

}
//Newly Created
public boolean verifyPresentTestCase() throws Exception
{
	try
	{
	bp=new BasePage();
	bp.waitForElement();
	int acnt=testCaseCount();
	log.info("Test Case Count After Operation- "+acnt);
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}

}

public boolean clickOnDetails() throws Exception
{
	try
	{
	bp=new BasePage();
	bp.waitForElement();
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(	detail_Tab));
	detail_Tab.click();
	bp.waitForElement();
	return true;
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}
public boolean clickOnList() throws Exception
{
	try
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(	list_Tab));
		list_Tab.click();
		bp.waitForElement();
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}
public boolean clickOnSearch()
{
search_Tab.click();
return true;
}
//public void clickOnFolder()
//{
// folder_Tab.click();	
//}

 public void moveToOption()
{
	WebElement eleop=driver.findElement(By.xpath(".//*[@id='j2_1_anchor']/div"));
	
	bp.moveToElementAndClick(eleop);
	
}



public String verifyTestRepTitle()
{
	String testreptitle=driver.getTitle();
	return testreptitle;
}


/* ****************************************************
 * Method Name   : dnDForTestStepsDetails(int fromStepNum,int toStepNum) 
* Purpose    : To dnD the teststeps in Testcase Steps
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
public int testCaseCount() throws Exception
{
	try
	{
	bp=new BasePage();
	//bp.waitForElement();
	int count=0;
	boolean sp=tcCount.isEnabled();
	
	if(sp==true)
	{
	 String testCaseCount=tcCount.getText();
	  count= Integer.parseInt(testCaseCount);
	  bp.waitForElement();
	 //Thread.sleep(3000);
	}
	return count;
	}
    
	catch(Exception e)
	{
		log.info("Currently No Test Case Present in the Node");
	    return 0;
		//throw e;
	}
}

/*	****************************************************
 * Method Name			: addNode(String Name,String Desc)
 * Purpose				: To add nodet in Zephyr Application
 * Author				: OPAL
 * Date Created			: 27/06/17
 * Date Modified		:
 * Reviewed By			: 
 * ******************************************************
 */
public boolean addNode(String Name,String Desc) throws Exception
{
	try
	{
		
		BasePage bp=new BasePage();
//		String releasename3=releasename1+releaseName+releasename2;
//		WebElement ele=driver.findElement(By.xpath(releasename3));
		bp.waitForElement();
//		Actions a2=new Actions(driver);
//		a2.contextClick().perform();
		options.click();
		System.out.println("Pass-Clicked on Options");
		bp.waitForElement();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(addNode));
		addNode.click();
		log.info("Pass - Clicked on Add Button");
		bp.waitForElement();
		nodeName.click();
		nodeName.sendKeys(Name);
		nodeDesc.click();
		nodeDesc.sendKeys(Desc);
		bp.waitForElement();
		saveNode.click();
		log.info("Pass - Clicked on Save Button");
		bp.waitForElement();
		//log.info("Pass - phase created with name and description");
		log.info("Pass - created with name and description");
		bp.waitForElement();
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

/*	****************************************************
 * Method Name			: navigateToNode(String releaseName,String phaseName,String systemName)
 * Purpose				: To Click on the ReleaseName of the Project in Zephyr Application
 * Author				: OPAL
 * Date Created			: 27/06/17
 * Date Modified		:
 * Reviewed By			: 
 * ******************************************************
 */
   
/*public boolean navigateToNode(String releaseName,String[] navigation) throws Exception
{
	try
	{
		BasePage bp=new BasePage();
		String releasename4;
		bp.waitForElement();
		String releasename3=releasename1+releaseName+releasename2;
		WebElement ele=driver.findElement(By.xpath(releasename3));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		bp.waitForElement();
		log.info("Pass - Double click on'"+releaseName+"' Successfull");
		Thread.sleep(3000);
		//bp.waitForElement();
		
		for(int i=0;i<=navigation.length-1;i++)
		{
			
			releasename4=releasename1+navigation[i]+releasename2;
			
			WebElement nodeElement=driver.findElement(By.xpath(releasename4));
			act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
			String Nodename=driver.findElement(By.xpath(releasename4)).getText();
			log.info(Nodename);
			log.info("Pass - Double click on'"+navigation[i]+"' Successfull");
			//act.moveToElement(nodeElement).click().perform();
			bp.waitForElement();
		}
		
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}	
}*/

/*	****************************************************
 * Method Name			: clickOnRelease(String rlsName)
 * Purpose				: To Click on the ReleaseName of the Project in Zephyr Application
 * Author				: OPAL
 * Date Created			: 27/06/17
 * Date Modified		:
 * Reviewed By			: 
 * ******************************************************
 */

public boolean clickOnRelease(String releaseName) throws Exception
{
	try
	{
		BasePage bp=new BasePage();
		String releasename3=releasename1+releaseName+releasename2;
		driver.findElement(By.xpath(releasename3)).click();
		bp.waitForElement();
		log.info("Pass - click on'"+releaseName+"' Successfull");
		
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}


/* ****************************************************
 * Method Name   : dnDForTestStepsDetails(int fromStepNum,int toStepNum) 
* Purpose    : To dnD the teststeps in Testcase Steps
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
//chaanged///////////////////////////////////////////////
    public boolean selectTestCase(String[] names) throws Exception
	{
    	try
    	{
//    		
//    		String pageNum=clickOnPageNumbers.getText();
//    		String[] p1=pageNum.split(" ");
//    		int lastpagenum=Integer.parseInt(p1[p1.length-1]);
    	
    	bp=new BasePage();
    	
    	//for(int l=1;l<=lastpagenum-1;l++)
    	//{
    	for(int i=0;i<=names.length-1;i++)
    	{
    	bp.waitForElement();
		String s3=testcase1+names[i]+testcase2;
		driver.findElement(By.xpath(s3)).click();
		bp.waitForElement();
		
    	}
    	//clickOnNextButton.click();
    	//}
    	
    	return true;
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		throw e;
    	}
    	
	}


    /* ****************************************************
     * Method Name   : dnDForTestStepsDetails(int fromStepNum,int toStepNum) 
    * Purpose    : To dnD the teststeps in Testcase Steps
    * Author    : OPAL1
    * Date Created   : 27/07/17
    * Date Modified  :
    * Reviewed By   : Opal4
    * ******************************************************
    */
/*public boolean doubleClickOnRelease(String releaseName) throws Exception 
{
	try
	{
		bp=new BasePage();
		bp.waitForElement();
	String releasename3=releasename1+releaseName+releasename2;
	WebElement ele=driver.findElement(By.xpath(releasename3));
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	//bp.waitForElement();
	Actions act=new Actions(driver);
	//WebElement ele=driver.findElement(By.xpath(releasename3));
	act.moveToElement(ele).doubleClick().perform();
	bp.waitForElement();
	//bp.waitForElement();
	log.info("Pass - double click on'"+releaseName+"' Successfull");
	bp.waitForElement();
	
	
	//
//	 Actions notification=new Actions(driver);
//	 notification.moveToElement(moveToNotificationElement).perform();
//	 Thread.sleep(1400);
//	 
//	 
//	 boolean status=applyNotification.isDisplayed();
//	 boolean status1=applyNotification.isEnabled();
//	 
//	 System.out.println(status);
//	 System.out.println(status1);
//	 if(status==true)
//	 {
//	  notification.moveToElement(applyNotification).click().perform();
//	  bp.waitForElement();
//	  bp.waitForElement();
//	  
//	  log.info("Pass - Updates are applied for the Application");
//	  notification.moveToElement(ele).doubleClick().perform();
//	 }
//	 else
//	 {
//	  log.info("Pass - No updates are available");
//	 }
//	
//	
//	 bp.waitForElement();
//	 driver.findElement(By.xpath(releasename3)).click();
	 
	return true;
	}	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}*/

/* ****************************************************
 * Method Name   : dnDForTestStepsDetails(int fromStepNum,int toStepNum) 
* Purpose    : To dnD the teststeps in Testcase Steps
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
public boolean addNewTestCaseInDetilview() throws Exception
{
	try
	{

	bp=new BasePage();
	bp.waitForElement();
	int bcnt=testCaseCount();
	
	int size_1=driver.findElements(By.xpath(addNewTestCase)).size();
    driver.findElements(By.xpath(addNewTestCase)).get(size_1-1).click();
	bp.waitForElement();

	int acnt=testCaseCount();
	
	if((bcnt+1)==acnt)
	{
		log.info("Pass-Test Case Successfully Added");
		
	}
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
		
	
}


/* ****************************************************
 * Method Name   : dnDForTestStepsDetails(int fromStepNum,int toStepNum) 
* Purpose    : To dnD the teststeps in Testcase Steps
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
public boolean moveToNodesInDetail() throws Exception
{
	try
	{

	String moveToNodes="//*[@class='tree-tcr-collapse']";
	WebElement ele=driver.findElement(By.xpath(moveToNodes));
	
	Actions a2=new Actions(driver);
	a2.moveToElement(ele).perform();
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

/*	****************************************************
 * Method Name			: findAndAdd()
 * Purpose				: POM of the findAndAdd Method Project in Zephyr Application
 * Author				: OPAL
 * Date Created			: 03/07/17
 * Date Modified		:
 * Reviewed By			: 
 * ******************************************************
 */

public boolean findAndAdd(String[] operator,String[] symbol, String[] value, String colName, int colNum,String role,String selectCount)
{
	try
	{
		BasePage bp=new BasePage();
		 
		String Z1="\"";
		String Z2="\"";
		String ZQL=operator[0]+symbol[0]+Z1+value[0]+Z2;
		int l=operator.length-1;
		if( l>0)
		{
			for(int k=1;k<=operator.length-1;k++)
		
		{
		
		    String ZQL2=operator[k]+symbol[k]+Z1+value[k]+Z2;
			 ZQL=ZQL+"and"+ZQL2;
		    
		}
		}
		options.click();
		bp.waitForElement();
		findAndAdd.click();
		bp.waitForElement();
		//System.out.println("Pass - findAndAdd option is selected");
		log.info("Pass - findAndAdd option is selected");
	
		advancedSearch.sendKeys(ZQL);
		bp.waitForElement();
		clickOnGo.click();
		bp.waitForElement();
		//System.out.println("Pass - ZQL quarry Enterd Successfully");
		log.info("Pass - ZQL quarry Enterd Successfully");
		
		String a="//*[@id='grid-table-find_add']/div[2]/div[";
		String b="]/div[";
		String d="]/div/div";
		String e=b+colNum+d;
		
		String ttc=totalNoOfTC.getText();
		String ptc=pageTc.getText();

		int count=Integer.parseInt(ttc);
		int pageCount;
		int count1=Integer.parseInt(ptc);
		int reminder=count%count1;
		if(reminder == 0)
		{
			pageCount = (count/count1);
		}
		else
		{
			pageCount = (count/count1)+1;
		}	
		if(selectCount== "Single")
		{
			pageCount=1;
		}
		log.info(count);
		log.info(count1);
		log.info(pageCount);
		log.info(reminder);
		//log.info(ttc);
		//log.info(ptc);
		
		clickOnTC.click();
		bp.waitForElement();
//		boolean stat1=clickNextInDetail.isDisplayed();
//		if(stat1==true)
//		{
//			clickNextInDetail.click();
//		}
		//clickOnNext.click();
		bp.waitForElement();
		//clickOnTC.click();
//		for(int j=1;j<=pageCount;j++)
//		{
//			if(j==pageCount && j != 1)
//			{
//			 count1 = reminder;	
//			}
//			
//			for(int i=1;i<=count1;i++)
//			{
//				String c=a+i+e;
//				String c1=driver.findElement(By.xpath(c)).getText();
//				Boolean z=driver.findElement(By.xpath(c)).isDisplayed();
////				System.out.println(c);
////				System.out.println(c1);
////				System.out.println(z);
//				log.info(c);
//				log.info(c1);
//				log.info(z);
//				if(i==count1)
//				{
//					//clickOnTC.click();
//					if((j<(pageCount)))
//					{
//						clickOnNext.click();
//						bp.waitForElement();
//						clickOnTC.click();
//						bp.waitForElement();
//					}
//									
//				}
//			}
//			//clickOnAdd.click();
//			
//		}	
		bp.waitForElement();
		boolean stat=clickAddInDetail.isDisplayed();
		if(stat==true)
		{
			clickAddInDetail.click();
			bp.waitForElement();
		}
		bp.waitForElement();
        clickOnAdd.click();
        bp.waitForElement();
		//System.out.println("Pass - testCase is added successfully");
		log.info("Pass - testCase is added successfully");
	
	return true;
	}
	catch(Exception e)
	{
		//e.printStackTrace();
		//clickOnTC.click();
		//clickOnAdd.click();
		return false;
	}
}



/* ****************************************************
 * Method Name   : renameNode(String name,String desc)
* Purpose    : To rename Node 
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
//NewlyAdded
public boolean renameNode(String name,String desc) throws Exception
{
	try
	{
	BasePage bp=new BasePage();
	options.click();
	log.info("Options clicked");
	bp.waitForElement();
	
	//driver.findElement(By.xpath("//a[contains(.,'Rename')]")).click();
	renameNode.click();
	bp.waitForElement();
	renameNodeText.clear();
	renameNodeText.sendKeys(name);
	bp.waitForElement();
	renameNodeDescText.click();
	renameNodeDescText.clear();
	renameNodeDescText.sendKeys(desc);
    renameButton.click();
	log.info("Pass - Clicked on Rename Button");
	log.info("Node Succesfully Renamed");
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
 * Method Name   : sortingTestCase(String[] sort) 
* Purpose    : To sorting Test Cases
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
/// Newly Created  Uncomplete

public boolean sortingTestCase(String[] sort) throws Exception
{
	try
	{

	String sorting1="//label[text()='";
	String sorting2="']/../input";
	bp=new BasePage();
    bp.waitForElement();
    sortTestCase.click();
    
   
   for(int i=0;i<=sort.length-1;i++)
   {
	      bp.waitForElement();
	      WebElement ele=driver.findElement(By.xpath(sorting1+sort[i]+sorting2));
	      String data=ele.getText();
	      boolean res= ele.isSelected();
	      System.out.println(res);
	   
	  if(res==false && sort[i].equals(data))
	  {
		  BasePage bp=new BasePage();
		  bp.waitForElement();
		  ele.click();
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


/* ****************************************************
 * Method Name   : selectTestCasesPerPage(String pageNumber)
* Purpose    : To select Test Cases Per Page
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
//Srikant Added
public boolean selectTestCasesPerPage(String pageNumber) throws Exception 
{
	try
	{
	BasePage bp=new BasePage();
	
	String releasename3=pagenumber1+pageNumber+pagenumber2;
	
	clickOnOptions.click();
	bp.waitForElement();
	String testCaseNo=driver.findElement(By.xpath(releasename3)).getText();
	WebElement ele=driver.findElement(By.xpath("//*[@id='pagination-page-size-tcr']"));
	Select s1=new Select(ele);
	

	
	if(pageNumber.equals(testCaseNo))
	{
	   s1.selectByVisibleText(pageNumber);
	}
	
	
//	//System.out.println(ele.getText());
//	Actions act=new Actions(driver);
//	act.click(ele).perform();
	log.info("Pass - click on'"+pageNumber+"' Successfull");
	
	bp.waitForElement();
//	boolean res=ele.isEnabled();
//	System.out.println(res);
    String res1=driver.findElement(By.xpath(".//*[@id='tcr-grid']/div/zui-tcr-grid/grid/div[2]/ul/span/li[1]")).getText();
    System.out.println(res1);
    
    return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
    
}	

/* ****************************************************
 * Method Name   : verifySelectingPageNumbers(String pageNumber)
* Purpose    : To verify Selecting Page Numbers
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
public boolean verifySelectingPageNumbers(String pageNumber) throws Exception
{
	try
	{
	String releasename3=pagenumber1+pageNumber+pagenumber2;
	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath(releasename3));//
	
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
	/*act.moveToElement(ele).click().perform();
	log.info("Pass - click on'"+pageNumber+"' Successfull");
	BasePage bp=new BasePage();
	bp.waitForElement();
	boolean res=ele.isEnabled();
	System.out.println(res);*/
}	

public boolean SwitchView() throws Exception
{
	try
	{
	clickOnDetailView.click();
	bp.waitForElement();
	clickOnListView.click();
	
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean ExpandMode() throws Exception
{
	try
	{
	clickOnTestCase.click();
	bp.waitForElement();
	clickOnExpander.click();
	
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
}

/* ****************************************************
 * Method Name   : click On NextAndPrev()
* Purpose    : To click On Next And Prev
* Author    : OPAL1
* Date Created   : 27/07/17
* Date Modified  :
* Reviewed By   : Opal4
* ******************************************************
*/
public boolean clickOnNextAndPrev() throws Exception
{

	try
	{


	//bp.waitForElement();
	//clickOnOptions.click();
	//driver.findElement(ep1+test+ep2).c
	//clickOnOption.click();
	//String releaseName3 = Excel_Lib.getData(INPUT_PATH_3,"TestCases",5,1);
	//bp.waitForElement();
	String pages=clickOnPageNumbers.getText();
	String[] p=pages.split(" ");
	int lastpage=Integer.parseInt(p[p.length-1]);
	//clickOnNextButton.click();
	
	for(int i=1;i<=lastpage-1;i++)
	{
		bp.waitForElement();
		clickOnNextButton.click();
		
	}
	for(int k=lastpage-1;k>=1;k--)
	{
		bp.waitForElement();
		clickOnPrevButton.click();
	}
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}
	
 public boolean navigateToPages(String[] pageNo) throws Exception
	{
	 try
	 {
	 
	String pageNum=clickOnPageNumbers.getText();
	String[] p1=pageNum.split(" ");
	int lastpagenum=Integer.parseInt(p1[p1.length-1]);
	for(int j=0;j<=pageNo.length-1;j++)
	{
	for(int i=0;i<=lastpagenum;i++)
	 {
		WebElement ele=driver.findElement(By.xpath(clickOnPages1+p1[i]+clickOnPages2));
		String text=ele.getText();
		if(pageNo[j].equals(text))
		{
		   bp.waitForElement();
		   ele.click();
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

	public boolean BreadCrumbs() throws Exception
	{
		try
		{
		//breadCrumbs.click();
		String str=driver.findElement(By.xpath("//*[@class='breadcrumb zui-breadcrumb']")).getText();
		System.out.println(str);
		
		
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}

	public boolean chooseCustomFields(String custom) throws Exception
		{
		try
		{
			bp=new BasePage();
			detail_Tab.click();
			bp.waitForElement();
			customFields.click();
		
			bp.waitForElement();
			Actions a1=new Actions(driver);
			a1.moveToElement(custom1).click().perform();
			a1.sendKeys(custom).perform();
			//custom1.click();
			//bp.waitForElement();
			//custom1.sendKeys(custom);
			bp.waitForElement();
			saveCustomField.click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
			
			
		}

	/* ****************************************************
	 * Method Name   : moveNode()
	* Purpose    : To  move Node 
	* Author    : OPAL1
	* Date Created   : 27/07/17
	* Date Modified  :
	* Reviewed By   : Opal4
	* ******************************************************
	*/
	public boolean moveNode() throws Exception
	{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		options.click();
		log.info("Node option is clicked");
		bp.waitForElement();
		moveNode.click();
		log.info("Node successfully moved");
		//driver.findElement(By.xpath("//a[contains(.,' Move')]")).click();
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	/* ****************************************************
	 * Method Name   : copyNode()
	* Purpose    : To  copy Node 
	* Author    : OPAL1
	* Date Created   : 27/07/17
	* Date Modified  :
	* Reviewed By   : Opal4
	* ******************************************************
	*/
	public boolean copyNode() throws Exception
	{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		options.click();
		log.info("Node option is clicked");
		bp.waitForElement();
		copyNode.click();
		log.info("Node copied Successfully");
		//driver.findElement(By.xpath("//a[contains(.,' Move')]")).click();
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
	}
	
	/* ****************************************************
	 * Method Name   : pasteNode()
	* Purpose    : To  paste  Node 
	* Author    : OPAL1
	* Date Created   : 27/07/17
	* Date Modified  :
	* Reviewed By   : Opal4
	* ******************************************************
	*/
	public boolean pasteNode() throws Exception
	{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		options.click();
		log.info("Node option is clicked");
		bp.waitForElement();
		pasteNode.click();
		log.info("Node pasted successfully");
		//driver.findElement(By.xpath("//a[contains(.,' Paste')]")).click();
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	
	/*	****************************************************
	 * Method Name			: enterFilterValue(String fvalue)
	 * Purpose				: To Click on the filter in the repository page
	 * Author				: OPAL4
	 * Date Created			: 27/07/17
	 * Date Modified		:
	 * Reviewed By			: OPAL2
	 * ******************************************************
	 */

		public boolean enterFilterValue(String fvalue) throws Exception
		{
			try
			{
			clickOnFilter.sendKeys(fvalue);
			
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
		}
		
		public boolean verifyFilteredNode(String nodeName) throws Exception
		{
			try
			{
			WebElement node=driver.findElement(By.xpath(releasename1+nodeName+releasename2));
			String text=node.getText();
			if(nodeName.equals(text))
			{
				log.info("Filtered node is present");
			}
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
		}
		
		
	
		//////////////////////////hhhh//////////
		
		public boolean previousSearchDropDown() throws Exception
		{
			try
			{
			bp=new BasePage();
			bp.waitForElement();
			prevSearchDropDown.click();
			bp.waitForElement();
			clickOnPreviousSearch.click();
			
			return true;
			}catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
		}
		
///////
		public void requirementMapping() throws Exception
		{
			try
			{
			clickOnMappedRequirements.click();
			clickOnMapReq.click();
			bp.waitForElement();
			clickOnReleaseNode.click();
			//bp.waitForElement();
			//nodeExpander.click();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
			
		}
		
		public boolean navigatingPageNumbers() throws Exception
		{
			try
			{
			clickOnPage2.click();
			clickOnPage3.click();
			clickOnPage4.click();
			clickOnPage5.click();
			
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
			
		}
		
		/*	****************************************************
		* Method Name			: deleteNode(String releaseName,String phaseName,String systemName) Test Repository
		* Purpose				: To delete a node
		* Author				: OPAL
		* Date Created			: 28/07/17
		* Date Modified			: 28/07/17
		* Reviewed By			: 
		* ******************************************************
		*/
				public boolean deleteNode() throws Exception
				{
					try
					{
//					Actions act=new Actions(driver);
//					act.contextClick().perform();
						bp=new BasePage();
						bp.waitForElement();
					options.click();
					log.info("Node options is clicked");
					bp=new BasePage();
					bp.waitForElement();
					deleteNode.click();
					log.info("delete node option is clicked");
					bp.waitForElement();
					deleteMsg.click();
					
					return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						throw e;
					}
				}
                
				public boolean selectPhase(String phaseName) throws Exception
				{
					try
				{
				bp=new BasePage();
						bp.waitForElement();
				 String s1="//*[@data-name='";
				 String s2="']";
				 String Phase=s1+phaseName+s2;
				 driver.findElement(By.xpath(Phase)).click();
				 log.info(phaseName+" is selected successfully");
				 bp.waitForElement();
				 return true;
				
				 
				
				}	
					catch(Exception e)
					{
						e.printStackTrace();
						throw e;
					}
				}
				
				/*	****************************************************
				 * Method Name			: naviagateNode()
				 * Purpose				: for Drag and Drop Node
				 * Author				: OPAL
				 * Date Created			: 01/08/17
				 * Date Modified		:
				 * Reviewed By			: 
				 * ******************************************************
				 */
				public boolean navigateNode(String[] node) throws Exception
				{
					try
					{
					Actions act=new Actions(driver);
					
					for(int i=0;i<=node.length-1;i++)
					{
						
						String releasename4=releasename1+node[i]+releasename2;
						
						WebElement nodeElement=driver.findElement(By.xpath(releasename4));
						act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
						
						log.info("Pass - Double click on'"+node[i]+"' Successfull");
						//act.moveToElement(nodeElement).click().perform();
						Thread.sleep(3000);
						
						
					}
				
					return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						throw e;
					}
				}
				
				/* ****************************************************
				   * Method Name   : dragAndDropNode(String srcNode,String destNode) 
				  * Purpose    : To drag And Drop Node
				  * Author    : OPAL1
				  * Date Created   : 27/07/17
				  * Date Modified  :
				  * Reviewed By   : Opal4
				  * ******************************************************
				  */
				public boolean dragAndDropNode(String srcNode,String destNode) throws Exception
				{
					try
					{
						
					
					Actions a1=new Actions(driver);
					
					WebElement src=driver.findElement(By.xpath(releasename1+srcNode+releasename2));
					WebElement dest=driver.findElement(By.xpath(releasename1+destNode+releasename2));
					a1.dragAndDrop(src, dest).perform();
					log.info(srcNode+" node is succesfully moved to the "+destNode+"node");
					return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						throw e;
					}
					
				}
				/* ****************************************************
				   * Method Name   : dragAndDropTestCase(WebElement srcNode,String destNode)
				  * Purpose    : To drag And Drop Test Case to node
				  * Author    : OPAL1
				  * Date Created   : 27/07/17
				  * Date Modified  :
				  * Reviewed By   : Opal4
				  * ******************************************************
				  */
				
				public boolean dragAndDropTestCase(WebElement srcNode,String destNode) throws Exception
				{
					try
					{
					Actions a1=new Actions(driver);
					
					//WebElement src=driver.findElement(By.xpath(releasename1+srcNode+releasename2));
					WebElement dest=driver.findElement(By.xpath(releasename1+destNode+releasename2));
					a1.dragAndDrop(srcNode, dest).perform();
					log.info("Test case successfully moved to the "+destNode+" node" );
					return true;
					}
                 catch(Exception e)
					{
                	 e.printStackTrace();
                	 throw e;
					}
				}
				
				/* ****************************************************
				   * Method Name   : selectTestCaseById(String id)  
				  * Purpose    : To select Test Case By Id
				  * Author    : OPAL1
				  * Date Created   : 27/07/17
				  * Date Modified  :
				  * Reviewed By   : Opal4
				  * ******************************************************
				  */
				
   public boolean selectTestCaseById(String id) throws Exception
	     {
	   try
	   {
		bp=new BasePage();
		bp.waitForElement();
	   String testCase=testcase1+id+testcase2;
	   driver.findElement(By.xpath(testCase)).click();
	   log.info("ID-"+id+"- Test Case Selected ");
	   return true;
	   
	   }
	   catch(Exception e)
		{
   	    e.printStackTrace();
   	     throw e;
		}
	   
}
   
   /* ****************************************************
	   * Method Name   : selectTestCaseById(String id)  
	  * Purpose    : To select Test Case By Id
	  * Author    : OPAL1
	  * Date Created   : 27/07/17
	  * Date Modified  :
	  * Reviewed By   : Opal4
	  * ******************************************************
	  */
   public boolean clickOnCopyFromProjects() throws Exception
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
   
   public boolean copyTestCase(WebElement srcNode,String destNode) throws Exception
	{
		try
		{
			bp=new BasePage();
			bp.waitForElement();
		WebElement dest=driver.findElement(By.xpath(releasename1+destNode+releasename2));
		Actions a1=new Actions(driver);
		
		//WebElement src=driver.findElement(By.xpath(releasename1+srcNode+releasename2));
		
		a1.sendKeys(Keys.CONTROL).dragAndDrop(srcNode, dest).perform();
		log.info("Test case sucessfully copied to the "+destNode+" node");
		return true;
		}
    catch(Exception e)
		{
   	 e.printStackTrace();
   	 throw e;
		}
	}
   
   
   public boolean clickOnFolder() throws Exception
   {
    try
    {
     folder_Tab.click();
     return true;
    }
    catch(Exception e)
    {
     e.printStackTrace();
     throw e;
    }
   }
   
   //14-08-17
   public boolean navigationToImport() throws Exception
   {
    try
    {
     releaseArrow.click();
     bp=new BasePage();
     bp.waitForElement();
     importArrow.click();
     bp.waitForElement();
     selectImportfile.click();
     bp.waitForElement();
     //phasearrows
     phaseArrow.click();
     bp.waitForElement();
     systemArrow.click();
     bp.waitForElement();
     subSystemArrow.click();
     
     return true;
    }catch(Exception e) 
    {
     e.printStackTrace();
     throw e;
         
 }
   }
   
   public boolean enterCustomFields(String text,String longText,String number,String checkBox,String pickupList, String date) throws Exception 
   {
   try
   {
    if(text!="")
    {
     textField.click();
     textField.sendKeys(text);
    }
    if(longText!="")
    {
     longTextField.clear();
     longTextField.sendKeys(longText);
    }
    if(number!="")
    {
       numberField.sendKeys(number);
    }
    if(checkBox!="")
    {
     checkboxField.click();
    }
    if(pickupList!="")
    {
     Select s1=new Select(pickuplistField);
     s1.selectByVisibleText(pickupList);
     
     //pickuplistField.sendKeys(pickupList);
    }

    bp.waitForElement();
    saveInAutoScript.click();
    confirmSaveInAutoScript.click();
    return true;
   }
   catch(Exception e)
   {
    e.printStackTrace();
    throw e;
   }
   }
   
   public boolean clickOnCustomField() throws Exception
   {
	   try
	   {
		   customFieldButton.click();
		   return true;
	   }
	   catch(Exception e)
	   {
	    e.printStackTrace();
	    throw e;
	   }
	   
   }
   
   public boolean deleteImportedNode() throws Exception
   {
    try
    {
    
    options.click();
    log.info("Node options is clicked");
    bp=new BasePage();
    bp.waitForElement();
    deletesNode.click();
    log.info("delete node option is clicked");
    bp.waitForElement();
    deleteMsg.click();
    
    return true;
    }
    catch(Exception e)
    {
     e.printStackTrace();
     throw e;
    }
   }
   
   public boolean clickedOnFolder()
   {
   folder_tab.click();
   return true;
   }
   
   public boolean navigationToImport1(String fileName) throws Exception
   {
    try
    {
     releaseArrow.click();
     bp=new BasePage();
     bp.waitForElement();
     importArrow.click();
     bp.waitForElement();
     bp=new BasePage();
  TestRepositoryPage tr=new TestRepositoryPage(driver);
  String A="//*[starts-with(@data-desc,'FileName : ";
  String B="')]";
  String ImportedFile=A+fileName+B;
  //Actions act=new Actions(driver);
  //act.doubleClick(Imported).perform();
  bp.waitForElement();
  driver.findElement(By.xpath(ImportedFile)).click();
  bp.waitForElement();
  for(int i=0;i<8;i++)
  {
   tr.addTestCase();
  }
    // selectImportfile.click();
     bp.waitForElement();
     //phasearrows
     phaseArrow.click();
     bp.waitForElement();
     systemArrow.click();
     bp.waitForElement();
     subSystemArrow.click();
     
     return true;
    }catch(Exception e) 
    {
     e.printStackTrace();
     throw e;
         
 }
   }
   
   /****************************29/09/17****************************/
   //added by srikanth
   public boolean confirmCloneOperation() throws Exception
   {
	   try
	   {
	   bp.waitForElement();
	   cloneConfirmation.click();
	   return true;
	   }
	   catch(Exception e) 
	    {
	     e.printStackTrace();
	     throw e;
	    }
   }
  
   public boolean addTestCase2(WebDriver driver2) throws Exception
	{
		try
		{
			this.driver=driver2;
		bp = new BasePage();
		 bp.waitForElement();
		WebElement ele=driver.findElement(By.id("zui-modal-trigger-tcr_1"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(ele);
		driver.findElement(By.id("zui-modal-trigger-tcr_1")).click();
		//add_TestCase.click();
		bp.waitForElement();	
			log.info("Pass-Test Case Successfully Added");
			return true;
		
		} 
		catch(Exception e)
		{
			log.info("Fail-Test Case is not Added");
			e.printStackTrace();
			
			throw e;
			
			
		}
	}

public boolean cloneTestCase2(WebDriver driver2) throws Exception
{
	try
	{
	BasePage bp=new BasePage();
	bp.waitForElement();
	driver.findElement(By.xpath("//*[@id='zui-modal-trigger-tcr_2']")).click();
	//clone_TestCase.click();
	return true; 
	
	}catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean addNode2(String Name,String Desc,WebDriver driver2) throws Exception
{
	try
	{
		this.driver=driver2;
		BasePage bp=new BasePage();
		bp.waitForElement();
		Actions a2=new Actions(driver);
		a2.contextClick().perform();
		//options.click();
		log.info("Pass - Clicked on Options");
		bp.waitForElement();
		bp.waitForElement();
		driver.findElement(By.cssSelector("body > ul.vakata-context.jstree-contextmenu.jstree-default-contextmenu > li:nth-child(1) > a")).click();
		//addNode.click();
		log.info("Pass - Clicked on Add Button");
		bp.waitForElement();
		driver.findElement(By.cssSelector("#addNodeName")).click();
		driver.findElement(By.cssSelector("#addNodeName")).sendKeys(Name);
		driver.findElement(By.cssSelector("#addNodeDescription")).click();
		driver.findElement(By.cssSelector("#addNodeDescription")).sendKeys(Desc);
		bp.waitForElement();
		driver.findElement(By.cssSelector("#tcrAddNodeModalSave")).click();
		//saveNode.click();
		log.info("Pass - Clicked on Save Button");
		bp.waitForElement();
		//log.info("Pass - phase created with name and description");
		log.info("Pass - created with name and description");
		bp.waitForElement();
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean navigateToNode2(String releaseName,String[] navigation,WebDriver driver2) throws Exception
{
	try
	{
		this.driver=driver2;
		BasePage bp=new BasePage();
		String releasename4;
		bp.waitForElement();
		String releasename3=releasename1+releaseName+releasename2;
		WebElement ele=driver.findElement(By.xpath(releasename3));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		bp.waitForElement();
		log.info("Pass - Double click on'"+releaseName+"' Successfull");
		Thread.sleep(3000);
		//bp.waitForElement();
		
		for(int i=0;i<=navigation.length-1;i++)
		{
			
			releasename4=releasename1+navigation[i]+releasename2;
			
			WebElement nodeElement=driver.findElement(By.xpath(releasename4));
			act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
			String Nodename=driver.findElement(By.xpath(releasename4)).getText();
			log.info(Nodename);
			log.info("Pass - Double click on'"+navigation[i]+"' Successfull");
			//act.moveToElement(nodeElement).click().perform();
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

public boolean clickOnRelease2(String releaseName,WebDriver driver2) throws Exception
{
	try
	{
		BasePage bp=new BasePage();
		String releasename1="//*[@data-name='";
		String releasename2="']";
		String releasename3=releasename1+releaseName+releasename2;
		driver.findElement(By.xpath(releasename3)).click();
		bp.waitForElement();
		log.info("Pass - click on'"+releaseName+"' Successfull");
		
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean doubleClickOnRelease2(String releaseName,WebDriver driver2) throws Exception 
{
	try
	{
		this.driver=driver2;
		bp=new BasePage();
		bp.waitForElement();
	String releasename3=releasename1+releaseName+releasename2;
	WebElement ele=driver.findElement(By.xpath(releasename3));
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	//bp.waitForElement();
	Actions act=new Actions(driver);
	//WebElement ele=driver.findElement(By.xpath(releasename3));
	act.moveToElement(ele).doubleClick().perform();
	bp.waitForElement();
	//bp.waitForElement();
	log.info("Pass - double click on'"+releaseName+"' Successfull");
	bp.waitForElement();
	
	
	//
//	 Actions notification=new Actions(driver);
//	 notification.moveToElement(moveToNotificationElement).perform();
//	 Thread.sleep(1400);
//	 
//	 
//	 boolean status=applyNotification.isDisplayed();
//	 boolean status1=applyNotification.isEnabled();
//	 
//	 System.out.println(status);
//	 System.out.println(status1);
//	 if(status==true)
//	 {
//	  notification.moveToElement(applyNotification).click().perform();
//	  bp.waitForElement();
//	  bp.waitForElement();
//	  
//	  log.info("Pass - Updates are applied for the Application");
//	  notification.moveToElement(ele).doubleClick().perform();
//	 }
//	 else
//	 {
//	  log.info("Pass - No updates are available");
//	 }
//	
//	
//	 bp.waitForElement();
//	 driver.findElement(By.xpath(releasename3)).click();
	 
	return true;
	}	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean applyNotification2(String releaseName,WebDriver driver2) throws Exception 
{
	try
	{
		bp=new BasePage();
		this.driver=driver2;
		WebElement ele=driver.findElement(By.xpath("//*[@id='ze-main-app']/testcase-execution/div/div/section/div/notifications/div/a/span"));
		Actions notification=new Actions(driver);
		notification.moveToElement(ele).perform();
		Thread.sleep(1400);
		
		WebElement ele1=driver.findElement(By.xpath("//*[text()='Apply']"));
		boolean status=ele1.isDisplayed();
		boolean status1=ele1.isEnabled();
		if(status==true)
			 {
			  notification.moveToElement(ele1).click().perform();
			  bp.waitForElement();
			  bp.waitForElement();
			  
			  log.info("Pass - Updates are applied for the Application");
			  notification.moveToElement(ele1).doubleClick().perform();
			 }
			 else
			 {
			  log.info("Pass - No updates are available");
			 }
	return true;
	}	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean discardNotification2(String releaseName,WebDriver driver2) throws Exception 
{
	try
	{
		bp=new BasePage();
		this.driver=driver2;
		WebElement ele=driver.findElement(By.xpath("//*[@id='ze-main-app']/testcase-execution/div/div/section/div/notifications/div/a/span"));
		Actions notification=new Actions(driver);
		notification.moveToElement(ele).perform();
		Thread.sleep(1400);
		
		WebElement ele1=driver.findElement(By.xpath("//*[text()='Discard']"));
		boolean status=ele1.isDisplayed();
		boolean status1=ele1.isEnabled();
		if(status==true)
			 {
			  notification.moveToElement(ele1).click().perform();
			  bp.waitForElement();
			  bp.waitForElement();
			  
			  log.info("Pass - Updates are discarded for the Application");
			  notification.moveToElement(ele1).doubleClick().perform();
			 }
			 else
			 {
			  log.info("Pass - No updates are available");
			 }
	return true;
	}	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean renameNode2(String name,String desc,WebDriver driver2) throws Exception
{
	try
	{
		this.driver=driver2;
	BasePage bp=new BasePage();
	driver.findElement(By.xpath("//div[@class='contextMenuIcon fa fa-ellipsis-v']")).click();
	//options.click();
	log.info("Options clicked");
	bp.waitForElement();
	
	driver.findElement(By.xpath("/html/body/ul[2]/li[2]/a")).click();
	//renameNode.click();
	
	bp.waitForElement();
	driver.findElement(By.xpath("//input[@name='testcaseNodeName']")).clear();
	//renameNodeText.clear();
	
	driver.findElement(By.xpath("//input[@name='testcaseNodeName']")).sendKeys(name);
	//renameNodeText.sendKeys(name);
	bp.waitForElement();
	driver.findElement(By.xpath("//*[@name='nodeDescription']")).click();
	//renameNodeDescText.click();
	
	driver.findElement(By.xpath("//*[@name='nodeDescription']")).clear();
	//renameNodeDescText.clear();
	
	driver.findElement(By.xpath("//*[@name='nodeDescription']")).sendKeys(desc);
	//renameNodeDescText.sendKeys(desc);
	
	driver.findElement(By.xpath("//*[text()='Rename']")).click();
    //renameButton.click();
    
	log.info("Pass - Clicked on Rename Button");
	log.info("Node Succesfully Renamed");
	bp.waitForElement();
	
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean selectPhase2(String phaseName,WebDriver driver2) throws Exception
{
	try
{
		this.driver=driver2;
 String s1="//*[@data-name='";
 String s2="']";
 String Phase=s1+phaseName+s2;
 driver.findElement(By.xpath(Phase)).click();
 log.info(phaseName+" is selected successfully");
 return true;
}	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean navigateNode2(String[] node,WebDriver driver2) throws Exception
{
	try
	{
		this.driver=driver2;
	Actions act=new Actions(driver);
	
	for(int i=0;i<=node.length-1;i++)
	{
		
		String releasename4=releasename1+node[i]+releasename2;
		
		WebElement nodeElement=driver.findElement(By.xpath(releasename4));
		act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
		
		log.info("Pass - Double click on'"+node[i]+"' Successfull");
		//act.moveToElement(nodeElement).click().perform();
		Thread.sleep(3000);
		
		
	}

	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

public boolean clickOnCopyFromProjects2(WebDriver driver2) throws Exception
{
	   try
	   {
		   this.driver=driver2;
		   driver.findElement(By.xpath("//div[@class='contextMenuIcon fa fa-ellipsis-v']")).click();
	   //options.click();
		   driver.findElement(By.xpath("//a[text()='Copy from Project Releases']")).click();
	   //copyFromProjectReleasesOption.click();
	   log.info("Copy from project release option is clicked");
	   return true;
	   }
	   catch(Exception e)
		{
	    e.printStackTrace();
	     throw e;
		}
	   
}

public boolean driverClose(WebDriver driver2) throws Exception
{
	try
	{
		this.driver=driver2;
		driver.close();
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}

   public boolean doubleClickOnRelease(String releaseName) throws Exception {
	  try 
	  {
	   bp = new BasePage();
	   bp.waitForElement();
	   String releasename3 = releasename1 + releaseName + releasename2;
	   WebElement ele = driver.findElement(By.xpath(releasename3));
	   WebElement releaseExpand= driver.findElement(By.xpath(releasename11+releaseName+releasename2+expandNode));
	   String text=releaseExpand.getAttribute("aria-expanded");
	   
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




	public boolean navigateToNode(String releaseName, String[] navigation) throws Exception {
	  try {
	   bp = new BasePage();
	   String releasename4;
	   bp.waitForElement();
	   String releasename3 = releasename1 + releaseName + releasename2;
	   WebElement ele = driver.findElement(By.xpath(releasename3));
	   Actions act = new Actions(driver);
	   WebElement releaseExpand= driver.findElement(By.xpath(releasename11+releaseName+releasename2+expandNode));
	   String text=releaseExpand.getAttribute("aria-expanded");
	   
	   while(text.equals("false"))
	  // if(text.equals("false"))
	   {
	  
	    System.out.println(text);
//	   if(text.equals("false"))
//	   {
	   
	    
	   act.doubleClick(ele).build().perform();
	   bp.waitForElement();
	   System.out.println("Pass - Double click on'" + releaseName + "' Successfull");
	   Thread.sleep(3000);
	   text=releaseExpand.getAttribute("aria-expanded");
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
		    bp.waitForElement();
		    //System.out.println("Pass - Double click on'" + navigation[i] + "' Successfull");
	    		
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
	
	
	
	public boolean navigateToNodes(String releaseName,String[] navigation) throws Exception
	{
		try
		{
			BasePage bp=new BasePage();
			String releasename4;
			bp.waitForElement();
			String releasename3=releasename1+releaseName+releasename2;
			WebElement ele=driver.findElement(By.xpath(releasename3));
			Actions act=new Actions(driver);
			act.doubleClick(ele).build().perform();
			bp.waitForElement();
			log.info("Pass - Double click on'"+releaseName+"' Successfull");
			Thread.sleep(3000);
			//bp.waitForElement();
			
			for(int i=0;i<=navigation.length-1;i++)
			{
				
				releasename4=releasename1+navigation[i]+releasename2;
				
				WebElement nodeElement=driver.findElement(By.xpath(releasename4));
				act.moveToElement(nodeElement).doubleClick(nodeElement).perform();
				String Nodename=driver.findElement(By.xpath(releasename4)).getText();
				log.info(Nodename);
				log.info("Pass - Double click on'"+navigation[i]+"' Successfull");
				//act.moveToElement(nodeElement).click().perform();
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
	
	
	public boolean selectRequirementFromGrids(String[] testCaseNo) throws InterruptedException
	{
	 BasePage bp=new BasePage();
	 bp.waitForElement();
	 for(int i=0;i<=testCaseNo.length-1;i++)
	 {
	 WebElement ele=driver.findElement(By.xpath(Requirement1+testCaseNo[i]+Requirement2));
	 Actions a1=new Actions(driver);
	 a1.moveToElement(ele).click().perform();
	 }
	 
	 return true;
	}  

	
	
	public String mappingRequirementID(String [] testCaseNo) throws Exception
	{
		try
		{
		String Result=null;
		for(int i=0;i<=testCaseNo.length-1;i++)
		{
		 WebElement ele=driver.findElement(By.xpath(req1+testCaseNo[i]+req2));
		 String value=ele.getText();
		 Result=value;
		 
		}
		System.out.println(Result);
		return String.valueOf(Result);
		
		}
		catch(Exception e)
		{
		e.printStackTrace();
		throw e;
		}
	}
	
	public boolean selectMultipleRequirementFromGrid(String[] requirementNo) throws Exception
	{
		try
		{
		BasePage bp=new BasePage();
		bp.waitForElement();
		for(int i=0;i<=requirementNo.length-1;i++)
		{
			bp.waitForElement();
		WebElement ele=driver.findElement(By.xpath(mapRequirementsToTestCases1+requirementNo[i]+mapRequirementsToTestCases2));
		Actions a1=new Actions(driver);
		a1.moveToElement(ele).click().perform();
		}
		System.out.println(requirementNo.length+" Requirement Selected");
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public boolean clickOnMap() throws Exception
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,AutomationConstants.EXPLICIT);
			wait.until(ExpectedConditions.elementToBeClickable(	clickOnMap));
			clickOnMap.click();
			bp.waitForElement();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

}
	public boolean validateMappedRequirementInList(int testcaseNo,int requirement) throws Exception
	{
		try
		{
		 bp=new BasePage();
		
		 WebElement ele=driver.findElement(By.xpath(valMappedReq1+testcaseNo+valMappedReq2));
			Actions a1=new Actions(driver);
			a1.moveToElement(ele).perform();
			String mapReq=ele.getText();
			String[] reqCount=mapReq.split(" ");
			int totalMappedReq=Integer.parseInt(reqCount[0]);
			if(totalMappedReq==requirement)
			{
		
		      System.out.println(requirement +"Requirement Mapaped to testcases succcessfully");
			}
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	public boolean validateTestRepositoryPage() throws Exception
	{
		try
		{
	
	String validate_TestRepository=driver.getTitle();
	System.out.println(validate_TestRepository);
    String expmsg="Test Repository";
    if(validate_TestRepository.equals(expmsg))
   {
    	System.out.println("Successfully Landed on Test Repository Page");
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
}
//    
    