Feature: Defect Tracking

@Defect_Tracking
Scenario: 0 Login Scenario
Given User Selects the Browser, Launches it and Maximises it_TPE
When User Navigates to the URL provided_TPE
	And User Enters Username, Password and clicks on login_TPE
Then User should be Logged in into Zephyr Successfully_TPE

@Defect_Tracking
Scenario: 8 Search defect/subtask by basic/advance search
Given User is in Defect Tracking page
 When User search a defect by entering project name
 Then Should be able to search the defect
 When User search a defect by entering project name and issue type
 Then Should be able to Search defect
 When User search a defect by entering project name,issue type and status
 Then Should be able to search a defect
 When User search a defect by project name and version
 Then Should Be able to search
 When User search a defect by selecting assignee from dropdown
 Then Should be Able to search the defect
 When User search a defect by project name and priority
 Then Shoulb be aBle to search
 When User search a defect by the filed by
 Then Should be abLe to search
 When User search a defect by project name/issue type/status/version/assignee/priority/filed by
 Then Should be ablE to search
 When User search a defect by jira id
 Then Should be able To search
 When User attempt search a defect by jira id which is non existing
 Then Should not be able to search
 When User search a defect by its id using advanced search
 Then Should be able tO search
 When User search a defect by using JQL
 Then Should be able to Search
 When search a defect by filter using advanced search
 Then Should be able to sEarch
 When search a non existing defect by using advanced search
 Then Should Not be able to search

@Defect_Tracking
Scenario: 9 Search defect/subtask by ID
Given User is in TestRepository page
 When User create a phase
  And Create testcases
  And Create a cycle in TestPlanning
  And Add the phase by choosing phase
  And Launch TestExecution and execute a testcase with status pass
  And click on defect button and select JQL
  Then Should be able to search
  Then Should be able to link a defect
 When click on D button and select my filter and select filter from dropdown
 Then Should be able to search and Link a defect
 When click on defect and select non existing defect id and attempt search for defect
 Then ShOuld not be able to search
 
 @Defect_Tracking
 Scenario: 10 As Mgr, Change Multiple attributes of a Defect in Defect Tracking & Save Changes_External System
 Given User is in a Defect Tracking page
  When User search a defects and select multiple defect and select change multiple option
  Then Should be able to change values of component
  When select change multiple to change version value
  Then Should be able to change values of version
  When select change multiple to change status
  Then Should be able to change values of status
  When select change multiple to change FixVersion
  Then Should be able to change values of FixVersion
  When select change multiple to change Priority
  Then Should be able to change values of Priority
  When select change multiple to change Assignee
  Then Should be able to change values of Assignee
  
  
#@Defect_Tracking
#Scenario: 11 As Mgr, Launch the "Defects Admin" app icon when Defect Tracking is set to_External System
#Given User is in Administration page
 #When User set the DTS
  #And User refresh the page
 #When User select the project and release and launch defect tracking and enter valid login credential and save it
 #Then Should be able to launch defect admin when DTS is set
 
@Defect_Tracking
Scenario: 12 Create a defect/subtask from Test Execution with/without copying steps
Given User Launch TestRepository and create a phase with testcases and add teststeps
 When Launch TestPlanning and create a Cycle and add phase and assign testcase to anyone
  And Launch TestExecution and execute testcase and click on D button
  And click on create defect and enter details and select copy steps from dropdown and save
 Then Should not be able to show teststeps in description field
 When click on create defect and enter details and select copy steps as plain text and save
 Then Should be able to view the test steps,testdata and expected results,status and notes
 When click on create defect and enter details and select copy steps as wiki markup and save
 Then Should be able to view the Test Steps,testdata and expected results,status and notes
 
 
 @Defect_Tracking 
Scenario: 19 Update a defect/subtask in search view
Given User is in defect tracking page
 When User search a defect and update the summary of the defect
 Then Should be able to update summary
 When User search a defect and update the priority of the defect
 Then Should be able to update priority
 When User search a defect and update the component of the defect
 Then Should be able to update component
 When User search a defect and update the version of the defect
 Then Should be able to update version
 When User search a defect and update the fixversion of the defect
 Then Should be able to update fixversion
 When User search a defect and update the environment of the defect
 Then Should be able to update environment
 When User search a defect and update the status and resolution of the defect
 Then Should be able to update status and resolution

 
@Defect_Tracking
Scenario: 56 Link defect to execution and delete linked defect from external JIRA
Given User launch testRepository and create phase with testcase
 When User Launch TestPlanning to create cycle,add a phase to the cycle
  And User Launch testExecution
 Then Should be able to launch testExecution page
 When User navigate to the phase to execute testcase
 Then Should be able to execute testcases
 When User click on D button to link testcase
  And search the defect and link defect to execution
 Then Should be able to link defect to execution
 When User search a linked defect in Defect Tracking page
 Then Should be able to to delete the linked defect
 When User launch testExecution to check notification
 Then Should be able to get notification
 When User navigate to the notification
 Then Should be able to apply notification
 
@Defect_Tracking   
Scenario: 67 View linked open defects count by priority "Open defect" gadget
Given User launch Requirements page
 When User add a node with requirements
  And User launch testRepository to create testcase
  And map testcase to requirement
  And User launch testPlanning to create cycle and add phase to the cycle
  And User Launch testExecution page to execute testcase
 Then Should be able to execute the testcase
 When click on D button to search and link a defect
 Then Should be able to link defect to executions
 When User Launch DashBoard
  And Create a Dashboard by the required fields
 Then Should be able to create dashboard
 When Add open defect gadget
 Then Should be able to add open defect gadget
 When View the total defect count and count by priority
 Then Should be able to show proper count by priority
 
 
 
@Defect_Tracking 
Scenario: 7 Create a defect/sub-task with all types of custom fields.
Given User is in Defect Tracking Page
 When User click on create defect and enter the external Jira project and issue type
  And User enter all types of custom fields
 Then Should be able to create defect
 When User launch TCC page to create a phase with testcases
  And launch test planning to create the cycle and add the phase to cycle
  And User launch Test Execution page to execute testcase and click on D button
  And click on create defect and enters the external Jira project and issue type
  And enter the all the custom fields
 Then Should be Able to create Defect
 
@Defect_Tracking1
Scenario: 13 Create a defect/subtask with newly added values for fields.
Given User is in Defect tracking page
 When User click on create defect button and enter the external Jira project and issue type
  And enter the the available fields
  And enter the all types of custom fields
 Then Should be able to create defect with available values
 When User search a defect and select the defect to create a subtask
  And enter the issue type
  And enter all the available fields with values
 Then Should be able to create a defect subtask with available fields
 
@Defect_Tracking
Scenario: 14 Create a defect/subtask with newly added values for fields.
Given User is in TestRepositorY page
 When create a phase with testcases
  And launch test planning to create a cycle and add phase to cycle
  And launch test Execution to execute testcase
  And click on D button and click on create defect button and enter the external Jira project and issue type
  And enter the available fields with values
 Then Should be able to create a defect with available fields
 When search a defect and click on subtask to create subtask
  And enter the IssueType and click on next button
  And enter all the available fields along with custom fields
 Then Should be able to create defect subtask
 
 @Defect_Tracking
Scenario: 15 Create a defect/sub-task if the fields are mandatory in jira
Given User is in DefectTracking page
 When User click on create defect button and enter external Jira project and issue type
  And enter all the available fields which are mandatory
 Then Should be able to Create Defect
 When search a defect and select the defect
  And click on create subtask and enter the issue type
  And enter all the mandatory fields
 Then Should be able to create defect subtask with available fields
 
@Defect_Tracking
Scenario: 16 Create a defect/sub-task if the fields are mandatory in jira
Given User is in The TestRepository page
 When Create a phase with testcases
  And Launch test planning to create a cycle and add phase to cycle
  And Launch test Execution to execute testcase
  And Click on D button and click on create defect button and enter the external Jira project and issue type
  And Enter the available fields with values and save
 Then Should Be able to create defect with available fields
 When Search a defect and click on subtask to create subtask
  And Enter all the available fields along with custom fields and save
 Then Should be Able to create defect subtask with the available fields

  
  @Defect_Tracking
  Scenario: 52 link the defect to execution and change linked defect status In external jira
  Given User is in the main page
  When User will click on the respository button and right click on release
  And user will add the test node
  Then user test node addded successfully
  When User will add  testcases
  Then testcases added successfully
  When user clicks on test Planning page and click on add test cycle
  And create a cycle and add the created phase to the cycle and assign to everyone
  Then testcases should be assigned to everyone
  When user will click on testexecution button and navigate to related node
  And user will execute the testcase to pass status
  Then status should be changed to pass
  When tester will click on the D button and search the defect by id
  Then defect should be successfully searched
  When user linked the searched defect
  Then should be able to link defect to execution successfully
  When User click on defect Tracking page
  And search for that defect ID
  Then searched defect will be shown in search page
  When user click on that defect Id
  Then Jira page will open
  When user fill up the jira credential and click on login
  And user will change the status of that defect in jira
  And user will open test execution and search for that defect id
  Then the status of that defect has been changed to new Updated status
  
  @Defect_Tracking
  Scenario: 53 link the defect to execution and change linked defect priority In external jira
    Given User will be in main page
    When user will go to execution page and navigate to the node
    And user will change the status of the testcase
    Then status successfully changed
    When user will search defect and link sucessfully
    Then should be able to link defect to Execution successfully
    When user will go to defect Tracking page search for the defect Id and click on it
    Then new tab Jira will open the page and fill the Credentials
    When user will change the priority and switch back to application
    And user will check for the notification in testexecution page
    Then the Priority of that defect has been changed
    
  @Defect_Tracking
  Scenario: 54 Link defect to execution and change linked defect Summary In external JIRA
    Given User is in the home page
    When user will goes to textexeution page and navigate to the node
    And user changes the Status of the TestCase
    Then status changed sucessfully
    When user will click on D button and search the defect and link it
    Then should be able to link defect to execution Successfully
    When user will go to defect tracking page and search the defect and click on it
    Then a new JIRA page will appear
    When user change the summary of the issue
    And user will switch back to the application page
    And user will goes to testexecution page and apply notification
    Then user will View the updated Summary in execution grid.
    
    @Defect_Tracking
    Scenario: 55 Link defect to execution and move linked defect from one project to another project in external JIRA
    Given User in the Home_Page
    When user will clicks on TextExecution page and navigated to the selected node
    And user changes the status of the related Testcase
    Then Status should be changed sucessfully
    When user click on the D button 
    And user will search for the defect and link that defect
    Then defect must linked to Execution sucessfully
    When user goes to DefectTracking page 
    And user search the Defect and clicks on it
    Then Jira will open the page
    When user fills the Credentials
    And will moved the linked defect to another project 
    Then defect must move Sucessfully to another project
    When user comes back to Application page
    And user will clicks on the textExecution button 
    And user clicks on the Apply Notification button and selects apply 
    Then user would be able to view new Defect-ID on execution grid 
    
    @Defect_Tracking
    Scenario: 57 Click on linked defect ID in test execution grid
    Given user will be in a homePage
    When user clicks the execution button and will navigates to the node
    And user will select the test case and change the status 
    Then status of that testcase is changed sucessfully
    When user clicks on the D button and search for the defect by id
    And user will link to the execution testcase
    Then sucessfully a new defect is linked in test execution grid
    When user clicks on that new defect id in testExecution grid
    Then Should navigate to DefectTracking page and search for that defect by id 
    
    @Defect_Tracking
    Scenario: 58  Click on linked defect ID in Link defect window
    Given user will be in a mainPage
    When user goes to testexecution page and navigates to the related node
    And user will goes to the selected testcase and will change the status of the testcase
    Then Status of the selected testcase must be changed sucessfully
    When user clicks on the D button of that testcase
    And user will search for the defect id and link that defect to execution testcase
    Then testcase must be linked sucessfully
    When user will click on the defect id in currently linked defects top column on the same page
    Then Should navigate to DT page and search for that defect by id
    
    @Defect_Tracking
    Scenario: 59 Link defect to to execution and view remote link in jira
    Given User shall be in Main_Page
    When user clicks testExceution button and goes to testExecution page 
    And user will search for the related node
    And user will select the TestCase and change the status 
    Then status of the testcase has been sucessfully Changed
    When user clicks on the Deffect D button of the related testcase
    And user search for the Defect ID and links that id to test execution
    Then Defect Id must linked sucessfully
    When user will click on links defect id
    Then A new JIRA page will open 
    When user will fill the credentials and login 
    Then should view remote link in jira 
    
    @Defect_Tracking
    Scenario: 60 Click on testcase ID in execution remote link in JIRA
    Given User will be in a testExecution page
    When user will navigate to the node
    And user will select the testcase and change the status 
    Then the selected status must be sucessfully changed
    When user will clicks on the changed status D button
    And user searches for the defectId and link the id to testcase
    And user will click on the defectID in linksdefect grid
    Then jira page will open 
    When user will fill the credentials in jira page and click on login button
    And user will click on the testcase ID 
    Then Should navigate to ZE test repository search window and search for that testcase
    
    @Defect_Tracking
    Scenario: 61  Click on testcase execution status in execution remote link in JIRA
    Given User shall be in testExecution page 
    When  user will navigates to related phase
    And user will change the status by selecting the testcase
    Then selected testcase status is changed
    When user clicks on the D button which the status has been changed
    And user will search the defectID and links it to the testcase
    Then defect must be sucessfully linked
    When user will clicks on the ID in linksdefect grid
    Then a jira page will appear
    When user will enter correct username and password and click on login 
    And user will click on the testcase Execution Status icon button 
    Then Should navigate to ZE test execution search window and search for that testcase
    
     @Defect_Tracking
    Scenario: 62 De-link the linked defect from execution and view the execution remote link in external JIRA
    Given user is in testExecution page
    When user naviagtes to node
    And user will change the status 
    Then sucessfully status changed of the testcase 
    When user clicks on D icon and naviagtes to linkwindow page
    And user will search for the defectId and link it to testcase
    Then defect must be sucessfully linked to testcase
    When user will click on the defectID in grid
    Then jira will open and user will switch to that window
    When user will enter the username and password 
    Then user will validate the link of the testcase
    When user clicks on logout button 
    Then user will comes to ZE application page
    When user selects the DefectId and clicks on Delete button
    And user again Search for the defectId and clicks on that ID
    Then jira page will appear in new tab
    When user enters correct valid username and password and click on login button
    Then Execution remote link should be removed from external JIRA after de-linking the defect
    
     @Defect_Tracking
    Scenario: 63 Hover on defect ID in test execution grid
    Given User will comes to TestExecution page
    When user will selects the related node to start execute testcase
    And user will select the testcase and change the status of that testcase 
    Then status must be changed sucessfully
    When user will click on D icon button Sucessfully
    And user will search a defectID and link it to the testcase sucessfully
    Then Should be linked to testcase sucessfully in testgrid  
    When user will mouse Hover on the linked testcase testcase 
    Then Should be able to defect details Defect ID,summary,status and priority in testExecition grid
    
    @Defect_Tracking
    Scenario: 64 View linked defects count by status in defect tracking app
     Given User is in a TestExecution Page 
     When user will navigate and selects the node
     And user will change the status to fail of the selected testcase 
     Then selected testcase is changed sucessfully
     When user will clicks on the D icon button in the grid
     And user searches the mutiple defect and links to the same testcase
     Then multiple defect to that testcase is linked sucessfully
     When user launches the defectTracking page
     Then user will view total linked defect and by status count
     
      @Defect_Tracking
     Scenario: 65 View linked defects count by status in Release summary page
     Given User arrives to TestExecution page
     When user selects the related node and phase
     And user will select the testcase and change the status of that testcase by fail 
     Then the selected testcase has changed to fail status sucessfully 
     When user will click on the D icon button of the tescase which status has been changed
     And user will search for different defectid and links it to testcase 
     Then the multiple defect must link to testcase Sucessfully
     When user will now selects the project and goes to release page
     Then should view the total linkeddefect count by status 
     
      @Defect_Tracking
      Scenario: 66 View linked defects count by status Overall defect gadget
     Given Users Comes into TestExecution Page
     When user will goes to the selected node by navigating 
     And user selects the testcase and change the status of the selected testcase 
     Then testcase status must be changed sucessfully
     When user clicks on the D icon 
     And user will search multiple defect and links it to testcase
     Then user must sucessfully linked all multiple defect to that testcase
     When user clicks on the dashboard button
     Then user must sucessfully comes to dashboard page 
     When user will click on AddDashboard Symbol
     And user will enters all the details and click on save
     Then dashboard must be sucessfully saved
     When user clicks on dashboard which is created
     And user will click on the plus button to add the overall defects gadget
     Then sucessfully gadget must be added
     When user selects the project name and release and refreshrate and save the gadget
     Then gadget must be sucessfully saved and View the total defect count and count by status
     
      @Defect_Tracking
     Scenario: 68 View linked defects count by status Traceability gadget
     Given User is in Requirement page
     When user will create a node and add requirements
     Then requirement added successfully
     And user clicks on the resporitory page 
     And user will click on release and create a node
     And user will add testcases
     Then testcases must be added successfully
     When user will map the testcase to requirement node
     Then testcase should be sucessfully mapped
     When user clicks on testplanning page 
     And user will click on add symbol to create cycle
     And user will fill all the details 
     Then test planning cycle is created successfully
     When user will navigate and add phase to the cycle
     And user will assign testcase to user 
     Then testcase successfully assigned to user     
     When user clicks on testExecution page 
     And user will be change the status of the testcase 
     Then Status should be able to change successfully
     When user will click on D button and search for the mutiple defect and link it
     Then multiple defect must be linked successfully
     When user will click on the dashboard button
     Then Dashboard page must be validate sucessfully
     When user clicks on add dashboard button 
     And users enters the fields to create dashboard
     Then dashboard must created successfully
     When user adds the Traceability gadget 
     Then gadget must be able to added successfully
     When user will selects project,release and refreshrate
     And user will clicks on manage button and search for the mapped requirement
     And user will click on save button
     Then gadget must be added sucessfully and view the total open defect count and count by priority
     
     @Defect_Tracking 
     Scenario: 69 View defect count in Daily pulse gadget
     Given Manager is in a administration page
     When manager clicks on Project SetUp button
     And map the jira project to ZE
     And manager will logout from application 
     And User will login with lead credentails 
     And user will click on dashboard button
     Then user must comes to dashboard page successfully
     When user clicks on add dashboard button and fill the details
     Then dashboard created successfully 
     When user cliks on add gadget symbol 
     And adds Daily pulse gadget 
     Then Daily pulse gadget must be added successfully
     When user will fill all the details and click on save button
     Then user must view the total defect count in mapped JIRA project
     
     
     #@Defect_Tracking 
      #Scenario: 72 View Mapped project selected by default while filing defect/sub-task
     #Given Manager will be in projectSetUp Page
     #When Manager map the jira project to ZE application
     #And manager will logout from manager credentials 
     #And User will enter ZE application with lead credentails
     #And user clicks on the DefectTracking button 
     #Then user must come to defect Tracking page successfully
     #When user clicks on the CreateDefect button
     #Then user must view mapped project selected by default in create defect window 
     #
     @Defect_Tracking 
     Scenario: 31 Navigate by Click on the Testcase ID of a Defect/subtask in SEARCH view
     Given User will be in Test Repository page 
     When user clicks on relase and create a node
     And user will add four testcase
     Then testcase must be added successfully
     When user clicks on testplanning button and clicks on add cycle button
     And user will fill the details 
     Then test cycle has been created successfully
     When user selects the cycle and adds the phase
     And user will select the bulk assignment and assign to everyone
     And user will click on testExecution button
     And  user will selects a single testcase and changes the status
     Then status have been sucessfully changed of the testcase
     When user will clicks the D icon button 
     And searches for the defect id and links the testcase 
     Then testcase must be linked successfully
      When user clicks on DefectTracking button
      Then user will comes to Defecttracking page
      When user searches for the defectId 
      Then defectid is validated successfully
      When user clicks on the testcaseID of the defectID linked grid
      Then Should be able to navigate to the testExecution search page with same TestcaseID
      
      #@Defect_Tracking 
      #Scenario: 32 View the DETAILS Info of a Defect in details of SEARCH view
      #Given user will be in a testRepository page
      #When user clicks on the release and creates a node
      #And user will add three testcase
      #Then three testcase will be successfully added
      #When user will comes to testplanning page
      #And user will creates a testcycle
      #Then testcycle must be created successfully
      #When user comes to testExecution page
      #And selects the first testcase and change the status
      #Then first testcase status changes successfully 
      #When user clicks on the first testcase D button
      #And user will search for the defect-Id and links the testcase
      #Then testcase must linked successfully and show the name of the defectID
      #When DefectTracking button is clicked by user
      #Then user will navigate to defectTracking page
      #When user enter the defectId and clicks on search button
      #Then defectID will be successfully searched
      #When user selects the defectID in grid
      #Then user Should be able to View the DETAILS Info of a Defect in details of SEARCH view 
      #
      @Defect_Tracking 
      Scenario: 82 Search defect which is linked to execution and view cycle and test case in search grid in defect tracking app
      Given user will be in a test Repository app
      When user creates a phase ,node and subnode 
      And user adds testcase to all three levels of nodes
      Then testcase is successfully added to all three levels of nodes
      When user navigates to Test Planning app
      And user creates a cycle by entering all details
      Then cycle created is validated successfullys
      When user clicks on test cycle and assign the phase 
      And user will assign bulk assignment to user
      Then assign testcase to user is successfully validated of all three level nodes
      When user naviagtes to test Execution page
      And user selects all three level nodes and changes the status 
      Then status changes of all three nodes must be validated successfully
      When user clicks on D icon button and will search the defect and links all three level nodes testcases
      Then linked testcase of all three level node must be validated successfully
      When user navigates to DT page
      And user searches for the defectID and clicked on seacrched button
      Then user Search linked defect at phase,node,subnode and also must view cycle and testcase in search grid in defect tracking app
      
     
  
   @Defect_Tracking   
  Scenario: 180 file defect/subtask from Test Execution, Copy test Steps as As wiki markup  if there are no test steps 
   Given User Logins as Manager to Zephyr
   When  User set DTS to JIRA
   Then  Should be able to Set
   When  User launch test repository 
   And   user creates a phase and adds testcase without steps
   Then  user should be able to create TestCase
   When  User is In a TestPlanning,Creates a cycle and Add phase to cycle and Assign testcases to users
   Then  user should be able to assign TestCases to user
   When  User Launches TestExecution 
   And   User Execute a testcase and Clicks on D button
   Then  Link defect window should launch
   When  user While filing defect,In desc field copy steps as wikimark up
   Then  In JIRA desc field should include table of teststeps
 
@Defect_Tracking
Scenario: 181 Copy test Steps as 'As wiki markup' if no test step is executed
  Given User Logins As Manager Credentials to Zephyr
  When  user set DTS TO JIRA
  Then  DTS should be set
  When   user is in  Test Repository,Creates a phase and add testcase with steps
  Then   should able to create a testcase
  When   user Launches Test planning creates cycle,Add phase to cycle and assign testcases to users
  Then   should be able Assign testcase to users
  When   user Launches test execution exexute testcase not the steps and clicks on D button
  Then   Link defect window should be launched
  When  While filing defect in desc field copy steps as As wikimark up
  Then  In jira desc field should include table of teststeps
  

@Defect_Tracking
Scenario: 182 file defect/subtask from Test Execution ,Copy test Steps as As wiki markup if the test steps are executed
Given User is in a TestRepository
When  user creates a phase and add testcase with steps
Then   should be able to create a testcase with steps
When   user Launch Test planning creates a Cycle,adds phase to cycle and assign Testcases To user
Then   should be Able to assign Testcase to User
When   user launches test execution execute testcase with steps and clicks on D button
Then  link Defect Window Should launch
When  While filing defect,In desc field copy Steps as  As wikimark up
Then  desc field should include table of teststeps in JIRA

@Defect_Tracking 
Scenario: 183 Copy test Steps as As wiki markup if the test steps have custom execution status
Given User launches TestRepository
When  User creates a Phase and adds test case with steps
Then   should be able to create a test case
When   user launches Test planning,creates cycle adds phase to cycle AND assign TestCase to user
Then   To be able to assign TestCase to user
When   user launch Test execution,Executes testcase with the steps to custom steps 
And   user Clicks On D button
Then  Defect Window should launch
When  user while Filling a defect,In desc Field copy steps as As Wikimark up
Then  Desc Field should include table of teststeps

@Defect_Tracking  
Scenario: 184 Copy test Steps as As wiki markup, if  test steps + test data + Expected Result are blank
Given User Is In a test Repository
When  user creates a phase and adds testcase with steps with test steps and test data and Expected Result are blank
And   user launches TestPlanning,Creates a Cycle,Adds phase to cycle and Assign testcases to users
And   Launches TestExecution,Executes testcase with the steps to custom steps and Clicks on D button
Then  defect window to be launch
When  user while creating a defetct,In desc Field copy steps as wikimark up
Then  Desc Field should include table of steps

@Defect_Tracking 
Scenario:185 file defect/subtask from Test Execution,copy test steps as wiki markup if test steps are executed to any status with notes
Given User launches Test Repository page
When  user creates a phase add testcase with steps with test steps 
And   Launches test planning
And   user creates New cycle,Add phase to cycle and Assign testcases to users
Then  testcase should be assigned to user
When  user launches Test execution,Executes testcase with the steps to any status and add notes,Click on D button
Then  Defect window should be Launched
When  while filling defect,In desc field Copy steps as As wiki mark up
Then  Description field should include table of teststeps

@Defect_Tracking
Scenario:186 file defect/subtask from Test Execution for a testcase, copy test steps as wiki markup if  teststeps are partially executed
Given User is IN a TestRepository
When  user creates a new Phase and adds Testcase with steps with Test Steps
Then  To  be able to create a TestCase with steps
When  user launches testplanning
And   creates a New Cycle, Add phase to cycle and Assign testcases to users
Then  should be Able To assign Testcases to User
When  user launches test execution 
And   Executes testcase with the steps partially and Clicks on D button
Then  Defect window to be launched
When  while filling defect,In description Field copy steps as wikimark up
Then  Desc field should include table of teststeps In JIRA 

 

@Defect_Tracking
Scenario:187 file defect/subtask from Test Execution,Copy test Steps as wiki markup if the test steps contain international characters
Given user is in a page of Test Repository
When  user creates a new phase,add testcase with steps with international chars
Then  should be able to create testcase
When  user launches testplanning,create a cycle Add phase to cycle and Assign testcases to users
Then  should able to assign testcase to user
When  user launches test execution,executes testcase with the steps and Clicks on D button
Then  link defect window should launch
When  filling defect,in desc field copy steps as wikimark up
Then  in jira desc field should include table of teststeps

@Defect_Tracking
Scenario:188 Copy teststeps as wiki markup if the test steps contain special characters, whitespaces, and new linecharacters
Given user launches Test repository
When  user creates a Phase adds testcase with steps with special chars
Then  should be able to Create a TestCase
When  user is in a test Planning page
And   user Creates a cycle,Adds phase to cycle and Assign Testcase to users
Then  user To Be able to assign testcase to user
When  user launch Test Execution Page
And   Executes testcase With the steps and Clicks on D button
Then  Link Defect Window should be Launched
When  While Filing defect in desc field Copy steps as As Wikimark Up
Then  In JIRA Desc Field Should include Table of teststeps


@Defect_Tracking 
Scenario: 45 Update the Defect/Subtask with comment
    Given User Launches Defect Tracking App
    When  user Searches defect by any attribute Project,Issue type,Priority,Status,Assignee,ID,Advance_JQL
    When  After search result,Select a defect,sub-task in  grid -> Update the defect/subtask with comment 
    Then  Should be able to Update the Defect,Subtask with comment
 
@Defect_Tracking    
Scenario: 46  Update the Defect/Subtask with comment  and cancel
Given User Is IN A DefectTracking App
When  user Searches defect by any attribute Project,issueType,Pripority,status,assignee
When  after search result,select a defect,sub-task in grid,Enter the  comment  Cancel the X button
Then  Should be able to  Update the Defect,subtask with comment  and cancel

