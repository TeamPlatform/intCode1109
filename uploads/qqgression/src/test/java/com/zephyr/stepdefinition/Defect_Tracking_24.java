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

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Defect_Tracking_24 extends LaunchBrowser{
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
	ExternalJiraPage ejp;
	public String defectId;
	public String subtask_defectId;
	public String test_defectId;
	public String testsubtask_defectId;
	boolean[] actual=new boolean[169];
	SoftAssert soft=new SoftAssert();
	String fileName="DefectTracking_24";


  @Given("^User Is in DefectTracking Page$")
  public void user_Is_in_DefectTracking_Page() throws Throwable {
	try
    {
	   bp=new BasePage();
	   rp=new ReleasePage(driver);
	   pp=new ProjectPage(driver);
	   dt=new DefectTracking(driver);
	   ctc=new CreateTestCasePage(driver);
	   ejp=new ExternalJiraPage(driver);
	   ep=new ExecutionPage(driver);
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

@When("^User create defect and search it and update an attachment in  text format$")
public void user_create_defect_and_search_it_and_update_an_attachment_in_text_format() throws Throwable {
	try
	   {
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
	   String[] filePath=new String[1];
	   filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 36);
	   int[] defectNo=new int[1];
	   defectNo[0]=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 1, 30);
	   actual[3]=dt.createDefect(project, issuetype);
	   bp.waitForElement();
	   actual[4]=dt.fileNewDefect(summary_1, components, descType, desc_1, fixVersion, priority, sprint, assignee, labels, env, epicLink, affectsVersion, linkedIssue);
	   bp.waitForElement();
	   actual[5]=dt.saveDefect();
	   bp.waitForElement();
	   bp.waitForElement();
	   defectId=dt.retrieveDefectId();
	   bp.waitForElement();
	   actual[6]=dt.updateDefect();
	   bp.waitForElement();
	   bp.waitForElement();
	   actual[7]=dt.searchDefect(defectId);
	   bp.waitForElement();
	   actual[8]=dt.selectSingleOrMultipleDefects(defectNo);
	   bp.waitForElement();
	   dt.Edit.click();
	   bp.waitForElement();
	   actual[9]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in text format$")
public void should_be_able_to_update_a_defect_with_attachment_in_text_format() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);	
    actual[10]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[11]=ctc.verifyAttachementFile(fileName);
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

@When("^User update an attachment in excel format$")
public void user_update_an_attachment_in_excel_format() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 36);
    actual[12]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in excel format$")
public void should_be_able_to_update_a_defect_with_attachment_in_excel_format() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);	
    actual[13]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[14]=ctc.verifyAttachementFile(fileName);
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


@When("^User update an attachment in word format$")
public void user_update_an_attachment_in_word_format() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 36);
    actual[15]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in word format$")
public void should_be_able_to_update_a_defect_with_attachment_in_word_format() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
    actual[16]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[17]=ctc.verifyAttachementFile(fileName);
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

@When("^User update an attachment in image format$")
public void user_update_an_attachment_in_image_format() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 36);
    actual[18]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in image format$")
public void should_be_able_to_update_a_defect_with_attachment_in_image_format() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
    actual[19]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[20]=ctc.verifyAttachementFile(fileName);
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

@When("^User update an attachment in any other format$")
public void user_update_an_attachment_in_any_other_format() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 5, 36);
    actual[21]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in other format$")
public void should_be_able_to_update_a_defect_with_attachment_in_other_format() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 5, 41);
    actual[22]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[23]=ctc.verifyAttachementFile(fileName);
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

@When("^User update multiple attachments in different format$")
public void user_update_multiple_attachments_in_different_format() throws Throwable {
	try
	{
    String[] filePath=new String[3];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 36);
    filePath[1]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 36);
    filePath[2]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 36);
    actual[24]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[25]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
//    dt.updateClose.click();
//    bp.waitForElement();
    actual[26]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[27]=dt.validateAttachmentSuccessMsg();
//    bp.waitForElement();
//    dt.updateClose.click();
    bp.waitForElement();
    actual[28]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[29]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
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

@Then("^Should be able to update a defect with multiple attachments in different formats$")
public void should_be_able_to_update_a_defect_with_multiple_attachments_in_different_formats() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);
	String fileName_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);
	String fileName_2=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
	actual[30]=ctc.verifyAttachementFile(fileName);
    bp.waitForElement();
    actual[31]=ctc.verifyAttachementFile(fileName_1);
    bp.waitForElement();
    actual[32]=ctc.verifyAttachementFile(fileName_2);
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

