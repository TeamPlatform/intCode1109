package com.zephyr.reusablemethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zephyr.pom.CreateCustomFieldsPage_POM;

public class CreateCustomFieldsPage extends CreateCustomFieldsPage_POM {
	WebDriver driver = null;
	public Logger log;
	BasePage bp;
	TestRepositoryPage tr;

	public CreateCustomFieldsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
	}

	/*
	 * **************************************************** Method Name :
	 * moveToCustomFields() Purpose : move to the Custom Fields Author : OPAL
	 * Date Created : 10/08/17 Date Modified : Reviewed By :
	 * ******************************************************
	 */
	public boolean validateJIRACustomFieldsManagement(String name) throws Exception
	{
		try
		{
		bp=new BasePage();	
		bp.waitForElement();
		String validation=driver.findElement(By.xpath(validateJiraCustomFieldsManagement1+name+validateJiraCustomFieldsManagement2)).getText();
		if(name.equals(validation))
		{
		System.out.println(validation + " Is Viewed Successfully ");
		}
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public boolean checkAvailableKeysValueInJira(String key,String keyValue) throws Exception
	{
	try
	{
	try
	{
		bp=new BasePage();
		bp.waitForElement();
		String availableKeyValue=driver.findElement(By.xpath(keyValue1+key+keyValue2)).getText();
		if(keyValue.equals(availableKeyValue))
		{
			System.out.println("Key value is already present");
		}
	}
		catch (NoSuchElementException e) {
			System.out.println("Key value is not Found");
			return false;

		}
		return true;
	  } 
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
	}
	
	public boolean changeKeyValues(String key,String keyValue) throws Exception
	{
		try
		{
			bp=new BasePage();
			bp.waitForElement();
			WebElement ele=driver.findElement(By.xpath(keyValue1+key+keyValue2));
			ele.click();
			ele.clear();
			ele.sendKeys(keyValue);
			bp.waitForElement();
			clickOnUpdate.click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
			
		}
	}
	
	public boolean checkAvailableCustomFieldsInJira(String customField) throws Exception
	{
		{
			try
			{
			try
			{
				bp=new BasePage();
				bp.waitForElement();
				String availableCustomField=driver.findElement(By.xpath(customFieldValue1+customField+customFieldValue2)).getText();
				if(customField.equals(availableCustomField))
				{
					System.out.println(customField+ " is already present ");
				}
			}
				catch (NoSuchElementException e) {
					System.out.println(customField + " is not Found ");
					return false;

				}
				return true;
			  } 
			catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
			}
	}
	
	public boolean clickOnAdvanceSettings() throws Exception
	{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		clickOnAdvanceSettingsInJira.click();
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public boolean validateClearCacheOfOnlineJIRACustomFields(String name) throws Exception
	{
		try
		{
		bp=new BasePage();	
		bp.waitForElement();
		String validation=driver.findElement(By.xpath(validateClearCasheOfOnlineProject1+name+validateClearCasheOfOnlineProject2)).getText();
		if(name.equals(validation))
		{
		System.out.println(validation + " Is Viewed Successfully");
		}
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	public boolean validateClearSelectedOrClearAll(String optionName) throws Exception
	{
		try
		{
		bp=new BasePage();	
		bp.waitForElement();
		String validation=driver.findElement(By.xpath(clearselected1+optionName+clearselected2)).getText();
		System.out.println(validation + " Is Viewed Successfully");
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public boolean validateCheckBoxEnabledOrDisabled(String propertyName) throws Exception
	{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		WebElement ele=driver.findElement(By.xpath(validateCheckBox1+propertyName+validateCheckBox2));
		boolean res=ele.isSelected();
		if(res==true)
		{
			System.out.println("Property is Enabled " +res);
		}
		else
		{
			System.out.println("Property is Disabled Successfully");
		}
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	public boolean validateCategories(String name,String value) throws Exception
	{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		String expectedName=driver.findElement(By.xpath(name3+name+name4)).getText();
		String result=driver.findElement(By.xpath(validation1+name+validation2)).getText();
		if(name.equals(expectedName) && value.equals(result))
		{
			System.out.println("categories " +name+ " is successfully validated");
			System.out.println("Categories " +value+ " is successfully validated");
		}
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}


	public boolean validatePropertyName(String propertyName) throws Exception
	{
		try
		{
	    bp=new BasePage();
	    bp.waitForElement();
	   
	    	String expectedName=driver.findElement(By.xpath(name3+propertyName+name4)).getText();
	    	if(expectedName.equals(propertyName))
	    	{
	    		System.out.println("Property Name is already present");
	    	}
	    	
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	
	
	
	
	public boolean checkAvailableCustomRole(String customRole) throws Exception
	{
		try
		{
		try
		{
		bp=new BasePage();
		bp.waitForElement();
		WebElement ele=driver.findElement(By.xpath(customRole1+customRole+customRole2));
		String ele1=ele.getText();
		if(customRole.equals(ele1)) 
		{
			System.out.println("CustomRole"+ele+"is already Present");
		}
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("CustomRole is not present");
			return false;
			
		}
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

	
}
	public boolean editCategoriesOperation(String category,String name,String value,String active) throws Exception
	{
		
			try
			{
			bp=new BasePage();
			bp.waitForElement();
			if(category!="")
			{
			driver.findElement(By.xpath(categories1+category+categories2)).click();
			System.out.println("Clicked on"+category+"Successfully");
			}
			if(name!="")
			{
			driver.findElement(By.xpath(name1+name+name2)).click();
			System.out.println("Pass-Clicked on"+name+"Successfully");
			}
			if(value!="")
			{
			bp.explicitWait(enterPreferenceValue);
			enterPreferenceValue.click();
			System.out.println("Clicked on"+value+"Successfully");
			enterPreferenceValue.clear();
			enterPreferenceValue.sendKeys(value);
			System.out.println("Successfully-Passed"+value);
			}
			if(active!="")
			{
			bp.waitForElement();
			driver.findElement(By.xpath(active1+active+active2)).click();
			System.out.println("Selected"+active+"Successfylly");
			}
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}		
	}
	
	
	public boolean editCustomStaus(String name,String value,String colour) throws Exception
	   {
	    try
	    {
	     WebElement ele=driver.findElement(By.xpath(customName1+name+customName2));
	     ele.click();
	     
	    if(value!="")
	    {
	   bp.waitForElement();
	   bp.eraseText(statusValue);
	   statusValue.sendKeys(value);
	   System.out.println("Pass - Execution Status Value Entered Successfully");
	    }
	     
	   if(colour!="")
	     {
	      StatusColour.click();
	   bp.waitForElement();
	   
	   if(colour.equalsIgnoreCase("Blue"))
	   {
	   Actions a1=new Actions(driver);
	   a1.moveToElement(StatusColourPicker).sendKeys(Keys.DOWN).pause(1200).click().perform();
	   }
	   else
	   {
	    Actions a1=new Actions(driver);
	    a1.moveToElement(StatusColourPicker).sendKeys(Keys.DOWN).pause(1200).perform();
	    a1.sendKeys(Keys.DOWN).pause(1200).click().perform();
	    
	   }
	   }
	   //epm.colourChoose.click();
	   bp.waitForElement();
	   
	   
	   bp.waitForElement();
	   StatusSaveButton.click();
	   bp.waitForElement();
	   statusConfirmSave.click();
	   System.out.println("Pass - Custom Status Edited Successfully");
	   bp.waitForElement();
//	   closeExecutionStatusPage.click();
//	   bp.waitForElement();
	   return true;
	   }
	   catch(Exception e)
	   {
	    e.printStackTrace();
	    throw e;
	   }
	   
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean moveToCustomFields() throws Exception {
		try {
			bp = new BasePage();
			
			bp.waitForElement();
			administration.click();
			log.info("Pass - Clicked On Administartion Successfully");
			bp.waitForElement();
			customizations.click();
			log.info("Pass - Clicked On Customizations Option Successfully");
			bp.waitForElement();
			testcaseFields.click();
			log.info("Pass - Clicked On Fields Option in Testcases Division Successfully");
			bp.waitForElement();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public boolean addNewProperty(String category,String name,String value) throws Exception
	{
		try
		{
		    bp=new BasePage();
		    bp.waitForElement();
		    if(category!="")
		    {	
			driver.findElement(By.xpath(categories1+category+categories2)).click();
			System.out.println("Clicked on " +category+ " Successfully");
			bp.waitForElement();
			addPreference.click();
			System.out.println("Successfully-clicked on add preference");
		    }
		    
		    if(name!="")
		    {
			bp.waitForElement();
			Actions act=new Actions(driver);
			act.moveToElement(enterPreferenceName).click().sendKeys(name).perform();
			System.out.println("Added a property " +name+ "Successfully");
		    }
			if(value!="")
			{
			bp.waitForElement();
			Actions act=new Actions(driver);
			act.moveToElement(enterPreferenceValue).click().sendKeys(value).perform();
			System.out.println("Successfully-Passed " +value);
			}
			savePreference.click();
			System.out.println("Clicked On Save Button");
			bp.waitForElement();
			clickOnSavePreference.click();
			System.out.println("Successfully Saved Preference");
		   return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public boolean checkAvailableCategories(String category,String name,String value) throws Exception
	{
		try
		{
		try
		{
        bp=new BasePage();
        bp.waitForElement();
        if(category!="")
        {
		driver.findElement(By.xpath(categories1+category+categories2)).click();
        }
        if(name!="" && value!="")
        {
		bp.waitForElement();
		WebElement ele=driver.findElement(By.xpath(name3+name+name4));
		ele.isDisplayed();
		String preferenceName=ele.getText();
		WebElement ele1=driver.findElement(By.xpath(validation1+name+validation2));
		ele1.isDisplayed();
		String preferencevalue=ele1.getText();
		if(name.equals(preferenceName) && value.equals(preferencevalue) )
		{
			System.out.println("Preference " +name+ " and " +value+ " already Present");
		}
        }
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Preference is not present");
			return false;
			
		}
		
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public boolean checkAvailablePropertyName(String category,String name) throws Exception
	{
		try
		{
		try
		{
        bp=new BasePage();
        bp.waitForElement();
        if(category!="")
        {
		driver.findElement(By.xpath(categories1+category+categories2)).click();
        }
        if(name!="")
        {
		bp.waitForElement();
		WebElement ele=driver.findElement(By.xpath(name3+name+name4));
		ele.isDisplayed();
		String preferenceName=ele.getText();
		
		if(name.equals(preferenceName))
		{
			System.out.println("PropertyName " +name+  " already Present");
		}
        }
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("PropertyName is not present");
			return false;
			
		}
		
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public boolean deleteProperty(String category,String propertyName) throws Exception
	{
		try
		{
			bp=new BasePage();
			bp.waitForElement();
			if(category!="")
			{
				driver.findElement(By.xpath(categories1+category+categories2)).click();
				System.out.println("Clicked on " +category+ " Successfully");
			}
			if(propertyName!="")
			{
			WebElement ele=driver.findElement(By.xpath(deleteproperty1+propertyName+deleteproperty2));
			bp.waitForElement();
			ele.click();
			bp.waitForElement();
			deleteYesIcon.click();
			System.out.println(propertyName + "Deleted Successfully");
			}
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
	}

	

	
	
	
	
	
	/*
	 * **************************************************** Method Name :
	 * lockZephyr() Purpose : Locks the zephyr application stop access for other
	 * users Author : OPAL Date Created : 10/08/17 Date Modified : Reviewed By :
	 * ******************************************************
	 */
	public boolean lockZephyrAccess() throws Exception {
		try {
			bp = new BasePage();
			lockZephyrAccess.click();
			bp.waitForElement();
			confirmLockZephyrAccess.click();
			bp.waitForElement();
			log.info("Pass - Manager locked the Zephyr Access for other users Successfully");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * **************************************************** Method Name :
	 * createCustomFields() Purpose : Creates new custom fields for the Testcase
	 * Author : OPAL Date Created : 11/08/17 Date Modified : Reviewed By :
	 * ******************************************************
	 */

	public boolean createCustomFields(String customfieldName, String customfieldDescription, String dataType,
			String piclistValues[], String allProject, String projectName, String searchableCheck, String unique,
			String mandatory) throws Exception {
		try {
			bp = new BasePage();
			addNewCustomField.click();
			bp.waitForElement();
			log.info("Pass - Clicked on Add new Custom Field");

			customFieldName.click();
			bp.waitForElement();
			customFieldName.sendKeys(customfieldName);
			bp.waitForElement();
			log.info("Pass - New CustomField Name entered Successfully");

			customFieldDescription.click();
			bp.waitForElement();
			customFieldDescription.sendKeys(customfieldDescription);
			bp.waitForElement();
			log.info("Pass - New CustomField Description is entered Successfully");

			Select sel = new Select(datatypeDropDown);
			sel.selectByVisibleText(dataType);
			if (dataType.equals("Picklist")) {
				picklistValues.click();
				bp.waitForElement();
				log.info("Pass - Picklist datatype is checked Successfully");
				int k = piclistValues.length;
				for (int i = 0; i <= k - 1; i++) {
					picklistValues.sendKeys(piclistValues[i]);
					bp.waitForElement();
					addPicklistValues.click();
					bp.waitForElement();
					log.info("Pass - Picklist Values are added Successfully");
				}
			}
			bp.waitForElement();
			log.info("Pass - Data type '" + dataType + "' Selected Successfully");

			if (allProject.equals("allProject")) {
				checkAllProject.click();
				bp.waitForElement();
				log.info("Pass - Checkbox is checked for '" + allProject + "' in Custom Fields");
			} else {
				projectAssociation.click();
				bp.waitForElement();
				Actions a1 = new Actions(driver);
				a1.sendKeys(projectName).sendKeys(Keys.ENTER).build().perform();
				// projectAssociation.sendKeys(projectName);
				log.info("Pass - Selected the '" + projectName + "' in Project Association");
			}

			if (searchableCheck.equals("searchable")) {
				searchable.click();
				bp.waitForElement();
				log.info("Pass - Checkbox is checked for '" + searchableCheck + "' in Custom Fields");
			} else {
				log.info("Pass - 'Searchable' cant be Applicable for Number Datatype");
			}

			if (unique.equals("Unique")) {
				uniqueCheckBox.click();
				bp.waitForElement();
				log.info("Pass - Unique is checked for '" + customfieldName + "' in Custom Fields");
			}

			if (mandatory.equals("Mandatory")) {
				mandatoryChk.click();
				bp.waitForElement();
				log.info("Pass - Mandatory is checked for '" + customfieldName + "' in Custom Fields");
			}
			bp.waitForElement();
			saveCustomField.click();
			bp.waitForElement();
			bp.waitForElement();
			log.info("Pass - Custom Field is Created with '" + dataType + "' Successfully");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * moveTocreateCustomUser() Purpose : Creates new custom fields for the
	 * Testcase Author : OPAL Date Created : 11/08/17 Date Modified : Reviewed
	 * By : ******************************************************
	 */

	public boolean moveToCreateCustomUser() throws Exception {
		try {
			bp = new BasePage();
			
			administration.click();
			bp.waitForElement();
			log.info("Pass - Clicked On Administartion Successfully");
			manageUsers.click();
			bp.waitForElement();
			log.info("Pass - Clicked On manage Users Successfully");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * **************************************************** Method Name :
	 * createCustomUser() Purpose : Creates new custom fields for the Testcase
	 * Author : OPAL Date Created : 11/08/17 Date Modified : Reviewed By :
	 * ******************************************************
	 */

	public boolean createCustomUser(String firstName, String lasTName, String type, String role, String email,
			String title, String location) throws Exception {
		try {
			bp = new BasePage();
			addNewUser.click();
			bp.waitForElement();
			log.info("Pass - Clicked On Add new User Successfully");
			FirstName.sendKeys(firstName);
			bp.waitForElement();
			log.info("Pass - Entered FirstName Successfully");
			LastName.sendKeys(lasTName);
			bp.waitForElement();
			log.info("Pass - Entered LastNmae Successfully");
			Select TYPE = new Select(Type);
			TYPE.selectByVisibleText(type);
			bp.waitForElement();
			log.info("Pass - Selected Type Successfully");
			Select ROLE = new Select(Role);
			ROLE.selectByVisibleText(role);
			bp.waitForElement();
			log.info("Pass - Selected Role Successfully");
			Email.sendKeys(email);
			bp.waitForElement();
			log.info("Pass - Entered Email Successfully");
			Title.sendKeys(title);
			bp.waitForElement();
			log.info("Pass - Entered Title Successfully");
			Location.sendKeys(location);
			bp.waitForElement();
			log.info("Pass - Entered Location Successfully");
			saveNewUser.click();
			bp.waitForElement();
			log.info("Pass - New User is Created Successfully");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public boolean checkAvailableCustomFields(String customFields) throws Exception {
		try {
			try {
				WebElement customFieldName = driver.findElement(By.xpath(customField1 + customFields + customField2));

				boolean res = customFieldName.isDisplayed();

				String customFieldText = customFieldName.getText();

				if (customFields.equals(customFieldText)) {
					System.out.println("Custom Field/Status-" + customFields + "- already present in project");
				}

			}

			catch (NoSuchElementException e) {
				System.out.println("Custom Field/Status-" + customFields + " is not present");
				return false;

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public boolean clickOnExecutionStatusTab() throws Exception {
		try {
			bp = new BasePage();
			executionButton.click();
			System.out.println("Pass - Clicked On Execution Status Tab Successfully");
			bp.waitForElement();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public boolean clickOnStepExecutionStatusTab() throws Exception {
		try {
			bp = new BasePage();
			executionStepButton.click();
			System.out.println("Pass - Clicked On Execution Status Tab Successfully");
			bp.waitForElement();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public boolean enterPicklistValues(String customName, String[] piclistValues) throws Exception {
		try {

			WebElement customFieldName = driver.findElement(By.xpath(customField1 + customName + customField2));
			customFieldName.click();
			picklistValues.click();
			bp.waitForElement();
			log.info("Pass - Picklist datatype is checked Successfully");
			int k = piclistValues.length;
			for (int i = 0; i <= k - 1; i++) {
				picklistValues.sendKeys(piclistValues[i]);
				bp.waitForElement();
				addPicklistValues.click();
				bp.waitForElement();
				log.info("Pass - Picklist Values are added Successfully");
			}

			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public boolean saveCustomFeilds() throws Exception {
		try {
			bp = new BasePage();
			bp.waitForElement();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(saveCustomFields));
			saveCustomFields.click();
			bp.waitForElement();
		} catch (Exception e) {
			bp.waitForElement();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(saveCustomFields));
			cancelCustomFields.click();
			bp.waitForElement();
			System.out.println("Clicked on Cancel button successfully");
		}
		return true;
	}

	
	public boolean addCustomRole(String name, String Description, String administrationApps, String projectApps)
			throws Exception {
		try {
			bp = new BasePage();
			bp.waitForElement();
			
			clickonRole.click();
			log.info("Pass-Clicked on Role successfully");
			addNewRole.click();
			System.out.println("Pass-Clicked on Add New Role Successfully");
			bp.waitForElement();
			if (name != "") {
				bp.explicitWait(addRoleName);
				addRoleName.click();
				addRoleName.clear();
				addRoleName.sendKeys(name);
				System.out.println("Pass-Role Name entered successfully");
			}
			if (Description != "") {

				bp.explicitWait(addRoleDesc);
				addRoleDesc.click();
				addRoleDesc.clear();
				addRoleDesc.sendKeys(Description);
				System.out.println("Pass-Role Description entered successfully");
			}
			driver.findElement(By.xpath(administrationApps1 + administrationApps + administrationApps2)).click();
			System.out.println("Pass-clicked On" + administrationApps + "Successfully");
			bp.waitForElement();
			driver.findElement(By.xpath(administrationApps1 + projectApps + administrationApps2)).click();
			System.out.println("Pass-clicked" + projectApps + "Successfully");
			bp.waitForElement();
			clickonAdd.click();
			System.out.println("Pass-Clicked Successfully Added New Role");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public boolean editCategories(String category, String name, String value, String active) throws Exception {
		try {
			bp = new BasePage();
			bp.waitForElement();
			driver.findElement(By.xpath(categories1 + category + categories2)).click();
			System.out.println("Clicked on" + category + "Successfully");
			driver.findElement(By.xpath(name1 + name + name2)).click();
			System.out.println("Pass-Clicked on" + name + "Successfully");
			if (value != "") {
				bp.explicitWait(enterPreferenceValue);
				// WebElement
				// ele=driver.findElement(By.xpath("//*[@id='preference-value']"));
				// JavascriptExecutor js=((JavascriptExecutor)driver);
				// js.executeScript("arguments[0].scrollIntoView(true);",ele );
				// WebDriverWait wait=new WebDriverWait(driver,60);
				// wait.until(ExpectedConditions.visibilityOf(ele));
				// ele.click();
				enterPreferenceValue.click();
				System.out.println("Clicked on" + value + "Successfully");
				enterPreferenceValue.clear();
				enterPreferenceValue.sendKeys(value);
				System.out.println("Successfully-Passed" + value);
			}
			bp.waitForElement();
			
			driver.findElement(By.xpath(active1 + active + active2)).click();
			System.out.println("Selected" + active + "Successfylly");
			
			savePreference.click();
			System.out.println("Clicked On Save Button");
			bp.waitForElement();
			clickOnSavePreference.click();
			System.out.println("Successfully Saved Preference");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	
	
	public boolean enableCustomFields(String linkType) throws Exception
	   {
	    
	    try
	    {
	    WebElement ele=driver.findElement(By.xpath(jiraLink1+linkType+jiraLink2));
	    WebDriverWait wait=new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(ele));
	    ele.click();
	    bp.waitForElement();
	    String text=ele.getText();
//	    //System.out.println(text);
	    	
	    	
	    if(text.equals(linkType))
	    {
	    		WebElement data=driver.findElement(By.xpath(customValue1+linkType+customValue2));
	            String display=data.getText();
	            System.out.println(display);
	            
	            if(display.equals("true"))
	            {
	            	WebElement ele1=driver.findElement(By.xpath(Checkbox));
	            	//WebElement ele1=driver.findElement(By.xpath(jiraLinkCheckbox1+i+jiraLinkCheckbox2));
	            	//WebDriverWait wait1=new WebDriverWait(driver, 30);
	            	 //wait1.until(ExpectedConditions.elementToBeClickable(ele1));
	            	Actions act=new Actions(driver);
	            	bp.waitForElement();
	            	
	            	boolean res=ele1.isSelected();
			    	 if(res==false)
				    {
			    		
			    		act.moveToElement(ele1).click().build().perform();
				    System.out.println(linkType+"- Enabled");
				   } 
			    	 else
	 			    	{
	 			    	System.out.println("Already in Enabled Mode");
	 			    	}  	
	            }
	            	
	 			    else
	 			    {
	 			    	
	 			    	WebElement ele1=driver.findElement(By.xpath(Checkbox));
	 			    	bp.waitForElement();
	 			    	Actions act=new Actions(driver);
	 			    	act.moveToElement(ele1).click().build().perform();
		            	bp.waitForElement();
		            	wait.until(ExpectedConditions.elementToBeClickable(Value));
					    Value.click();
					    Value.clear();
					    System.out.println(Value);
				    	Value.sendKeys("true");
				    	bp.waitForElement();
				    	ele1.click();
				    	wait.until(ExpectedConditions.elementToBeClickable(Save));
				    	Save.click();
				    	wait.until(ExpectedConditions.elementToBeClickable(Save1));
				    	Save1.click();
				    	System.out.println(Value+"Succesfully Entered");
		 			    boolean res1=ele1.isSelected();
		 			    if(res1==true)
		 			    {
		 			    	act.moveToElement(ele1).click().build().perform();
		 			    System.out.println(linkType+"- Enabled"); 
	 			          }
		 			    else
		 			    	{
		 			    	System.out.println("Already in Enabled Mode");
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

	public boolean disableCustomFields(String linkType) throws Exception
	   {
	    
	    try
	    {
	    WebElement ele=driver.findElement(By.xpath(jiraLink1+linkType+jiraLink2));
	    WebDriverWait wait=new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(ele));
	    ele.click();
	    bp.waitForElement();
	    String text=ele.getText();
//	    //System.out.println(text);
	    	
	    	
	    if(text.equals(linkType))
	    {
	    		WebElement data=driver.findElement(By.xpath(customValue1+linkType+customValue2));
	            String display=data.getText();
	            System.out.println(display);
	            
	            if(display.equals("false"))
	            {
	            	WebElement ele1=driver.findElement(By.xpath(Checkbox));
	            	//WebElement ele1=driver.findElement(By.xpath(jiraLinkCheckbox1+i+jiraLinkCheckbox2));
	            	//WebDriverWait wait1=new WebDriverWait(driver, 30);
//	            	 wait1.until(ExpectedConditions.elementToBeClickable(ele1));
	            	Actions act=new Actions(driver);
	            	bp.waitForElement();
	            	
	            	boolean res=ele1.isSelected();
			    	 if(res==true)
				    {
			    		
			    		act.moveToElement(ele1).click().build().perform();
				    System.out.println(linkType+"- Disabled");
				   } 
			    	 else
	 			    	{
	 			    	System.out.println("Already in Disabled Mode");
	 			    	}  	
	            }
	            	
	 			    else
	 			    {
	 			    	
	 			    	WebElement ele1=driver.findElement(By.xpath(Checkbox));
	 			    	bp.waitForElement();
	 			    	Actions act=new Actions(driver);
	 			    	act.moveToElement(ele1).click().build().perform();
		            	bp.waitForElement();
		            	wait.until(ExpectedConditions.elementToBeClickable(Value));
					    Value.click();
					    Value.clear();
					    System.out.println(Value);
				    	Value.sendKeys("false");
				    	bp.waitForElement();
				    	ele1.click();
				    	wait.until(ExpectedConditions.elementToBeClickable(Save));
				    	Save.click();
				    	wait.until(ExpectedConditions.elementToBeClickable(Save1));
				    	Save1.click();
				    	System.out.println(Value+"Succesfully Entered");
		 			    boolean res1=ele1.isSelected();
		 			    if(res1==true)
		 			    {
		 			    	act.moveToElement(ele1).click().build().perform();
		 			    System.out.println(linkType+"- Disabled"); 
	 			          }
		 			    else
		 			    	{
		 			    	System.out.println("Already in Disabled Mode");
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
	
	public boolean editCustomFields(String linkType,String linkValue) throws Exception
	{
		try
		{
		bp=new BasePage();
		WebElement ele=driver.findElement(By.xpath(jiraLink1+linkType+jiraLink2));
	    WebDriverWait wait=new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(ele));
	    ele.click();
	    bp.waitForElement();
	    String text=ele.getText();
	    if(text.equals(linkType))
	    {
	    	Value.click();
		    Value.clear();
		    System.out.println(Value);
	    	Value.sendKeys(linkValue);
	    	bp.waitForElement();
	    	wait.until(ExpectedConditions.elementToBeClickable(Save));
	    	Save.click();
	    	wait.until(ExpectedConditions.elementToBeClickable(Save1));
	    	Save1.click();
	    	System.out.println(Value+"Succesfully Entered");	
	    	bp.waitForElement();
	    	System.out.println("Pass-Custom Field value'"+linkValue+"' is edited successfully");
	    }
		return true;	
		}
		 catch(Exception e)
		   {
		    e.printStackTrace();
		      throw e;
		   }
		
	}
	
	public boolean selectCategory(String categoryName) throws Exception
	{
	 try
	 {
	 bp=new BasePage();
	 WebDriverWait wait=new WebDriverWait(driver,60);
	 wait.until(ExpectedConditions.elementToBeClickable(defectAdmin));
	 defectAdmin.click();
	 System.out.println("Pass - Clicked On Defect Admin Successfully");
	 bp.waitForElement();
	 preferences.click();
	 System.out.println("Pass - Clicked On Preferences Option Successfully");
	 bp.waitForElement();
	 WebElement ele=driver.findElement(By.xpath(selectCategory1+categoryName+selectCategory2));
	 wait.until(ExpectedConditions.elementToBeClickable(ele));
	 ele.click();
	 System.out.println("Pass - Clicked On '"+categoryName+"' Category Option Successfully");
	 bp.waitForElement();
	 return true; 
	 }
	 catch(Exception e)
	  {
	   e.printStackTrace();
	   throw e;
	  }
	 
	}

	public boolean clearCache() throws Exception
	{
	 try
	 {
	 bp=new BasePage();
	 WebDriverWait wait=new WebDriverWait(driver,60);
	 wait.until(ExpectedConditions.elementToBeClickable(jiraCustomFieldsManagement));
	 jiraCustomFieldsManagement.click();
	 bp.waitForElement();
	 wait.until(ExpectedConditions.elementToBeClickable(clearAll));
	 clearAll.click();
	 bp.waitForElement();
	 wait.until(ExpectedConditions.elementToBeClickable(clearCache));
	 clearCache.click();
	 bp.waitForElement();
	 String text=cacheMsg.getText();
	 System.out.println("Cache confirmation message:" +text);
	 wait.until(ExpectedConditions.elementToBeClickable(cacheYes));
	 cacheYes.click();
	 bp.waitForElement();
	 return true; 
	 }
	 catch(Exception e)
	  {
	   e.printStackTrace();
	   throw e;
	  }
	}
	
	
	public boolean enterAcessURl(String desktop_URL,String dasboard_URL) throws Exception
	{
		try
		{
			desktopURL.sendKeys(desktop_URL);
		
			dashboardUrl.sendKeys(dasboard_URL);
		
		return true; 
		}
		 catch(Exception e)
		  {
		   e.printStackTrace();
		   throw e;
		  }
	}
	
	
	public boolean setDTS(String DTS,String url,String username,String password) throws Exception
	{
	 try
	 {
		 bp=new BasePage();
	 WebElement ele=driver.findElement(By.xpath("//*[@id='defect-system-select2']"));
	 
	 Select s1=new Select(ele);
	 String value=s1.getFirstSelectedOption().getText();
	    System.out.println(value);
	 if(!value.equals(DTS))
	 {
	 s1.selectByVisibleText(DTS);
	 
	 driver.findElement(By.xpath("//input[@placeholder='Enter JIRA connection name']")).clear();
	 
	 driver.findElement(By.xpath("//input[@placeholder='Enter JIRA connection name']")).sendKeys("JIRA");
	 
	 driver.findElement(By.xpath("//input[@placeholder='Enter JIRA connection URL']")).clear();

	 //driver.findElement(By.xpath("//*[@id='dt-url']")).sendKeys(url);
	 driver.findElement(By.xpath("//input[@placeholder='Enter JIRA connection URL']")).sendKeys(url);
	 //driver.findElement(By.xpath("//*[@id='sampleUsername']")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).clear();
	 driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys(username);
	 //driver.findElement(By.xpath("//*[@id='samplePassword']")).sendKeys(password);
	 driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).clear();
	 driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(password);
	 //driver.findElement(By.xpath("//*[@id='ze-main-app']//zui-admin-defect-tracking/div/div[2]/form/div[3]/div/div[2]/button[2]")).click();
	 bp.waitForElement();
	 driver.findElement(By.xpath("//i[@title='Save']")).click();
	 bp.waitForElement();
	 driver.findElement(By.xpath(" (//button[text()='Yes'])[1]")).click();

	 }
	 
	 
	 else
	 {
	   System.out.println("Already Defect tracking is set to JIRA");
	 }
	 return true;
	 }

	 catch (Exception e) 
	 {
	  e.printStackTrace();
	  throw e;
	 }

	}
	
	
	public boolean Enable_disabledStatus(String status) throws Exception
	{
		try
		{
		bp=new BasePage();
		driver.findElement(By.xpath(statusEnableDisabel1+status+statusEnableDisabel2)).click();
		
		bp.waitForElement();
		updateStatus.click();
		
		System.out.println("Execution Status "+status+" Enabled/disabled sucessfully");
		bp.waitForElement();
		bp.waitForElement();
		closeExecutionStatusPage.click();
		bp.waitForElement();
		return true;
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			throw e;
		}
	}
	



///*****************************13/10/17 Jira Requirement******************************/
//public boolean DisableJiraLinkIssue(String linkType) throws Exception
//   {
//    
//    try
//    {
//    for(int i=17;i<=20;i++)
//    {
//    WebElement ele=driver.findElement(By.xpath(jiraLink1+i+jiraLink2));
//    
//    String text=ele.getText();
//    
//    if(text.equals(linkType))
//    {
//    WebElement ele1=driver.findElement(By.xpath(jiraLinkCheckbox1+i+jiraLinkCheckbox2));
//    boolean res=ele1.isSelected();
//    if(res==true)
//    {
//    ele1.click();
//    System.out.println(linkType+"- Disabled");
//    
//     
//    }
//    
//   /* else
//    {
//     ele1.click();
//     System.out.println(linkType+"- Enabled");
//    }*/
//    }
//   }
//      
//   
//   
//   return true;
//   } 
//   catch(Exception e)
//   {
//    e.printStackTrace();
//      throw e;
//   }
//}
//
//
//public boolean EnableJiraLinkIssue(String linkType) throws Exception
//   {
//    
//    try
//    {
//    for(int i=17;i<=20;i++)
//    {
//    WebElement ele=driver.findElement(By.xpath(jiraLink1+i+jiraLink2));
//    
//    String text=ele.getText();
//    
//    if(text.equals(linkType))
//    {
//    WebElement ele1=driver.findElement(By.xpath(jiraLinkCheckbox1+i+jiraLinkCheckbox2));
//    boolean res=ele1.isSelected();
//    if(res==false)
//    {
//    ele1.click();
//    System.out.println(linkType+"- Enabled");
//    
//    }
//
//    }
//   }
//      
//   return true;
//   } 
//   catch(Exception e)
//   {
//    e.printStackTrace();
//      throw e;
//   }
//}
//
//
//public boolean navigatingToGeneralConfigurationTab() throws Exception
//{
//	try
//	{
//		bp=new BasePage();
//		ExecutionPage_POM epm=new ExecutionPage_POM(driver);
//	CreateCustomFieldsPage_POM cpm =new CreateCustomFieldsPage_POM(driver);
//	
////	cpm.adminSetting.click();
////	System.out.println("Pass - Clicked On Administartion Setting Successfully");
//	bp.waitForElement();
//	cpm.administration.click();
//	System.out.println("Pass - Clicked On Administartion Successfully");
//	bp.waitForElement();
//	epm.defectsAdmin.click();
//	System.out.println("Pass - Clicked On Defect Admin Option Successfully");
//	bp.waitForElement();
//
//	preferences.click();
//	System.out.println("Pass - Clicked On Preferences Option Successfully");
//	bp.waitForElement();
//	epm.generalConfiguration.click();
//	System.out.println("Pass - Clicked On General Configuration Option Successfully");
//	bp.waitForElement();
//	
//	/*executionButton.click();
//	System.out.println("Pass - Clicked On Execution Status Tab Successfully");
//	bp.waitForElement();*/
//	
//	return true;
//	}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//		throw e;
//	}
//}
//
//

public boolean disabledStatus(String status) throws Exception
{
	try
	{
	bp=new BasePage();
	driver.findElement(By.xpath(statusEnableDisabel1+status+statusEnableDisabel2)).click();
	bp.waitForElement();
	updateStatus.click();
	System.out.println("Execution Status "+status+" disabled sucessfully");
	bp.waitForElement();
	closeExecutionStatusPage.click();
	System.out.println("Execution Status Page closed sucessfully");
	bp.waitForElement();
	return true;
	}
	catch(Exception e)
	{
		
		throw e;
		//return false;
	}
}

public boolean createCustomStaus(String value,String colour) throws Exception
{
	try
	{
	bp=new BasePage();
    addStatusButton.click();

System.out.println("Pass - Clicked On Add Execution Status Button Successfully");
bp.waitForElement();
statusValue.sendKeys(value);
System.out.println("Pass - Execution Status Value Entered Successfully");
StatusColour.click();
bp.waitForElement();

if(colour.equalsIgnoreCase("Blue"))
{
Actions a1=new Actions(driver);
a1.moveToElement(StatusColourPicker).sendKeys(Keys.DOWN).pause(1200).click().perform();
}
else
{
	Actions a1=new Actions(driver);
	a1.moveToElement(StatusColourPicker).sendKeys(Keys.DOWN).pause(1200).perform();
	a1.sendKeys(Keys.DOWN).pause(1200).click().perform();
	
	
}
//epm.colourChoose.click();
bp.waitForElement();


bp.waitForElement();
StatusSaveButton.click();
bp.waitForElement();
statusConfirmSave.click();
System.out.println("Pass - Custom Status-"+value+" Created Successfully");
bp.waitForElement();
return true;
}
catch(Exception e)
{
	e.printStackTrace();
	throw e;
}

}

public boolean navigatingToCustomizationStatusTab() throws Exception
{
	try
	{
		bp=new BasePage();
	CreateCustomFieldsPage_POM cpm =new CreateCustomFieldsPage_POM(driver);
	
//	cpm.adminSetting.click();
//	System.out.println("Pass - Clicked On Administartion Setting Successfully");
	bp.waitForElement();
	cpm.administration.click();
	System.out.println("Pass - Clicked On Administartion Successfully");
	bp.waitForElement();
	cpm.customizations.click();
	System.out.println("Pass - Clicked On Customizations Option Successfully");
	bp.waitForElement();
	
	
	
//	executionButton.click();
//	System.out.println("Pass - Clicked On Execution Status Tab Successfully");
//	bp.waitForElement();
	
	return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
}
//
public boolean moveToPreferences() throws Exception
{
 try
 {
 bp=new BasePage();
 WebDriverWait wait=new WebDriverWait(driver,60);
 wait.until(ExpectedConditions.elementToBeClickable(defectAdmin));
 defectAdmin.click();
 System.out.println("Pass - Clicked On Defect Admin Successfully");
 bp.waitForElement();
 preferences.click();
 System.out.println("Pass - Clicked On Preferences Option Successfully");
 bp.waitForElement();
// WebElement ele=driver.findElement(By.xpath(selectCategory1+categoryName+selectCategory2));
// wait.until(ExpectedConditions.elementToBeClickable(ele));
// ele.click();
// System.out.println("Pass - Clicked On '"+categoryName+"' Category Option Successfully");
// bp.waitForElement();
 return true; 
 }
 catch(Exception e)
  {
   e.printStackTrace();
   throw e;
  }
 
}

public boolean createUser(String firstName,String lasTName,String type,String role,String email,String title,String location) throws Exception
{
 try
 {
  bp=new BasePage();
  addNewUser.click();
  bp.waitForElement();
  log.info("Pass - Clicked On Add new User Successfully");
  FirstName.sendKeys(firstName);
  bp.waitForElement();
  log.info("Pass - Entered FirstName Successfully");
  LastName.sendKeys(lasTName);
  bp.waitForElement();
  log.info("Pass - Entered LastName Successfully");
  Select TYPE=new Select(Type);
  TYPE.selectByVisibleText(type);
  bp.waitForElement();
  log.info("Pass - Selected Type Successfully");
  Select ROLE=new Select(Role);
  ROLE.selectByVisibleText(role);
  bp.waitForElement();
  log.info("Pass - Selected Role Successfully");
  Email.sendKeys(email);
  bp.waitForElement();
  log.info("Pass - Entered Email Successfully");
  Title.sendKeys(title);
  bp.waitForElement();
  log.info("Pass - Entered Title Successfully");
  Location.sendKeys(location);
  bp.waitForElement();
  log.info("Pass - Entered Location Successfully");
  boolean val=expireCredential.isSelected();
  if(val==true)
  {
   expireCredential.click();
   System.out.println("Pass-Expire credential un selected");
  }
  else
  {
   System.out.println("Expire credential in selected mode");
  }
  saveNewUser.click();
  bp.waitForElement();
  log.info("Pass - New User is Created Successfully");
  
  return true; 
 }
 catch(Exception e)
 {
  e.printStackTrace();
  throw e;
 }
}

public boolean editDTS(String DTS,String url,String username,String password) throws Exception
{
 
  try
  {
   bp=new BasePage();
  WebElement ele=dtsType;
  Select s1=new Select(ele);
  String value=s1.getFirstSelectedOption().getText();
     System.out.println(value);
  if(!value.equals(DTS))
  {
  s1.selectByVisibleText(DTS);
  
  }
  
  editDTS.click();
 
  dtsName.clear();
  dtsName.sendKeys("JIRA");
  
  dtsUrl.clear();
     dtsUrl.sendKeys(url);
    
  dtsUname.clear();
  dtsUname.sendKeys(username);
    
  dtsPass.clear();
  dtsPass.sendKeys(password);
 
  bp.waitForElement();
  saveDTS.click();
  bp.waitForElement();
  confirmSave.click();
  
  

  System.out.println("DTS data successfully edited");
 
  return true;
  }

  catch (Exception e) 
  {
   e.printStackTrace();
   throw e;
  }

}



}