@Defect_Tracking
Scenario:40 Submit a defect with < > tag [special character] in the Description field
Given In zephyr  login as a manager
When  user launches Administration set DTS to Jira
Then  should be Set DTS to JIRA
When  user Launches Defects Admin app  and configured  dts.customfield.jira.date_format = yyyy-MM-dd
Then  To be able to configure 
When  user launches Defect Tracking app and clicks on create defect
And   Create a defect with special characters
Then  should create a defect with special characters
When  In zephyr as a manager launch Administration and set DTS to Jira
Then  should set dts to jira
When  user launches TestExecution app,Execute a testcase with any status 
And   user Clicks on D and  Clicks on Create Defect
And   user Create a defect with special characters 
Then  Should be able to Submit a defect with < > tag in the Description field


@Defect_Tracking 
Scenario:41 Submit a sub task with < > tag [special character] in the Description field
Given Login as Manager to Zephyr application
When  user launches administration app and set DTS to Jira
Then  Should be able to set Dts
When  user Launches Defect Admin app  and configured  dts.customfield.jira.date_format = yyyy-MM-dd
Then  to Be able to configure
When  user Launches Defect Tracking app,clicks on create defect
And   create a Sub task with Special characters
Then  should be able To Create
When  in zephyr as Manager launch Administration app and set DTS to Jira
Then  should be able To set dts to JIRA
When  user launch Test execution,executes a Testcase with any status
And   user clicks on D button and clicks on create defect
And   user creates the subtask with special characters 
Then  To be able to Submit a subtask with special character in the Description field 

@Defect_Tracking
Scenario:42 Submit a defect with International character in the Description field
	Given Login as Manager credential to zephyr
	When  user launches administration App and set Dts to Jira
	Then  should be set DTS to JIRA
	When  Launch Defects admin app and Configured dts.customfield.jira.date_format = yyyy-MM-dd
	Then  should be possible to configure
	When  user launch Defect tracking application and Clicks on Create Defect
	And   Create a defect with international characters in description
	Then  should be able to create Defect
	When  In zephyr as a manager,launch Administration and set DTS to Jira
	Then  To be set Dts to JIRA
	When  user Launch Defects Admin app and Configured dts.customfield.jira.date_format = yyyy-MM-dd
	Then  should be configured
	When   launch TestExecution application Executes a testcase with any status 
	And   user Clicks on D and Clicks on Create Defect
	And   create a defect with International characters in Description
	Then  Should be able to create a defect with international characters  
	
@Defect_Tracking	
Scenario:43 Submit a sub task with International character in the Description field
Given login as Manager To Zephyr
When  launch Administration and set DTS to Jira
Then  DTS to Jira should be set
When  launch Defects admin app and Configured dts.customfield.jira.date_format = yyyy-MM-dd
Then  should be configure
When  user Launch Defect Tracking app,Click on Create Defect
And   Creates a sub task with International character in description
Then  should be able to create
When  In zephyr as a manager,launch Administration and set dts to Jira
Then  should be set dts to jira
When  user Launches Defects Admin app and configures dts.customfield.jira.date_format = yyyy-MM-dd
Then  dts.customfield.jira.date_format = yyyy-MM-dd should configure
When  user launches test execution,executes a testcase with status
And   clicks on D and clicks on create defect
And   create a sub task with international character in description
Then  should be able to create a defect

@Defect_Tracking
Scenario:44 Perform Sort on any column header of Defect Listings 
Given User is in a Page of Defect Tracking
When  User searches Defect by any Attribute
And   after search,Sort on Any Column Header of Defects
When  User launches Defect tracking app and search by Jql
And   after search,sort any column Header of Defect listings
Then  Should be sorted Defects
When  user launches defect tracking app and searches by MyFilter
And   sorts any column Header of Defect Listings
Then  Defect listings should be sorted
When  user is in test execution page,executes testcase with any status and clicks on D button
And   user search by MyFilter and Sorts  on any column header of Defect Listings
And   Launch Test Execution,Execute testcase with any status and Click on D 
And   Search by JQL,Sort on any Column Header of Defect Listings
Then  Should be able to Perform Sort on any column header of Defect Listings

@Defect_Tracking
Scenario: 33 Create  a defect/Subtask with custom field of type Text Field
Given User is in a Defect Tracking Page and clicks on create defect
When  user Creates a defect with only numbers in custom field of type Text Field
Then  should be able to create a defect with only numbers
When  User Creates a defect with custom field of type Text Field in UPPERCASE
Then  should create a defect with custom field of type Text Field in UPPERCASE 
When  user Creates a defect with custom field of type Text Field in lowercase
Then  Defect should be created with custom Field of type TextField
When  Creates a defect with custom field of type Text Field containing alphanumeric characters and spaces
Then  should be able to create a defect with custom field containing alphanumeric characters
When  user Creates a defect with custom field of type Text Field containing special characters
Then  should be created a defect with custom field of Type  Text field
When  Create a defect with custom field of type Text Field containing international characters
Then  Defect should be created with custom field of type Text Field containing international characters
When  user launches defect tracking app,searches a defect and selects it and clicks on Create Sub-task 
And   creates a subtask only numbers in custom field of type Text Field
Then  should create a subtask only numbers in custom field of type text Field
When  user creates a subtask with custom field of type Text Field in lowercase
Then  lowercase of subtask should be created
When  user creates a subtask of type Text Field containing alphanumeric characters and spaces
Then  subtask should be created of type Text Field containing alphanumeric characters
When  user Creates a subtask with custom field of type Text Field containing special characters
Then  should be created a subtask with custom field of type Text field consists of special characters
When  user creates a sub task the text field containing international characters
Then  should be created a defect which containing international characters of text field
When  user launches test repository page, creates a Phase 
And   adds a few testcases, and goes to Test Planning Creates a cycle and assigns testcases to Anyone
And   User launches Test execution,selects test cases and executes with any status and clicks on D
Then  Defect window to be Launched
When  User clicks on create defect and creates a defect with only numbers in text field
Then  defect should create only numbers in text field
When  Create a defect of type Text Field in UPPERCASE
Then  defect should be created of type text field in Upper case
When  create a defect of type text field in lower case
Then  defect should create of type text field in lower case
When  user will Create a defect  of type Text Field containing alphanumeric characters and spaces
And   user will create a defect of type Text Field containing special characters
And   user will create a defect of type Text Field containing international characters
Then  should be able to create a defects of Type text field
When  user launch test repository page and creates a phase and adds few testcases
And   user launch test planning page,create a cycle and assign phase to cycle,assigns testcases to anyone
And   user goes to test execution,executes testcases with ANY Status,clicks on D button
Then  defect window should be opened
When  user clicks on create defect button
And   searches a defect and creates subtask
And   Create subtask with custom field of type Text Field in Uppercase
And   Create SubTask with Custom field of type text field in Lowercase
Then  should be created a sub task with custom field of type text fields
When  create a subtask with custom field of type Text Field Containing alphanumeric Characters
And   Create a subtask with custom field of Type text Fields containing Special Characters
And   Creates the subtask with custom field of type text field Containing International characters
Then  should be able to create a subtask with custom field of type text field consists international characters

@Defect_Tracking
Scenario: 34 Create  a defect/Subtask with custom field of type Free Text
Given user is in a page of defect tracking and clicks on create defect
When  user creates a defect with only numbers in custom field of type Free Text
Then  should able to create a defect with only numbers in custom field of type free Text
When  Create the Defect with custom field of type Free Text in UPPERCASE characters
Then  Uppercase character defect should be created
When  Create Defect With custom field of type Free text in lowercase
And   user Creates defect with Custom field of Type Free Text containing alphanumeric characters and spaces
And   create Defect with custom field of type Free Text containing Special characters
And   create a defect with custom field of type free text containing international characters
Then  to be able to create the defect
When  Create a defect with custom field of type Free Text containing new line characters 
And   Create defect With custom field of type Free Text by Copy/Paste pre-formatted text containing new line characters from clipboard
Then  should create the defect
When  Create a defect with custom field of type Free Text greater than two thousand fourty eight characters
And   Create a defect with custom field of type Free Text with very long text as defined in  Defects Admin
Then  defect should create as very long text as defined in  Defects Admin
When  Defect with custom field of type free text longer than configured maxlength using old property DTS.CUSTOMFIELD.customfield_xx.MAXLENGTH
Then  should create defect with custom field of type free text
When  user launches defect Tracking app,search defect and selects it
And   clicks on Create Sub-task
And   Create subtask with Only Numbers in Custom field of type Free Text
Then  should be able to create a subtask with only numbers in custom field of type free text
When  create subtask with custom field of type Free text in UPPERCASE
And   create Subtask with custom field of type Free Text in lowercase
And   Create subtask with custom field of type Free Text containing alphanumeric characters and spaces
Then  to be able to create the subtask with custom field of type Free Text consists of alphanumeric
When  Create Subtask with custom field of type free text Containing Special characters
And   Create a subtask with Custom field of Type Free Text containing international characters
And   Create a Sub task with custom field of type free text containing new line characters
Then  should create a sub task with custom field of type free text consists of new line characters
When  Create Subtask with custom field of type Free Text with very long text as defined in Defects Admin
Then  should able to create a subtask with very long text
When  Create a Sub task with custom field of type Free Text longer than the configured maxlength using the old property
Then  subtask should be created with custom field of type Free Text longer than the configured maxlength
When  Launch test repository,create a phase and add few test cases
And   go to test planning,create a cycle and assign phase to cycle and assign testcase to anyone
And   go to test execution,select testcases and execute with any status
And   user clicks on D button
Then  link defect Window Should be Launched
When  user clicks on create defect and creates defect with only Numbers in custom field of Type free Text
And   Create defect with custom field of Type Free Text in uppercase
And   create Defect with custom field of type Free Text in lowercase
Then  Defect with custom field of type Free Text in lowercase should be created
When  user Creates the defect with custom field of type Free Text containing alphanumeric characters and spaces
And   Create Defect with custom field of type Free Text containing special characters 
And   create Defect with custom field of type Free Text containing international characters
Then  Defect with custom field of type Free Text consists international characters should be created
When  Create a defect With custom field of type Free Text Containing New line characters
And   create defect with custom field of type Free Text by copy/paste pre-formatted text consists new line characters
And   create a defect with custom field of type Free Text more than two thousand fourty eight characters  
Then  should be able to create a defect with custom field of type Free Text
When  create Sub task with custom field of Type Free Text with very long text as defined in defects admin
And   create a defect with custom field of type Free Text longer than the configured maxlength
Then  defect with custom field of type Free Text to be created
When  launch test repository Page,create a phase and add testcases
And   launch tesplanning,create new cycle and assign phase to cycle and assign testcases to anyone
And   launch test execution,execute TestCases with Any status
And   select testcase and clicks on D button
Then  link defect window should be opened
When  user search defect,and selects it
And   clicks on Create subtask
And   Create Subtask with only numbers in custom field of type Free Text
Then  Subtask with only numbers in custom field of type Free Text should be created
When  create Subtask with custom field of type Free Text in UPPER CASE characters
And   Create the subtask with custom field of type Free Text in lowercase
And   Create The subtask with custom field Of Type Free Text consists alphanumeric characters and spaces
Then  should be able to create a subtask
When  user creates subtask with custom field of type Free Text Containing special characters
And   Create a subtask with custom field of type Free Text containing international characters
And   create Sub task with custom field of type Free Text containing new line characters 
Then  should be able to create a subtask
When  Create subtask with custom field of type Free Text by Copy/Paste pre-formatted text containing new line characters
And   Create a Sub task with custom field of type Free Text more than two thousand fourty eight characters
And   create a Sub task with custom field of type Free Text with very long text as defined in  Defects Admin
And   create the Subtask with custom field of type  longer than the configured maxlength
Then  Subtask with custom field of type Free Text should be created

#Free Text#
@Defect_Tracking
Scenario:35 Create  a defect/Subtask with custom field of type Select List
Given User is in a Page Of Defect Tracking and clicks on Create Defect
When  user creates a defect with select list of values containing only numbers
And   user creates a defect with Select List of values in UPPERCASE
And   create a defct with select list of values in lower case
Then  should be able to create defect with Select LOV in lowercase
When  user Creates a defect with Select List of values containing alphanumeric characters and spaces
And   Create a defect with Select List of values containing special characters
And   Create a defect with Select List of values containing international characters
Then  should be able to create a defect with select LOV
When  User is in page of defect tracking,and searches defect
And   selects defect and clicks on create subtask
And   Create the subtask with Select LOV containing only numbers
Then  subtask with Select LOV containing only numbers should be created
When  Create the subtask with Select List of values in UPPERCASE
And   Create subtask with Select List Of Values in lowercase
And   Create a subtask with Select List LOV containing alphanumeric characters and spaces
Then  subtask with Select List LOV containing alphanumeric characters to be created
When  Create a subtask with select List of values containing special characters
And   create the sub task with select list of values containg International characters
Then  should be able to create the sub task with select list of values
When  user Is in a Page of Test repository,creates a phase and adds few Testcases
And   user Is in a Page of test planning,creates a cycle and assign phase to cycle and assign testcases to anyone
And   user Launches Test Execution,selects testcases and executes with any status and clicks on d button
Then  Link defect window to be Launched
When  user clicks on Create Defect
And   creates the defect with select list of Values containing Only Numbers
And   creates The Defect With select lov consists Uppercase characters
Then  Defect With select lov consists Uppercase characters to be created
When  create a defect with Select LOV consists  lowercase characters
And   Create a defect with Select List LOV consists Alphanumeric characters and spaces
Then  defect with Select List LOV consists Alphanumeric should be created
When  User creates defect with select LOV consists special characters
And   user create The Defect With Select lov containing international characters
Then  Defect With Select lov containing international characters should be created
When  User Launch test repository page,creates a phase and Adds Few TestCases
And   User Launch TestPlanning page,create a cycle and assign Phase to cycle
And   Launches TestExecution,selects testcases and executes with any status
And   user click on d button
Then  defect window to be opened
When  User create the subtask with select Lov consists containing only numbers
And   create the sub task with select list in UPPERCASE characters
Then  sub task with lov in uppercase should be created
When  create a subtask with select LOV in lowercase characters
Then  The sub task with Select list of values in lowercase to be able to create 
When  create the sub task with select LOV containing Alpha Numeric characters and Spaces
And   create the SubTask with select list of values containing special characters
And   create the subTask with select LOV consists International characters
Then  subTask with select LOV consists International characters should be able to create  

@Defect_Tracking
Scenario:38 Create  a defect/Subtask with custom field of type Date Picker
Given User Launches Defect Tracking app and clicks on a create defect
When  user Creates a defect or subtask with custom field of type Date Picker as current date
Then  should be able to create a defect with custom field of type Date Picker as current date
When  user creates a defect with custom field of type Date Picker as date in the past
Then  should be able to create a defect with custom field of type Date Picker as date in the past
When  user Creates a defect with custom field of type Date Picker as date in the future
Then  should be able to create defect with custom field of type Date Picker as date in the future
When  user Launches defect tracking,Search defect and Select it and Clicks on Create Sub-task
And   Create a subtask with custom field of type Date Picker as current date
Then  should be able to create a subtask with custom field of type Date Picker as current date
When  user Creates subtask with custom field of type Date Picker as date in the past
Then  should be able to create a subtask with custom field of type Date Picker as date in the past
When  user Create a subtask with custom field of type Date Picker as date in the future
Then  should be able create subtask with custom field of type Date Picker as date in the future
When  user is in a test repository page,creates a phase P1 and adds Few TestCases
And   user goes to Test Planning Creates a cycle C1 and adds Phase P1 and assign testcases to anyone
Then  testcases should be assigned to anyone
When  user is in a test execution,select testcase and execute with any status
And   user clicks on D button and Clicks on Create defect
And   Creates a defect of custom field type Date Picker as current date
Then  should be create defect of custom field DatePicker
When  user creates a defect with custom Field type Date Picker as date in past date
Then  successfully should create a defect 
When  create a defect with custom fields of DatePicker as type as in the future date
Then  successfully should create a defect of Date Picker Type 
When  user launches test repository, creates a phase P2 and adds few TestCases
And   user is in a TestPlanning, Creates a Cycle C2 and adds Phase P2,assigns TestCase to anyone
And   user goes to TestExecution,executes testcase with any status and clicks on D button
Then  Defect window should be launched
When  user clicks on Create Defect,and search for a defect and create a subTask
And   creates subtask Date Picker as current date
Then  subtask of Date Picker should be created
When  creates subtask type Date Picker past date
Then  past date should be created and Updated
When  creates subtask type Date Picker future Date
Then  successfully should create a defect of Date Picker as in the future Date

@Defect_Tracking
Scenario:190 link an existing defect/subtask to a test in test planning, if testcase execution status is customized
Given User logins as Manager to Zephyr
When  user sets dts to jira
Then  dts to jira should be set
When  user customizes the test case status ex:PassA,FailB,
Then  Should be able to customize the status
When  user Launch Test Repository Page
And   user creates a phase and adds testcase
Then  should be able to create a testcase
When  user is In a Page Of Test Planning
And   creates a cycle,adds Phase to cycle and assigns TestCases To User
Then  TestCases should be assigned to User
When  USER Launches TestExecution Page 
And   Executes a Testcase and clicks on d icon
Then  link Defect Window To be Launched
When  user searches defect and Links It
Then  should Be Able to link defect to executions

@Defect_Tracking
Scenario:191 file defect/subtask from Test Execution, if testcase execution status is customized
Given User is in a page  of Test repository
When  creates a phase and adds testcase
Then  should be able to add Testcase
When  launches Test planning page
And   create a new Cycle,add phase To Cycle and assign testcases to User
Then  TestCases to User Should be Assigned
When  user launch test execution app
And   select and execute testcase and Clicks On d Icon
Then  window of Link defect Should be able to launch
When  File defect on execution
Then  To be able to link Defect to executions

@Defect_Tracking
Scenario:36 Edit field setup for custom field of type Select List in Jira, add new LOV and Attempt to view the change reflected in Zephyr 
Given user logins to Jira
When  user goes to administration and clicks on Issues
And   goes to custom fields,Already added a custom field of type Select List adds new list of values  
Then  should be able to add
When  user is in a defect tracking Page,clicks On Create Defect
And   Without  Cache timeout,try to  view new added LOV of type select List 
Then  user needs to relogin to see the new sets of values
When  user Is In a Page of TestRepository
And   creates a phase and adds few TestCases
And   user launch test planning page to create a cycle and assigns phase to cycle,assigns testcases to anyone
And   user goes to Test Execution page,selects testcases and executes with any status and clicks on D button
Then  window of link defect should be launched
When  user clicks on Create Defect and create defect
And   user Tries to view new added LOV of type select List 
Then  Should not be able to view new added LOV of type select List 

@Defect_Tracking
Scenario:37 Edit field setup for custom field of type Select List in Jira, add new LOV and  view the change reflected in Zephyr after cache timeout
Given user Logins to Jira
When  user Goes to administration and clicks on Issues
And   Goes to custom fields,Already added a custom field of type Select List adds new list of values  
Then  should be able to add new list of values
When  user logins to zephyr as Manager credential
And   goes to administration
And   clicks on Defect Admin and clear the cashe timeout
When  user Launches defect tracking Page,clicks On Create Defect
And   Tries to view new added LOV of type select List 
Then  should be able to see the new set of values
When  user Launches Test Execution page,selects testcases and executes with any status and clicks on D button
Then  defect window should be launched
When  user clicks on Create Defect in test execution
And   User Tries to view New added LOV of type select List 
Then  Should be able to view new added LOV of type select List  

@Defect_Tracking
Scenario: 39 Create  a defect/Subtask with custom field of type Select List
Given user Logins To Jira as admin
When  User clicks ON Administration and clicks on system
And   clicks on Advance Settings
And   Changes the format jira date picker javaformat to yyyy-MM-dd
And   Create a custom field in Jira of type date picker  
Then  custom field should be created
When  user Logins as Manager Credentials to zephyr and clicks on Administration
And   set DTS to JIRA by user
And   Launch Defects Admin app  and configured  dts customfield jira date_format = yyyy-MM-dd
Then  should be configuered jira date format
When  user Launches Defect Tracking app and clicks on Create Defect
And   creates a defect with customfield of type date Picker
Then  should be able to create a defect with custom field of type Date Picker  
When  user Launches Defect Tracking,searches a defect and selects it
And   creates a subtask with Custom Field of type Date Picker
Then  should be able to create a defect with Customfield of Type Date Picker
When  user Launches Test Repository and creates a phase and adds Few Testcases
And   Launches TestPlanning and creates a new Cycle and adds phase to cycle
And   assign Testcases to Anyone
And   Launches TestExecution,executes testcase with any status and clicks on D button
Then  Link defect window should be launched by user
When  user clicks on create defect and creates a defect with Customfield of Type Date Picker
Then  defect should be created of type date picker
When  user Launches TestRepository Page and creates a New phase and adds Few Testcases
And   Launches TestPlanning Page and creates a new Cycle and adds created phase to cycle,and assign testcases to anyone
And   Launches Test Execution,Executes testcase with Any status and Clicks on D button
Then  Link Defect Window should be launched by user
When  user clicks on Create Defect and creates a defect with custom field of Type Date Picker
Then  defect should be created with custom field of type date picker