@When("^User attempt to update file of size TenMB$")
public void user_attempt_to_update_file_of_size_TenMB() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 6, 36);
    actual[33]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment of size TenMB$")
public void should_be_able_to_update_a_defect_with_attachment_of_size_TenMB() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 6, 41);
    actual[34]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[35]=ctc.verifyAttachementFile(fileName);
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

@When("^User create a file with special characters and try to upload that file$")
public void user_create_a_file_with_special_characters_and_try_to_upload_that_file() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 7, 36);
    actual[36]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment of special char file$")
public void should_be_able_to_update_a_defect_with_attachment_of_special_char_file() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 7, 41);
	actual[37]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[38]=ctc.verifyAttachementFile(fileName);
    bp.waitForElement();
    bp.waitForElement();
    dt.defect_Updateclose.click();
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

@When("^User search the defect and create subtask and update an attachment in  text format$")
public void user_search_the_defect_and_create_subtask_and_update_an_attachment_in_text_format() throws Throwable {
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
	   String defectValue_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 31);
	   String[] filePath=new String[1];
	   filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 36);
	   int[] defectNo=new int[1];
	   defectNo[0]=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 1, 30);
	   actual[39]=dt.searchDefect(defectId);	
	   bp.waitForElement();
	   actual[40]=dt.selectSingleOrMultipleDefects(defectNo);
	   bp.waitForElement();
	   actual[41]=dt.defectsOperation(defectValue_1);
	   bp.waitForElement();
	   actual[42]=dt.createDefectSubtask(issuetype_1);
	   bp.waitForElement();
	   actual[43]=dt.fileNewDefect(summary_1, components, descType, desc_1, fixVersion, priority, assignee, labels, sprint, env, epicLink, affectsVersion, linkedIssue);
	   bp.waitForElement();
	   actual[44]=dt.saveDefect();
	   bp.waitForElement();
	   bp.waitForElement();
	   subtask_defectId=dt.retrieveDefectId();
	   bp.waitForElement();
	   bp.waitForElement();
	   dt.updatesubtask_Defect.click();
	   bp.waitForElement();
	   bp.waitForElement();
	   actual[45]=dt.searchDefect(subtask_defectId);	
	   bp.waitForElement();
	   actual[46]=dt.selectSingleOrMultipleDefects(defectNo);
	   bp.waitForElement();
	   dt.Edit.click();
	   bp.waitForElement();
	   actual[47]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in text format$")
public void should_be_able_to_update_subtask_with_attachment_in_text_format() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);	
    actual[48]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[49]=ctc.verifyAttachementFile(fileName);
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
@When("^User try to update an attachment in excel format$")
public void user_try_to_update_an_attachment_in_excel_format() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 36);
    actual[50]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in excel format$")
public void should_be_able_to_update_subtask_with_attachment_in_excel_format() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);	
    actual[51]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[52]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to update an attachment in word format$")
public void user_try_to_update_an_attachment_in_word_format() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 36);
    actual[53]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in word format$")
public void should_be_able_to_update_subtask_with_attachment_in_word_format() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
    actual[54]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[55]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to update an attachment in image format$")
public void user_try_to_update_an_attachment_in_image_format() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 36);
    actual[56]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in image format$")
public void should_be_able_to_update_subtask_with_attachment_in_image_format() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
    actual[57]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[58]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to update an attachment in any other format$")
public void user_try_to_update_an_attachment_in_any_other_format() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 5, 36);
    actual[59]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in other format$")
public void should_be_able_to_update_subtask_with_attachment_in_other_format() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
    actual[60]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[61]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to update multiple attachments in different format$")
public void user_try_to_update_multiple_attachments_in_different_format() throws Throwable {
	try
    {
	ctc=new CreateTestCasePage(driver);
    String[] filePath=new String[3];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 36);
    filePath[1]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 36);
    filePath[2]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 36);
    actual[62]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[63]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    actual[64]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[65]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    actual[66]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[67]=dt.validateAttachmentSuccessMsg();
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

@Then("^Should be able to update subtask with multiple attachments in different formats$")
public void should_be_able_to_update_subtask_with_multiple_attachments_in_different_formats() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);
	String fileName_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);
	String fileName_2=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
	actual[68]=ctc.verifyAttachementFile(fileName);
    bp.waitForElement();
    actual[69]=ctc.verifyAttachementFile(fileName_1);
    bp.waitForElement();
    actual[70]=ctc.verifyAttachementFile(fileName_2);
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

