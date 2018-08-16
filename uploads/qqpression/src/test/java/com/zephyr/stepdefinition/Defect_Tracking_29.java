package com.zephyr.stepdefinition;

import org.testng.asserts.SoftAssert;

import com.zephyr.common.LaunchBrowser;
import com.zephyr.generic.Excel_Lib;
import com.zephyr.generic.Property_Lib;
import com.zephyr.reusablemethods.BasePage;
import com.zephyr.reusablemethods.CreateTestCasePage;
import com.zephyr.reusablemethods.DashBoardPage;
import com.zephyr.reusablemethods.DefectTracking;
import com.zephyr.reusablemethods.ExecutionPage;
import com.zephyr.reusablemethods.ExportPage;
import com.zephyr.reusablemethods.LoginPage;
import com.zephyr.reusablemethods.ProjectPage;
import com.zephyr.reusablemethods.ReleasePage;
import com.zephyr.reusablemethods.RequirementsPage;
import com.zephyr.reusablemethods.TestPlanningPage;
import com.zephyr.reusablemethods.TestRepositoryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Defect_Tracking_29 extends LaunchBrowser{
	BasePage bp;
	ProjectPage pp;
	ReleasePage rp;
	TestRepositoryPage tr;
	TestPlanningPage tp;
	DashBoardPage dp;
	ExecutionPage ep;
	CreateTestCasePage ctc;
	LaunchBrowser lb;
	LoginPage lp;
	ExportPage ex;
	RequirementsPage req;
	DefectTracking dt;
    boolean[] actual=new boolean[27];
	SoftAssert soft=new SoftAssert();
	String fileName="DefectTracking_29";
   
@Given("^user is in Defecttracking page$")
public void user_is_in_Defecttracking_page() throws Throwable {
	try
    {
	   bp=new BasePage();
	   rp=new ReleasePage(driver);
	   pp=new ProjectPage(driver);
	   String projectName=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE_TPE,"Normal_Project_1");
	   String releaseName=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE_TPE,"Release_1");
	   actual[0]=pp.selectProject(projectName);
	   actual[1]=pp.selectRelease(releaseName);
	   bp.waitForElement();
	   actual[2]=pp.clickOnDefectTracking();	 
	   }
  catch(Exception e)
    {
    lb=new LaunchBrowser();	 
    lb.getScreenShot(fileName);
	e.printStackTrace();
	driver.close();
    Relogin_TPE rl=new Relogin_TPE();
    rl.reLogin();
    throw e; 
    }
} 

@When("^user serach the subtask by JiraID in advance serach$")
public void user_serach_the_subtask_by_JiraID_in_advance_serach() throws Throwable {
	try
    {
    dt=new DefectTracking(driver);		
	String selectSearch=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 33);
  	String name=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 34);  	
	actual[3]=dt.advancedSearch(selectSearch, name);
	bp.waitForElement();
    }
  catch(Exception e)
    {
    lb=new LaunchBrowser();	 
    lb.getScreenShot(fileName);
	e.printStackTrace();
	driver.close();
    Relogin_TPE rl=new Relogin_TPE();
    rl.reLogin();
    throw e; 
    }
} 


@Then("^Should be able to search by a specific Subtask number$")
public void should_be_able_to_search_by_a_specific_Subtask_number() throws Throwable {
	try
    {
    dt=new DefectTracking(driver);
    String defectValue=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 35); 
    actual[4]=dt.validateAdvancedSearch(defectValue);
    }
  catch(Exception e)
    {
    lb=new LaunchBrowser();	 
    lb.getScreenShot(fileName);
	e.printStackTrace();
	driver.close();
    Relogin_TPE rl=new Relogin_TPE();
    rl.reLogin();
    throw e; 
    }
} 