#
#@Defect_Tracking
#Scenario:207 Search defects using JQL by Issue Type Bug
#Given Test repository page launched by User
#When  user creates a new phase and adds testcase
#Then  should be Added Testcase
#When  user launch test planning page, creates new cycle and assign phase to cycle
#And   launch Test execution page,Executes Testcase with any status 
#And   click on D ICON
#Then  window of link defect to be launched
#When  Search defects using JQL by Issue Type Bug in test execution
#Then  should be able to Search defects
#When  search defect using JQL in defect tracking page
#Then  should be able to search defects
#When  user searches the defects using JQL by Issue Type Bug in requirements page
#Then  The defects using JQL by Issue Type Bug should search
#
#@Defect_Tracking
#Scenario:208 Search defects using JQL by Issue Type Epic
#Given  user is in a Page of execution
#When   user search the defects using jql by Issue Type Epic
#Then   should able to search defects
#When   user Searches defects using JQL by Issue Type Epic in Defect Tracking
#Then   In Defect Tracking,should be able to search defects
#When    user search the defects using JQL by Issue Type Epic In requirements
#Then    should search the defects in requirements
#
#@Defect_Tracking
#Scenario:209 Search defects using JQL by Issue Type Improvement
#Given  Test execution Page is Launched By user
#When   user  searches the defects using Jql by issue type Improvement
#Then   issue type Improvement defects should search
#When   user searches the defects using jql by issue type Improvement in defect tracking
#Then   should search the defects using jQL by issue type Improvement 
#When    search defects using JQL by Issue Type Improvement in Requirements
#Then    should search defects using Jql by issue type Improvement
#
#@Defect_Tracking
#Scenario:210 Search defects using JQL by Issue Type Story
#Given  TestExecution page is Launched by user
#When   user Searches defects using JQL by Issue Type Story
#Then   Defects should search
#When   In defect tracking,user searches Defects using JQL by issuetype Story
#Then   should search the defects in defect tracking
#When    search defects Using Jql by IssueType Story In requirements page
#Then    should search defects Using Jql by IssueType Story In requirements page
#
#@Defect_Tracking
#Scenario:211 Search defects using JQL by Issue Type Task
#Given User Launch Test execution page 
#When  Search defects using JQL by Issue Type Task
#Then  should search defects using JQL by Issue Type Task
#When  Search defects using JQL by Issue Type Task in defect tracking
#Then   should search Defects using JQL by Issue Type Task
#When  Search defects using JQL by Issue Type Task in requirements page
#Then  should be able to search defects using JQL by Issue Type Task
#
#@Defect_Tracking
#Scenario:212 Search defects using JQL by Issue Type New Feature
#Given user is in the testexecution page
#When  user Search defects using JQL by Issue Type New Feature in test execution page
#Then  should search the defects using JQL by Issue Type New Feature
#When  Search defects using JQL by Issue Type New Feature in defect tracking
#Then  In defect tracking,should search the Defects 
#When  In requirements page,search the defects using JQL by Issue Type New Feature
#Then  In requirement page should search the defects using JQL by Issue Type New Feature 
#
#@Defect_Tracking
#Scenario:213 Search defects using JQL by Issue Type Sub-Task
#Given TestExecution page is Launched by User
#When  Searches defects using JQL by Issue Type Sub-Task
#Then  should search defects using JQL by issue type Sub-Task
#When  User searches the defects using jql by issue type sub-task in Defect tracking
#Then  Should search the defects using jql by issue type sub-task
#When  user searches The defects using Jql By issue type sub-task in Requirements
#Then  should search the defects  using Jql By issue type sub-task in requirements
#
#@Defect_Tracking
#Scenario:214 Search defects using JQL by custom Issue Type
#Given user is in test execution PAGE
#When  user searches defects using JQL by custom Issue Type
#Then  should search the defects using JQL by custom Issue Type
#When  user searches defects using JQL by custom Issue Type in defect tracking
#Then  In defect tracking,should search the defects using JQL by custom Issue Type
#When  In requirements, Search defects using JQL by custom Issue Type
#Then  should search defects using JQL by custom Issue Type In requirements
#
#@Defect_Tracking
#Scenario:201 Search defects using valid JQL written in Lowercase
#Given Test execution Page is Launched by User
#When  user Searches defects using valid JQL written in Lowercase
#Then  should be able to Search Defects 
#When  Search defects using valid JQL written in Lowercase In Defect Tracking 
#Then  in defect tracking,defects should search
#When  user searches the defects using valid JQL written in Lowercase in Requirements
#Then  should search defects using valid JQL written in Lowercase in Requirements
#
#@Defect_Tracking
#Scenario:202 Search defects using valid JQL written in Uppercase
#Given Test execution page is Launched by user
#When  user Searches defects using valid JQL written in Uppercase
#Then  defects should search in test execution
#When  In defect tracking,user searches the defects using valid JQL written in Uppercase
#Then  In defect tracking,defects should search
#When  user searches the defects using valid JQL written in Uppercase in requirements
#Then  In requirements,defects should search 
#
#@Defect_Tracking
#Scenario:200 Attempt to search defects using invalid JQL
#Given Testexecution app is launched by user
#When  user Attempts to search defects using invalid JQL
#Then  should get a proper message
#When  user attempts to search defects using invalid JQL in defect tracking page
#Then   should get the proper message
#
#@Defect_Tracking
#Scenario:203 Search defects without entering query
#Given  Launched test execution page by user
#When  user searches defects without entering query
#Then  should be able to search the defects
#When  User searches defects without entering query in defct tracking page
#Then  should search defects
#When  user serach defects without entering any query in requirements
#Then  In requirements should search defects
#
#@Defect_Tracking
#Scenario:204 Attempt to get search results using JQL if there is no defect match to entered query
#Given  Test execution page is launched by User
#When   user searches defects using JQL if there is no defect match to entered query
#Then   Should get message that No records found or you do not have access.Try modifying your search criteria
#When   user searches defects using JQL if there is no defect match to entered query in defect tracking
#Then   should get message No records found or you do not have access
#When   user search defects using JQL if There is no defect match to entered query in requirements
#Then   In requirements should show message that No records found or you do not have access
#
#@Defect_Tracking
#Scenario:205 Search defects using JQL having one or more matching defects, verify count of defects displayed is correct
#Given  user is in the page OF TestExecution
#When   user search defects using JQL having one or more matching defects and verifies count of defects 
#Then   should show the proper search count
#When   In defect tracking,Search defects using JQL having one or more matching defects and verify count of defects 
#Then   should display proper search count
#When   In requirements,Search defects using JQL having one or more matching defects and verifies count of defects 
#Then   should Show Proper search Count
#
#@Defect_Tracking
#Scenario:215 Search defects by issue type ID using JQL
#Given  TESTExecution page is launched by User
#When   Search defects by issue type ID using JQL
#Then   should be able to search defect by ID
#When   user searches defects by issuetype ID using Jql in Defect Tracking
#Then   should be Able to search Defects by issuetype ID in defect tracking
#When   In requirements,user searches the defects by issue Type ID using JQL
#Then   should search the defects by issue Type ID using JQL
#
#@Defect_Tracking
#Scenario:206 Search defects by project with project name using JQL
#Given  User is in a Page Of DefectTracking
#When   user search defects by project with long project name using JQL
#Then   should search defects by project with long project name using JQL
#When   user searches defects by project with project name having numbers using JQL 
#Then   should search defects by project with project name having numbers using JQL
#When   user searches defects by project with project name having special chars using JQL
#Then   should able to search defects by project with project name having special chars
#When   user searches defects by project with project name having apha numeric chars using JQL
#Then   should search defects by project with project name having apha numeric chars
#When   user search defects by project with project name having international chars using JQL
#Then   should able to search defects by project with project name having international chars
#
#@Defect_Tracking
#Scenario:216 Search defects using JQL by component with all operator
#Given  user is in DefectTracking page
#When   Search defects using JQL by component with = operator
#Then   defects should search using Jql
#When   user searches defects using JQL by component with = operator in test execution
#Then   In test execution,should search defects using jql by component with = operator
#When   Search defects using JQL by component with != operator in defect tracking
#Then   in defect tracking,should search the defects 
#When   In test execution,search defects using JQL by component with != operator
#Then   defects should be searched in test execution
#When   user Search defects using JQL by component with AND operator in defect tracking
#Then   Defects should be searched by using AND operator
#When   Search defects using JQL by component with AND operator in test execution page
#Then   In test execution defects should search using jql by component with AND operator
#When   user search defects using JQL by component with OR operator in defect tracking
#Then   defects should be searched using jql by component with OR operator
#When   In test execution,search defects using JQL by component with OR operator
#Then    Defects should search using jql by component with OR operator in test execution page
#When   In defect tracking,Search defects using JQL by component with IN operator
#Then   Defects should be searched in defect tracking
#When   In test execution,search defects using JQL by component with IN operator
#Then   defects should be searched in test execution using JQL by component with IN operator
#When   In defect tracking,user search defects using JQL by component with NOT IN operator
#Then   In defect tracking,should be able search defects using JQL by component with NOT IN operator
#When   In test execution,user search defects using JQL by component with NOT IN operator
#Then   defects should be able to search in Test execution
#When   Search defects using JQL by component with IS operator in defect tracking
#Then   defects should search using JQL by component with IS operator
#When   user Search defects using JQL by component with IS operator in test execution
#Then   should be able to search defects using JQL by component with IS operator
#When   user Search defects using JQL by component with IS NOT operator in defect tracking
#Then   should be able to search defects using jql by component with IS NOT operator
#When   In test execution search defects using JQL by component with IS NOT operator
#Then   should be able to search defects using JQL by component with IS NOT operator in test execution
#
#@Defect_Tracking
#Scenario:217 Search defects using JQL by Affected version with all operator
#Given  Defect tracking page is launched by user
#When   user searches defects using JQL by Affected version with = operator 
#Then   should able to search defects using JQL by affected version
#When   In test execution,user Searches defects using JQL by Affected version with = operator
#Then   in test execution should able to search defects using JQL by affected version
#When   In defect tracking, user searches defects using JQL by Affected version with != operator
#Then   defects should be searched using jql by affected version
#When   in test execution,search the defects using JQL by Affected version with != operator
#Then   defects should search in test Execution page
#When   Search defects using JQL by Affected version with AND operator in Defect tracking
#Then   should be able to search defects using JQL by Affected version
#When   In test execution,search Defects using JQL by Affected version with AND operator
#Then   should able to search defects using JQL by Affected version with AND operator
#When   In defect tracking page,user searches defects using JQL by Affected version with OR operator
#Then   defects should search using JQL by Affected version with OR operator
#When   In test execution,searches defects using JQL by Affected version with OR operator
#Then   In test execution, defects should search using JQL by Affected version
#When   user Searches defects using JQL by Affected version with IN operator in defect tracking
#Then   Defects should search using JQL by Affected version with IN operator
#When   In test execution page user searches Defects using JQL by Affected version with IN operator
#Then   in test execution page Defects should search using JQL by Affected version
#When   user search defects using JQL by Affected version with NOT IN operator in defect tracking
#Then   Defects should search using JQL by Affected version with NOT IN Operator
#When   In test execution page user Searches Defects Using jql by Affected version with NOT IN operator
#Then   in test execution page, Defects to be able to search using JQL by Affected version 
#When   In defect tracking page,user searches defects Using JQL By Affected Version with IS operator
#Then   defects should be searched using JQL by Affected version with IS Operator
#When   In test execution,searches defects using JQL by Affected version with IS operator
#Then   In test execution page, defects should search using JQL by Affected version with IS operator
#When   In defect tracking page,user will search defects using JQL by Affected Version With IS NOT operator
#Then   defects should Be searched using JQL by Affected version with IS NOT operator
#When   In test execution,searches defects using JQL by Affected version with IS NOT operator
#Then   In test execution, defects should search using JQL by Affected version with IS NOT operator
#
#@Defect_Tracking
#Scenario:218 Search defects using JQL by Fix version with all operator
#Given  User is in page OF DefectTracking
#When   user will search defects using JQL by Fix Version with = operator 
#Then   should be searched defects using JQL by Fix Version
#When   In Test execution,user searches defects using JQL by Fix Version with = operator
#Then   in Test execution page should able to search defects using JQL by Fix Version
#When   In defect tracking,user searches defects using JQL by Fix Version with != operator
#Then   defects should be able to search using jql by Fix Version
#When   in Test execution page,Search the defects using JQL by Fix Version with != operator
#Then   Defects should be searched in test Execution page
#When   search Defects using JQL by Fix Version with AND operator in Defect tracking
#Then   should be able to search Defects Using JQL by Fix Version
#When   In Test execution,search Defects using jql by Fix Version with AND operator
#Then   should able to search defects using jql by Fix Version with AND operator
#When   In defect tracking page,user Searches defects using JQL by Fix version with OR operator
#Then   defects should search using jql by Fix version with OR operator
#When   In Test execution,searches Defects using JQL by Fix Version with OR operator
#Then   In Test execution,Defects Should search using JQL by Fix Version
#When   user Searches defects using JQL By Fix Version with IN operator in defect tracking
#Then   Defects should search using JQL By Fix Version with IN operator
#When   In Test execution page user searches Defects using JQL by Fix Version with IN operator
#Then   in Test execution page Defects should search using JQL by Fix Version
#When   user search defects using JQL by Fix Version with NOT IN operator in defect tracking
#Then   Defects should search using JQL by Fix Version with NOT IN Operator
#When   In Test execution page user Searches Defects Using jql by Fix Version with NOT IN operator
#Then   in Test execution page, Defects to be able to search using JQL by Fix Version 
#When   In defect tracking page,user searches defects Using JQL By Fix Version with IS operator
#Then   defects should be searched using JQL by Fix Version with IS Operator
#When   In Test execution,searches defects using JQL by Fix Version with IS operator
#Then   In Test execution page, defects should search using JQL by Fix Version with IS operator
#When   In defect tracking page,user will search defects using JQL by Fix Version With IS NOT operator
#Then   defects should Be searched using JQL by Fix Version with IS NOT operator
#When   In Test execution,searches defects using JQL by Fix Version with IS NOT operator
#Then   In Test execution,Defects should Search using jql by Fix Version with IS NOT Operator
#
#@Defect_Tracking
#Scenario:219 Search defects by priority using JQL with all operator
#Given  user will launch defect Tracking Page
#When   user searches Defects Using JQL by priority with = operator 
#Then   should Able to search defects using JQL by priority
#When   In Test Execution,user searches the Defects using JQL by priority with = Operator
#Then   in Test Execution page,should able to search Defects using JQL by priority
#When   In defect tracking,User searches defects using JQL by priority with != operator
#Then   Defects should be searched Using jql by Priority
#When   in test execution,search the defects using JQL by priority with != operator
#Then   defects should search using JQL by priority with != operator in Test Execution page
#When   Search defects using JQL by priority with AND operator in Defect tracking page
#Then   should be able to search defects using JQL by priority in Defect tracking page
#When   In Test Execution,search Defects using JQL by priority with AND operator
#Then   should Able to Search defects using JQL by priority with AND operator
#When   In defect tracking page,user Searches defects using JQL by priority with OR operator
#Then   defects should search Using JQL by priority With OR Operator
#When   In Test Execution,searches defects using JQL by priority with OR operator
#Then   In test execution, defects should search using JQL by priority
#When   User searches defects using jql by fix version with IN operator in defect tracking
#Then   Defects should search using jql by fix version with IN operator
#When   In test execution page,User searches Defects using jql by fix version with IN Operator
#Then   in test execution page Defects should be searched using JQL by fix version
#When   user search defects using jql by fix version With NOT IN operator in Defect tracking Page
#Then   Defects should be searched using JQL by fix version with NOT IN Operator
#When   in Test execution page User searches Defects Using jql by fix version with NOT IN operator
#Then   In test execution page, Defects to be able to search using jql by fix version 
#When   In defect tracking user searches defects Using jql by fix version with IS operator
#Then   defects should be searched using JQL By fix version with IS Operator
#When   In Test execution,searches defects using JQL by fix version with IS operator
#Then   In Test execution Page, defects should search using JQL by fix version with IS Operator
#When   In defect tracking Page,user will search defects using JQL by fix version With IS NOT Operator
#Then   defects should Be searched using JQL by fix version with IS NOT Operator
#When   In test execution,searches defects using JQL by fix version with IS NOT operator
#Then   In test execution,defects should Search Using JQL by fix version with IS NOT Operator
#
#@Defect_Tracking
#Scenario:220  Search defects by priority using JQL
#Given  user Is in the Defect tracking App
#When   Search defects by priority Blocker using JQL 
#Then   should search the defects by priority Blocker using JQL 
#When   In test execution user searches the defects by priority blocker using jql
#Then   In test execution page should search the defects by priority blocker
#When   user Search defects by priority Critical using JQL in defect tracking
#Then   should able to search defects by priority Critical using JQL
#When   In Test execution page,Search defects by priority Critical using JQL
#Then   Defects should search by priority Critical
#When   user Search defects by priority Major using JQL in defect tracking
#Then   should able to search defects by priority Major using JQL
#When   In Test execution page,Search defects by priority Major using JQL
#Then   Defects should search by priority Major
#When   user Search defects by priority Minor using JQL in defect tracking
#Then   should able to search defects by priority Minor using JQL
#When   In Test execution page,Search defects by priority Minor using JQL
#Then   Defects should search by priority Minor
#When   user Search defects by priority Trivial using JQL in defect tracking
#Then   should able to search defects by priority Trivial using JQL
#When   In Test execution page,Search defects by priority Trivial using JQL
#Then   Defects should search by priority Trivial
#When   user Search defects by custom priority using JQL in defect tracking
#Then   should able to search defects by custom priority using JQL
#When   In Test execution page,Search defects by custom priority using JQL
#Then   Defects should search by custom priority
#When   user Search defects by custom priority contain long name in defect tracking
#Then   should able to search defects by custom priority contain long name
#When   In Test execution page,Search defects by custom priority contain long name
#Then   Defects should search by custom priority contain long name
#When   user Search defects by  custom priority contain number in defect tracking
#Then   should able to search defects by  custom priority contain number
#When   In Test execution page,Search defects by  custom priority contain number
#Then   Defects should search defects by custom priority contain number
#When   user Search defects by custom priority contain special chars in defect tracking
#Then   should able to search defects by custom priority contain special chars
#When   In Test execution page,Search defects by custom priority contain special chars
#Then   Defects should search by Custom priority contain special chars
#When   user Search defects by Custom priority contain white spaces in defect tracking
#Then   should able to search defects by custom priority contain white spaces
#When   In Test execution page,Search defects by  custom priority contain white spaces
#Then   Defects should search by custom priority contain white spaces
#When   user Search defects by Custom priority contain alpha numeric chars in defect tracking
#Then   should able to search defects by custom priority contain alpha numeric chars
#When   In Test Execution page,Search defects by custom priority contain alpha numeric chars
#Then   Defects should search by custom priority contain alpha numeric chars
#When   user Search defects by custom priority contain international chars in defect tracking
#Then   should able to search defects by custom priority contain international chars
#When   In Test Execution page,Search defects by custom priority Contain international chars
#Then   Defects should search by custom priority Contain international chars
#
#
#@Defect_Tracking
#Scenario:221 Search defects by status using JQL with all operator
#Given  User is in a Page OF DEFECT TRACKING
#When   Search defects using JQL by status with = Operator
#Then   should able to search defects using JQL by status with = Operator
#When   user searches the defects using JQL by status with = Operator in TestExecution page
#Then   Defects should search using JQL by status with = Operator
#When   Search defects using JQL by status with != operator In Defect Tracking Page
#Then   Should able to search defects using JQL by status with != operator
#When   In testexecution,user searches defects using JQL by status with != operator 
#Then   To able to search defects using JQL by status with != operator In Test Execution Page
#When   Search defects using JQL by status with AND operator In Defect Tracking Page
#Then   Should Able to search defects using JQL by status with AND operator
#When   In testexecution,user searches defects using JQL by status with AND operator 
#Then   should search defects using JQL by status with AND operator In Test Execution Page
#When   user search defects using JQL by status with OR operator In Defect Tracking Page
#Then   To be able to search defects using JQL by status with OR operator
#When   In testexecution,user searches defects using JQL by status with OR operator 
#Then   should able to search defects using JQL by status with OR operator In Test Execution Page
#When   Search defects using JQL by status with IN operator In Defect Tracking Page
#Then   Should able To search defects using JQL by status with IN operator
#When   In testexecution,user searches defects using JQL by status with IN operator 
#Then   should be searched defects using JQL by status with IN operator In Test Execution Page
#When   User search Defects using JQL by status with NOT IN operator In Defect Tracking Page
#Then   Should able to search Defects using JQL by status with NOT IN operator
#When   In testexecution,user searches defects using JQL by status with NOT IN Operator 
#Then   should able to search defects using JQL by status with NOT IN operator In Test Execution Page
#When   user Searches defects using JQL by status with IS operator In Defect Tracking Page
#Then   should be able to search defects using JQL by status with IS operator
#When   In Testexecution,user searches defects using JQL by status with IS operator 
#Then   should search defects using JQL by status with IS operator In Test Execution Page
#When   search Defects using JQL by status with IS NOT operator In Defect Tracking Page
#Then   Should able to search defects using JQL by status with IS NOT operator
#When   In Testexecution page,user searches defects using JQL by status with IS NOT operator 
#Then   should Be able to search defects using JQL by status with IS NOT operator In Test Execution Page
#
#
#@Defect_Tracking
#Scenario:225 Search defects by project using JQL
#Given  Defect Tracking App is Launched By a User
#When   user searches defects by custom project contain long name
#Then   To be able to search defects
#When   In TestExecution page,user searches defects by Custom project contains Long name
#Then   defects should be searched in a TestExecution page
#When   user searches defects by custom project consists Number In a DefectTracking
#Then   By custom project defects should search
#When   In TestExecution page,user searches Defects By custom project contains Number
#Then   Defects should be searched In TestExecution
#When   user searches defects by custom project contains special chars In Defect tracking page
#Then   To be able to search defects by custom project contains special chars
#When   In TestExecution page,user searches defects by Custom project contain special chars
#Then   defects should be searched by Custom project consists special chars in a TestExecution page
#When   In Defect tracking,user searches defects by custom project contain white spaces
#Then   To be able to search Defects by custom project contain white spaces
#When   In TestExecution page,user searches defects by Custom project consists white spaces
#Then   Defects should search in a TestExecution page by Custom project consists white spaces
#When   user Search defects By custom project consists alpha numeric chars In defect tracking Page
#Then   Should search defects By custom project consists alpha numeric chars
#When   In TestExecution page,user searches defects by Custom project contains Alpha Numeric chars
#Then   defects should be searched In a TestExecution page by Custom project contains Alpha Numeric chars
#When   In Defect Tracking,user searches defects by custom project contains international chars
#Then   To be Able to search defects by custom project
#When   In TestExecution page,user searches defects by Custom project consists International chars
#Then   defects should be searched in a TestExecution page by Custom project consists international chars
#
#
#@Defect_Tracking
#Scenario:226 Search defects by component using JQL
#Given  DEFECTTRACKING Page is Launched BY User
#When   user Searches defects by component Contains long name
#Then   Should able to search defects by Component contains long name
#When   User Searches defects by component contain Long name in TestExecution Page
#Then   In Test Execution Page,Defects should search by Component
#When   user Searches defects by component contains number In Defect Tracking
#Then   Should able to search defects by Component contains number
#When   User Searches defects by component contain number in TestExecution Page
#Then   In Test Execution Page,Defects should search by component contains number
#When   user Searches defects by component contain special chars In defectTracking page
#Then   Should able to search defects by Component contains special chars
#When   User Searches defects by component contain special chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by component consists special chars
#When   user Searches defects by component contain  white spaces in defect tracking
#Then   Should able to search defects by Component contains  white spaces
#When   User Searches defects by component contain  white spaces in TestExecution Page
#Then   In Test Execution Page,Defects should search by component contains  white spaces
#When   In Defect Tracking page,user Searches defects by component contain alpha numeric chars
#Then   Should able to search defects by Component contains alpha numeric chars
#When   User Searches defects by component contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by component consists Alpha numeric chars
#When   user Searches defects by component contain international chars in Defect Tracking Page
#Then   should able to search defects by Component contains International chars
#When   User Searches defects by component contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Component Consists International char
#
#@Defect_Tracking
#Scenario:223 Search defects by Assignee using JQL with all operator
#Given  USer Launch Defect TRACKING page
#When   Searches defects using JQL by Assignee  with = operator
#Then   Should Able to Search Defects using JQL by Assignee  with = operator
#When   user searches Defects using JQL by Assignee  with = operator In Test Execution Page
#Then   In Test Execution Page,should search defects using JQL by assignee
#When   User Searches defects using JQL by Assignee  with != operator In Defect Tracking
#Then   Should Able to Search Defects using JQL by assignee with != operator
#When   user searches Defects using JQL by assignee With != operator In Test Execution Page
#Then   In Test Execution Page,should search defects using JQL by Assignee With != operator
#When   Searches defects using JQL by Assignee  with AND operator In Defect tracking page
#Then   should Able to Search Defects using JQL by Assignee  with AND operator
#When   user searches Defects using JQL by Assignee with AND operator In Test Execution Page
#Then   In Test Execution Page,should search defects using JQL by assignee with AND operator
#When   Searches defects using JQL by Assignee  with OR operator
#Then   Should able to search defects using JQL by Assignee  with OR operator
#When   user searches Defects using JQL by Assignee  with OR operator In Test Execution Page
#Then   In Test Execution Page,should search defects using JQL by assignee with OR operator
#When   user Searches Defects using JQL by Assignee  with IN operator in defect tracking
#Then   user should Able to Search Defects using JQL by Assignee  with IN operator
#When   user searches Defects using JQL by Assignee  with IN operator In test Execution Page
#Then   In Test Execution Page,should search defects using JQL by Assignee  with IN operator
#When   user search defects using JQL by Assignee  with NOT IN Operator In Defect Tracking
#Then   Should be able to Search defects using JQL by Assignee  with NOT IN operator in defect tracking
#When   user searches Defects using JQL by Assignee  with NOT IN operator In Test execution Page
#Then   In Test Execution Page,should search defects using JQL by Assignee with NOT IN operator
#When   In defect tracking page,user Searches defects using JQL by Assignee  with IS operator
#Then   Should be Searched Defects using JQL by Assignee  with IS operator
#When   user searches Defects using JQL by Assignee  with IS operator In Test Execution Page
#Then   In Test Execution Page,Should search Defects using JQL by  Assignee  with IS operator
#When   Searches defects using JQL by Assignee with IS NOT Operator in defect tracking page
#Then   Should Able to Search Defects using JQL by Assignee  with IS NOT operator
#When   user searches Defects using JQL by Assignee  with IS NOT operator In Test Execution Page
#Then   In Test Execution Page,should search defects using JQL by Assignee With IS NOT operator
#
#@Defect_Tracking
#Scenario:224 Search defects by Reporter using JQL with all operator
#Given  USer Launches DefectTRACKING page
#When   Searches defects using jql by Reporter with = operator
#Then   should Able to Search Defects using JQL by Reporter with = operator
#When   user searches Defects using jql by Reporter with = Operator In Test Execution Page
#Then   In Test Execution Page,should search defects using jql by Reporter
#When   user Searches defects using JQL by Reporter With != operator In Defect Tracking
#Then   To be able to Search Defects using JQL by Reporter with != Operator
#When   User searches Defects using JQL by Reporter with != operator In Test Execution Page
#Then   In Test Execution Page,should search defects using JQL by Reporter with != Operator
#When   Searches defects using JQL by Reporter With AND operator In Defect tracking page
#Then   should Able to Search Defects using JQL by Reporter With AND Operator
#When   user searches Defects using JQL by Reporter With AND Operator In Test Execution Page
#Then   In Test Execution Page,Should search defects using JQL by Reporter with AND operator
#When   Searches defects using JQL by Reporter with OR operator in defect tracking
#Then   To Be able to search defects using JQL by Reporter with OR operator
#When   user searches Defects using JQL By Reporter with OR operator In Test Execution Page
#Then   In Test Execution Page,should search Defects using JQL by Reporter with OR operator
#When   user Searches Defects using JQL by Reporter with IN operator in defect tracking
#Then   user should Able to Search Defects using JQL by Reporter with IN operator
#When   user searches Defects using JQL by Reporter with IN operator In test Execution Page
#Then   In Test Execution Page,should search Defects using JQL by Reporter with IN Operator
#When   user search defects using jql by Reporter with NOT IN Operator In Defect Tracking
#Then   Should be Searched defects using JQL by Reporter with NOT IN operator in Defect tracking Page
#When   user searches Defects using JQL by Reporter With NOT IN operator In Test execution Page
#Then   In Test Execution Page,should search defects using JQL By Reporter with NOT IN operator
#When   In defect tracking page,user Searches defects using JQL By Reporter With IS operator
#Then   Should be Searched Defects using jql By Reporter with IS operator
#When   user searches Defects using jql By Reporter With IS operator In Test Execution Page
#Then   In Test Execution Page,Should search Defects using JQL by Reporter with IS Operator
#When   Searches defects using JQL By Reporter with IS NOT Operator in defect tracking page
#Then   To be Able to Search Defects using JQL by Reporter with IS NOT operator
#When   user searches Defects using jql by Reporter with IS NOT operator In Test Execution Page
#Then   In Test Execution Page,Should search Defects using JQL by Reporter With IS NOT operator
#
#@Defect_Tracking
#Scenario:227 Search defects by Affected version using JQL
#Given  DEFECTTRACKING is Launched by User
#When   user Searches defects by Affected version Contains long name
#Then   should able to search defects by Affected version consists long name
#When   User Searches defects by Affected version contains Long Name in TestExecution Page
#Then   In Test Execution Page,Defects should search by Affected version consists long name
#When   user Searches defects by Affected version contains number In Defect tracking
#Then   Should able To search defects by Affected version contains Number
#When   User Searches defects by Affected version Contains number in TestExecution Page
#Then   In Test Execution Page,Defects should search by Affected version contains Number
#When   user Searches defects by Affected version contains special chars In defectTracking page
#Then   Should able to search defects by Affected version contains special characters
#When   User Searches defects by Affected version contain special chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Affected version consists special chars
#When   user searches defects by Affected version contain  white spaces in defect tracking
#Then   To be able to search defects by Affected version contains  white spaces
#When   User Searches defects by Affected version contain  white spaces in TestExecution Page
#Then   in Test Execution Page,Defects should search by Affected version contains  white spaces
#When   In defect Tracking page,user Searches defects by Affected version contain alpha numeric chars
#Then   should able to search defects by Affected version contains alpha numeric chars
#When   user Searches defects by Affected version contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by affected version consists Alpha numeric chars
#When   user Searches defects by Affected version contain international chars in Defect Tracking Page
#Then   should able to search defects by Affected version Contains International chars
#When   User Searches Defects by Affected version contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Affected version Consists International chars
#
#@Defect_Tracking
#Scenario:228 Search defects by Fix version using JQL
#Given  DEFECT TRACKING page is Launched BY User
#When   user Searches defects by Fix version Contains long Name
#Then   Should Able to search Defects by Fix version contains Long Name
#When   User searches defects By Fix Version contain Long name in TestExecution Page
#Then   In Test Execution Page,Defects should Search by Fix version
#When   user Searches defects By Fix version contains Number In Defect Tracking
#Then   To be able to search defects by Fix version contains Number
#When   User Searches defects by Fix version contains Number in TestExecution Page
#Then   In Test Execution Page,Defects should search by Fix version consists number
#When   user Searches defects by Fix Version contain special chars In defectTracking page
#Then   To be able to search defects by Fix version contains special chars
#When   User Searches Defects by Fix version contain Special chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Fix version consists Special chars
#When   user Searches defects by Fix version contain White spaces in defect tracking
#Then   Should able to search defects by Fix version Contains White spaces
#When   User Searches Defects by Fix version contain  white spaces in Test Execution Page
#Then   In Test Execution Page,Defects should be searched by Fix version contains  white spaces
#When   In Defect Tracking page,user Searches defects by Fix version contain Alpha numeric chars
#Then   Should able to search defects by Fix version contains Alpha numeric chars
#When   User Searches defects by Fix version contains alpha numeric Chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Fix version consists Alpha Numeric chars
#When   user searches defects by Fix version contain international chars in Defect Tracking Page
#Then   should able to search Defects by Fix version contains International chars
#When   User Searches defects By Fix version contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Fix version contains International chars
#
#@Defect_Tracking
#Scenario:229 Search defects by text custom field using JQL
#Given  DEFECT TRACKING Page is launched BY User
#When   user Searches defects by Text custom field Contains long Name
#Then   to be able to search defects by text custom field contains long name
#When   User Searches Defects by text custom field contain Long name in TestExecution Page
#Then   In Test ExecutionPage,Defects should search by Text custom field
#When   user Searches defects by text custom field contains number In Defect Tracking
#Then   should able to search defects by text Custom field contains number
#When   User Searches Defects by text custom field contain number in TestExecution Page
#Then   In TestExecution Page,Defects should search by text custom field contains number
#When   user Searches defects by text custom field contain special chars In defectTracking page
#Then   to be able to search defects by text custom field contains special chars
#When   user searches defects by text custom field contain special chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by text custom field consists special chars
#When   user Searches defects by text custom field contain  white spaces in defect tracking
#Then   Should able to search defects by text custom field contains  white spaces
#When   User Searches defects by text custom field contain  white spaces in TestExecution Page
#Then   in Test Execution Page,Defects should search by text custom field contains  white spaces
#When   In defect Tracking page,user Searches defects by text custom field contain alpha numeric chars
#Then   Should able to search defects by text custom field contains alpha numeric chars
#When   User Searches defects by text custom field contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,defects should search by text custom field consists Alpha numeric chars
#When   user Searches defects by Text custom field contain international chars in Defect Tracking Page
#Then   should be searched Defects by Text custom field contains International chars
#When   User Searches defects by text custom field contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by text custom field Consists International chars
#
#@Defect_Tracking
#Scenario:230 Search defects by Free text custom field using JQL
#Given  DEFECTTRACKING Page is Launched By the User
#When   user Searches defects by Free text which Contains long name
#Then   Should able to search defects by Free text contains Long name
#When   User Searches defects by Free text contain Long name in TestExecutionPage
#Then   in Test Execution Page,Defects should search by Free Text
#When   user Searches Defects by Free text contains number In Defect Tracking
#Then   Should be searched defects by Free text contains number
#When   User Searches defects By Free text contain number in TestExecution Page
#Then   In TestExecution Page,Defects should be searched by Free text contains number
#When   user Searches Defects by Free text contain special chars In defectTracking page
#Then   Should able to search defects by Free text contains special chars
#When   User Searches defects by Free text contain special chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Free text consists special chars
#When   user searches defects by Free text contain  white spaces in defect tracking
#Then   should able to search defects by Free text contains  white spaces
#When   User Searches defects by Free text contain  white spaces in TestExecution Page
#Then   In Test Execution Page,Defects should search by Free text contains  white spaces
#When   In Defect Tracking page,user Searches defects by Free text contain alpha numeric chars
#Then   Should able to search defects by Free text contains alpha numeric chars
#When   User Searches defects by Free text contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Free text consists Alpha numeric chars
#When   user Searches defects by Free text contain international chars in Defect Tracking Page
#Then   should able to search defects by Free text contains International chars
#When   User Searches defects by Free text contain international chars in TestExecution Page
#Then   In TestExecution page,Defects should search By Free text Consists International chars
#
#@Defect_Tracking
#Scenario:231 Search defects by checkbox custom field using JQL
#Given  User Navigates to defect Tracking app
#When   User searches Defects By checkbox custom field  Contains long name
#Then   To be able to Search defects by checkbox custom field contains long name
#When   User Searches Defects by checkbox custom field contain Long name in TestExecution Page
#Then   In TestExecution page,Defects should Search by checkbox custom field
#When   user searches Defects by checkbox custom field contains number In Defect Tracking
#Then   Should be searched defects by checkbox custom field contains Number
#When   User Searches defects By checkbox custom field contain number in TestExecution Page
#Then   In Test Execution Page,Defects should be searched by checkbox custom field contains Number
#When   user Searches defects by Checkbox custom field contain special chars In defectTracking page
#Then   Should be able to search defects by checkbox custom field contains special chars
#When   User Searches defects by checkbox custom field contain special chars in TestExecution Page
#Then   In testExecution Page,Defects should search by checkbox custom field consists special chars
#When   user Searches defects by checkbox custom field contain  white spaces in Defect Tracking
#Then   should able to search defects by checkbox custom field contains  white spaces
#When   User Searches defects bycheckbox custom field contain  white spaces in TestExecution Page
#Then   In Test Execution page,Defects should search by checkbox custom field contains White spaces
#When   In Defect Tracking page,user Searches defects by checkbox custom field contain alpha numeric chars
#Then   Should able to search defects by checkbox custom field contains Alpha numeric chars
#When   User Searches defects by checkbox custom field contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by checkbox custom field consists Alpha numeric chars
#When   user Searches defects by checkbox custom field contain international chars in Defect Tracking Page
#Then   should able to search defects by checkbox custom field contains International chars
#When   User Searches defects by checkbox custom field contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by checkbox custom field contains International Chars
#
#@Defect_Tracking
#Scenario:232 Search defects by Radio custom field using JQL
#Given  User navigates to Defect Tracking app
#When   User searches Defects By Radio custom field Contains Long name
#Then   To be Able to Search defects by Radio custom field contains long name
#When   User Searches Defects by Radio custom field contain Long name in TestExecution Page
#Then   In Test Execution Page,Defects should Search by Radio custom field
#When   user searches Defects by Radio custom field contains number In Defect Tracking
#Then   Should be searched defects by Radio custom field contains Number
#When   User Searches Defects By Radio custom field contain number in TestExecution Page
#Then   In Test Execution page,Defects should be searched by Radio custom field contains Number
#When   user Searches defects by Radio custom field contain special chars In defectTracking page
#Then   Should be able to search defects by Radio custom field contains special chars
#When   User Searches defects by Radio custom field contain special chars in TestExecution Page
#Then   In test Execution Page,Defects should search by Radio custom field consists special chars
#When   user Searches Defects by Radio custom field contain  white spaces in Defect Tracking
#Then   should able to search defects by Radio custom field contains  white spaces
#When   User Searches defects by Radio custom field contain  white spaces in TestExecution Page
#Then   In Test Execution page,Defects should search by Radio custom field contains White spaces
#When   In Defect Tracking page,user Searches defects by Radio custom field contain alpha numeric chars
#Then   Should able to search defects by Radio custom field contains Alpha numeric chars
#When   User Searches defects by Radio custom field contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Radio custom field consists Alpha numeric chars
#When   user Searches defects by Radio custom field contain international chars in Defect Tracking Page
#Then   should able to search defects by Radio custom field contains International chars
#When   User Searches defects by Radio custom field contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Radio custom field contains International Chars
#
#@Defect_Tracking
#Scenario:233 Search defects by single select custom field using JQL
#Given  DEFECT TRACKING Page is Launched By The User
#When   user Searches defects by Single select custom field which Contains long name
#Then   should be able to search defects by single select custom field contains Long name
#When   User Searches defects by single select custom field contain Long name in TestExecutionPage
#Then   in Test Execution Page,Defects should search by single select custom field
#When   user Searches Defects By single select custom field contains number In Defect Tracking
#Then   Should be searched Defects By single select custom field contains Number
#When   User Searches defects By single select custom field contain number in TestExecution Page
#Then   In TestExecution Page,Defects should be searched by single select custom field contains number
#When   user Searches Defects by single select custom field contain special chars In DefectTracking page
#Then   Should able to search defects by single select custom field contains special chars
#When   User Searches defects by single select custom field contain special chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by single select custom field consists special chars
#When   user searches defects by single select custom field contain  white spaces in Defect tracking
#Then   should able to search defects by single select custom field contains  white spaces
#When   User Searches defects by single select custom field contain  white spaces in TestExecution Page
#Then   In Test Execution Page,Defects should search by single select custom field contains  white spaces
#When   In Defect Tracking page,user Searches defects by single select custom field contain alpha numeric Chars
#Then   Should able to search defects by single select custom field contains alpha Numeric chars
#When   User Searches defects by single select custom field contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by single select custom field consists Alpha numeric chars
#When   user Searches defects by single select custom field contain international chars in Defect Tracking Page
#Then   should able to search defects by single select custom field contains International chars
#When   User Searches defects by single select custom field contain international chars in TestExecution Page
#Then   In TestExecution page,Defects should search By single select custom field Consists International chars
#
#@Defect_Tracking
#Scenario:234 Search defects by multi select custom field using JQL
#Given  DEFECT Tracking Page is Launched BY the User
#When   user Searches Defects by Multi select custom field Contains long name
#Then   Should able to Search defects by multi select custom field contains long name
#When   User Searches defects By multi select custom field contain Long name in TestExecution Page
#Then   In Test Execution page,Defects should search by multi select custom field
#When   user Searches Defects by multi select custom field contains number In Defect Tracking
#Then   Should be able to search defects by multi select custom field contains number
#When   User Searches defects By multi select custom field contain number in TestExecution Page
#Then   In Test Execution Page,Defects should search by multi select custom field contains number
#When   user Searches defects by multi select Custom field contain special chars In defectTracking page
#Then   To be able to search defects by multi select custom field contains special chars
#When   User Searches defects by multi select custom field contain special chars in TestExecution Page
#Then   In TestExecution Page,Defects should search by multi select custom field consists special chars
#When   user Searches defects by multi Select custom field contain  white spaces in Defect Tracking
#Then   Should able to search defects by multi select custom field contains  white spaces
#When   User Searches defects by multi select custom field contain  white spaces in TestExecution Page
#Then   In Test Execution Page,Defects should search by multi select custom field contains White spaces
#When   In Defect Tracking page,user Searches defects by multi select custom field contain alpha numeric chars
#Then   Should able to search defects by multi select custom field contains Alpha numeric chars
#When   User Searches defects by multi select custom field contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by multi select custom field consists Alpha numeric chars
#When   user Searches defects by multi select custom field contain international chars in Defect Tracking Page
#Then   should able to search defects by multi select custom field contains International chars
#When   User Searches defects by multi select custom field contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Multi select custom field contains International chars
#
#@Defect_Tracking
#Scenario:235 Search defects by single version picker custom field using JQL
#Given  DEFECT TRACKING Page is Launched BY USER
#When   user Searches defects by single version picker custom field Contains long name
#Then   Should able to search defects by single version picker custom field contains long name
#When   User Searches defects by single version picker custom field contain Long name in TestExecution Page
#Then   In Test Execution Page,Defects should search by single version picker custom field
#When   user Searches defects by single version picker custom field contains number In Defect Tracking
#Then   Should able to search defects by single version picker custom field contains number
#When   User Searches defects by single version picker custom field contain number in TestExecution Page
#Then   In Test Execution Page,Defects should search by single version picker custom field contains number
#When   user Searches defects by single version picker custom field contain special chars In defectTracking page
#Then   Should able to search defects by single version picker custom field contains special chars
#When   User Searches defects by single version picker custom field contain special chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by single version picker custom field consists special chars
#When   user Searches defects by single version picker custom field contain  white spaces in defect tracking
#Then   Should able to search defects by single version picker custom field contains  white spaces
#When   User Searches defects by single version picker custom field contain  white spaces in TestExecution Page
#Then   In Test Execution Page,Defects should search by single version picker custom field contains  white spaces
#When   In Defect Tracking page,user Searches defects by single version picker custom field contain alpha numeric chars
#Then   Should able to search defects by single version picker custom field contains alpha numeric chars
#When   User Searches defects by single version picker custom field contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by single version picker custom field consists Alpha numeric chars
#When   user Searches defects by single version picker custom field contain international chars in Defect Tracking Page
#Then   should able to search defects by single version picker custom field contains International chars
#When   User Searches defects by single version picker custom field contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by single version picker custom field Consists International chars
#
#@Defect_Tracking
#Scenario:236  Search defects by multi version picker custom field using JQL
#Given  User Navigates To defect Tracking Page
#When   User searches Defects By Multi version picker Custom field  Contains long name
#Then   To be able to Search defects by Multi version picker Custom field contains long name
#When   User Searches Defects by Multi version picker Custom field contain Long name in TestExecution Page
#Then   In TestExecution page,Defects should Search by Multi version picker Custom field
#When   user searches Defects by Multi version picker Custom field contains number In Defect Tracking
#Then   Should be searched defects by Multi version picker Custom field contains Number
#When   User Searches defects By Multi version picker Custom field contain number in TestExecution Page
#Then   In Test Execution Page,Defects should be searched by Multi version picker Custom field contains Number
#When   user Searches defects by Multi version picker Custom field contain special chars In defectTracking page
#Then   Should be able to search defects by Multi version picker Custom field contains special chars
#When   User Searches defects by Multi version picker Custom field contain special chars in TestExecution Page
#Then   In testExecution Page,Defects should search by Multi version picker Custom field consists special chars
#When   user Searches defects by Multi version picker Custom field contain  white spaces in Defect Tracking
#Then   should able to search defects by Multi version picker Custom field contains  white spaces
#When   User Searches defects by Multi version picker Custom field contain  white spaces in TestExecution Page
#Then   In Test Execution page,Defects should search by Multi version picker Custom field contains White spaces
#When   In Defect Tracking page,user Searches defects by Multi version picker Custom field contain alpha numeric chars
#Then   Should able to search defects by Multi version picker Custom field contains Alpha numeric chars
#When   User Searches defects by Multi version picker Custom field contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Multi version picker Custom field consists Alpha numeric chars
#When   user Searches defects by Multi version picker Custom field contain international chars in Defect Tracking Page
#Then   should able to search defects by Multi version picker Custom field contains International chars
#When   User Searches defects by Multi version picker Custom field contain international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Multi version picker Custom field contains International Chars
#
#
#
#
#@Defect_Tracking
#Scenario:237  Search defects by Summary using JQL
#Given  User navigates To defect Tracking Page
#When   User Searches Defects By Summary Contains long name
#Then   To be able to Search defects by Summary contains long name
#When   User Searches Defects By Summary Contain Long name in TestExecution Page
#Then   In TestExecution page,defects should Search by Summary
#When   user searches Defects by Summary Contains Number In Defect Tracking
#Then   Should be searched defects by Summary which contains Number
#When   User Searches defects By Summary contain number in TestExecution Page
#Then   In Test Execution Page,Defects should be searched by Summary contains Number
#When   user Searches defects by Summary Contain special chars In defectTracking page
#Then   Should be able to search defects by Summary contains special chars
#When   User Searches defects by Summary contain special chars in TestExecution Page
#Then   In testExecution Page,Defects should search by Summary consists special chars
#When   user Searches defects by Summary contain  white spaces in Defect Tracking
#Then   should able to search defects by Summary contains  white spaces
#When   User Searches defects by Summary contain  white spaces in TestExecution Page
#Then   In Test Execution page,Defects should search by Summary contains White spaces
#When   In Defect Tracking page,user Searches defects by Summary contain alpha numeric chars
#Then   Should able to search defects by Summary contains Alpha numeric chars
#When   User Searches defects by Summary contain alpha numeric chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Summary consists Alpha numeric chars
#When   user Searches defects by Summary contain international chars in Defect Tracking Page
#Then   should able to search defects by Summary contains International chars
#When   User Searches defects by Summary contain international chars in TestExecution Page
#Then   In TestExecution Page,Defects should search by Summary contains International Chars
#
#@Defect_Tracking
#Scenario:238 Search defects by Description using JQL
#Given  User navigates to DefectTracking Page
#When   User Searches Defects By Description Contains Long Name
#Then   To Be able to Search defects by Description contains long Name
#When   User Searches Defects By Description Contain long Name in TestExecution Page
#Then   In TestExecution page,defects should Search By Description
#When   user searches defects by Description Contains Number In Defect Tracking
#Then   Should be searched defects by Description which should contains Number
#When   User searches defects By Description contain number in TestExecution Page
#Then   In Test Execution Page,Defects to be searched by Description contains Number
#When   user Searches defects by Description Contain Special chars In defectTracking page
#Then   Should be able to search defects By Description contains special chars
#When   User Searches defects by Description contain special chars In TestExecution Page
#Then   In TestExecution Page,Defects should search by Description consists special chars
#When   user Searches defects by Description contains  white spaces in Defect Tracking
#Then   should able To search defects by Description contains  white spaces
#When   user Searches defects by Description contain  white spaces in TestExecution Page
#Then   In TestExecution page,Defects should search by Description contains White spaces
#When   In defect Tracking page,user Searches defects by Description contain alpha numeric chars
#Then   should able to search defects by Description contains Alpha numeric chars
#When   User searches defects by Description contain alpha numeric chars in TestExecution Page
#Then   In Test execution Page,Defects should search by Description consists Alpha numeric chars
#When   user Searches defects by Description contain international chars in Defect tracking Page
#Then   should able to search defects by Description contains international chars
#When   User Searches defects by Description contains international chars in TestExecution Page
#Then   In Test Execution Page,Defects should search by Description contains International Chars
#
 #@Defect_Tracking