@When("^User try to attempt to update file of size TenMB$")
public void user_try_to_attempt_to_update_file_of_size_TenMB() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 6, 36);
    actual[71]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment of size TenMB$")
public void should_be_able_to_update_subtask_with_attachment_of_size_TenMB() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 6, 41);
    actual[72]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[73]=ctc.verifyAttachementFile(fileName);
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

@When("^User create a file with special characters and try to upload it$")
public void user_create_a_file_with_special_characters_and_try_to_upload_it() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getNumericValue(INPUT_PATH_6,"DefectTracking", 7, 36);
    actual[74]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment of special char file$")
public void should_be_able_to_update_subtask_with_attachment_of_special_char_file() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 7, 41);
    actual[75]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[76]=ctc.verifyAttachementFile(fileName);
    dt.defect_Updateclose.click();
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

@When("^User launch TextExecution and execute testcases with any status and create defect$")
public void user_launch_TextExecution_and_execute_testcases_with_any_status_and_create_defect() throws Throwable {
	try
	   {
       tr=new TestRepositoryPage(driver);
       rp=new ReleasePage(driver);
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
	   String project=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 0);
	   String issuetype=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 1);
	   String summary =Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 2);
	   String components=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 3);
	   String descType=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 4);
	   String desc_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 28);
	   String fixVersion=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 6);
	   String priority=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 7);
	   String assignee=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 8);
	   String labels=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 9);
	   String sprint=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 10);
	   String env=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 11);
	   String epicLink=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 12);
	   String affectsVersion=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 13);
	   String linkedIssue=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 100, 14);
	   int[] defectNo=new int[1];
	   defectNo[0]=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 1, 30);
	   int testcase=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 1, 26);
	   String cyclename[]=new String[1];
	   cyclename[0]=cycle;
	   String phase1[]=new String[1];
	   phase1[0]=name;
	   actual[77]=rp.clickOnTestRep();
	   bp.waitForElement();
	   actual[78]=tr.clickOnRelease(releaseName);
	   bp.waitForElement();
	   actual[79]=tr.addNode(name, desc);
	   bp.waitForElement();
	   actual[80]=tr.doubleClickOnRelease(releaseName);
	   bp.waitForElement();
	   actual[81]=tr.navigateToNode(releaseName,phase1);
	   bp.waitForElement();
	   actual[82]=tr.addTestCase();
	   actual[83]=tr.addTestCase();
	   bp.waitForElement();
	   actual[84]=rp.clickOnTestPlanning();
	   bp.waitForElement();
	   actual[85]=tp.clickOnAddTestCycleSymbol();
	   bp.waitForElement();
	   actual[86]=tp.CreateCycle(cycle, build, environ, hide);
	   bp.waitForElement();
	   actual[87]=tp.enterStartDatAndEndDate(syear, smonth, sdate, eyear, emonth, edate);
	   bp.waitForElement();
	   actual[88]=tp.saveTestCycle();
	   bp.waitForElement();
	   actual[89]=tp.navigateToCycle(cyclename);
	   bp.waitForElement();
	   actual[90]=tp.addPhaseToCycle(name);
	   bp.waitForElement();
	   actual[91]=tp.bulkAssignment(bulk_type_1);
	   String[] str=new String[2];
	   str[0]=cycle;
	   str[1]=phase;
	   actual[92]=rp.clickOnTestExecution();
	   bp.waitForElement();
	   actual[93]=tr.navigateToNode(releaseName, str);
	   bp.waitForElement();
	   actual[94]=ep.selectAndDeselectAllTestCase();
	   bp.waitForElement();
	   actual[95]=ep.changeMultiSelectedStatus(status);
	   bp.waitForElement();		
	   actual[96]=ep.clickOnDefectButton(testcase);
	   bp.waitForElement();
	   actual[97]=ep.createDefect(project, issuetype);
	   bp.waitForElement();
	   actual[98]=ep.fileNewDefect(summary, components, descType, desc_1, fixVersion, priority, assignee, labels, sprint, env, epicLink, affectsVersion, linkedIssue);
	   bp.waitForElement();
	   actual[99]=dt.saveDefect();
	   bp.waitForElement();
	   test_defectId=dt.retrieveDefectId();
	   bp.waitForElement();
	   actual[100]=dt.updateDefect();
	   bp.waitForElement();
	   actual[101]=dt.searchDefect(test_defectId);
	   bp.waitForElement();
	   actual[102]=dt.selectSingleOrMultipleDefects(defectNo);
	   bp.waitForElement();
	   dt.Edit.click();
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