@When("^user click on Textexecution and execute testcases and create defect and search it$")
public void user_click_on_Textexecution_and_execute_testcases_and_create_defect_and_search_it() throws Throwable {
	try
	   {
       tr=new TestRepositoryPage(driver);
       rp=new ReleasePage(driver);
       tp=new TestPlanningPage(driver);
       ep=new ExecutionPage(driver); 
	   String testcase=Integer.toString(Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 1, 26));
	   String name=UNIQUE+Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 17);
	   String desc=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 18);
	   String cycle=UNIQUE+Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 19);
	   String build=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 20);
	   String environ=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 21);
	   String hide=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 22);
	   String bulk_type_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 23);
	   String phase=UNIQUE+Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 17);
	   String releaseName=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE_TPE,"Release_1");
	   String status=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 25);
	   String syear=Integer.toString(Excel_Lib.getNumberData(INPUT_PATH_6,"TestCycle", 1, 0));
	   String smonth=Excel_Lib.getData(INPUT_PATH_6,"TestCycle", 1, 1);
	   String sdate=Integer.toString(Excel_Lib.getNumberData(INPUT_PATH_6,"TestCycle", 1, 2));
	   String eyear=Integer.toString(Excel_Lib.getNumberData(INPUT_PATH_6,"TestCycle", 1, 3));
	   String emonth=Excel_Lib.getData(INPUT_PATH_6,"TestCycle", 1, 4);
	   String edate=Integer.toString(Excel_Lib.getNumberData(INPUT_PATH_6,"TestCycle", 1, 5));  
	   String selectSearch=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 33);
	   String name1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 34);  	
	   String cyclename[]=new String[1];
	   cyclename[0]=cycle;
	   String phase1[]=new String[1];
	   phase1[0]=name;
	   actual[5]=rp.clickOnTestRep();
	   bp.waitForElement();
	   actual[6]=tr.clickOnRelease(releaseName);
	   bp.waitForElement();
	   actual[7]=tr.addNode(name, desc);
	   bp.waitForElement();
	   actual[8]=tr.doubleClickOnRelease(releaseName);
	   bp.waitForElement();
	   actual[9]=tr.navigateToNode(releaseName,phase1);
	   bp.waitForElement();
	   actual[10]=tr.addTestCase();
	   actual[11]=tr.addTestCase();
	   bp.waitForElement();
	   actual[12]=rp.clickOnTestPlanning();
	   bp.waitForElement();
	   actual[13]=tp.clickOnAddTestCycleSymbol();
	   bp.waitForElement();
	   actual[14]=tp.CreateCycle(cycle, build, environ, hide);
	   bp.waitForElement();
	   actual[15]=tp.enterStartDatAndEndDate(syear, smonth, sdate, eyear, emonth, edate);
	   bp.waitForElement();
	   actual[16]=tp.saveTestCycle();
	   bp.waitForElement();
	   actual[17]=tp.navigateToCycle(cyclename);
	   bp.waitForElement();
	   actual[18]=tp.addPhaseToCycle(name);
	   bp.waitForElement();
	   actual[19]=tp.bulkAssignment(bulk_type_1);
	   bp.waitForElement();
	   tp.goBackToCycle();
	   String[] str=new String[2];
	   str[0]=cycle;
	   str[1]=phase;
	   actual[20]=rp.clickOnTestExecution();
	   bp.waitForElement();
	   actual[21]=tr.navigateToNode(releaseName, str);
	   bp.waitForElement();
	   actual[22]=ep.selectAndDeselectAllTestCase();
	   //tr.select_all_TestCase.click();
	   bp.waitForElement();
	   actual[23]=ep.changeMultiSelectedStatus(status);
	   bp.waitForElement();	
	   actual[24]=ep.clickOnDefectButton(testcase);
	   bp.waitForElement();
	   actual[25]=ep.advancedSearch2(selectSearch, name1);
	   bp.waitForElement(); 
	   }
	 catch(Exception e)
	   {
	   lb=new LaunchBrowser();		 
	   lb.getScreenShot(fileName);
	   e.printStackTrace();
	   driver.close();
	   Relogin_TPE rl=new Relogin_TPE();
	   rl.reLogin();			   
	   throw e;     
    }  
}

@Then("^should be able to search by a specific subtask number$")
public void should_be_able_to_search_by_a_specific_subtask_number() throws Throwable {
	try
    {
    dt=new DefectTracking(driver);
    String defectValue=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 35); 
    actual[26]=dt.validateAdvancedSearch(defectValue);
    bp.waitForElement();
    ep.cancelDefect.click();
	for(int k=0;k<=actual.length-1;k++)
      {
	  System.out.println("Actual["+k+"]="+actual[k]);
	  soft.assertEquals(actual[k], true);
	  }
	  soft.assertAll();
	  }
  catch(Exception e)
    {
    lb=new LaunchBrowser();	 
    lb.getScreenShot(fileName);
	e.printStackTrace();
	driver.close();
    Relogin_TPE rl=new Relogin_TPE();
    rl.reLogin();
    throw e; 
    }
} 

}