#Scenario:298 View pre-defined custom field properties in Defects Admin
#Given user Logins to zephyr as Manager Credentials 
#When  user goes to Adminstration
#And   User clicks on Defects admin and prefrences
#Then  Should be able to see the pre defined dts.customfield.jira.date_format customfield property
#Then  Should be able to see the pre defined jira.customfield.createmeta.allproject.online customfield property
#Then  Should be able to see the pre defined jira.customfield.field.maxlength customfield property
#Then  Should be able to see the pre defined jira.customfield.socket.timeout customfield property
#Then  Should be able to see the pre defined jira.customfield.zephyr.field.mapping customfield property
#
#@Defect_Tracking
#Scenario:299 View pre-defined General Configuration properties in Defects Admin
#Given Login as Manager to Zephyr
#When  user clicks on Administration 
#And   User clicks on Defects Admin and Prefrences and further clicks on General Configuration
#Then  Should be able to see the pre defined defect.timeout General Configuration property
#Then  Should be able to see the pre defined defect.user.lookup_size General Configuration property
#Then  Should be able to see the pre defined jira.activitystream.enabled General Configuration property
#Then  Should be able to see the pre defined jira.remote.link.additional.link.req-defect.enabled General Configuration property
#Then  Should be able to see the pre defined jira.remote.link.additional.link.req-defect.relation General Configuration property
#Then  Should be able to see the pre defined jira.remote.link.additional.link.req-tc.enabled General Configuration property
#Then  Should be able to see the pre defined jira.remote.link.enabled General Configuration property
#Then  Should be able to see the pre defined jira.rest.api.activity.url_fragment General Configuration property
#
#@Defect_Tracking
#Scenario:296 As Manager, edit and modify system defined property value for General Configuration category
#Given user logins as manager Credentials to Zephyr
#When  user goes to adminstration and Clicks on Defect admin
#And   User goes to preferences and Edits and Change the Value for defects\\.timeout and Saves
#Then  Should be Able to Modify General Configuration property value
#
#@Defect_Tracking
#Scenario:297 As Manager, edit and modify system default property value for Chart Options category
#Given user logins as Manager Credentials to zephyr
#When  user goes to Adminstration and Clicks on defect admin
#And   User goes to preferences and Edits and changes the value for dts.trendchart.t8.defectSeries1.status and save
#Then  Should be able to modify  Chart Option property value
#When  user logins as manager to zephyr
#And   user clicks on adminstration and clicks on defect admin 
#And   user navigates to preferences,Edits and changes the value for dts.trendchart.t8.defectSeries2.status and save
#Then  To be able to Modify Chart Option property value
#
#@Defect_Tracking
#Scenario: 295 As custom role user( with access), launch Defects Admin
#Given User Logins to Zephyr as Manager
#When  User Goes to administration and clicks on Customization
#And   adds role with defect admin permission 
#And   user goes to User setup and adds a user with above created role
#Then  should be able to add created role to user  
#When  user logins as as custom user to Zephyr
#And   goes to administration and views Defect Admin
#Then  Should be able to launch Defects Admin app
#
#@Defect_Tracking
#Scenario: 302 As Manager, disable(uncheck) the system default properties for chart option and General Configuration
#Given user logins as Manager to zephyr App 
#When  clicks ON administration 
#And   further clicks On Defect Admin and Preferences
#And   In Custom fields Disable the system default Enabled Property and save
#Then  should be able to disable the Property
#When  Enable the disabled Property and Cancel
#Then  warning message will popup
#When  Enable the disabled Property and Save
#Then  should be enabled the property
#
#
#@Defect_Tracking
#Scenario: 303 As Manager, enable(check) the system default  properties  for custom fields
#Given user logins as Manager Credentials to Zephyr application
#When  clicks on Administration Page
#And   Further Clicks on Defect admin and Preferences
#And   Enable the disabled property and save
#Then  should be able to enable the property
#When  Disable the enabled property and cancel
#Then  Warning Message will Pop Up
#When  disable the enabled property and save
#Then  To be able to disable the property
#
#@Defect_Tracking
#Scenario: 304 As Manager,disable(uncheck)  for new property
#Given user logins as Manager Credentials To Zephyr 
#When  clicks on Administration
#And   Further clicks on Defect admin and Preferences
#And   Adds a new property
#Then  New property should be added
#When  disable the Enabled property and cancel
#Then  Warning message will be popuped
#When  disable the Enabled property and save
#Then  should be able To Disable property
#When  enable the disabled Property and save
#Then  Should be able to enable the Property
#
#@Defect_Tracking
#Scenario: 305 As Manager,delete user defined property
#Given user logged in to zephyr as Manager 
#When  user navigates to Administration
#And   further navigates on Defect admin and Preferences
#And   user Adds few property
#Then  few property should be added
#When  user Deletes one property
#Then  should delete one property
#When  user Deletes two property
#Then  should be able To delete two property
#When  user Deletes all property
#Then  Should delete all the Property
#
#@Defect_Tracking
#Scenario: 306 As Manager,disable(uncheck) /Enable(Check) the  properties
#Given user Logged as Manager to zephyr
#When  user navigates to Administration page
#And   user navigates to Defect admin and Preferences 
#When  Disable the system default enabled property for chart option and save
#Then  Should be able to disable the property for chart option
#When  Enable the disabled property and cancel for chart option
#Then  Warning message will popup in for chart option
#When  Enable a disabled property for chart option and save
#Then  should be enabled the property for chart option
#When  Disable the system default enabled property for General Configuration and save
#Then  Should be able to disable the property for General Configuration
#When  Enable the disabled property and cancel for General Configuration
#Then  Warning message will popup in General Configuration
#When  Enable a disabled property for General Configuration and save
#Then  should be enabled the property for General Configuration
#When  user adds new property
#Then  new property should be added
#When  Disable added new property the enabled property and cancel 
#Then  warning message popuped
#When  disable the added enable property and save
#Then  should be disable the property
#When  Enable the disabled added new property and save
#Then  to be enabled the new property
#
#@Defect_Tracking
#Scenario: 307 As Manager, Add property name for General Configuration Chart Options Custom Fields  category 
#Given user Logged as Manager credentials to zephyr
#When  user Navigates to Administration page
#And   User navigates to Defect Admin and Preferences
#And   user Enters property name with upper case in General Configuration 
#Then  Property name should be saved with upper case in General Configuration
#When  user Enters property name with lower case in General Configuration 
#Then  Property name should be saved with lower case in General Configuration
#When  user Enter property name with both upper case and lower case in General Configuration 
#Then  Property name should be saved with both upper case and lower case in General Configuration
#When  user Enters property name with numbers only in General Configuration 
#Then  Property name should be saved with numbers only in General Configuration
#When  user Enters property name with Alphanumeric characters in General Configuration 
#Then  Property name should be saved with Alphanumeric characters in General Configuration
#When  user Enters property name with Special characters in General Configuration 
#Then  Property name should be saved with Special characters in General Configuration
#When  user Enters property name with International characters in General Configuration 
#Then  Property name should be saved with International characters in General Configuration
#When  user Enters property name with leading space in General Configuration 
#Then  Property name should be saved with leading space in General Configuration
#When  user Enters property name with trailing space in General Configuration 
#Then  Property name should be saved with trailing space in General Configuration
#When  user Enters property name with Uppercase in Chart Options 
#Then  Property name should be saved with Upper Case in Chart Options
#When  user Enters property name with lower case in Chart Options 
#Then  Property name should be saved with lower case Chart Options
#When  user Enter property name with both Upper case and lower case in Chart Options 
#Then  Property name should be saved with both Upper case and lower case in Chart Options
#When  user Enters property name with Numbers only in Chart Options 
#Then  Property name should be saved with Numbers only in Chart Options
#When  user Enters property name with Alphanumeric characters in Chart Options
#Then  Property name should be saved with Alphanumeric characters in Chart Options
#When  user Enters property name with Special Characters in Chart Options 
#Then  Property name should be saved with Special Characters in Chart Options
#When  user Enters property name with International characters in Chart Options 
#Then  Property name should be saved with international characters in Chart Options
#When  user Enters property name with Leading space in Chart Options 
#Then  Property name should be saved with Leading space in Chart Options
#When  user Enters property name with Trailing space in Chart Options 
#Then  Property name should be saved with Trailing space in Chart Options
#When  User Enters property name with upper case in Custom Fields 
#Then  property name should be saved with upper case in Custom Fields
#When  User Enters property name with lower case in Custom Fields 
#Then  Property Name should be saved with lower case in Custom Fields
#When  User Enter property name with both upper case and lower case in Custom Fields 
#Then  Property name Should be saved with both upper case and lower case in Custom Fields
#When  User Enters property name with numbers only in Custom Fields 
#Then  Property name should Be saved with numbers only in Custom Fields
#When  user Enters property name with alphanumeric characters in Custom Fields 
#Then  Property name should be saved with alphanumeric characters in Custom Fields
#When  user Enters property name with special characters in Custom Fields 
#Then  Property name should be saved with special characters in Custom Fields
#When  user Enters property name with international characters in Custom Fields
#Then  Property name should be saved with International Characters in Custom Fields
#When  user Enters property name with leading Space in Custom Fields 
#Then  Property name should be saved with leading Space in Custom Fields
#When  user Enters property name with trailing Space in Custom Fields 
#Then  Property name should be saved with trailing space in Custom Fields
#
#@Defect_Tracking
#Scenario: 308 Save property name with Min/Maxcharacter
#Given User Logged as Manager credentials to Zephyr application
#When  User Navigates to Administration 
#And   User Launches Defects Admin app and
#And   Selects the General Configuration Category,click on Add button and Enters single character in name field and save
#Then  Property name should be saved with single character for General Configuration category
#When  Selects the Chart Options Category,click on Add button and Enters single character in Name field and save
#Then  Property name should be saved with single character for Chart Options category
#When  Selects the Custom Fields Category,click on Add button and Enters single character in name field and save
#Then  Property name should be saved with single character for Custom Fields category
#When  selects the General Configuration Category,click on Add button and Enters Maximum two fifty five characters in name field and save
#Then  property name should be saved with Maximum two fifty five characters for General Configuration category
#When  Selects the chart Options Category,click on Add button and Enters Maximum two fifty five characters in Name field and save
#Then  Property name should be saved with Maximum Two fifty five characters for Chart Options category
#When  Selects the custom Fields Category,click on Add button and Enters Maximum two fifty five characters in name field and save
#Then  Property name should be saved with Maximum Two Fifty Five characters for Custom Fields category
#
#@Defect_Tracking
#Scenario: 309 As Manager,Add property value for General Configuration Chart Options Custom Fields category 
#Given user Logged to zephyr as Manager credentials 
#When  user clicks on the Administration page
#And   User further clicks to Defect Admin and Preferences
#And   user Enters value for existing property with upper case in General Configuration 
#Then  Property value should be saved with upper case in General Configuration
#When  user Enters value for existing property with lower case in General Configuration 
#Then  Property value should be saved with lower case in General Configuration
#When  user Enters value for existing property with upper case and lower case in General Configuration 
#Then  Property value should be saved with both upper case and lower case in General Configuration
#When  user Enters value for existing property with numbers in General Configuration 
#Then  Property value should be saved with numbers only in General Configuration
#When  user Enters value for existing property with alphanumeric characters in General Configuration 
#Then  Property value should be saved with Alphanumeric characters in General Configuration
#When  user Enters  value for existing property with special characters in General Configuration 
#Then  Property value should be saved with Special characters in General Configuration
#When  user Enters value for existing property with international characters in General Configuration 
#Then  Property value should be saved with International characters in General Configuration
#When  user Enters property value with leading space in General Configuration 
#Then  Property value should be saved with leading space in General Configuration
#When  user Enters property value with trailing space in General Configuration 
#Then  Property value should be saved with trailing space in General Configuration
#When  user Enters value for existing property with upper case in Chart Options  
#Then  Property value should be saved with upper case in Chart Options 
#When  user Enters value for existing property with lower case in Chart Options  
#Then  Property value should be saved with lower case in Chart Options 
#When  user Enters value for existing property with upper case and lower case in Chart Options  
#Then  Property value should be saved with both upper case and lower case in Chart Options 
#When  user Enters value for existing property with numbers in Chart Options  
#Then  Property value should be saved with numbers only in Chart Options 
#When  user Enters value for existing property with alphanumeric characters in Chart Options  
#Then  Property value should be saved with Alphanumeric characters in Chart Options 
#When  user Enters  value for existing property with special characters in Chart Options  
#Then  Property value should be saved with Special characters in Chart Options 
#When  user Enters value for existing property with international characters in Chart Options  
#Then  Property value should be saved with International characters in Chart Options 
#When  user Enters property value with leading space in Chart Options  
#Then  Property value should be saved with leading space in Chart Options 
#When  user Enters property value with trailing space in Chart Options  
#Then  Property value should be saved with trailing space in Chart Options  
#When  user Enters value for existing property with upper case in Custom Fields  
#Then  Property value should be saved with upper case in Custom Fields 
#When  user Enters value for existing property with lower case in Custom Fields  
#Then  Property value should be saved with lower case in Custom Fields 
#When  user Enters value for existing property with upper case and lower case in Custom Fields  
#Then  Property value should be saved with both upper case and lower case in Custom Fields 
#When  user Enters value for existing property with numbers in Custom Fields  
#Then  Property value should be saved with numbers only in Custom Fields 
#When  user Enters value for existing property with alphanumeric characters in Custom Fields  
#Then  Property value should be saved with Alphanumeric characters in Custom Fields 
#When  user Enters  value for existing property with special characters in Custom Fields  
#Then  Property value should be saved with Special characters in Custom Fields 
#When  user Enters value for existing property with international characters in Custom Fields  
#Then  Property value should be saved with International characters in Custom Fields 
#When  user Enters property value with leading space in Custom Fields  
#Then  Property value should be saved with leading space in Custom Fields 
#When  user Enters property value with trailing space in Custom Fields  
#Then  Property value should be saved with trailing space in Custom Fields 