@When("^User update an attachment in text format in TE$")
public void user_update_an_attachment_in_text_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 36);
    actual[103]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in text format in TE$")
public void should_be_able_to_update_a_defect_with_attachment_in_text_format_in_TE() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);	
    actual[104]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[105]=ctc.verifyAttachementFile(fileName);
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

@When("^User update an attachment in excel format in TE$")
public void user_update_an_attachment_in_excel_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 36);
    actual[106]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in excel format in TE$")
public void should_be_able_to_update_a_defect_with_attachment_in_excel_format_in_TE() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);	
    actual[107]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[108]=ctc.verifyAttachementFile(fileName);
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

@When("^User update an attachment in word format in TE$")
public void user_update_an_attachment_in_word_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 36);
    actual[109]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in word format in TE$")
public void should_be_able_to_update_a_defect_with_attachment_in_word_format_in_TE() throws Throwable {
	try
    {
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
    actual[110]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[111]=ctc.verifyAttachementFile(fileName);
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

@When("^User update an attachment in image format in TE$")
public void user_update_an_attachment_in_image_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 36);
    actual[112]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in image format in TE$")
public void should_be_able_to_update_a_defect_with_attachment_in_image_format_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
    actual[113]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[114]=ctc.verifyAttachementFile(fileName);
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

@When("^User update an attachment in any other format in TE$")
public void user_update_an_attachment_in_any_other_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 5, 36);
    actual[115]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment in other format in TE$")
public void should_be_able_to_update_a_defect_with_attachment_in_other_format_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 5, 41);
    actual[116]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[117]=ctc.verifyAttachementFile(fileName);
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

@When("^User update multiple attachments in different format in TE$")
public void user_update_multiple_attachments_in_different_format_in_TE() throws Throwable {
	try
	{
    String[] filePath=new String[3];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 36);
    filePath[1]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 36);
    filePath[2]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 36);
    actual[118]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[119]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    actual[120]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[121]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    actual[122]=ctc.uploadAttachement(filePath);
    bp.waitForElement();
    actual[123]=dt.validateAttachmentSuccessMsg();
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

@Then("^Should be able to update a defect with multiple attachments in different formats in TE$")
public void should_be_able_to_update_a_defect_with_multiple_attachments_in_different_formats_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);
	String fileName_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);
	String fileName_2=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
	actual[124]=ctc.verifyAttachementFile(fileName);
    bp.waitForElement();
    actual[125]=ctc.verifyAttachementFile(fileName_1);
    bp.waitForElement();
    actual[126]=ctc.verifyAttachementFile(fileName_2);
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

@When("^User attempt to update file of size TenMB in TE$")
public void user_attempt_to_update_file_of_size_TenMB_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 6, 36);
    actual[127]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment of size TenMB in TE$")
public void should_be_able_to_update_a_defect_with_attachment_of_size_TenMB_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 6, 41);
    actual[128]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[129]=ctc.verifyAttachementFile(fileName);
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

@When("^User create a file with special characters and try to upload that fiel in TE$")
public void user_create_a_file_with_special_characters_and_try_to_upload_that_fiel_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getNumericValue(INPUT_PATH_6,"DefectTracking", 7, 36);
    actual[130]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update a defect with attachment of special char file in TE$")
public void should_be_able_to_update_a_defect_with_attachment_of_special_char_file_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 7, 41);
	actual[131]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[132]=ctc.verifyAttachementFile(fileName);
    bp.waitForElement();
    ep.cancelDefect.click();
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

@When("^User launch TextExecution and execute testcases with any status and click on D and create subtask$")
public void user_launch_TextExecution_and_execute_testcases_with_any_status_and_click_on_D_and_create_subtask() throws Throwable {
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
	   String defectValue_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 31);
	   String[] filePath=new String[1];
	   filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 36);
	   int[] defectNo=new int[1];
	   defectNo[0]=Excel_Lib.getNumberData(INPUT_PATH_6,"DefectTracking", 1, 30);
	   actual[133]=dt.searchDefect(test_defectId);	
	   bp.waitForElement();
	   actual[134]=dt.selectSingleOrMultipleDefects(defectNo);
	   bp.waitForElement();
	   actual[135]=dt.defectsOperation(defectValue_1);
	   bp.waitForElement();
	   actual[136]=dt.createDefectSubtask(issuetype_1);
	   bp.waitForElement();
	   actual[137]=dt.fileNewDefect(summary_1, components, descType, desc_1, fixVersion, priority, assignee, labels, sprint, env, epicLink, affectsVersion, linkedIssue);
	   bp.waitForElement();
	   bp.waitForElement();
	   actual[138]=dt.saveDefect();
	   bp.waitForElement();
	   bp.waitForElement();
	   testsubtask_defectId=dt.retrieveDefectId();
	   bp.waitForElement();
	   bp.waitForElement();
	   actual[139]=dt.updateDefect();
	   bp.waitForElement();
	   actual[140]=dt.searchDefect(testsubtask_defectId);	
	   bp.waitForElement();
	   actual[141]=dt.selectSingleOrMultipleDefects(defectNo);
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

