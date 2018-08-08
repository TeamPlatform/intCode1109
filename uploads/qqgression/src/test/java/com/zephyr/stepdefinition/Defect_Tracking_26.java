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
import com.zephyr.reusablemethods.ExternalJiraPage;
import com.zephyr.reusablemethods.LoginPage;
import com.zephyr.reusablemethods.ProjectPage;
import com.zephyr.reusablemethods.ReleasePage;
import com.zephyr.reusablemethods.RequirementsPage;
import com.zephyr.reusablemethods.TestPlanningPage;
import com.zephyr.reusablemethods.TestRepositoryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Defect_Tracking_26 extends LaunchBrowser{
	BasePage bp;
	ProjectPage pp;
	ReleasePage rp;
	TestRepositoryPage tr;
	TestPlanningPage tp;
	DashBoardPage dp;
	ExecutionPage ep;
	LaunchBrowser lb;
	LoginPage lp;
	DefectTracking dt;
	CreateTestCasePage ct;
	ExternalJiraPage ejp;
	public String  defectValue2;
	boolean[] actual=new boolean[40];
	SoftAssert soft=new SoftAssert();
	String fileName="DefectTracking_26";
	
	
	@Given("^User is in DefectTracking Page$")
	public void user_is_in_DefectTracking_Page() throws Throwable {
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

	@When("^User serach the defect and attach any format file and save it then view and download the attachment$")
	public void user_serach_the_defect_and_attach_any_format_file_and_save_it_then_view_and_download_the_attachment() throws Throwable {
		 try
		    {
			dt=new DefectTracking(driver);
			ct=new CreateTestCasePage(driver);
			ejp=new ExternalJiraPage(driver);
		    String project=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 0);
		    String issuetype=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 1);
		    String summary_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 29);
		    String components=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 3);
		    String descType=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 100);
		    String desc_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 28);
		    String fixVersion=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 6);
		    String priority=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 7);
		    String assignee=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 8);
		    String labels=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 9);
		    String sprint=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 10);
		    String env=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 11);
		    String epicLink=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 12);
		    String affectsVersion=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 13);
		    String linkedIssue=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 14);
		    String username=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE_TPE,"Jira_Username");
			String password=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE_TPE,"Jira_Password");
		    String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
		    int switch_1=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 4, 1);	 	
		    String[] filePath=new String[1];
		    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 36);
		    actual[3]=dt.createDefect(project, issuetype);
		    bp.waitForElement();
		    actual[4]=dt.fileNewDefect(summary_1, components, descType, desc_1, fixVersion, priority, sprint, assignee, labels, env, epicLink, affectsVersion, linkedIssue);
		    bp.waitForElement();
		    actual[5]=dt.saveDefect();
		    bp.waitForElement();
		    bp.waitForElement();
		    bp.waitForElement();
		    actual[6]=ct.uploadAttachement(filePath);	
		    bp.waitForElement();
		    bp.waitForElement();
		    bp.waitForElement();
		    bp.waitForElement();
		    bp.waitForElement();
		    bp.waitForElement();
		    bp.waitForElement();
		    actual[7]=dt.downloadDefectAttachment(fileName);
		    bp.waitForElement();
		    bp.waitForElement();
		    bp.switchWindowTab(switch_1);
		    bp.waitForElement();
		    bp.waitForElement();
		    actual[8]=ejp.loginToExternalJira(username, password);
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


	@Then("^Should be able to Download attachment$")
	public void should_be_able_to_Download_attachment() throws Throwable {
		try
	    {
   	    String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
   	    int switch_0=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 4, 0);	 
   	    actual[9]=dt.validateDownloadAttachment(fileName);
	    bp.waitForElement();
	    driver.close();
	    bp.waitForElement();
	    bp.switchWindowTab(switch_0);
	    bp.waitForElement();
	    dt.closeDownload.click();
	    bp.waitForElement();
	    dt.closeUpdateDownload.click();
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
	@When("^User click on TestExecution and execute testcases with any status and create defect$")
	public void user_click_on_TestExecution_and_execute_testcases_with_any_status_and_create_defect() throws Throwable {
		try
		   {
	       tr=new TestRepositoryPage(driver);
	       tp=new TestPlanningPage(driver);
	       ep=new ExecutionPage(driver); 
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
		   String cyclename[]=new String[1];
		   cyclename[0]=cycle;
		   String phase1[]=new String[1];
		   phase1[0]=name;
		   actual[10]=rp.clickOnTestRep();
		   bp.waitForElement();
		   actual[11]=tr.clickOnRelease(releaseName);
		   bp.waitForElement();
		   actual[12]=tr.addNode(name, desc);
		   bp.waitForElement();
		   actual[13]=tr.doubleClickOnRelease(releaseName);
		   bp.waitForElement();
		   actual[14]=tr.navigateToNode(releaseName,phase1);
		   bp.waitForElement();
		   actual[15]=tr.addTestCase();
		   actual[16]=tr.addTestCase();
		   bp.waitForElement();
		   actual[17]=rp.clickOnTestPlanning();
		   bp.waitForElement();
		   actual[18]=tp.clickOnAddTestCycleSymbol();
		   bp.waitForElement();
		   actual[19]=tp.CreateCycle(cycle, build, environ, hide);
		   bp.waitForElement();
		   actual[20]=tp.enterStartDatAndEndDate(syear, smonth, sdate, eyear, emonth, edate);
		   bp.waitForElement();
		   actual[21]=tp.saveTestCycle();
		   bp.waitForElement();
		   actual[22]=tp.navigateToCycle(cyclename);
		   bp.waitForElement();
		   actual[23]=tp.addPhaseToCycle(name);
		   bp.waitForElement();
		   actual[24]=tp.bulkAssignment(bulk_type_1);
		   bp.waitForElement();
		   actual[25]=tp.goBackToCycle();
		   String[] str=new String[2];
		   str[0]=cycle;
		   str[1]=phase;
		   actual[26]=rp.clickOnTestExecution();
		   bp.waitForElement();
		   actual[27]=tr.navigateToNode(releaseName, str);
		   bp.waitForElement();
		   actual[28]=ep.selectAndDeselectAllTestCase();
		   bp.waitForElement();
		   actual[29]=ep.changeMultiSelectedStatus(status);
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


	@When("^User search thd defect and create subtask and attach any format file and save it and view it then download the attachment$")
	public void user_search_thd_defect_and_create_subtask_and_attach_any_format_file_and_save_it_and_view_it_then_download_the_attachment() throws Throwable {
		try
		   {
	       String issuetype_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 32);
		   String summary_1 =Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 29);
		   String components=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 3);
		   String descType=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 4);
		   String desc_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 28);
		   String fixVersion=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 6);
		   String priority=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 7);
		   String assignee=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 8);
		   String labels=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 9);
		   String sprint=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 10);
		   String env=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 11);
		   String epicLink=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 12);
		   String affectsVersion=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 13);
		   String linkedIssue=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 14);
		   String defectID=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 16);
		   String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
		   int switch_1=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 4, 1); 
		   String[] filePath=new String[1];
		   filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 36);
		   int[] defectNo=new int[1];
		   defectNo[0]=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 1, 30);
		   int testcase=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 1, 26);
		   actual[30]=ep.clickOnDefectButton(testcase);
		   bp.waitForElement();
		   actual[31]=ep.searchDefect(defectID);	
		   bp.waitForElement();
		   actual[32]=ep.clickOnSubTask();
		   bp.waitForElement();
		   actual[33]=dt.createDefectSubtask(issuetype_1);
		   bp.waitForElement();
		   actual[34]=dt.fileNewDefect(summary_1, components, descType, desc_1, fixVersion, priority, assignee, labels, sprint, env, epicLink, affectsVersion, linkedIssue);
		   bp.waitForElement();
		   bp.waitForElement();
		   actual[35]=dt.saveDefect();
		   bp.waitForElement();
		   bp.waitForElement();
		   bp.waitForElement();
		   actual[36]=ct.uploadAttachement(filePath);	
		   bp.waitForElement();
		   bp.waitForElement();
	       bp.waitForElement();
		   bp.waitForElement();
		   bp.waitForElement();
		   bp.waitForElement();
		   bp.waitForElement();
		   bp.waitForElement();
		   actual[37]=dt.downloadDefectAttachment(fileName);
		   bp.waitForElement();
		   bp.waitForElement();
		   bp.waitForElement();
		   bp.waitForElement();
		   bp.switchWindowTab(switch_1);
		   bp.waitForElement();
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

	@Then("^should be able to download attachment$")
	public void should_be_able_to_download_attachment() throws Throwable {
		try
	    {
   	    String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
   	    int switch_0=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 4, 0); 
   	    actual[38]=dt.validateDownloadAttachment(fileName);
	    driver.close();
	    bp.waitForElement();
	    bp.switchWindowTab(switch_0);
	    bp.waitForElement();
	    dt.closeDownload.click();
	    bp.waitForElement();
	    dt.updateCancelButton.click();
	    bp.waitForElement();
	    actual[39]=ep.clickOnCancelDefectWindow();
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