@Defect_Tracking
  Scenario: 21  Attempt To Create a Defect and Subtask
   Given User In Defect Tracking Page
  When User try to create a defect with summary of 255 characters
  Then Should not be able to create a Defect
  When User try to create a defect with Description of 2048 characters
  Then Should not be Able to Create a Defect
  When user Search a defect and select it and try to create a subtask Without Summary and With Description
  Then Should not be able To Create a Subtask Without Summary
  When User Search a defect and select it and Try to create a subtask With Summary and Without Description
  Then Should not be able to Create a subtask without Description
  When User Search a defect and Select it and try to create a Subtask with Summary of 255 characters
  Then should not be able To Create Subtask with Summary of 255 characters
  When user Search a defect and Select It and Try to create Subtask with Description of 2048 characters
  Then Should Not Be Able To Create Subtask with Description of 2048 characters
  When user click on TCC Create phase and Add testcase then go to Test planning and Create cycle then Add phase and execute testcase with any status
  When user click on Test Execution and Click on D and Try to create defect with summary of 255 chars
  Then Should not be able To Create Defect with summary of 255 chars
  When user Try to create a defect With Description of 2048 chars
  Then Should not be able to Create Defect With Description of 2048 chars
  When user  Click ON D and Select It and Try to create a subtask Without Summary and With Description
  Then Should NOT be able to Create SubTask Without Summary
  When user click D AND Search defect AnDselect it and Try to create subtask With Summary and Without Description
  Then ShoUld not Be Able to creatE subTask Without Description
  When User Click on D and Search a Defect and select it and try to create Subtask with Summary of 255 chars
  Then Should not Be Able to create SubTask
  When user click on D and Search defect and select it And Try to create Subtask with Description of 2048 chars
  Then should not be Able To Create Subtask
  




  @Defect_Tracking
  Scenario: 22 Cancel a New Defect Prior to Submit
    Given User Is In defectTracking Page
     When User create defect with corresponding project and issuetype then click on cancel
      And Search defect and create subtask with corresponding project and issuetype then click on cancel
     When user click on TextExecution and execute testcases with any status
      And User click on D and create defect with corresponding project and issuetype and click on cancel
      And user click on D and create subtask with corresponding project and issuetype then click on cancel
  
   #@Defect_Tracking
   #Scenario: 23 View drop down fields populated data with Project Selected
    #Given User is in Defecttracking page
    #When user create defect and select project and verify the all respective project name in dropdown
    #Then Should be able to view dropdown fields in DefectTracking
    #When user click on TextExecution and create defect and select project and verify the all respective project name in dropdown
    #Then should be able to view dropdown fields in TextExecution
  #
    
   @Defect_Tracking
  Scenario: 27 Attempt to edit and modify the Defect after Submission in Test Execution
    Given user is in Testrepository page
    When User click on Textexecution and create testcases and execute with any status and create defect
    And User try to modify defect project in created defect
    Then Should not be able to edit and modify the Defect
    When User search the defect and try to modify subtask project after submission in TestExecution
    Then Should not be able to edit and modify the subtask
    When User search the defect and try to modify subtask parentsID after submission in TestExecution
    Then Should not be able to modify the subtask
    
    
    @Defect_Tracking
  Scenario: 28 View the details of a defect associated to a Testcase from Test Execution in Test Execution
   Given user is in TestRepository page
   When user click on TextExecution and create testcases and execute with any status and create defect
  # And user try to link the created defect with testcase and view the details of defect in currently inked defect grid
   Then should not be able to View the details of a defect
   When user try to create subtask and link with testcase and view the details of subtask in currently linked defect grid
   Then sholud not be able to view the details of defect
    
  @Defect_Tracking
  Scenario: 29 Search by a specific Subtask number using Jira KeyID
  Given user is in Defecttracking page
  When user serach the subtask by JiraID in advance serach
  Then Should be able to search by a specific Subtask number
  When user click on Textexecution and execute testcases and create defect and search it
  Then should be able to search by a specific subtask number
  
  
  @Defect_Tracking
 Scenario: 30 Export the Defects in Excel format
 Given User is in defectTracking page
 When User click on basic and serach by jiraId and select single defect and export defect into excel format
 Then Should be able to export the single defect into Excel format
 When User serach by jiraId and select multiple defect and export defects into excel format
 Then Should be able to export the multiple defects into Excel format
 When User select project and issuetype and select single defect and export into excel format
 Then Should be able to export the single defect into excel format
 When User select project and issuetype and select multiple defects and export into excel format
 Then Should be able to export the multiple defects into excel format
 When User select project and issuetype and status and serch single defect and export into excel format
 Then Should be able to export the single Defect into excel format 
 When User select project and issuetype and status and select multiple defects and export into excel format
 Then Should be able to export the multiple Defects into excel format
 When User select assignee and select single defect and export into excel format
 Then Should be able to export single defecct into excel format
 When User select assignee and select multiple defects and export into excel format
 Then Should be able to export multiple defects into Excel format
 When User select Filedby and select single defect and export into excel format
 Then Should be able to export single defect into excel format in filedby
 When User select Filedby and select multiple defects and export into excel format
 Then Should be able to export multiple defect into excel format in filedby
 When User click on Advance and select single defect and export into excel format
 Then Should be able to export single defect and export into excel format in advance search
 When User select multiple defects and export into excel format
 Then Should be able to export multiple defects and export into excel format in advance search
 When User select JQL and select single defect and export into excel format
 Then Should be able to export single defect into excel format while selecting JQL
 When User select JQL and select multiple defects and export into excel format
 Then Should be able to export multiple defects into excel format while selecting JQL
 When User select Filters and select single defect and export into excel format
 Then Should be able to export single defect into excel format while selecting filters
 When User select Filters and select multiple defect and export into excel format
 Then Should be able to export multiple defect into excel format while selecting filters
  
   @Defect_Tracking
  Scenario: 24 Update a defect with attachment
  Given User Is in DefectTracking Page
   When User create defect and search it and update an attachment in  text format
   Then Should be able to update a defect with attachment in text format
   When User update an attachment in excel format
   Then Should be able to update a defect with attachment in excel format
   When User update an attachment in word format
   Then Should be able to update a defect with attachment in word format
   When User update an attachment in image format
   Then Should be able to update a defect with attachment in image format
   When User update an attachment in any other format 
   Then Should be able to update a defect with attachment in other format
   When User update multiple attachments in different format
   Then Should be able to update a defect with multiple attachments in different formats
   When User attempt to update file of size TenMB 
   Then Should be able to update a defect with attachment of size TenMB 
   When User create a file with special characters and try to upload that file
   Then Should be able to update a defect with attachment of special char file
   When User search the defect and create subtask and update an attachment in  text format
   Then Should be able to update subtask with attachment in text format
   When User try to update an attachment in excel format
   Then Should be able to update subtask with attachment in excel format
   When User try to update an attachment in word format
   Then Should be able to update subtask with attachment in word format
   When User try to update an attachment in image format
   Then Should be able to update subtask with attachment in image format
   When User try to update an attachment in any other format 
   Then Should be able to update subtask with attachment in other format
   When User try to update multiple attachments in different format
   Then Should be able to update subtask with multiple attachments in different formats
   When User try to attempt to update file of size TenMB 
   Then Should be able to update subtask with attachment of size TenMB 
   When User create a file with special characters and try to upload it
   Then Should be able to update subtask with attachment of special char file
   When User launch TextExecution and execute testcases with any status and create defect 
    And User update an attachment in text format in TE 
   Then Should be able to update a defect with attachment in text format in TE
   When User update an attachment in excel format in TE
   Then Should be able to update a defect with attachment in excel format in TE
   When User update an attachment in word format in TE
   Then Should be able to update a defect with attachment in word format in TE
   When User update an attachment in image format in TE
   Then Should be able to update a defect with attachment in image format in TE
   When User update an attachment in any other format in TE 
   Then Should be able to update a defect with attachment in other format in TE
   When User update multiple attachments in different format in TE
   Then Should be able to update a defect with multiple attachments in different formats in TE
   When User attempt to update file of size TenMB in TE
   Then Should be able to update a defect with attachment of size TenMB in TE
   When User create a file with special characters and try to upload that fiel in TE
   Then Should be able to update a defect with attachment of special char file in TE
   When User launch TextExecution and execute testcases with any status and click on D and create subtask
   And  User try to update an attachment in  text format in TE
   Then Should be able to update subtask with attachment in text format in TE
   When User try to update an attachment in excel format in TE
   Then Should be able to update subtask with attachment in excel format in TE
   When User try to update an attachment in word forma in TEt
   Then Should be able to update subtask with attachment in word format in TE
   When User try to update an attachment in image format in TE
   Then Should be able to update subtask with attachment in image format in TE
   When User try to update an attachment in any other format in TE 
   Then Should be able to update subtask with attachment in other format in TE
   When User try to update multiple attachments in different format in TE
   Then Should be able to update subtask with multiple attachments in different formats in TE
   When User search the defect and create subtask and attempt to update file of size TenMB  in TE
   Then Should be able to update subtask with attachment of size TenMB in TE 
   When User try to create a file with special characters and try to upload it in TE
   Then Should be able to update subtask with attachment of special char file in TE
   
   @Defect_Tracking
  Scenario: 25 View the attachment of Defect in different format
  Given User is in defecttracking page
  When User search the defect and attach the text format and try to view the attachment
  Then Should be able to view the attachment of defect in text format
  When User search the defect and attach the excel format and try to view the attachment
  Then Should be able to view the attachment of defect in excel format
  When User search the defect and attach the word format and try to view the attachment
  Then Should be able to view the attachment of defect in word format
  When User search the defect and attach the image format and try to view the attachment
  Then Should be able to view the attachment of defect in image format
  When User click on testexecution and execute testcases in any status and create defect
   And User create subtask and attach the text format and try to view the attachment
  Then Should be able to view the attachment of subtask in text format
  When User create subtask and attach the excel format and try to view the attachment
  Then Should be able to view the attachment of subtask in excel format
  When User create subtask and attach the word format and try to view the attachment
  Then Should be able to view the attachment of subtask in word format
  When User create subtask and attach the image format and try to view the attachment
  Then Should be able to view the attachment of subtask in image format
  
 


 @Defect_Tracking
  Scenario: 26 Download attachment of Defect in any format
  Given User is in DefectTracking Page
  When User serach the defect and attach any format file and save it then view and download the attachment
  Then Should be able to Download attachment
  When User click on TestExecution and execute testcases with any status and create defect
  And User search thd defect and create subtask and attach any format file and save it and view it then download the attachment
  Then should be able to download attachment
 
    @Defect_Tracking
   Scenario: 239 Change the status of linked defect from open to Inprogress and view count in Overall gadget
    Given User is in administration page
    When User set the DTS to JIRA
    Then Should be able to set the DTS to JIRA
    When User launch the testexecution
    Then Should be able to launch testexecution
    When User link one defect with status open to execution
    Then Should be able to link the defect
    When User create the dashboards
    Then Should be able to add dashboards
    When User launch the gadget
    Then Should be able to launch the gadget
    When User add overall gadget
    Then Should be able to add overall gadget
    When User search that linked defect in DefectTracking
    Then Should be able to search that linked defect
    When User change the status from open to inprogress
    Then Should be able to change the status
    When User refresh the added overall gadget
    Then Should be able to refresh the overall gadget
    When view the defect count by status
    Then defect count show updated count with status


   @Defect_Tracking
  Scenario: 240 <DT/Gadget> Change the status of linked defect from "In-progress" to "Done" and view count in "Overall gadget"
    Given User Is In administration page
    When User set the dts to JIRA
    Then Should be able to set the dts to JIRA
    When User launch the TestExecution
    Then Should Be able to launch TestExecution
    When User link one defect with status inprogress to execution
    Then Should be able to link the defect with status inprogress
    When User create the Dashboard
    Then Should be able to add Dashboard
    When User launch the Gadget
    Then Should be able to launch the Gadget
    When User add Overall Gadget
    Then Should be able to add Overall Gadget
    When User search the linked defect in DefectTracking
    Then Should be able to search the linked defect
    When User change the status from inprogress to done
    Then Should be able to change the status from inprogress to done
    When User Refresh the added overall gadget
    Then Should be able to refresh the Overall Gadget
    When view the defect count by status of done
    Then defect count show updated count with status of done
  
   @Defect_Tracking
 Scenario: 241 <DT/Gadget> Change the status of linked defect from "DONE" to "TO DO" and view count in "Overall gadget"
    Given User is in Administration Page
    When User set the dts to jira
    Then Should be able to set the dts to jira
    When User launch the TestExecution and click on D  
    Then Should be Able to launch TestExecution
    When User link one defect with status Done to execution
    Then Should be able to link the defect with status Done
    When User Create the Dashboard
    Then Should be able to Add Dashboard
    When User Launch the Gadget
    Then Should be able to launch Gadget
    When User Add Overall Gadget 
    Then Should be able to Add Overall Gadget
    When User Search the linked defect in DefectTracking
    Then Should be able to search the linked Defect
    When User change the status from Done to TO DO
    Then Should be able to change the status from Done to TO DO 
    When User Refresh the added Overall Gadget
    Then Should be able to Refresh Overall Gadget
    When view the defect count by status of TO Do
    Then defect count show updated count with status of TO DO
    
   @Defect_Tracking
 Scenario: 1969 <DT/Gadget> Delete linked defect and view count in "Overall gadget"
 Given user is in administration page
 When user set DTS to jira
 Then should be able to set dts to jira
 When user launch the textexecution
 Then should be able to launch the textexecution 
 When user link one defect to execution 
 Then should be able to link the defect to execution
 When user create the dashboard 
 Then should be able to create dashboard
 When user launch the gadget page
 Then should be able to launch the gadget page
 When user add the overall gadget
 Then should be able to add overall gadget
 When user search the linked defect in jira
 Then should be able to search the linked defect in jira
 When user delete the linked defect
 Then should be able to delete the linked defect
 When user refresh the added overall gadget
 Then should be able to refresh the added overall gadget
 When user view the Defect count by status 
 Then Defect count show updated count with status
 
   @Defect_Tracking
 Scenario: 242 <DT/Gadget> Change the priority of linked defect, View count in "Open gadget"
 Given user is in Administration Page
 When user set the dts to jira
 Then should be able to set the dts to jira
 When user Launch the testexecution
 Then should be able to Launch the testexecution
 When user link one defect with status open to execution
 Then should be able to link defect with status open to execution
 When user create Dashboard
 Then should be able to create Dashboard
 When user launch the Gadget Page
 Then should be able to launch the Gadget Page
 When user add the open gadget
 Then should be able to add open gadget
 When user search that linked defect in JIRA
 Then should be able to search the linked defecct in JIRA
 When user change the priority of linked defect
 Then should be able to change priority of linked defect
 When user refresh the added open gadget
 Then should be able to refresh the open gadget
 When user view the defect count by priority
 Then defect count show updated count with priority
 
 
   @Defect_Tracking
 Scenario: 243 Delete linked defect and view count in "open defect" gadget
 Given user Is In Administration Page
 When user set dts to the jira
 Then should be able to set dts to the jira
 When user launch the TestExecution
 Then should be able to launch the TestExecution 
 When user link one defect to the execution 
 Then should be able to link the defect to the execution
 When user create the DashBoard 
 Then should be able to create DashBoard
 When user launch the gadget Page
 Then should be able to launch the gadget Page
 When user add the open defects gadget
 Then should be able to add open defects gadget
 When user search the linked defect in JIRA
 Then should be able to search the linked defect in JIRA
 When user delete the linked defect in jira
 Then should be able to change priority
 When user refresh the added open defect gadget
 Then should be able to refresh the added open defects gadget
 When User view the Defect count by status 
 Then Defect count show updated count with priority
    
   @Defect_Tracking
 Scenario: 244 <DT/Gadget> Change the status of linked defect from "open" to "Inprogress" and view count in "Traceability gadget"
 Given User Is in administration page
 When user set dts to Jira
 Then should be able to set
 When user click on Requiremetns 
 Then should be able to launch Requirements
 When user create a node and add Requirements
 Then should be able to add Requirements
 When user launch the Test repository
 Then should be able to launch the Test repository
 When user create phase and add the testcases
 Then should be able to add testcases
 When user map testcases to requiremetns
 Then should be able to map
 When user launch Test planning
 Then should be able to launch Test planning
 When user create cycle and assign phase to users
 Then should be able to assign testcases to users
 When user launch Test execution
 Then should be able to launch Test execution
 When user link One defect with status Open to execution
 Then should be able to link defect with status Open to execution
 When user create dashBoards
 Then should be able to create dashBoards
 When user launch the Gadaget page
 Then should be Able to launch the Gadget Page
 When user add Traceability gadget
 Then should be able to add Traceability gadget
 When user search that linked defect in DT app
 Then should be able to search that linked defect in DT app
 When user change status from Open to Inprogress
 Then should be able to change status from Open to Inprogress
 When user refresh the added Traceability gadget
 Then should be able to refresh the added Traceability gadget
 When user view the total and open defect count
 Then defect count show updated count with status in added Traceability gadget
 
  @Defect_Tracking
 Scenario: 245 <DT/Gadget> Change the status of linked defect from "Inprogress" to "Done" and view count in "Traceability gadget"
 Given User Is In administration Page
 When User set dts to Jira
 Then Should be able to set
 When user launch the Test execution
 Then should be able to launch the Test execution
 When user link One defect with status Inprogress to execution
 Then should be able to link defect with status Inprogress to execution
 When user create the dashBoards
 Then should be able to create the dashBoards
 When user launch the Gadaget Page
 Then should Be able to launch the Gadget Page
 When user add Traceability Gadget
 Then should be able to add Traceability Gadget
 When user search that linked defect in defecttracking
 Then should be able to search that linked defect in defecttracking
 When user change status from Inprogress to Done
 Then should be able to change status from Inprogress to Done
 When user refresh the added Traceability Gadget
 Then should be able to refresh the added Traceability Gadget
 When user view the total and Open defect count
 Then defect count show updated count with status in added Traceability Gadget
 
  @Defect_Tracking
 Scenario: 246 <DT/Gadget> Change the status of linked defect from "Done" to "Open" and view count in "Traceability gadget"
 Given user Is In administration page
 When User set Dts to Jira
 Then Should be Able to Set
 When user launch TestExecution
 Then should be able to launch TestExecution
 When user link One defect with status Done to execution
 Then should be able to link defect with status Done to execution
 When user create the DashBoards
 Then should be able to create the DashBoards
 When user launch the gadaget Page
 Then should be Able to launch the gadget Page
 When user add traceability gadget
 Then should be able to add traceability gadget
 When user search that linked defect in Defecttracking
 Then should be able to search that linked defect in Defecttracking
 When user change status from Done to Open 
 Then should be able to change status from Done to Open 
 When user refresh the added traceability gadget
 Then should be able to refresh the added traceability gadget
 When user view the Total and open defect count
 Then Defect count show updated count with status in added Traceability gadget
    
   @Defect_Tracking
 Scenario: 247 <DT/Gadget> Delete linked defect and view count in "Traceability gadget"
 Given User Is In Administration Page
 When User set DTS to Jira
 Then Should be able to Set DTS to Jira
 When User launch TestExecution
 Then Should be able to launch TestExecution
 When User link One defect with status ToDo to execution
 Then should be able to link defect with status ToDo to execution
 When User create the DashBoards
 Then Should be able to create the DashBoards
 When User launch the gadaget Page
 Then Should be Able to launch the gadget Page
 When User add traceability gadget
 Then Should be able to add traceability gadget
 When User search that defect in JIRA and Delete it
 Then Should search that defect and delete 
 When User refresh the added traceability gadget
 Then Should be able to refresh the added traceability gadget
 When User view the Total and open defect count
 Then Defect count show updated count with status in Traceability gadget
 
 @Defect_Tracking
 Scenario: 2073 After creating defect in mapped jira project run  ETL and view defect count in "Daily pulse gadget"
 Given User is In Administration Page
 When User Set Dts to Jira
 Then Should be able to set Dts to jira
 When User launch project setup
  And User map ZE project to jira project
 Then Should be able to map ZE project to jira project
 When User launch the dashboard
 Then Should be able to launch the dashboard
 When User add the dashboard
 Then Should be able to add dashboard
 When User add the dailypulse gadget
 Then Should be able to add dailypulse gadget
 When User view the defect count
 Then Should show proper defect count
 When User create one more defect in mapped project
 Then Should be able to create defect in mapped project
 When User view defect count after creating defect in mapped project
 Then should show proper defect count after creating defect in mapped Project
 
@Defect_Tracking
 Scenario: 248 After deleting defect in mapped jira project run  ETL and view defect count in "Daily pulse gadget"
 Given User in administration page
 When User set Dts to JIRA
 Then Should be able to set Dts to JIRA
 When User launch Project setup
  And User map ZE project to JIRA project
 Then Should be able to map ZE project to JIRA project
 When User launch dashboard
 Then Should be able to launch dashboard
 When User Add one dashboards
 Then Should be able to Add dashboards
 When User Add dailypulse gadget
 Then Should be able to add Dailypulse gadget
 When User view the defect count after adding dailypulse gadget
 Then Should show proper defect count after adding dailypulse gadget
 When User delete defect in mapped jira project
 Then Should be able to delete defect
 When User view proper defect count after deleting defect 
 Then Should be able to view proper defect count after deleting defect
 
 
 @Defect_Tracking
  Scenario: 194 Link multiple defects to multiple testcases with various priorities and statuses and then hover the cursor on D button in Test Execution
 Given User is in Test Execution page
 When User launch Test Execution
 Then Should be able to launch Test Execution 
 When User open linked defects modal dialog using D button of first testcase
 Then Should launch link Defect window
 When User Search defect with first priority by JQL
 Then Should be able to search defects by JQL
 When User link the searched defect
  And User Search defect with different priority by JQL
 Then Should be able to Search defects by JQL
 When User link defect with different priority
 Then Should be able to link defect to execution with different priorities
 When User open linked defects modal dialog using D button of second testcase
 Then Should launch Link defect window
 When User Search defect with first status by JQL
 Then Should be able to Search Defects by JQL
 When User Link searched defect
  And User serach defect with different status by JQL
 Then Should be Able to Search defects by JQL
 When User link defect with different status 
 Then Should be able to link defect to execution with different status 
 When User hover the cursor on defectid in execution grid
 Then defect details should show properly for all linked defects

 @Defect_Tracking
 Scenario: 195 Attempt to link the same defect multiple times to a testcase
 Given user is in TestExecution page
 When user launch TestExection
 Then should be able To launch TestExecution
 When user open linked defects modal dialog using D button on a testcase
 Then should launch link defect window
 When user search for a defect by ID
 Then should be able to search defects by ID
 When user add the defect to the testcase
 Then should be able to link defect to execution
 When user search for the same defect again using the defect ID
 Then should be able to search defect again
 When user again try to link defect
 Then should get message as defect is already linked
   
 
@Defect_Tracking
Scenario: 196 Link the defect with no priority to execution
Given User is in text execution page
When User launch text execution
Then Should be able to launch text execution
When User open linked defect modal dialog using D button on a testcase
Then Should be able to launch link defect window
When User search a defect by ID which is having empty priority
Then Should be able to search defect with empty priority
When User click on link button
Then Should be able to link defect to execution with empty priority

@Defect_Tracking
Scenario: 197 Search a defect has special characters in name and link to the testcase in Test Execution
Given User is in textexecution page
When User launch Textexecution
Then Should be able to launch Textexecution
When User open linked defects modal dialog using D button on a Testcase
Then Should be able to launch Link defect window
When User search a defect by ID which is having special chars in name
Then Should be able to search defect which is having special chars in name
When User click on Link button
Then Should be able to link defect which is having special chars in name

@Defect_Tracking
Scenario: 198 Search for defect has international characters and link to the testcase in Test Execution
Given user in textexecution page
When user launch Textexecution
Then should be able to launch Textexecution
When user open linked defects modal Dialog using D button on a testcase
Then should be able to launch link defect Window
When user search for a defect by ID which is having international chars in name
Then should be able to search defects which is having international chars in name
When user click on link button
Then should be able to link defect which is having international chars in name


@Defect_Tracking
Scenario: 199 Link multiple defects with a long name to a testcase in Test Execution
Given user in Textexecution Page
When User launch textexecution
Then Should be able to Launch textexecution
When User Open linked defects modal dialog using D button on a testcase
Then Should be able to launch Link Defect Window
When User search for first defect by ID which is having long name of 255 chars
Then Should be able to search first defect with long name
When User Click on Link button on first defect
Then Should be able to link first defect with long name
When User search for second defect by ID which is having long name of 255 chars
Then Should be able to search second defect with long name
When User Click on Link button on second defect
Then Should be able to link second defect with long name

@Defect_Tracking
Scenario: 266 Create a defect with custom field of type MultiSelect
Given User isin defectTracking Page
When User create defect with customfield of type multiselect if option value is in number
Then Should be able to create defect if option value is in number
When User create defect if option value is in uppercase
Then Should be able to create defect if option value is in uppercase
When User create defect if option value is in lowercase
Then Should be able to create defect if option value is in lowercase  
When User create defect if option value is in alphanumeric characters
Then Should be able to create defect if option value is in alphanumeric characters
When User create defect if option value is in special character
Then Should be able to create defect if option value is in special character
When User create defect if option value is in international characters
Then Should be able to create defect if option value is in international characters
When User create defect if option value is very long
Then Should be able to create defect if option value is very long
When User Launch the Testexecution
Then Should be able to Launch the Testexecution
When User create defect with customfield of type multiselect if option value is in Number
Then Should be able to create defect if option value is in Number
When User create defect if option value is in Uppercase
Then Should be able to create defect if option value is in Uppercase
When User create defect if option value is in Lowercase
Then Should be able to create defect if option value is in Lowercase  
When User create defect if option value is in Alphanumeric characters
Then Should be able to create defect if option value is in Alphanumeric characters
When User create defect if option value is in Special character
Then Should be able to create defect if option value is in Special character
When User create defect if option value is in International characters
Then Should be able to create defect if option value is in International characters
When User create defect if option value is Very long
Then Should be able to create defect if option value is Very long

@Defect_Tracking
Scenario: 267 Edit a defect MultiSelect for custom field of type MultiSelect if set as nonmandatory
Given User is in defectTraccking Page
When User create defect with customfield of type multiselect if option value in number
Then Should be able to create defect if option value in number 
When User search the created defect and remove the multiselect customfield value and save it
Then Should be able to save the defect after modification in Defecttracking
When User create defect with customfield of type multiselect in Testexecution
Then Should be able to create defect with customfield of type multiselect in Testexecution
When User remove the option value save the defect 
Then Should be able to remove the option value in testexecution



@Defect_Tracking
Scenario: 268 Create a defect with custom field of type RadioButton
Given User in Defecttracking Page
When User create a defect with custom field of type RadioButton if option values in numbers
Then Should be able to create defect if option values in numbers
When User create defect if option values in uppercase
Then Should be able to create defect if option values in uppercase
When User create defect if option values in  lowercase
Then Should be able to create defect if option values in lowercase
When User create defect if option values contains alphanumeric characters and spaces
Then Should be able to create defect if option values contains alphanumeric characters and spaces
When User create defect if option values in special character
Then Should be able to create defect if option values in special character
When User create defect if option values contains international characters  
Then Should be able to create defect if option values contains international characters
When User create defect if option values is very long
Then Should be able to create defect if option values is very long
When User launch the Testexecution
Then Should be able to launch the Testexecution
When User create a defect with custom field of type radiobutton if option values in numbers
Then Should be able to create defect if option values is in numbers
When User create defect if option values is in uppercase
Then Should be able to create defect if option values is in uppercase
When User create defect if option values is in lowercase
Then Should be able to create defect if option values is in lowercase
When User create defect if option values contains alphanumeric characters
Then Should be able to create defect if option values contains alphanumeric characters
When User create defect if option values is in special character
Then Should be able to create defect if option values is in special character
When User create defect if option values is in international characters  
Then Should be able to create defect if option values is in international characters
When User create defect if option values is Very long
Then Should be able to create defect if option values is Very long


@Defect_Tracking
Scenario: 269 Edit a defect and change the value of custom field of type Radio Button
Given User is in DefectTrcking page
When User create a defect with custom field of type radio button
Then Should be able to create defect with custom field of type radio button
When User search the created defect and click on edit and change the value and save it
Then Should be able to save the defect after modification
When User create a defect with custom field of radio button in testexecution
Then Should be able to create defect in testexecution
When User search the created defect and select click on edit and change the value and save it
Then Should be able to save the defect after Modification  