@When("^User try to update an attachment in  text format in TE$")
public void user_try_to_update_an_attachment_in_text_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 36);
    actual[142]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in text format in TE$")
public void should_be_able_to_update_subtask_with_attachment_in_text_format_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);
    actual[143]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[144]=ctc.verifyAttachementFile(fileName); 
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

@When("^User try to update an attachment in excel format in TE$")
public void user_try_to_update_an_attachment_in_excel_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 36);
    actual[145]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in excel format in TE$")
public void should_be_able_to_update_subtask_with_attachment_in_excel_format_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);
    actual[146]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[147]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to update an attachment in word forma in TEt$")
public void user_try_to_update_an_attachment_in_word_forma_in_TEt() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 36);
    actual[148]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in word format in TE$")
public void should_be_able_to_update_subtask_with_attachment_in_word_format_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
    actual[149]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[150]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to update an attachment in image format in TE$")
public void user_try_to_update_an_attachment_in_image_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 36);
    actual[151]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in image format in TE$")
public void should_be_able_to_update_subtask_with_attachment_in_image_format_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 4, 41);
    actual[152]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[153]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to update an attachment in any other format in TE$")
public void user_try_to_update_an_attachment_in_any_other_format_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 5, 36);
    actual[154]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment in other format in TE$")
public void should_be_able_to_update_subtask_with_attachment_in_other_format_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 5, 41);
    actual[155]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[156]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to update multiple attachments in different format in TE$")
public void user_try_to_update_multiple_attachments_in_different_format_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);
	String fileName_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);
	String fileName_2=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
	actual[157]=ctc.verifyAttachementFile(fileName);
    bp.waitForElement();
    actual[158]=ctc.verifyAttachementFile(fileName_1);
    bp.waitForElement();
    actual[159]=ctc.verifyAttachementFile(fileName_2);
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

@Then("^Should be able to update subtask with multiple attachments in different formats in TE$")
public void should_be_able_to_update_subtask_with_multiple_attachments_in_different_formats_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 1, 41);
	String fileName_1=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 2, 41);
	String fileName_2=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 3, 41);
	actual[160]=ctc.verifyAttachementFile(fileName);
    bp.waitForElement();
    actual[161]=ctc.verifyAttachementFile(fileName_1);
    bp.waitForElement();
    actual[162]=ctc.verifyAttachementFile(fileName_2);
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

@When("^User search the defect and create subtask and attempt to update file of size TenMB  in TE$")
public void user_search_the_defect_and_create_subtask_and_attempt_to_update_file_of_size_TenMB_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 6, 36);
    actual[163]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment of size TenMB in TE$")
public void should_be_able_to_update_subtask_with_attachment_of_size_TenMB_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 6, 41);
    actual[164]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[165]=ctc.verifyAttachementFile(fileName);
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

@When("^User try to create a file with special characters and try to upload it in TE$")
public void user_try_to_create_a_file_with_special_characters_and_try_to_upload_it_in_TE() throws Throwable {
	try
    {
    String[] filePath=new String[1];
    filePath[0]=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 7, 36);
    actual[166]=ctc.uploadAttachement(filePath);
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

@Then("^Should be able to update subtask with attachment of special char file in TE$")
public void should_be_able_to_update_subtask_with_attachment_of_special_char_file_in_TE() throws Throwable {
	try
    {	
	String fileName=Excel_Lib.getData(INPUT_PATH_6,"DefectTracking", 7, 41);
    actual[167]=dt.validateAttachmentSuccessMsg();
    bp.waitForElement();
    dt.updateClose.click();
    bp.waitForElement();
    actual[168]=ctc.verifyAttachementFile(fileName);
    bp.waitForElement();
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