@Defect_Tracking
Scenario: 270 Edit a defect remove the value for customfield of type RadioButton if set as nonmandatory
Given User is In defecttracking Page
When User create a defect with only numbers in customfield of type radiobutton
Then Should be able to create defect with only number in customfield of type radiobutton
When User search the created defect and remove the radio button custom field value and save it
Then Should be able to save the defect after modification in defecttracking
When User create the defect with only numbers in customfield of type radiobutton in Testexecution 
Then Should be able to create defect in Testexecution
When User remove the radio button custom field value and Save it
Then Should be able to save the defect after modification in Textexecution

@Defect_Tracking
Scenario: 271 Create a defect with customfield of type Readonly text field
Given User is In DefectTracking Page
When User create defect with readonly type of customfield in defecttracking 
Then Should be able to create defect with readonly type of customfield in defecttracking
When User create defect with readonly type of customfield in testexecution
Then Should be able to create defect with readonly type of customfield in testexecution 
  
  @Defect_Tracking
Scenario: 272 Create  a defect with custom field of type User Picker
Given User is in Defecttracking Page
When User create defect with userpicker type of customfield in defecttracking
Then Should be able to create defect with userpicker type of customfield in defecttracking
When User create defect with userpicker type of customfield in testexecution
Then Should be able to create defect with userpicker type of customfield in testexecution   

@Defect_Tracking
Scenario: 273 Create a defect with custom field of type MultiUser Picker
Given User is in defecttracking Page
When User create defect with multiuser picker type customfield in defecttracking
Then Should be able to create defect with multiuser picker type of customfield in defecttracking
When User create defect with multiuser picker type of customfield in testexecution
Then Should be able to create defect with multiuser type of customfield in testexecution

@Defect_Tracking
Scenario: 274 Create a defect with custom field of type Single Version Picker
Given User is in defectTracking Page
When User create defect with SingleVersion Picker type of customfield in defecttracking
Then Should be able to create defect with SingleVersion Picker type of customfield in defecttracking
When User create defect with SingleVersion Picker type of customfield in testexecution
Then Should be able to create defect with SingleVersion Picker type of customfield in testexecution  

@Defect_Tracking
Scenario: 276 Create a defect with custom field of any type if default screen is not configured in Jira
Given User Is In external jira page 
When User create any type of customfield and associate to the resolve screen
Then Should be able to associate to the resolve screen
When User create the defect and view the created customfield in defecttracking
Then Should be able to create the defect and view the created customfield in defecttracking
When User create the defect and view the created customfield in testexecution
Then Should be able to create the defect and view the created customfield in testexecution


@Defect_Tracking
Scenario: 275 Create a defect with custom field of type MultiVersion Picker
Given User Is in Defecttracking Page
When User create defect with MultiVersion Picker type of customfield in defecttracking
Then Should be able to create defect with MultiVersion Picker type of customfield in defecttrackinng
When User create defect with MultiVersion Picker type of customfield in testexecution
Then Should be able to create defect with MultiVersion Picker type of customfield in testexecution

@Defect_Tracking
Scenario: 279 Create a defect with >1 custom fields
Given user Is in defectTracking Page
When user create defect with multiple type of customfields
Then should be able to create Defect with multiple type of customfields
When user create defect with multiple type of customfields in testexecution
Then should be able to create Defect with multiple type of customfields in testexecution 


@Defect_Tracking
 Scenario: 280 Create defect with Issue Type New Feature
 Given User is In DefectTracking page
 When User create defect with issue type new feature
 Then Should be able to create defect with issue type new feature
 When User create defect with issue type new feature in testexecution
 Then Should be able to create defect with issue type new feature in testexecution
 
  @Defect_Tracking
  Scenario: 281 Create defect with Issue Type Task
 Given user Is In DefectTracking Page
 When user create defect with issue type Task
 Then should be able to create defect with issue type Task
 When user create defect with issue type Task in testexecution
 Then should be able to create defect with issue type Task in testexecution
 
 @Defect_Tracking
 Scenario: 282 Create a defect with Issue Type Improvement
 Given user Is in DefectTracking Page
 When user create defect with issue type Improvement
 Then should be able to create defect with issue type Improvement
 When user create defect with issue type Improvement in testexecution
 Then should be abble to create defect with issue type Improvement in testexecution
 
 @Defect_Tracking
 Scenario: 283 Create a defect with custom field of any type if custom field flag online is set to true in Jira Latest version
 Given User In Administration Page
 When User click on defect admin and set the preferences
  And User create defect with customfield of type Textfield in Defecttracking
 Then Should be able to create defect with customfield of type Textfield in Defecttracking
 When User create defect with customfield of type Textfield in Testexecution
 Then Should be able to create defect with customfield of type Textfield in Testexecution
 When User create defect with customfield of type Freetext in Defecttracking
 Then Should be able to create defect with customfield of type Freetext in Defecttracking
 When User create defect with customfield of type Freetext in Testexecution
 Then Should be able to create defect with customfield of type Freetext in Testexecution
 When User create defect with customfield of type Select List in Defecttracking
 Then Should be able to create defect with customfield of type Select List in Defecttracking
 When User create defect with customfield of type Select List in Testexecution
 Then Should be able to create defect with customfield of type Select List in Testexecution
 When User create defect with customfield of type Date Picker in Defecttracking
 Then Should be able to create defect with customfield of type Date Picker in Defecttracking
 When User create defect with customfield of type Date Picker in Testexecution
 Then Should be able to create defect with customfield of type Date Picker in Testexecution
 When User create defect with customfield of type Number in Defecttracking
 Then Should be able to create defect with customfield of type Number in Defecttracking
 When User create defect with customfield of type Number in Testexecution
 Then Should be able to create defect with customfield of type Number in Testexecution
 When User create defect with customfield of type URL in Defecttracking
 Then Should be able to create defect with customfield of type URL in Defecttracking
 When User create defect with customfield of type URL in Testexecution
 Then Should be able to create defect with customfield of type URL in Testexecution
 When User create defect with customfield of type Checkbox in Defecttracking
 Then Should be able to create defect with customfield of type Checkbox in Defecttracking
 When User create defect with customfield of type Checkbox in Testexecution
 Then Should be able to create defect with customfield of type Checkbox in Testexecution
 When User create defect with customfield of type Multi Checkboxes in Defecttracking
 Then Should be able to create defect with customfield of type Multi Checkboxes in Defecttracking
 When User create defect with customfield of type Multi Checkboxes in Testexecution
 Then Should be able to create defect with customfield of type Multi Checkboxes in Testexecution
 When User create defect with customfield of type MultiSelect in Defecttracking
 Then Should be able to create defect with customfield of type MultiSelect in Defecttracking
 When User create defect with customfield of type MultiSelect in Testexecution
 Then Should be able to create defect with customfield of type MultiSelect in Testexecution
 When User create defect with customfield of type RadioButton in Defecttracking
 Then Should be able to create defect with customfield of type RadioButton in Defecttracking
 When User create defect with customfield of type RadioButton in Testexecution
 Then Should be able to create defect with customfield of type RadioButton in Testexecution 
 When User create defect with customfield of type User Picker in Defecttracking
 Then Should be able to create defect with customfield of type User Picker in Defecttracking
 When User create defect with customfield of type User Picker in Testexecution
 Then Should be able to create defect with customfield of type User Picker in Testexecution
 When User create defect with customfield of type Multi User Picker in Defecttracking
 Then Should be able to create defect with customfield of type Multi User Picker in Defecttracking
 When User create defect with customfield of type Multi User Picker in Testexecution
 Then Should be able to create defect with customfield of type Multi User Picker in Testexecution
 When User create defect with customfield of type Single Version Picker in Defecttracking
 Then Should be able to create defect with customfield of type Single Version Picker in Defecttracking
 When User create defect with customfield of type Single Version Picker in Testexecution
 Then Should be able to create defect with customfield of type Single Version Picker in Testexecution
 
 #@Defect_Tracking
 #Scenario: 285 View dropdown menu options for custom field of type Select List if LOVs are not sorted in Jira
 #Given User is in external jira page
  #When User add value into selectlist type of customfield
  #Then Should be able to add value into selectlist type of customfield 
  #When User login to Zephyr as testmanager
   #And User view the LOVs in selectlist customfield dropdown while creating defect in defecttrackinng
  #Then Should be able to view dropdown menu options for customfield of type selectlist in defecttracking
  #When User view the LOVs in selectlist customfield dropdown while creating defect in testexecution
  #Then Should be able to view dropdown menu options for customfield of type selectlist in testexecution
 #
 #@Defect_Tracking
 #Scenario: 284 View dropdown menu options for customfield of type Select List if LOVs are sorted in Jira
 #Given user is in external Jira Page
  #When user sort the values present in selectlist type of customfield 
  #Then should be able to sort the values present in selectlist type of customfield
  #When user login to zephyr as testmanager
   #And user view the LOVs in selectlist customfield dropdown while creating defect in Defecttrackinng
  #Then should be able to view dropdown menu options for customfield of type selectlist in Defecttracking
  #When user view the LOVs in selectlist customfield dropdown while creating defect in Testexecution
  #Then should be able to view dropdown menu options for customfield of type selectlist in Testexecution
#
 #@Defect_Tracking
 #Scenario: 286 Edit field setup for custom field of type Select List in Jira rearrange sequence of LOVs and view the changes reflected in Zephyr
 #Given User is in External Jira Page
  #When User rearrange the values present in selectlist type of customfield 
  #Then Should be able to rearrange the values present in selectlist type of customfield
  #When User login to zephyr as Testmanager
   #And User view the LOVs in selectlist customfield dropdown while creating defect in DefectTrackinng
  #Then Should be able to view dropdown menu options for customfield of type selectlist in DefectTracking
  #When User view the LOVs in selectlist customfield dropdown while creating defect in TestExecution
  #Then Should be able to view dropdown menu options for customfield of type selectlist in TestExecution

 @Defect_Tracking
 Scenario: 287 Create  a defect with custom field of type Date Picker
 Given user is in defectTracking Page
 When User create a defect with customfield of type Date Picker as date in the past in DT
 Then Should be able to create a defect with date in the past in defecttracking
 When User create a defect with customfield of type date picker as date in the past in testexecution
 Then Should be able to create a defect with date in the past in testexecution
  When User create a defect with customfield of type Date Picker as date in the future in DT
 Then Should be able to create a defect with date in the future in defecttracking
 When User create a defect with customfield of type date picker as date in the future in testexecution
 Then Should be able to create a defect with date in the future in testexecution
 
 @Defect_Tracking
 Scenario: 288 Search for a defect with custom field value any type by attribute
 Given user is In defectTracking page
 When User create defect with any types of customfield values
 Then Should be able to create defect with any types of customfield values
 When User create defect with any types of customfield values in testexecution
 Then Should be able to create defect with any types of customfield values in testexecution
 When User search for a defect with customfield value any type using attributes in defecttracking
 Then Should be able to search the defect in defecttracking with customfield value any type using attributes
 When User search for a defect with customfield value any type using attributes in testexecution
 Then Should be able to search the defect in testexecution with customfield value any type using attributes  
  

   
@Defect_Tracking
Scenario: 47 Change Multiple Defects/Subtask from single Component to multiple Components for the same Project 
Given User is in the Defect_Tracking page
 When User search the defects and select the multiple defects to change single component to multiple component
  And Click on Change multiple defect option
  And Change single component to multiple multiple component for the same project
 Then Should be able to change multiple defects from single component to multiple component   
   
@Defect_Tracking
Scenario: 48 Change Multiple Defects/Subtask from single fix version to multiple fix versions for the same Project 
Given User is in defect Tracking page
 When User search the defects and select multiple defects
  And click on change multiple defect option
  And change fix version to multiple fix version for the same project
 Then Should be able to change multiple defects from single fix version to multiple fix version
 
@Defect_Tracking
Scenario: 49 Change Multiple Defects/Subtask from single affected version to multiple affected versions for the same Project 
Given User is in the DefectTracking page
 When User search the defects and select the multiple defects
  And Click on change multiple defect option
  And change single affected version to multiple affected version for the same project
 Then Should be able to change multiple defects from single affected version to multiple affected version
 
@Defect_Tracking
Scenario: 17 Update a defect/sub task in “update defect” window
Given User is in the defect tracking page
 When User search the defect and select the defect
  And click on edit and update the defect summary
 Then Should be able to update the defect summary
 When User search the the defect and click on edit
  And enter the description field of a defect
 Then Should be able to update the defect description
 When search the defect and enter the priority
 Then Should be able to update the defect priority
 When search the defect and update the component
 Then Should be able to update the defect component
 When search the defect and update the version
 Then Should be able to update the defect version
 When search the defect and update the fixversion
 Then Should be able to update the defect fixversion
 When search the defect and update the label
 Then Should be able to update the defect label
 When search the defect and update the assignee
 Then Should be able to update the defect assignee
 When search the defect and update the environment
 Then Should be able to update the defect environment
 When search the defect and update the custom field text
 Then Should be able to update the defect custom field text
 When search the defect and update the custom field free text
 Then Should be able to update the defect custom field free text
 When search the defect and update the custom field text
 Then Should be able to update the defect custom field text
 When search the defect and update the custom field checkbox
 Then Should be able to update the defect custom field checkbox
 When search the defect and update the custom field radio button
 Then Should be able to update the defect custom field radio button
 When search the defect and update the custom field Date picker
 Then Should be able to update the defect custom field Date picker
 When search the defect and update the custom field URL
 Then Should be able to update the defect custom field URL
 When search the defect and update the custom field single select
 Then Should be able to update the defect custom field single select
 When search the defect and update the custom field multi select
 Then Should be able to update the defect custom field multi select
 When search the defect and update the custom field version picker
 Then Should be able to update the defect custom field version picker
 When search the defect and update the custom field multiple version picker
 Then Should be able to update the defect custom field multiple version picker
 When search the defect and update the custom field single user picker
 Then Should be able to update the defect custom field single user picker
 When search the defect and update the custom field multiple user picker
 Then Should be able to update the defect custom field multiple user picker
 When search the defect and update the custom field label
 Then Should be able to update the defect custom field label
 When search the defect and update custom field single select list cascading parent/child
 Then Should be able to update the defect custom field single select list cascading parent/child
 When search the defect and update custom field multiple select list cascading parent/child
 Then Should be able to update the defect custom field multiple select list cascading parent/child
 When search the defect subtask and enter the summary
 Then Should be able to update the defect subtask summary
 When search the defect subtask and enter the description
 Then Should be able to update the defect subtask description
 When search the defect subtask and enter the priority
 Then Should be able to update the defect subtask priority
 When search the defect subtask and update the component
 Then Should be able to update the defect subtask component
 When search the defect  subtask and update the version
 Then Should be able to update the defect subtask version
 When search the defect subtask and update the fixversion
 Then Should be able to update the defect subtask fixversion
 When search the defect subtask and update the label
 Then Should be able to update the defect subtask label
 When search the defect subtask and update the assignee
 Then Should be able to update the defect subtask assignee
 When search the defect subtask and update the environment
 Then Should be able to update the defect subtask environment
 When search the defect subtask and update the custom field text
 Then Should be able to update the defect subtask custom field text
 When search the defect subtask and update the custom field free text
 Then Should be able to update the defect subtask custom field free text
 When search the defect subtask and update the custom field text
 Then Should be able to update the defect subtask custom field text
 When search the defect subtask and update the custom field checkbox
 Then Should be able to update the defect subtask custom field checkbox
 When search the defect subtask and update the custom field radio button
 Then Should be able to update the defect subtask custom field radio button
 When search the defect subtask and update the custom field Date picker
 Then Should be able to update the defect subtask custom field Date picker
 When search the defect subtask and update the custom field URL
 Then Should be able to update the defect subtask custom field URL
 When search the defect subtask and update the custom field URL
 Then Should be able to update the defect subtask custom field URL
 When search the defect subtask and update the custom field single select
 Then Should be able to update the defect subtask custom field single select
 When search the defect subtask and update the custom field multi select
 Then Should be able to update the defect subtask custom field multi select
 When search the defect subtask and update the custom field version picker
 Then Should be able to update the defect subtask custom field version picker
 When search the defect subtask and update the custom field multiple version picker
 Then Should be able to update the defect subtask custom field multiple version picker
 When search the defect subtask and update the custom field single user picker
 Then Should be able to update the defect subtask custom field single user picker
 When search the defect subtask and update the custom field multiple user picker
 Then Should be able to update the defect subtask custom field multiple user picker
 When search the defect subtask and update the custom field label
 Then Should be able to update the defect subtask custom field label
 When search the defect subtask and update custom field single select list cascading parent/child
 Then Should be able to update the defect subtask custom field single select list cascading parent/child
 When search the defect subtask and update custom field multiple select list cascading parent/child
 Then Should be able to update the defect subtask custom field multiple select list cascading parent/child
 
@Defect_Tracking
Scenario: 18 Update a defect/sub task in “update defect” window
Given User is in Test Repository page
 When User create a phase with testcase
  And User launch TestPlanning to create a cycle and add phase to cycle
  And User launch TestExecution execute testcase  
  And User click on Create Defect button and enter the projectName and issueType
  And enter the summary and description and save the Defect
  And update all the available fields for the defect 
 Then should be able to update the defect
 When User search the defect in TestExecution page
  And Click on create Subtask button
  And enter the defect subtask issue type
  And enter the Summary and Description of Subtask and save the defect
  And Update all the available fields for defect subtask
 Then Should be able to Update the defect subtask  
 
 
@Defect_Tracking
Scenario: 6 As Mgr/lead/tester, Create a Defect/subtask in Defect Tracking_External System
Given User is in the defectTracking page
 When User click on create defect button and enter the projectName and issueType
  And enter the minimum required fields and save
 Then Should be able to Create defect 
 When search a defect and select the defect in defect tracking page
  And Click on Create Subtask button and enter the issueType
  And enter the minimum required fields and save the Subtask
 Then Should be able to create defect Subtask
 When Click on create defect button and enter the projectName and issueType
  And enter the mandatory fields and optional fields and save
 Then Should be able to create defect with mandatory and optional fields
 When Search a defect and select the defect in DefectTracking page
  And Click on Create Subtask button and enter the IssueType
  And enter the mandatory and optional fields
 Then Should be able to create subtask with minimum required and optional fields
 When launch TestRepository and create a phase with testcase
  And launch TestPlanning to create a cycle and add phase to cycle
  And launch TestExecution to execute testcases
  And click on D button and click on create defect button and enter the projectName and issueType
  And enter the minimum required fields to create a defect
 Then Should be able to create a defect with minimum required fields in TestExecution
 When search a defect and click on Subtask icon
  And enter the issuetype and minimum required fields
 Then Should be able to create defect Subtask with minimim required fields
 When Click on D button to create the defect
  And click on create defect and enter the mandatory and optional fields
 Then Should be create a defect with mandatory and optional fields
 When search a defect in test execution
  And click on Create Subtask icon and enter the issueType
  And enter the mandatory and optional fields to create a defect
 Then Should be able to create a defect subtask with mandatory and optional fields
 
 
 @Defect_Tracking
Scenario: 20 <DT/Test Execution> Remove the non-mandatory field values
Given User is in a DefectTracking page
 When User click on create defect and enter the projectName and issuetType
  And enter all the fields and save
 Then Should be able to create a defect
 When search a defect and click on edit
  And remove the non-mandatory Fields
 Then Should be able to remove the non-mandatory fields
 When User launch test repository to create a phase with testcases
  And Launch test planning to create a cycle and add phase to the cycle
  And launch test execution to execute testcase 
  And click on D button and click on create defect button and enter projectName and issueType
  And Enter all the Fields and save
  And Remove The non-mandatory fields
 Then should be able to remove the non-mandatory Fields
 
@Defect_Tracking
Scenario: 144 <DT> Search issues with "AND" operator in JQL
Given User is in the defect Tracking
 When User search a issue with AND operator
 Then Should be search issues with AND operator
 When User launch requirements
  And search a issue with AND operator
 Then Should be able to search issue with AND operator
 When User launch Test Execution to search Issue
  And Search a issue with AND Operator
 Then Should be able to search a issue with AND operator

@Defect_Tracking
Scenario: 145 <DT> Search issues with "OR" operator in JQL
Given User is in The defect Tracking page
 When User search a issue with OR operator
 Then Should be search issues with OR operator
 When User Launch requirements page and search a issue with OR operator
 Then Should be able to search issue with OR operator
 When User Launch Test Execution to Search a Issue
  And search a issue with OR operator
 Then Should be able to search a issue OR operator
 
    
@Defect_Tracking
Scenario: 146 <DT> Search issues with "IN" operator in JQL
Given User is in the page defectTracking
 When User search a issue with IN operator
 Then Should be able to search issues with IN operator
 When User Launch requirements and search a issues with IN operator
 Then Should be able to search issues with IN Operator
 When User Launch Test Execution to Search a issues
  And search a issues with IN operator 
 Then Should be able to search a issues with IN operator

@Defect_Tracking
Scenario: 147 <DT> Search issues with "NOT IN" operator in JQL
Given User is in the page DefectTracking
 When User search a issue with NOT IN operator
 Then Should be search issues with NOT IN operator
 When User Launch requirements and search a issue with NOT IN operator
 Then Should be able to search issue with NOT IN operator
 When User Launch TestExecution to Search a Issue
  And search a issue with NOT IN operator
 Then Should be able to search a issue with NOT IN operator

@Defect_Tracking
Scenario: 148 <DT> Search issues with "IS" operator in JQL
Given User is in the page defect Tracking
 When User search a issue with IS operator using JQL
 Then Should be search issues with IS operator using JQL
 When User launch the page requirements and search a issue with IS operator using JQL
 Then Should be able to search issue with IS operator using JQL
 When User Launch TestExecution to Search a issue
  And search a issue with IS operator using JQL
 Then Should be able to search a issue with IS operator JQL
 
@Defect_Tracking
Scenario: 150 <DT> Search issues with "IS NOT" operator in JQL
Given User is in the page of Defect Tracking
 When User search a issue with IS NOT operator using JQL
 Then Should be search issues with IS NOT operator using JQL
 When User launch requirements and search a issue with IS NOT operator using JQL
 Then Should be able to Search issue with IS NOT operator using JQL
 When User launch TestExecution to search a issue
  And search a issue with IS NOT operator using JQL
 Then Should be able to search a issue with IS NOT operator using JQL

@Defect_Tracking
Scenario: 151 <DT> Search issues with "=" operator in JQL
Given User is in The defect Tracking
 When User search a issue with equals operator using JQL
 Then Should be search issues with equals operator using JQL
 When User launch requirements and search a issues with equals operator using JQL
 Then Should be able to Search issues with equals operator using JQL
 When User launch TestExecution to search the issue
  And search a issues with equals operator using JQL
 Then Should be able to search a issue equals operator using JQL

@Defect_Tracking
Scenario: 152 <DT> Search issues with "!=" operator in JQL
Given User is in The Defect Tracking
 When User search a issue with not equals operator using JQL
 Then Should be able to search issues with equals operator using JQL
 When User launch requirements and search a issue with equals operator using JQL
 Then Should be able to Search issue not equals operator using JQL
 When User Launch Test Execution to search a issue
  And search a issue with equals operator using JQL
 Then Should be able to search a issue not equals operator using JQL
 
@Defect_Tracking
Scenario: 153 <DT> Search issues with "ORDER BY" operator in JQL
Given User is in The Page defect Tracking
 When User search a issues with ORDER BY operator using JQL
 Then Should be search issues with ORDER BY operator using JQL
 When User launch requirements and search a issues with ORDER BY operator
 Then Should be able to Search issue ORDER BY operator
 When User Launch TestExecution to search the issues
  And search a issues with ORDER BY operator using JQL
 Then Should be able to search a issue ORDER BY operator using JQL
 
@Defect_Tracking
Scenario: 154 <DT> Search issues with "ASC" operator in JQL
Given User is in the Defect Tracking page
 When User search a issue with ASC operator using JQL
 Then Should be search issues with ASC operator using JQL
 When User launch requirements and search issues with ASC operator using JQL
 Then Should be able to Search issue ASC operator using JQL
 When User Launch the TestExecution to search The issues
  And search a issues with ASC operator using JQL
 Then Should be able to search a issue ASC operator using JQL
 
@Defect_Tracking
Scenario: 155 <DT> Search issues with "DESC" operator in JQL
Given User is In the DefectTracking page
 When User search a issues with DESC operator using JQL
 Then Should be search issues with DESC operator using JQL
 When User launch requirements and search a issues with DESC operator using JQL
 Then Should be able to Search issues with DESC operator using JQL
 When User launch TestExecution to search The Issues
  And search the issues with DESC operator
 Then Should be able to search issues with DESC operator 

@Defect_Tracking
Scenario: 156 <DT> search defects by filter, If filter name contains upper case letters
Given User is in the DefectTracking Page
 Then Should be able to launch defect tracking
 When User click on advance link
 Then Should be able to go to advance search page
 When User select the filter option
 Then Should be able to select filter
  And User select the uppercase filter
 Then Should be able to select uppercase filter
 When User click on search button
 Then Should be able to search defects

@Defect_Tracking  
Scenario: 157 <DT> search defects by filter, If filter name contains number
Given User is in the Defect_Tracking Page
 Then Should be able to Launch defect tracking
 When User click on the advance link
 Then Should be able to go to Advance search page
 When User select the filter option as myfilter
 Then Should be able to select the filter
  And User select the number filter
 Then Should be able to select number filter
 When User click on a search button
 Then Should be able to Search defects

@Defect_Tracking
Scenario: 158 <DT> search defects by filter, If filter name contains special chars
Given User is in the page of Defect_Tracking
 Then Should be able to Launch DefectTracking
 When User Click on the advance link
 Then Should be able to go to the Advance search page
 When User Select the filter option as myfilter
 Then Should be able to select the myFilter
  And User select the filter name contains special character
 Then Should be able to select special character filter
 When User Click on a search button
 Then Should be able to search defects for special character filter

@Defect_Tracking
Scenario: 159 <DT> search defects by filter, If filter name contains alpha numeric chars
Given User is in the page of a Defect_Tracking
 Then Should be able to Launch Defect_Tracking
 When User Click on the Advance link
 Then Should be able to go to the Advance Search page
 When User Select the filter option as myFilters
 Then Should be able to select the MyFilters
  And User select the filter name contains alpha numeric character
 Then Should be able to select alpha numeric character filter
 When User Click on a Search button
 Then Should be able to search defects for alpha numeric character filter         
 
@Defect_Tracking
Scenario: 160 <DT> search defects by filter, If filter name contains international chars
Given User is in the page of an Defect_Tracking
 Then Should be able to Launch the Defect_Tracking
 When User Click on the Advance Link
 Then Should Be able to go to the Advance Search page
 When User Select The filter option as myFilters
 Then Should Be able to select the MyFilters
  And User select the filter name contains international character
 Then Should be able to select international character filter
 When User Click on the Search button
 Then Should be able to search defects for international character filter
 
@Defect_Tracking            
Scenario: 161 <DT> Search defect by new added filter
Given User is in the page of the Defect_Tracking
 Then Should be able to Launch the defect_Tracking
 When User click on the Advance Link
 Then Should be Able to go to the Advance Search page
 When User Select the Filter option as myFilters
 Then Should be able to select MyFilters
  And User select the added filter
 Then Should be able to select the added filter
 When User click On the Search button
 Then Should be able to search defects for added filter
 
@Defect_Tracking
Scenario: 162 <DT> Search defect by edited filter
Given User is in the External Jira page
 When User create the filter
  And User edit the filter name
 When User launch the Defect_Tracking
 Then Should be able to Launch the Defect_Tracking page
 When User click on the Advance Link button
 Then Should be Able to navigate to the Advance Search page
 When User Select the Filter option as MyFilters
 Then Should be able to Select MyFilters
 When User select the edited filter
 Then Should be able to select the edited filter
 When User click On the Search Button
 Then Should be able to search defects for the edited filter
 
@Defect_Tracking
Scenario: 163 HTML/DT Jira>Search defect by  wrong defect ID in Test Execution and Defect Tracking
Given User is in the test execution page
 When User navigate to the search page
  And search the defect by wrong defect id
 Then should get Issue does not exist
 When User launch the defect tracking page
  And search the wrong defect id
 Then Should get the message Issue does not exist
 
@Defect_Tracking
Scenario: 164 <DT> Attempt to export more than 500 defects from DT search grid
Given User logged in as manager
 When Manager is in Administration page
  And set the DTS to Jira
 Then Should be able to set DTS 
 When User is in the Defect Tracking Page
 Then should be able to launch defect tracking
 When User search the defects by selecting the project
 Then Should search more than five hunderd defects
 When select all the searched defects
 Then Should select more than five hunderd defects
 When click on export button
 Then Should get proper message
 
@Defect_Tracking
Scenario: 165 <DT> Attempt to create a sub_task for a sub_task
Given Manager is in the project page
 When launch administration to set DTS
  And set DTS to JIRA
 Then Should be able to set the DTS
 When User is in Defect_Tracking page
 Then Should be able to launch defect_tracking
 When User search the defect subtask in defect tracking
 Then Should search subtask
 When select the defect and click on create subtask
 Then create subtask button should be disabled if searched defect is of type subtask

@Defect_Tracking
Scenario: 166 <DT> Link 50 defect to test executions
Given Manager is in a Administration page
 When set to DTS to JIRA
 Then Should be able to Set DTS 
 When User is in Test_Repository page to create testcase
  And launch Test Planning to create cycle and add phase to the cycle
 When launch the Test Execution
 Then Should launch Test Execution 
 When execute the testcase
 Then Should execute testcase
 When click on D button
 Then Should launch link defect window
 When search more than fifty defects and link to execution
 Then Should be able to link fifty defects to execution

@Defect_Tracking 
Scenario: 169 <Search> Filter creators by partial text using single character
Given User is in the Project_page
 When User navigate to the Defect Tracking
  And search a creators by partial username using single character
 Then Dropdown menu should populate the matching users with partial username
 When User filter a creators by partial first name
 Then Dropdown menu should populate the matching users with partial first name 
 When filter a creators by partial middle name using single character
 Then Dropdown menu should populate the matching users with partial middle name
 When filter a creators by partial last name using single character
 Then Dropdown menu should populate the matching users with partial last name
 When filter a creator by partial email using single character
 Then Dropdown menu should populate the matching users with partial email
 
@Defect_Tracking
Scenario: 170 <Search>Filter creators by partial text using UPPERCASE if actual result is in lowercase
Given User is in the project page
 When User navigate to the DefectTracking
  And Filter creators by partial username using UPPERCASE
 Then Dropdown menu should populate the matching users with partial username by lowercase
 When User filter a creators by partial first name using UPPERCASE
 Then Dropdown menu should populate the matching users with partial first name by lowercase 
 When filter a creators by partial middle name using UPPERCASE
 Then Dropdown menu should populate the matching users with partial middle name by lowercase
 When filter a creators by partial last name using UPPERCASE
 Then Dropdown menu should populate the matching users with partial last name by lowercase
 When filter a creator by partial email using UPPERCASE
 Then Dropdown menu should populate the matching users with partial email by lowercase
 
@Defect_Tracking 
Scenario: 171 <Search>Filter creators by partial text using lowercase if actual result is in UPPERCASE
Given User is in a project page
 When User launch the DefectTracking
  And Filter creators by partial username using lowercase
 Then Dropdown menu should populate the matching users with partial username by UPPERCASE
 When User filter a creators by partial first name using lowercase
 Then Dropdown menu should populate the matching users with partial first name by UPPERCASE 
 When filter a creators by partial middle name using lowercase
 Then Dropdown menu should populate the matching users with partial middle name by UPPERCASE
 When filter a creators by partial last name using lowercase
 Then Dropdown menu should populate the matching users with partial last name by UPPERCASE
 When filter a creator by partial email using lowercase
 Then Dropdown menu should populate the matching users with partial email by UPPERCASE 

@Defect_Tracking
Scenario: 172 <Search> Filter creators by partial text using special characters
Given User is in a Project Page
 When User Launch the DefectTracking
  And Filter creators by partial username using special characters
 Then Dropdown menu should populate the matching users with partial username by special characters
 When User filter a creators by partial first name using special characters
 Then Dropdown menu should populate the matching users with partial first name by special characters 
 When filter a creators by partial middle name using special characters
 Then Dropdown menu should populate the matching users with partial middle name by special characters
 When filter a creators by partial last name using special characters
 Then Dropdown menu should populate the matching users with partial last name by special characters
 When filter a creator by partial email using special characters
 Then Dropdown menu should populate the matching users with partial email by special characters
 
 @Defect_Tracking
Scenario: 173 <Search> Filter creators by partial text using international characters
Given User is in a Project page
 When User Launch the Defect_Tracking
  And Filter creators by partial username using international characters
 Then Dropdown menu should populate the matching users with partial username by international characters
 When User filter a creators by partial first name using international characters
 Then Dropdown menu should populate the matching users with partial first name by international characters 
 When filter a creators by partial middle name using international characters
 Then Dropdown menu should populate the matching users with partial middle name by international characters
 When filter a creators by partial last name using international characters
 Then Dropdown menu should populate the matching users with partial last name by international characters
 When filter a creator by partial email using international characters
 Then Dropdown menu should populate the matching users with partial email by international characters 

@Defect_Tracking
Scenario: 174 <Search> Filter creators by partial text using alphanumeric characters and spaces
Given User is in a project_page
 When User Launch the Defect_Tracking page
  And Filter creators by partial username using alphanumeric characters and spaces
 Then Dropdown menu should populate the matching users with partial username by alphanumeric characters and spaces
 When User filter a creators by partial first name using alphanumeric characters and spaces
 Then Dropdown menu should populate the matching users with partial first name by alphanumeric characters and spaces 
 When filter a creators by partial middle name using alphanumeric characters and spaces
 Then Dropdown menu should populate the matching users with partial middle name by alphanumeric characters and spaces
 When filter a creators by partial last name using alphanumeric characters and spaces
 Then Dropdown menu should populate the matching users with partial last name by alphanumeric characters and spaces
 When filter a creator by partial email using alphanumeric characters and spaces
 Then Dropdown menu should populate the matching users with partial email by alphanumeric characters and spaces 
  
@Defect_Tracking
Scenario: 175 Filter assignees by full text as username
Given User is in the Project selection page
 When User launch the defectTracking page
  And filter assignee by full text as username
 Then dropdown menu should populate the matching users with assignees using username
 When User launch the Test Execution page to filter the assignee by full text as username
 Then dropdown menu should populate matching users with assignees using username
 When User search a defect assignee in defect details window
 Then dropdown menu should populate the matching users with assignee in defect detail window
 When User search a assignee in change multiple window
 Then dropdown menu should populate the matching users in change multiple window
 
 @Defect_Tracking
Scenario: 176 Filter assignees by full first name
Given User is in the Project Selection page
 When User launch the defect_Tracking Page
  And filter assignees by full first name
 Then dropdown menu should populate the matching users with assignees using first name  
 When User launch the Test Execution page to filter the assignee by full first name
 Then dropdown menu should populate matching users with assignees using first name
 When User search a defect assignee by full first name in defect details window
 Then dropdown menu should populate the matching users with assignee by full first name in defect detail window
 When User search a assignee by full first name in change multiple window
 Then dropdown menu should populate the matching users with assignee by full first name in change multiple window  

@Defect_Tracking
Scenario: 177 Filter assignees by full middle name
Given User is in the page of Project Selection
 When User Launch the defectTracking page
  And filter assignees by full middle name
 Then dropdown menu should populate the matching users with assignees using middle name  
 When User launch the Test Execution page to filter the assignee by full middle name
 Then dropdown menu should populate matching users with assignees using middle name
 When User search a defect assignee by full middle name in defect details window
 Then dropdown menu should populate the matching users with assignee by full middle name in defect detail window
 When User search a assignee by full middle name in change multiple window
 Then dropdown menu should populate the matching users with assignee by full middle name in change multiple window 
 
@Defect_Tracking
Scenario: 178 Filter assignees by full last name
Given User is in the page of a Project Selection
 When User Launch The defectTracking Page
  And filter assignees by full last name
 Then dropdown menu should populate the matching users with assignees using last name  
 When User launch the Test Execution page to filter the assignee by full last name
 Then dropdown menu should populate matching users with assignees using last name
 When User search a defect assignee by full last name in defect details window
 Then dropdown menu should populate the matching users with assignee by full last name in defect detail window
 When User search a assignee by full last name in change multiple window
 Then dropdown menu should populate the matching users with assignee by full last name in change multiple window 
 
@Defect_Tracking
Scenario: 179 Filter assignees by full email
Given User is in the page of an Project selection
 When User launch The defect_Tracking page
  And filter assignees by the full email
 Then dropdown menu should populate the matching users with assignees using full email  
 When User launch the Test Execution page to filter the assignee by full email
 Then dropdown menu should populate matching users with assignees using full email
 When User search a defect assignee by full email in defect details window
 Then dropdown menu should populate the matching users with assignee by full email in defect detail window
 When User search a assignee by full email in change multiple window
 Then dropdown menu should populate the matching users with assignee by full email in change multiple window      

@Defect_Tracking 
Scenario: 135 <DT> Create a defect/subtask with edited component value
Given User is in the project age
 When User navigate to the External Jira page
  And User navigate to the component page and edit the component value
 Then Should be able to edit the component value
 When Manager Launch the Defect Admin page
 Then Should be able to Launch Defect Admin
 When clear the cache of online project  
 Then Should be able to clear the cache
 When launch DefectTracking Page
 Then Should be able to Launch DT page
 When create a defect with edited component value
 Then Should be able to create defect with edited component value

@Defect_Tracking
Scenario: 133 <DT> Create a defect/subtask with in edited Issue type
Given User is in the Project page to select project
 When User navigate to the External jira page
  And navigate to the issues and edit the issueType
 Then Should be able to edit the existing issueType
 When As a Manager,launch defect admin page
 Then Should be able to launch defect admin page
 When clear the cache of an Online Project
 Then Should be able to Clear the Cache
 When Launch the defect tracking page
 Then Should be able to Launch Defect tracking pagess
 When create a defect with edited issueType
 Then Should be able to create a defect with edited issueType
 
 @Defect_Tracking
Scenario: 134 <DT> Create a defect/subtask with edited priority
Given User is in the project_page
 When User navigate to an External Jira page
  And User navigate to the priority page
 Then Should be able to edit the priority value
 When Manager launch the Defect Admin page
 Then Should be able to launch Defect Admin
 When clear the cache of a online project  
 Then Should clear the cache
 When launch DefectTracking page
 Then Should be able to launch DT page
 When create a defect with edited priority value
 Then Should be able to create defect with edited priority value 

@Defect_Tracking
Scenario: 136<DT> Create a defect/subtask with edited affected version value
Given User is in the project page selection
 When User navigate to an External_Jira page
  And User navigate to the affected version
 Then Should be able to edit the affected version value
 When Manager launch the Defect Admin Page
 Then Should be able to launch Defect Admin page
 When Clear the cache of a online project  
 Then Should Clear the cache
 When Launch DefectTracking page
 Then Should be able to launch DefectTracking page
 When create a defect with edited affected version value
 Then Should be able to create defect with edited affected version value

@Defect_Tracking
Scenario: 137<DT> Create a defect/subtask with edited fix version value
Given User is in the Project page selection
 When User Navigate to an External_Jira page
  And User navigate to the fix version
 Then Should be able to edit the fix version value
 When Manager Launch the Defect Admin Page
 Then Should be able to launch Defect Admin Page
 When Clear the Cache of a online project  
 Then Should Clear the Cache
 When Launch the DefectTracking page
 Then Should Be able to launch DefectTracking page
 When create a defect with edited fix version value
 Then Should be able to create defect with edited fix version value
 
@Defect_Tracking
Scenario: 138 <DT> Create the defect/subtask with edited custom field checkbox value
Given User is in the Project page Selection
 When User Navigate To an External_jira page
  And User navigate to the custom fields page to edit custom field checkbox value
 Then Should be able to edit the custom field checkbox value
 When As a Manager Launch the Defect Admin Page
 Then Should Be able to launch Defect Admin Page
 When Clear the Cache of a Online project  
 Then Should Clear The Cache
 When Lead Launch the DefectTracking page
 Then Should Be able to Launch DefectTracking page
 When create a defect with edited custom field checkbox value
 Then Should be able to create defect with edited custom field checkbox value 

@Defect_Tracking
Scenario: 139 <DT> Create the defect/subtask with edited custom field single select list value
Given User is in the Project_page Selection
 When User Navigate To an external_Jira page
  And User navigate to the Custom fields page to edit custom field single select list value
 Then Should be able to edit the custom field single select list value
 When As a Manager Launch the Defect Admin page
 Then Should Be able to launch Defect Admin page
 When clear the Cache of a Online project  
 Then Should clear The Cache
 When As a Lead Launch the DefectTracking page
 Then Should Be able To Launch DefectTracking page
 When create a defect with edited custom field single select list value
 Then Should be able to create defect with edited custom field single select list value 
 
@Defect_Tracking
Scenario: 140 <DT> Create the defect/subtask with edited custom field multi select list value
Given User is in Project page Selection
 When User Navigate To the external_Jira page
  And User navigate to the Custom Fields page to edit custom field multi select list value
 Then Should be able to edit the custom field multi select list value
 When As a Manager Launch the defect Admin page
 Then Should Be able to launch defect Admin Page
 When Clear the Cache of an Online project  
 Then should clear The Cache
 When As a Lead,Launch the DefectTracking page
 Then Should be Able to Launch DefectTracking page
 When create a defect with edited custom field multi select list value
 Then Should be able to create defect with edited custom field multi select list value  

@Defect_Tracking
Scenario: 141 <DT> Create the defect/subtask with edited custom field radio button value
Given User is in project page Selection
 When User navigate To the external_Jira page
  And User navigate to the Custom Fields page to edit the custom field radio button value 
 Then Should be able to edit the custom field radio button value
 When As a Manager,Launch the defect admin page
 Then Should Be able to launch defect admin Page
 When clear the Cache of an Online project  
 Then should clear the CaChe
 When As a Lead,Launch the defectTracking page
 Then Should Be Able to Launch DefectTracking page
 When create a defect with edited custom field radio button value
 Then Should be able to create defect with edited custom field radio button value   
 
@Defect_Tracking
Scenario: 142 <DT> Create the defect/subtask with edited custom field single version picker
Given User is in project_page Selection
 When User navigate to the external_Jira page
  And User navigate to the version fields Page
 Then Should be able to edit the custom field single version picker 
 When As a Manager,launch the defect admin page
 Then Should Be able to Launch defect admin Page
 When clear the Cache of an Online Project  
 Then should be able to Clear the Cache
 When As a Lead,Launch the defectTracking Page
 Then Should Be Able to Launch DefectTracking Page
 When create a defect with edited custom field single version picker value
 Then Should be able to create defect with edited custom field single version picker value 

@Defect_Tracking
Scenario: 250 <Test Execution/DT> Create a defect/Subtask with custom field of type URL
Given User is in the External JIra page 
 When User create a custom field of type URL
  And User navigate to the defectTracking page
  And create a defect defect with only numbers in custom field of type URL
 Then Should be able to create a defect with only numbers in custom field of type URL
 When create a defect with UPPERCASE in custom field of type URL
 Then Should be able to create a defect with UPPERCASE in custom field of type URL
 When create a defect with lowercase in custom field of type URL
 Then Should be able to create a defect with lowercase in custom field of type URL 
 When create a defect with alphanumeric characters in custom field of type URL
 Then Should be able to create a defect with alphanumeric characters in custom field of type URL  
 When create a defect with special characters in custom field of type URL
 Then Should be able to create a defect with special characters in custom field of type URL
 When create a defect with international characters in custom field of type URL
 Then Should be able to create a defect with international characters in custom field of type URL 
 When create a defect with very long atleast five hundred and twelve characters in custom field of type URL
 Then Should be able to create a defect with very long atleast five hundred and twelve characters in custom field
 When create a defect with supported protocol in custom field of type URL
 Then Should be able to create a defect with supported protocol in custom field of type URL  of type URL
 When User navigate to the Test Execution to execute testcase
  And create a defect defect with only numbers in custom field of type URL in TestExecution
 Then Should be able to create a defect with only numbers in custom field of type URL in TestExecution
 When create a defect with UPPERCASE in custom field of type URL in TestExecution
 Then Should be able to create a defect with UPPERCASE in custom field of type URL in TestExecution
 When create a defect with lowercase in custom field of type URL in TestExecution
 Then Should be able to create a defect with lowercase in custom field of type URL in TestExecution 
 When create a defect with alphanumeric characters in custom field of type URL in TestExecution
 Then Should be able to create a defect with alphanumeric characters in custom field of type URL in TestExecution  
 When create a defect with special characters in custom field of type URL in TestExecution
 Then Should be able to create a defect with special characters in custom field of type URL in TestExecution
 When create a defect with international characters in custom field of type URL in TestExecution
 Then Should be able to create a defect with international characters in custom field of type URL in TestExecution 
 When create a defect with very long atleast five hundred and twelve characters in custom field of type URL in TestExecution
 Then Should be able to create a defect with very long atleast five hundred and twelve characters in custom field in TestExecution
 When create a defect with supported protocol in custom field of type URL in TestExecution
 Then Should be able to create a defect with supported protocol in custom field of type URL  of type URL in TestExecution  

@Defect_Tracking  
Scenario: 251 <Test Execution/DT> Edit a defect/Subtask change the value for custom field of type URL
Given User is in the ExternalJira page
 When User create the custom field of type URL
  And User launch defectTracking
  And create a defect with only number in URL field
 Then Should be able to create a defect with number in URL field
 When User search a defect in defect tracking and click on edit button
  And update the custom field URL value
 Then Should be able to edit a defect and change the value for custom field of type URL
 When launch test execution page
  And create a defect with minimum required fields and save
 Then Should update the custom field URL for the defect

@Defect_Tracking  
Scenario: 252 <DT/ Test Execution> Edit a defect/Subtask remove the value for custom field of type URL if set as non-mandatory  
Given User is In the ExternalJira page
 When User create the customField of type URL
  And User launch DefectTracking page
  And create a defect with required fields and custom url field
 Then Should be able to create a defect with URL field
 When User search a Defect in defect tracking and click on edit button
  And remove the custom field URL value
 Then Should be able to remove the value of custom field of type URL
 When Launch test execution page
  And create a efect with minimum required fields and save
 Then Should remove the custom field URL for the defect
 
@Defect_Tracking
Scenario: 253 <Test Execution/DT> Create a defect/Subtask with custom field of type checkbox (single)
Given User is In the ExternalJira Page
 When User Create the customField of type checkbox
  And create the list of values number,uppercase,lowercase,specialchar,international char and very long characters to the checkbox
  And User Launch DefectTracking page
  And create a defect with custom field of type checkbox option contains number
 Then Should be able to create a defect with custom field of type checkbox option contains number
 When create a defect with custom field of type checkbox option contains Uppercase
 Then Should be able to create a defect with custom field of type checkbox option contains Uppercase
 When create a defect with custom field of type checkbox option contains lowercase
 Then Should be able to create a defect with custom field of type checkbox option contains lowercase
 When create a defect with custom field of type checkbox option contains alphanumeric character
 Then Should be able to create a defect with custom field of type checkbox option contains alphanumeric character
 When create a defect with custom field of type checkbox option contains special character
 Then Should be able to create a defect with custom field of type checkbox option contains special character
 When create a defect with custom field of type checkbox option contains international character
 Then Should be able to create a defect with custom field of type checkbox option contains international character
 When create a defect with custom field of type checkbox option contains very long character
 Then Should be able to create a defect with custom field of type checkbox option contains very long character
 When Launch Test Execution page to create defect
  And create a defect with custom field of type checkbox option contains number in TestExecution
 Then Should be able to create a defect with custom field of type checkbox option contains number in TestExecution
 When create a defect with custom field of type checkbox option contains Uppercase in TestExecution
 Then Should be able to create a defect with custom field of type checkbox option contains Uppercase in TestExecution
 When create a defect with custom field of type checkbox option contains lowercase in TestExecution
 Then Should be able to create a defect with custom field of type checkbox option contains lowercase in TestExecution
 When create a defect with custom field of type checkbox option contains alphanumeric character in TestExecution
 Then Should be able to create a defect with custom field of type checkbox option contains alphanumeric character in TestExecution
 When create a defect with custom field of type checkbox option contains special character in TestExecution
 Then Should be able to create a defect with custom field of type checkbox option contains special character in TestExecution
 When create a defect with custom field of type checkbox option contains international character in TestExecution
 Then Should be able to create a defect with custom field of type checkbox option contains international character in TestExecution
 When create a defect with custom field of type checkbox option contains very long character in TestExecution
 Then Should be able to create a defect with custom field of type checkbox option contains very long character in TestExecution

@Defect_Tracking 
Scenario: 254 <Test Execution/DT> Create a defect/Subtask with custom field of type checkboxes(multiple)
Given User is the page External Jira
 When User Create the customField of type Checkbox
  And create the List of values number,uppercase,lowercase,specialchar,international char and very long characters to the checkbox
  And User Launch DefectTracking Page
  And Create a defect with custom field of type checkbox option contains number
 Then Should be able to create a defect with custom field of type Checkbox option contains number
 When Create a defect with custom field of type checkbox option contains Uppercase
 Then Should be able to create a defect with custom field of type Checkbox option contains Uppercase
 When Create a defect with custom field of type checkbox option contains lowercase
 Then Should be able to create a defect with custom field of type Checkbox option contains lowercase
 When Create a defect with custom field of type checkbox option contains alphanumeric character
 Then Should be able to create a defect with custom field of type Checkbox option contains alphanumeric character
 When Create a defect with custom field of type checkbox option contains special character
 Then Should be able to create a defect with custom field of type Checkbox option contains special character
 When Create a defect with custom field of type checkbox option contains international character
 Then Should be able to create a defect with custom field of type Checkbox option contains international character
 When Create a defect with custom field of type checkbox option contains very long character
 Then Should be able to create a defect with custom field of type Checkbox option contains very long character
 When Launch Test Execution page to create Defect
  And Create a defect with custom field of type checkbox option contains number in TestExecution
 Then Should be able to create a defect with custom field of type Checkbox option contains number in TestExecution
 When Create a defect with custom field of type checkbox option contains Uppercase in TestExecution
 Then Should be able to create a defect with custom field of type Checkbox option contains Uppercase in TestExecution
 When Create a defect with custom field of type checkbox option contains lowercase in TestExecution
 Then Should be able to create a defect with custom field of type Checkbox option contains lowercase in TestExecution
 When Create a defect with custom field of type checkbox option contains alphanumeric character in TestExecution
 Then Should be able to create a defect with custom field of type Checkbox option contains alphanumeric character in TestExecution
 When Create a defect with custom field of type checkbox option contains special character in TestExecution
 Then Should be able to create a defect with custom field of type Checkbox option contains special character in TestExecution
 When Create a defect with custom field of type checkbox option contains international character in TestExecution
 Then Should be able to create a defect with custom field of type Checkbox option contains international character in TestExecution
 When Create a defect with custom field of type checkbox option contains very long character in TestExecution
 Then Should be able to create a defect with custom field of type Checkbox option contains very long character in TestExecution
 
@Defect_Tracking
Scenario: 255 <Test Execution/DT> Edit a defect/Subtask check one/multiple checkboxes for custom field of type Checkboxes
Given User is in the External_Jira page
 When User navigate to the custom fields page
  And User create a custom field of type Checkbox
  And Add a list of values number,Uppercase,lowercase,alphanumeric,special char,international char and very long character 
  And launch Defect Tracking page
  And create a defect with custom field of type Checkbox
 Then Should be able to create defect with checkbox
 When Search the created defect id and click on edit button
  And enter the multiple checkbox options
 Then Should be able to create defect with edited checkbox values 
 When User launch TestExecution to execute testcase and click on D button
  And Create a defect with required fields and save
 Then Should be able to update checkbox values in a edit defect window

@Defect_Tracking  
Scenario: 256 <Test Execution/DT> Edit a defect/Subtask disable checkbox/checkboxes (ALL) for custom field of type Checkboxes, if set as non-mandatory
Given User is In the External_Jira page
 When User navigate to the Custom fields page
  And User Create a custom field of type Checkbox
  And Add a list of values number,Uppercase,lowercase,alphanumeric char,special char,international char and very long character 
  And Launch Defect Tracking Page
  And Create a defect with custom field of type Checkbox
 Then Should be able to create defect with checkbox value
 When Search the created defect Id and click on edit button
  And unselect selected checkbox value
 Then Should be able to Unselect checkbox value in edit defect window
 When User Launch TestExecution to execute testcase and click on D button
  And create a defect with custom checkbox value and save
 Then Should be able to unselect checkbox value in a edit defect window 
 
@Defect_Tracking 
Scenario: 257 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox/Multiple select/Label in Jira, add new checkbox and Attempt to view the change reflected in Zephyr before cache timeout 
Given User is in External Jira page
 When User navigate to the Custom Fields page
  And edit the custom field of type text
  And create a custom field of type checkbox
  And Launch Defect Tracking page
  And create a defect with minimum required fields
  And search the created defect id and edit the defect
 Then Should not be able to view the changes reflected in zephyr
 When User launch Test Execution and execute the testcase
  And click on D button and create a defect
 Then Should not able to view the changes reflected in zephyr 

@Defect_Tracking
Scenario: 143 <DT> Create the defect/subtask with edited custom field multi version picker
Given User is in Project_page Selection
 When User navigate to the External_Jira page
  And User Navigate to the Version Fields Page
 Then Should be able to edit the custom field multi version picker value
 When As a manager,launch the defect admin page
 Then Should be able to Launch defect admin Page
 When clear the cache of an Online project  
 Then should be able to clear the Cache
 When As a Lead,Launch the Defect_Tracking page
 Then Should Be able to launch defectTracking page
 When create a defect with edited custom field multi version picker value
 Then Should be able to create defect with edited custom field multi version picker value 

@Defect_Tracking
Scenario: 132 <DT> Create a defect/subtask in edited project
Given User is in the Project page
 When User navigate to the external jira page
  And navigate to the project page and edit the project Name
 Then Should be able to edit the existing projectName
 When As a Manager,Launch defect admin page
 Then Should be able to launch defect admin
 When clear the cache of an online project
 Then Should be able to clear the Cache
 When launch the defect tracking page
 Then Should be able to Launch Defect tracking page
 When create a defect with edited projectName
 Then Should be able to create a defect with edited projectName 

@Defect_Tracking
Scenario: 258 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox/Multiple select/Label in Jira, add new checkbox and Attempt to view the change reflected in Zephyr after cache timeout 
Given User is in a External Jira page
 When User navigate to the CustomFields page
  And edit the Custom field of type text
  And add a custom field of type checkbox
  And Launch the Defect Tracking page
  And Create a defect with minimum required fields
  And As a Manager,clear the cache
  And As a Lead,search the created defect id and edit the defect
 Then Should be able to view the changes reflected in zephyr
 When User Launch Test Execution and execute the testcase
  And Click on D button and create a defect
 Then Should able to view the changes reflected in Zephyr 

@Defect_Tracking
Scenario: 259 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox/Multiple select/Label in Jira, add new checkbox and view the change reflected in Zephyr after manually clearing cache 
Given User is in a ExternalJira page
 When User navigate to the customFields page
  And edit the customField of type text
  And Add a custom field of type checkbox
  And Launch the Defect Tracking Page
  And Create a Defect with minimum required fields
  And As a Manager,Clear the cache
  And As a Lead,Search the created defect id and edit the defect
 Then Should be able to View the changes reflected in zephyr
 When User Launch Test Execution and Execute the testcase
  And Click on the D button and create a defect
 Then Should able to View the changes reflected in Zephyr  

@Defect_Tracking
Scenario: 260 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox/Multiple select/Label in Jira,add new checkbox and view the change reflected in Zephyr after manually clearing cache 
Given User is in a ExternalJira Page
 When User Navigate to the customFields page
  And Edit the Custom field of type text
  And Launch the DefectTracking Page
  And Create a defect with Minimum required fields
  And Search the created defect id and edit the defect
 Then Should not be able to View the changes reflected in Zephyr
 When User Launch TestExecution and execute the testcase
  And Click On D button and create a defect
 Then Should not able to view the Changes reflected in Zephyr

@Defect_Tracking
Scenario: 261 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox/Multiple select/Label in Jira,add new checkbox and view the change reflected in Zephyr after automatically clearing cache 
Given User is in the ExternalJira Page
 When User Navigate to a customFields page
  And Edit the Custom Field of type text
  And As a manager,clear the cache and logout
  And As a Lead,Launch the DefectTracking Page
  And Create a Defect with minimum required Fields
  And Search the Created defect id and edit the defect
 Then Should be able to View the changes reflected in Zephyr
 When User Launch TestExecution and Execute the testcase
  And Click On D button and Create a defect
 Then Should able to view the Changes reflected in Zephyr 

@Defect_Tracking
Scenario: 262 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox/Multiple select/Label in Jira,edit custom fields and Attempt to view the change reflected in Zephyr before cache timeout
Given User is In a ExternalJira Page
 When User navigate to the customFields Page
  And Edit the CustomField of type text
  And Launch the Defect_Tracking page
  And create a Defect with minimum required fields
  And As a Manager,clear the Cache
  And As a Lead,search the Created defect id and edit the defect
 Then Should be able to view the Changes reflected in zephyr
 When User Launch the TestExecution and Execute the testcase
  And Click on D button and Create a defect
 Then should able to view the changes reflected in Zephyr
 
@Defect_Tracking  
Scenario: 263 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox /Multiple select /Label in Jira, Delete custom fields and Attempt to view the change reflected in Zephyr before cache timeout
Given User is In a External Jira Page
 When User Navigate to the customFields Page
  And delete the Custom Field of type Checkbox
  And Launch the defectTracking page
  And Create a Defect with minimum Required fields
  And As a Lead,search the Created defect Id and edit the defect
 Then Should not be able to view the Changes Reflected in zephyr
 When User Launch the TestExecution and Execute the Testcase
  And Click on D button and Create a Defect
 Then should not be able to view the changes Reflected in zephyr
 
@Defect_Tracking
Scenario: 264 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox /Multiple select /Label in Jira, Delete custom fields and Attempt to view the change reflected in Zephyr before cache timeout
Given User Is In a External Jira Page
 When User Navigate to the CustomFields Page
  And delete the CustomField of type Checkbox
  And Launch the defect_Tracking page
  And Create a defect with minimum Required fields
  And As an Manager,Clear the Cache
  And As a Lead,search the Created defect ID and edit the defect
 Then Should able to view the Changes Reflected in Zephyr
 When User Launch the TestExecution and Execute the TestCase
  And Click on D Button and Create a Defect
 Then should be able to view the changes Reflected in Zephyr

@Defect_Tracking
Scenario: 265 <Test Execution/DT> Edit field setup for custom field of type Text/Free-text/Select-list/URL/Checkbox/Multiple checkbox/Multiple select/Label in Jira, Delete custom fields and Attempt to view the change reflected in Zephyr before cache timeout
Given User is in the page External Jira
 When User navigate to the custom field page
  And delete the custom field of type checkbox
  And launch defect tracking page
  And create a defect With minimum required fields  
  And as a manager,clear the cache
  And as a lead,search the created defect ID and edit the defect
 Then Should be able to view the changes reflected in Zephyr
 When User launch the test execution and execute the testcase
  And click on D button and create the defect
 Then should be able to view the changes reflected in zephyr
   

#@Defect_Tracking
#Scenario: 127 HTML/DT Jira/Search>Verify the selection of drop-down attributes(Issue type/Status/Version/Priority)
#Given User is in the projectPage
 #When User select the release to launch defect tracking
  #And User navigate to the defect tracking page
 #Then Should be able to launch DT app
 #When check the dropdown attributes of Issuetype/priority/status/version without selecting the project
 #Then Should show all these dropdown should be empty if project is not selected
#
#@Defect_Tracking
#Scenario: 128 HTML/DT Jira/Search>Verify the selection of drop-down attributes(Issue type/Version/Priority)
#Given User is in the Projectpage
 #When User select the release in the project page
  #And User navigate to the DT page
 #Then Should be able to launch DT Page
 #When check the dropdown attributes of Issue type/Version/Priority after selecting the project
 #Then all these dropdowns should show values after project and issuetype selection
#
#@Defect_Tracking
#Scenario: 129 HTML/DT Jira/Search>Verify the selection of drop-down attributes(status)
#Given User is in the project selection page
 #When User select the release in a project page
  #And User navigate to the DefectTracking page
 #Then Should be able to launch DefectTracking
 #When check the dropdown attributes of status after selecting the project and issuetype
 #Then status dropdown should show values after project and issue type selection

@Defect_Tracking 
Scenario: 130 <DT> Search defects by JQL and update multiple defects 
 Given User is in a Defect_Tracking page
  When User search the defects by JQL
   And select the multiple defects and click on change multiple
  Then Should be able to change values of Component
  When select change multiple to change Version value
  Then Should be able to change values of Version
  When select change multiple to change Status
  Then Should be able to change values of Status
  When select change multiple to change the FixVersion
  Then Should be able to change values of the FixVersion
  When select change multiple to change the Priority
  Then Should be able to change values of the Priority
  When select change multiple to change Assignee value
  Then Should be able to change values of the Assignee
   
 @Defect_Tracking
Scenario: 83 <DT> Click on testcase ID in defect tracking search grid
Given User is in Project page
 When User is In TestRepository page
 Then Should be able to launch testrepository
 When User create a phase with testcases
 Then Should be able to create testcases in a phase node
 When User create a node with testcases for phase
 Then Should be able to create testcases in a node
 When User create a subnode with testcases for node
 Then Should be able to create testcases in a subnode
 When User launch testPlanning
 Then Should be able to launch testplanning
 When create a cycle and add phase to cycle and assign testcases
 Then Should be able to assign testcases in phase node
 When navigate to the system node and assign testcases
 Then Should be able to assign testcases in system node
 When navigate to the subsystem node and assign testcases
 Then Should be able to assign testcases in subsystem node
 When launch Test execution page
 Then Should be able to launch test execution page
 When navigate to the phase and execute testcase
  And click on D button and link a defect to execution
 Then Should be able to link defect to the executed testcase in phase node
 When navigate to the system and execute testcase
 Then Should be able to link defect to the executed testcase in system node
 When navigate to the subsystem and execute testcase
 Then Should be able to link defect to the executed testcase in subsystem node
 When launch Defect tracking page
  And search a defect which is linked at phase
 Then Should be able to view cycle and testcase in search grid in DT app for phase level
 When search a defect which is linked at system node
 Then Should be able to view cycle and testcase in search grid in DT app for system level
 When search a defect which is linked at subsystem node
 Then Should be able to view cycle and testcase in search grid in DT app for subsystem level
 
@Defect_Tracking  
Scenario: 84 <DT> Create defect/sub_task and check the JIRA activity stream
Given user is in the project page 
 When user is in the DefectTracking page
  And user create a defect with minimum required fields
 Then Should be able to create the defect
 When user navigate to the external jira page
 Then Should be able to view activity stream
 When create a subtask in defect tracking page
  And navigate to the external jira page
 Then Should be able to view the activity stream 
 
 @Defect_Tracking
Scenario: 85 <Test execution> Link defect to execution and check JIRA activity stream
Given User in TestExecution page
 When User click on D button to create a defect
  And Create a defect With minimum required fields
 Then Should be able to create a defect in test execution
 When User navigate to the ExternalJira page
 Then Should be able to view activity stream in JIRA
 When User navigate to the execution page to create a subtask in test execution
  And search the created defect and create a subtask
  And navigate to the external_jira page
 Then Should be able to view a activity stream  in JIRA
 
@Defect_Tracking
Scenario: 131 <DT> Search defects by filter and update multiple defects 
 Given User is in a Defect_Tracking Page
  When User search the defects by filter
   And select the multiple defects and click on change multiple button
  Then Should be able to Change values of Component
  When select change multiple to Change Version value
  Then Should be able to Change values of Version
  When select Change multiple to change Status
  Then Should be able to Change values of Status
  When select Change multiple to change the FixVersion
  Then Should be able to Change values of the FixVersion
  When select Change multiple to change the Priority
  Then Should be able to Change values of the Priority
  When select Change multiple to change Assignee value
  Then Should be able to Change values of the Assignee 

@Defect_Tracking
Scenario: 123 <project setup> Map ZE project JIRA project
Given Manager is in the Project Page
 When manager create a different types of project by different specification
  And map the projectName containing uppercase to Jira project
 Then Should get activity stream for map projectName containing uppercase to Jira project
 When map the projectName containing specialChars to Jira project
 Then Should get activity stream for map projectName containing specialChars to Jira project
 When map the projectName containing numbers to Jira project  
 Then Should get activity stream for map projectName containing numbers to Jira project
 When map the projectName containing alpha numberic to Jira project  
 Then Should get activity stream for map projectName containing alpha numberic to Jira project
 When map the projectName containing international chars to Jira project  
 Then Should get activity stream for map projectName containing international chars to Jira project

@Defect_Tracking
Scenario: 124<project setup> Map ZE Release JIRA project
Given Manager is in a project page
 When create a different types of releases for the projects
  And map the releaseName containing uppercase to Jira project
 Then Should get activity stream for map releaseName containing uppercase to Jira project
 When map the releaseName containing lowercase to Jira project
 Then Should get activity stream for map releaseName containing lowercase to Jira project
 When map the releaseName containing numbers to Jira project  
 Then Should get activity stream for map releaseName containing numbers to Jira project
 When map the releaseName containing alpha numberic to Jira project  
 Then Should get activity stream for map releaseName containing alpha numberic to Jira project
 When map the releaseName containing international chars to Jira project  
 Then Should get activity stream for map releaseName containing international chars to Jira project  

@Defect_Tracking
Scenario: 193 Delete the defect/subtask linked to a testcase in Test Execution and link it again
Given User is in Project Page 
 When User launch the Test Execution page 
 Then Should launch Test Execution page
 When User execute the testcase
  And User click on D button to launch link defect window
 Then Should be able to launch the Link Defect window 
 When search a defect by ID
 Then Should be able to search defect
 When link the searched defect to the testcase
 Then Should be able to link defect to Execution
 When select the linked defect in currently linked defect window and delete it
 Then Should be able to delete the defect on execution
 When User search the same defect ID to link to the testcase
 Then Should be able to link defect to the execution
 
#@Defect_Tracking
#Scenario: 126 <Daily pulse gadget> View defect count daily pulse gadget, If ZE project mapped to JIRA project
#Given User is in the uppercase project page
 #When User execute testcase in test execution
  #And User create a dashBoard and add daily pulse gadget for uppercase project
 #Then Should show defect count properly for uppercase project
 #When User select the special character project and execute testcase in test execution
  #And User create a dashBoard and add daily pulse gadget for special character project
 #Then Should show defect count properly for special character project
 #When User select the number character project and execute testcase in test execution
  #And User create a dashBoard and add daily pulse gadget for number character project
 #Then Should show defect count properly for number character project
 #When User select the alpha numberic character project and execute testcase in test execution
  #And User create a dashBoard and add daily pulse gadget for alpha numberic character project
 #Then Should show defect count properly for alpha numberic character project
 #When User select the international character project and execute testcase in test execution
  #And User create a dashBoard and add daily pulse gadget for international character project
 #Then Should show defect count properly for international character project

 @Defect_Tracking
Scenario: 192 Send activity to JIRA when a new release is created in a Zephyr Project which is mapped to JIRA project
Given manager is in the project page
 When User creates a new release with special character
  And map special character release created in sample project to JIRA project
  And User launch external jira page to view activity stream
 Then Should be able to view JIRA activity stream for special character release
 When select the sample project to create a new release with alphanumeric characters
  And map alphanumeric character release created in sample project to JIRA project
 Then Should be able to view JIRA Activity stream for the alphanumeric character release
 When select the sample project to create a new release with only number characters
  And map number character release created in sample project to JIRA project
 Then Should be able to view JIRA Activity stream for the number character release
 When select the sample project to create a new release with capital characters
  And map capital character release created in sample project to JIRA project
 Then Should be able to view JIRA Activity stream for the capital character release
 When select the sample project to create a new release with international characters
  And map international character release created in sample project to JIRA project
 Then Should be able to view JIRA Activity stream for the international character release
 When select the sample project to create a new release with minimum characters
  And map minimum character release created in sample project to JIRA project
 Then Should be able to view JIRA Activity stream for the minimum character release
 When select the sample project to create a new release with maximum characters
  And map maximum character release created in sample project to JIRA project
 Then Should be able to view JIRA Activity stream for the maximum character release
 When select the sample project to create a new release with duplicate name
  And map duplicate name release created in sample project to JIRA project
 Then Should be able to view JIRA Activity stream for the duplicate name release 

@Defect_Tracking
Scenario: 70 <DT>ReLogin to Zephyr when Password/Username is Edited in Jira
Given As a manager,launch project page
 When user in the administration page
  And set the DTS to JIRA
 Then Should be able to Set the DTS
 When User is in the Defect tracking page
 Then Should be able to launch defect tracking page
 When login as defect user and reset DTS
 Then Should be able to login successfully 
 When User is in a external jira page
 When User navigate to the user management page
  And edit the change the user name
 Then Should be able to change the user name
 When relogin to Zephyr page
 Then Should be able to re-login successfully
 When launch defect Tracking page
 Then should get message "Authentication failed for defect user admin. Please refresh the page and try again.If your defect user credentials changed,use Reset User button to enter the new credentials.
 When launch test execution page to execute testcase
  And click on D button of a testcase
 Then Should get message "authentication failed for defect user admin.Please refresh the page and try again. If your defect user credentials changed,use Reset User button to enter the new credentials.

@Defect_Tracking
Scenario: 73 Attempt to create defect, If user doesn't have create defect permission
Given As a manager,Launch administration
 When launch defect tracking system
  And Set the DTS to JIRA
 Then Should be able to set DTS to JIRA
 When As a Lead,Launch defect tracking page
 Then Should be able to launch Defect Tracking page
 When set the defect user who doesn't have create defect permission
  And attempt to create defect in defect tracking app
 Then Should get proper message 'user doesn't have permission to create defect'
 When create a subtask in defect tracking app
 Then should get the proper Message 'user doesn't have permission to create defect'
 When launch the Test Execution page
  And attempt to create defect in test execution app
 Then should get the proper message 'user doesn't have permission to create defect'
 When create a subtask in test execution app
 Then should get proper Message 'user doesn't have permission to create defect'

@Defect_Tracking
Scenario: 75 Create defect, If user doesn't have have browse project permission
Given As a manager,Launch the administration
 When Launch the Defect tracking to set DTS
  And Set DTS to the JIRA
 Then Should be able to Set DTS to JIRA
 When launch the External jira page
  And Change permission to project permission
  And As a Lead,Launch the Defect tracking page
 Then Should be able to Launch Defect Tracking page
 When Set the defect user who doesn't have create defect permission
  And Attempt to create defect in defect tracking app
 Then Should get a proper message 'user doesn't have permission to create defect'
 When Create a subtask in defect tracking app
 Then Should get a proper Message 'user doesn't have permission to create defect'
 When Launch the Test Execution page
  And attempt to Create defect in test execution app
 Then Should get the proper message 'user doesn't have permission to create defect'
 When create a Subtask in test execution app
 Then should get a proper message that'user doesn't have permission to create defect'
 
@Defect_Tracking
Scenario: 76 Search defect, If user doesn't have create defect permission
Given As a manager,Launch administration page
 When launch the defect tracking system
  And Set the DTS To JIRA
 Then Should be able to set DTS To JIRA
 When launch external jira page
  And change create defect permission to the defect user
 When As a Lead,launch defect tracking page
 Then Should be able to launch Defect tracking page
 When reset the external DTS login detail
 When search a defect by ID defect tracking app
 Then Should able to search the defect
 When search a defect by JQL in DT app
 Then Should able to search defect
 When search a defect by filter in DT app
 Then Should able to search Defect
 When launch the test execution page
  And search a defect by ID test execution app
 Then Should able to Search the defect in test execution
 When search a defect by JQL in test execution app
 Then Should able to search defect in test execution
 When search a defect by filter in test execution app
 Then Should able to Search Defect in test execution 
 
 @Defect_Tracking
Scenario: 79 <DT> Create defect/sub-task, If user have no assign issue permission
Given User Is in the External Jira page
 When navigate to the projects page
  And Change permission to No Assign Issue
  And As a Manager,Launch the Administration page
  And launch the Defect Tracking to set the DTS
  And Set a DTS To the JIRA
 Then Should Be able to Set a DTS to JIRA
 When As a Lead,Launch The Defect Tracking Page
 Then Should Be Able to Launch Defect Tracking page
 When Set the Defect user who doesn't have assign issue permission
  And Create a defect in defect tracking app
 Then Should be able to create a Defect
 When Create a Subtask in defect Tracking app
 Then Should be able to Create a defect subtask in DT
 When Launch the TestExecution Page
  And Create defect in Test execution app
 Then Should be Able to create a defect in Execution page
 When Create a Subtask in Test execution app
 Then should be able to create a defect subtask test in execution page 

@Defect_Tracking
Scenario: 80 <DT>Attempt to add comments to defects/subtasks When User have No Assign Issue Permission
Given User Is in the External Jira Page
 When navigate to the Projects page
  And change permission to No Assign Issue
  And As a Manager,Launch the Administration Page
  And launch the DefectTracking to set the DTS
  And set a DTS To the JIRA
 Then Should be able to Set a DTS to JIRA
 When As a Lead,Launch The DefectTracking Page
 Then Should Be able to Launch Defect Tracking page
 When set the Defect user who doesn't have assign issue permission
  And search a defect in defect tracking app
  And attempt to add comment in search defect view
 Then Should get message 'you do not have the permission to comment on this issue' for defect
 When search a Subtask in defect Tracking app
  And attempt to add comment in search defect view for subtask
 Then Should get message 'you do not have the permission to comment on this issue' for the subtask
 
 
@Defect_Tracking
Scenario: 77 <DT>Attempt to edit defects/subtasks When User have No Edit Issue Permission
Given User in External jira page
 When Change administrator permission to defect permission
  And As a manager,Launch the Administration page
 When Launch the Defect Tracking to set DTS
  And Set an DTS to the JIRA
 Then Should be able to Set an DTS to JIRA
  And As a Lead,Launch the Defect Tracking page
 Then Should be able to launch the Defect Tracking Page
 When Set the defect user who Don't have permission to editing defect
  And Attempt to edit defect in defect tracking app
 Then Should get a proper message 'Don't have permission to editing defect'
 When attempt to edit a subtask in defect tracking app
 Then Should get a proper Message 'user Don't have permission to editing defect'
 When Launch the Test Execution Page
  And attempt to edit defect in test execution app
 Then Should get the proper message 'user Don't have permission to editing defect'
 When attempt to edit a Subtask in test execution app
 Then should get a proper message that'user Don't have permission to editing defect' 
 
@Defect_Trackin1
Scenario: 78 <DT> Attempt to assign issues,If user have no assign issue permission
 Given User Is in the External_Jira page
 When Navigate to the Projects page
  And change permission to the No Assign Issue
  And As a Manager,launch the Administration Page
  And launch the Defect Tracking to Set the DTS
  And Set the DTS To the JIRA
 Then Should Be able to Set an DTS to JIRA
 When As a Lead,Launch the Defect_Tracking Page
 Then Should Be Able to Launch Defect_Tracking page
 When Set the defect user who doesn't have assign issue permission
  And attempt to assign issues for defect with assignee in defect tracking app
 Then Should not be able to search users in assignee field
 When attempt to assign issues for subtask with assignee in defect Tracking app
 Then should not be able to search users in assignee field in DT app
 When attempt to assign issues in search defect view
 Then Should not able to search users in assignee field using search defect view
 When attempt to assign issues in change multiple window
 Then Should not able to search users in assignee field using change multiple window
 When Launch the Test_Execution Page
  And attempt to create defect with assignee in Test execution app
 Then should not be able to search users in Assignee field
 When attempt to create a subtask with assignee in Test execution app
 Then should not be able to search users in Assignee Field 
 
@Defect_Tracking
Scenario: 81 <DT>Attempt to add attachment in defect/subtask When User have No create attachment  Permission
Given User Is in the External_Jira Page
 When User navigate to the projects page
  And change the permission to No Attachment permission
  And As a manager,launch the Administration page
  And launch Defect Tracking to set the DTS
  And Set DTS To the JIRA
 Then Should be able to set a DTS to JIRA
 When As the Lead,Launch the Defect Tracking Page
 Then Should be able to launch defect Tracking page
 When Set the Defect user who doesn't have no attachment permission
  And aatempt to add attachment to the defect in defect tracking
 Then Should get message 'Don't have permission to add attachment' to the defect
 When attempt to add attachment to a subtask in defect Tracking app
 Then Should get message 'Don't have permission to add attachment' to the subtask
 When launch the TestExecution Page
  And attempt to add attachment to the defect in test execution
 Then Should get message 'Don't have permission to add attachment' to the defect in test execution
 When attempt to add attachment to the subtask in test execution
 Then Should get message 'Don't have permission to add attachment' to the subtask in test execution 

@Defect_Tracking
Scenario: 71 <DT> Do JIRA operation after JIRA session time out
Given User is in the Project Page 
 When User launch defect tracking to create defect
  And create a defect in defect tracking app
 Then Should be able to Create the defect
 When create subtask in defect tracking app
 Then Should be able to create subtask in defect tracking app
 When search a defect by ID in defect tracking app
 Then Should be able to search defect in DT
 When search a defect by JQL in defect tracking app
 Then Should be able to search a defect in DT app
 When search a defect by filter in defect tracking app
 Then Should be able to search defect using filter
 When launch Test Execution page
  And create a defect in test execution page
 Then Should be able to Create the defect in Test Execution
 When create subtask in test execution page
 Then Should be able to create subtask in test execution page
 When search a defect by ID in test execution page
 Then Should be able to search defect in test execution page
 When search a defect by JQL in test execution page
 Then Should be able to search a defect in test execution page
 When search a defect by filter in test execution page
 Then Should be able to search defect using filter in Test Execution page

@Defect_Tracking
Scenario: 278<Test Execution/DT> Edit custom field configuration in Jira from non-mandatory to mandatory and attempt to create a defect/subtask in Zephyr without value for the mandatory custom field
Given defect user is in the external jira Page
 When navigate to the issues page
  And change custom fields from non mandatory to mandatoty 
  And As the Manager,Launch the administration page
  And launch the defect admin to clear the cache
  And As the Lead,Launch the defect tracking page
  And attempt to create a defect without text field
 Then should not be able to create defect for without text field
 When attempt to create a defect without free text field
 Then should not be able to create defect for without free text field
 When attempt to create a defect without single select field
 Then should not be able to create defect for without single select field
 When attempt to create a defect without date picker field
 Then should not be able to create defect for without date picker field
 When attempt to create a defect without number field
 Then should not be able to create defect for without number field
 When attempt to create a defect without url field
 Then should not be able to create defect for without url field
 When attempt to create a defect without checkbox field
 Then should not be able to create defect for without checkbox field
 When attempt to create a defect without multi select field
 Then should not be able to create defect for without multi select field
 When attempt to create a defect without radio button field
 Then should not be able to create defect for without radio button field
 When attempt to create a defect without user picker field
 Then should not be able to create defect for without user picker field
 When attempt to create a defect without multi user picker field
 Then should not be able to create defect for without multi user picker field
 When attempt to create a defect without single version picker field
 Then should not be able to create defect for without single version picker field
 When launch the test execution page to execute the testcase
  And attempt to create a defect without text field in execution page
 Then should not be able to create defect for without text field in execution page
 When attempt to create a defect without free text field in execution page
 Then should not be able to create defect for without free text field in execution page
 When attempt to create a defect without single select field in execution page
 Then should not be able to create defect for without single select field in execution page
 When attempt to create a defect without date picker field in execution page
 Then should not be able to create defect for without date picker field in execution page
 When attempt to create a defect without number field in execution page
 Then should not be able to create defect for without number field in execution page
 When attempt to create a defect without url field in execution page
 Then should not be able to create defect for without url field in execution page
 When attempt to create a defect without checkbox field in execution page
 Then should not be able to create defect for without checkbox field in execution page
 When attempt to create a defect without multi select field in execution page
 Then should not be able to create defect for without multi select field in execution page
 When attempt to create a defect without radio button field in execution page
 Then should not be able to create defect for without radio button field in execution page
 When attempt to create a defect without user picker field in execution page
 Then should not be able to create defect for without user picker field in execution page
 When attempt to create a defect without multi user picker field in execution page
 Then should not be able to create defect for without multi user picker field in execution page
 When attempt to create a defect without single version picker field in execution page
 Then should not be able to create defect for without single version picker field in execution page

@Defect_Tracking
Scenario: 277<Test Execution/DT> Edit custom field configuration in Jira from mandatory to non-mandatory and create a defect/subtask in Zephyr withou optional custom field
Given defect user is in the external Jira Page
 When navigate to the Issues page
  And change custom fields from mandatory to non mandatoty 
  And As the Manager,Launch the Administration page
  And launch the defect admin to clear the Cache
  And As the Lead,launch the defect tracking page
  And create a defect with text field
 Then should be able to create defect with text field
 When create a defect with free text field
 Then should be able to create defect with free text field
 When create a defect with single select field
 Then should be able to create defect with single select field
 When create a defect with date picker field
 Then should be able to create defect with date picker field
 When create a defect with number field
 Then should be able to create defect with number field
 When create a defect with url field
 Then should be able to create defect with url field
 When create a defect with checkbox field
 Then should be able to create defect with checkbox field
 When create a defect with multi select field
 Then should be able to create defect with multi select field
 When create a defect with radio button field
 Then should be able to create defect with radio button field
 When create a defect with user picker field
 Then should be able to create defect with user picker field
 When create a defect with multi user picker field
 Then should be able to create defect with multi user picker field
 When create a defect with single version picker field
 Then should be able to create defect with single version picker field
 When launch the testExecution page to execute the testcase
  And create a defect with text field in execution page
 Then should be able to create defect with text field in execution page
 When create a defect with free text field in execution page
 Then should be able to create defect with free text field in execution page
 When create a defect with single select field in execution page
 Then should be able to create defect with single select field in execution page
 When create a defect with date picker field in execution page
 Then should be able to create defect with date picker field in execution page
 When create a defect with number field in execution page
 Then should be able to create defect with number field in execution page
 When create a defect with url field in execution page
 Then should be able to create defect with url field in execution page
 When create a defect with checkbox field in execution page
 Then should be able to create defect with checkbox field in execution page
 When create a defect with multi select field in execution page
 Then should be able to create defect with multi select field in execution page
 When create a defect with radio button field in execution page
 Then should be able to create defect with radio button field in execution page
 When create a defect with user picker field in execution page
 Then should be able to create defect with user picker field in execution page
 When create a defect with multi user picker field in execution page
 Then should be able to create defect with multi user picker field in execution page
 When create a defect with single version picker field in execution page
 Then should be able to create defect with single version picker field in execution page



@Defect_Tracking
Scenario: 74 Attempt search defects, If user doesn't have have browse project permission
Given As a manager,Launch Administration page
 When launch the Defect tracking system
  And Set the DTS tO JIRA
 Then Should be able to set the DTS To JIRA
 When launch the external jira page
  And change permission to project permission
 When As a Lead,Launch Defect tracking page
 Then Should be able to launch Defect Tracking Page
 When reset the external DTS login detail
 When search a defect by ID Defect tracking app
 Then Should get proper message 'user doesn't have browser permission for this project' using ID
 When search a defect by JQL in DT App
 Then Should get proper message 'user doesn't have browser permission for this project' using JQL
 When search a defect by filter in DT App
 Then Should get proper message 'user doesn't have browser permission for this project' using MyFilter
 When launch the test_execution page
  And search a defect by ID using test execution app
 Then Should get proper message 'user doesn't have browser permission for this project' using ID in test execution
 When search a defect by JQL in test execution App
 Then Should get proper message 'user doesn't have browser permission for this project' using JQL in test execution
 When search a defect by filter in test execution App
 Then Should get proper message 'user doesn't have browser permission for this project' using MyFilter in test execution
  
 
@Defect_Tracking
Scenario: Logout
Given User is in the Zephyr ProjectPage_TPE
When User Clicks on logout Icon_TPE
	And User clicks on Logout Option_TPE
Then User should be logged out from Zephyr Application Successfully_TPE