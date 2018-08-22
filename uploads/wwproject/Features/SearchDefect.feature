
Feature: Search Scenrio

@Search_Defect
Scenario: Login
Given User Selects the Browser, Launches it and Maximises it_TPE
When User Navigates to the URL provided_TPE
	And User Enters Username, Password and clicks on login_TPE
Then User should be Logged in into Zephyr Successfully_TPE


@Search_Defect
Scenario:207 Search defects using JQL by Issue Type Bug
Given Test repository page launched by User
When  user creates a new phase and adds testcase
Then  should be Added Testcase
When  user launch test planning page, creates new cycle and assign phase to cycle
And   launch Test execution page,Executes Testcase with any status 
And   click on D ICON
Then  window of link defect to be launched
When  Search defects using JQL by Issue Type Bug in test execution
Then  should be able to Search defects
When  search defect using JQL in defect tracking page
Then  should be able to search defects
When  user searches the defects using JQL by Issue Type Bug in requirements page
Then  The defects using JQL by Issue Type Bug should search

@Search_Defect
Scenario:208 Search defects using JQL by Issue Type Epic
Given  user is in a Page of execution
When   user search the defects using jql by Issue Type Epic
Then   should able to search defects
When   user Searches defects using JQL by Issue Type Epic in Defect Tracking
Then   In Defect Tracking,should be able to search defects
When    user search the defects using JQL by Issue Type Epic In requirements
Then    should search the defects in requirements

@Search_Defect
Scenario:209 Search defects using JQL by Issue Type Improvement
Given  Test execution Page is Launched By user
When   user  searches the defects using Jql by issue type Improvement
Then   issue type Improvement defects should search
When   user searches the defects using jql by issue type Improvement in defect tracking
Then   should search the defects using jQL by issue type Improvement 
When    search defects using JQL by Issue Type Improvement in Requirements
Then    should search defects using Jql by issue type Improvement

@Search_Defect
Scenario:210 Search defects using JQL by Issue Type Story
Given  TestExecution page is Launched by user
When   user Searches defects using JQL by Issue Type Story
Then   Defects should search
When   In defect tracking,user searches Defects using JQL by issuetype Story
Then   should search the defects in defect tracking
When    search defects Using Jql by IssueType Story In requirements page
Then    should search defects Using Jql by IssueType Story In requirements page

@Search_Defect
Scenario:211 Search defects using JQL by Issue Type Task
Given User Launch Test execution page 
When  Search defects using JQL by Issue Type Task
Then  should search defects using JQL by Issue Type Task
When  Search defects using JQL by Issue Type Task in defect tracking
Then   should search Defects using JQL by Issue Type Task
When  Search defects using JQL by Issue Type Task in requirements page
Then  should be able to search defects using JQL by Issue Type Task

@Search_Defect
Scenario:212 Search defects using JQL by Issue Type New Feature
Given user is in the testexecution page
When  user Search defects using JQL by Issue Type New Feature in test execution page
Then  should search the defects using JQL by Issue Type New Feature
When  Search defects using JQL by Issue Type New Feature in defect tracking
Then  In defect tracking,should search the Defects 
When  In requirements page,search the defects using JQL by Issue Type New Feature
Then  In requirement page should search the defects using JQL by Issue Type New Feature 

@Search_Defect
Scenario:213 Search defects using JQL by Issue Type Sub-Task
Given TestExecution page is Launched by User
When  Searches defects using JQL by Issue Type Sub-Task
Then  should search defects using JQL by issue type Sub-Task
When  User searches the defects using jql by issue type sub-task in Defect tracking
Then  Should search the defects using jql by issue type sub-task
When  user searches The defects using Jql By issue type sub-task in Requirements
Then  should search the defects  using Jql By issue type sub-task in requirements

@Search_Defect
Scenario:214 Search defects using JQL by custom Issue Type
Given user is in test execution PAGE
When  user searches defects using JQL by custom Issue Type
Then  should search the defects using JQL by custom Issue Type
When  user searches defects using JQL by custom Issue Type in defect tracking
Then  In defect tracking,should search the defects using JQL by custom Issue Type
When  In requirements, Search defects using JQL by custom Issue Type
Then  should search defects using JQL by custom Issue Type In requirements

@Search_Defect
Scenario:201 Search defects using valid JQL written in Lowercase
Given Test execution Page is Launched by User
When  user Searches defects using valid JQL written in Lowercase
Then  should be able to Search Defects 
When  Search defects using valid JQL written in Lowercase In Defect Tracking 
Then  in defect tracking,defects should search
When  user searches the defects using valid JQL written in Lowercase in Requirements
Then  should search defects using valid JQL written in Lowercase in Requirements

@Search_Defect
Scenario:202 Search defects using valid JQL written in Uppercase
Given Test execution page is Launched by user
When  user Searches defects using valid JQL written in Uppercase
Then  defects should search in test execution
When  In defect tracking,user searches the defects using valid JQL written in Uppercase
Then  In defect tracking,defects should search
When  user searches the defects using valid JQL written in Uppercase in requirements
Then  In requirements,defects should search 

@Search_Defect
Scenario:200 Attempt to search defects using invalid JQL
Given Testexecution app is launched by user
When  user Attempts to search defects using invalid JQL
Then  should get a proper message
When  user attempts to search defects using invalid JQL in defect tracking page
Then   should get the proper message

@Search_Defect
Scenario:203 Search defects without entering query
Given  Launched test execution page by user
When  user searches defects without entering query
Then  should be able to search the defects
When  User searches defects without entering query in defct tracking page
Then  should search defects
When  user serach defects without entering any query in requirements
Then  In requirements should search defects

@Search_Defect
Scenario:204 Attempt to get search results using JQL if there is no defect match to entered query
Given  Test execution page is launched by User
When   user searches defects using JQL if there is no defect match to entered query
Then   Should get message that No records found or you do not have access.Try modifying your search criteria
When   user searches defects using JQL if there is no defect match to entered query in defect tracking
Then   should get message No records found or you do not have access
When   user search defects using JQL if There is no defect match to entered query in requirements
Then   In requirements should show message that No records found or you do not have access

@Search_Defect
Scenario:205 Search defects using JQL having one or more matching defects, verify count of defects displayed is correct
Given  user is in the page OF TestExecution
When   user search defects using JQL having one or more matching defects and verifies count of defects 
Then   should show the proper search count
When   In defect tracking,Search defects using JQL having one or more matching defects and verify count of defects 
Then   should display proper search count
When   In requirements,Search defects using JQL having one or more matching defects and verifies count of defects 
Then   should Show Proper search Count

@Search_Defect
Scenario:215 Search defects by issue type ID using JQL
Given  TESTExecution page is launched by User
When   Search defects by issue type ID using JQL
Then   should be able to search defect by ID
When   user searches defects by issuetype ID using Jql in Defect Tracking
Then   should be Able to search Defects by issuetype ID in defect tracking
When   In requirements,user searches the defects by issue Type ID using JQL
Then   should search the defects by issue Type ID using JQL

@Search_Defect
Scenario:206 Search defects by project with project name using JQL
Given  User is in a Page Of DefectTracking
When   user search defects by project with long project name using JQL
Then   should search defects by project with long project name using JQL
When   user searches defects by project with project name having numbers using JQL 
Then   should search defects by project with project name having numbers using JQL
When   user searches defects by project with project name having special chars using JQL
Then   should able to search defects by project with project name having special chars
When   user searches defects by project with project name having apha numeric chars using JQL
Then   should search defects by project with project name having apha numeric chars
When   user search defects by project with project name having international chars using JQL
Then   should able to search defects by project with project name having international chars

@Search_Defect
Scenario:216 Search defects using JQL by component with all operator
Given  user is in DefectTracking page
When   Search defects using JQL by component with = operator
Then   defects should search using Jql
When   user searches defects using JQL by component with = operator in test execution
Then   In test execution,should search defects using jql by component with = operator
When   Search defects using JQL by component with != operator in defect tracking
Then   in defect tracking,should search the defects 
When   In test execution,search defects using JQL by component with != operator
Then   defects should be searched in test execution
When   user Search defects using JQL by component with AND operator in defect tracking
Then   Defects should be searched by using AND operator
When   Search defects using JQL by component with AND operator in test execution page
Then   In test execution defects should search using jql by component with AND operator
When   user search defects using JQL by component with OR operator in defect tracking
Then   defects should be searched using jql by component with OR operator
When   In test execution,search defects using JQL by component with OR operator
Then    Defects should search using jql by component with OR operator in test execution page
When   In defect tracking,Search defects using JQL by component with IN operator
Then   Defects should be searched in defect tracking
When   In test execution,search defects using JQL by component with IN operator
Then   defects should be searched in test execution using JQL by component with IN operator
When   In defect tracking,user search defects using JQL by component with NOT IN operator
Then   In defect tracking,should be able search defects using JQL by component with NOT IN operator
When   In test execution,user search defects using JQL by component with NOT IN operator
Then   defects should be able to search in Test execution
When   Search defects using JQL by component with IS operator in defect tracking
Then   defects should search using JQL by component with IS operator
When   user Search defects using JQL by component with IS operator in test execution
Then   should be able to search defects using JQL by component with IS operator
When   user Search defects using JQL by component with IS NOT operator in defect tracking
Then   should be able to search defects using jql by component with IS NOT operator
When   In test execution search defects using JQL by component with IS NOT operator
Then   should be able to search defects using JQL by component with IS NOT operator in test execution

@Search_Defect
Scenario:217 Search defects using JQL by Affected version with all operator
Given  Defect tracking page is launched by user
When   user searches defects using JQL by Affected version with = operator 
Then   should able to search defects using JQL by affected version
When   In test execution,user Searches defects using JQL by Affected version with = operator
Then   in test execution should able to search defects using JQL by affected version
When   In defect tracking, user searches defects using JQL by Affected version with != operator
Then   defects should be searched using jql by affected version
When   in test execution,search the defects using JQL by Affected version with != operator
Then   defects should search in test Execution page
When   Search defects using JQL by Affected version with AND operator in Defect tracking
Then   should be able to search defects using JQL by Affected version
When   In test execution,search Defects using JQL by Affected version with AND operator
Then   should able to search defects using JQL by Affected version with AND operator
When   In defect tracking page,user searches defects using JQL by Affected version with OR operator
Then   defects should search using JQL by Affected version with OR operator
When   In test execution,searches defects using JQL by Affected version with OR operator
Then   In test execution, defects should search using JQL by Affected version
When   user Searches defects using JQL by Affected version with IN operator in defect tracking
Then   Defects should search using JQL by Affected version with IN operator
When   In test execution page user searches Defects using JQL by Affected version with IN operator
Then   in test execution page Defects should search using JQL by Affected version
When   user search defects using JQL by Affected version with NOT IN operator in defect tracking
Then   Defects should search using JQL by Affected version with NOT IN Operator
When   In test execution page user Searches Defects Using jql by Affected version with NOT IN operator
Then   in test execution page, Defects to be able to search using JQL by Affected version 
When   In defect tracking page,user searches defects Using JQL By Affected Version with IS operator
Then   defects should be searched using JQL by Affected version with IS Operator
When   In test execution,searches defects using JQL by Affected version with IS operator
Then   In test execution page, defects should search using JQL by Affected version with IS operator
When   In defect tracking page,user will search defects using JQL by Affected Version With IS NOT operator
Then   defects should Be searched using JQL by Affected version with IS NOT operator
When   In test execution,searches defects using JQL by Affected version with IS NOT operator
Then   In test execution, defects should search using JQL by Affected version with IS NOT operator

@Search_Defect
Scenario:218 Search defects using JQL by Fix version with all operator
Given  User is in page OF DefectTracking
When   user will search defects using JQL by Fix Version with = operator 
Then   should be searched defects using JQL by Fix Version
When   In Test execution,user searches defects using JQL by Fix Version with = operator
Then   in Test execution page should able to search defects using JQL by Fix Version
When   In defect tracking,user searches defects using JQL by Fix Version with != operator
Then   defects should be able to search using jql by Fix Version
When   in Test execution page,Search the defects using JQL by Fix Version with != operator
Then   Defects should be searched in test Execution page
When   search Defects using JQL by Fix Version with AND operator in Defect tracking
Then   should be able to search Defects Using JQL by Fix Version
When   In Test execution,search Defects using jql by Fix Version with AND operator
Then   should able to search defects using jql by Fix Version with AND operator
When   In defect tracking page,user Searches defects using JQL by Fix version with OR operator
Then   defects should search using jql by Fix version with OR operator
When   In Test execution,searches Defects using JQL by Fix Version with OR operator
Then   In Test execution,Defects Should search using JQL by Fix Version
When   user Searches defects using JQL By Fix Version with IN operator in defect tracking
Then   Defects should search using JQL By Fix Version with IN operator
When   In Test execution page user searches Defects using JQL by Fix Version with IN operator
Then   in Test execution page Defects should search using JQL by Fix Version
When   user search defects using JQL by Fix Version with NOT IN operator in defect tracking
Then   Defects should search using JQL by Fix Version with NOT IN Operator
When   In Test execution page user Searches Defects Using jql by Fix Version with NOT IN operator
Then   in Test execution page, Defects to be able to search using JQL by Fix Version 
When   In defect tracking page,user searches defects Using JQL By Fix Version with IS operator
Then   defects should be searched using JQL by Fix Version with IS Operator
When   In Test execution,searches defects using JQL by Fix Version with IS operator
Then   In Test execution page, defects should search using JQL by Fix Version with IS operator
When   In defect tracking page,user will search defects using JQL by Fix Version With IS NOT operator
Then   defects should Be searched using JQL by Fix Version with IS NOT operator
When   In Test execution,searches defects using JQL by Fix Version with IS NOT operator
Then   In Test execution,Defects should Search using jql by Fix Version with IS NOT Operator

@Search_Defect
Scenario:219 Search defects by priority using JQL with all operator
Given  user will launch defect Tracking Page
When   user searches Defects Using JQL by priority with = operator 
Then   should Able to search defects using JQL by priority
When   In Test Execution,user searches the Defects using JQL by priority with = Operator
Then   in Test Execution page,should able to search Defects using JQL by priority
When   In defect tracking,User searches defects using JQL by priority with != operator
Then   Defects should be searched Using jql by Priority
When   in test execution,search the defects using JQL by priority with != operator
Then   defects should search using JQL by priority with != operator in Test Execution page
When   Search defects using JQL by priority with AND operator in Defect tracking page
Then   should be able to search defects using JQL by priority in Defect tracking page
When   In Test Execution,search Defects using JQL by priority with AND operator
Then   should Able to Search defects using JQL by priority with AND operator
When   In defect tracking page,user Searches defects using JQL by priority with OR operator
Then   defects should search Using JQL by priority With OR Operator
When   In Test Execution,searches defects using JQL by priority with OR operator
Then   In test execution, defects should search using JQL by priority
When   User searches defects using jql by fix version with IN operator in defect tracking
Then   Defects should search using jql by fix version with IN operator
When   In test execution page,User searches Defects using jql by fix version with IN Operator
Then   in test execution page Defects should be searched using JQL by fix version
When   user search defects using jql by fix version With NOT IN operator in Defect tracking Page
Then   Defects should be searched using JQL by fix version with NOT IN Operator
When   in Test execution page User searches Defects Using jql by fix version with NOT IN operator
Then   In test execution page, Defects to be able to search using jql by fix version 
When   In defect tracking user searches defects Using jql by fix version with IS operator
Then   defects should be searched using JQL By fix version with IS Operator
When   In Test execution,searches defects using JQL by fix version with IS operator
Then   In Test execution Page, defects should search using JQL by fix version with IS Operator
When   In defect tracking Page,user will search defects using JQL by fix version With IS NOT Operator
Then   defects should Be searched using JQL by fix version with IS NOT Operator
When   In test execution,searches defects using JQL by fix version with IS NOT operator
Then   In test execution,defects should Search Using JQL by fix version with IS NOT Operator

@Search_Defect
Scenario:220  Search defects by priority using JQL
Given  user Is in the Defect tracking App
When   Search defects by priority Blocker using JQL 
Then   should search the defects by priority Blocker using JQL 
When   In test execution user searches the defects by priority blocker using jql
Then   In test execution page should search the defects by priority blocker
When   user Search defects by priority Critical using JQL in defect tracking
Then   should able to search defects by priority Critical using JQL
When   In Test execution page,Search defects by priority Critical using JQL
Then   Defects should search by priority Critical
When   user Search defects by priority Major using JQL in defect tracking
Then   should able to search defects by priority Major using JQL
When   In Test execution page,Search defects by priority Major using JQL
Then   Defects should search by priority Major
When   user Search defects by priority Minor using JQL in defect tracking
Then   should able to search defects by priority Minor using JQL
When   In Test execution page,Search defects by priority Minor using JQL
Then   Defects should search by priority Minor
When   user Search defects by priority Trivial using JQL in defect tracking
Then   should able to search defects by priority Trivial using JQL
When   In Test execution page,Search defects by priority Trivial using JQL
Then   Defects should search by priority Trivial
When   user Search defects by custom priority using JQL in defect tracking
Then   should able to search defects by custom priority using JQL
When   In Test execution page,Search defects by custom priority using JQL
Then   Defects should search by custom priority
When   user Search defects by custom priority contain long name in defect tracking
Then   should able to search defects by custom priority contain long name
When   In Test execution page,Search defects by custom priority contain long name
Then   Defects should search by custom priority contain long name
When   user Search defects by  custom priority contain number in defect tracking
Then   should able to search defects by  custom priority contain number
When   In Test execution page,Search defects by  custom priority contain number
Then   Defects should search defects by custom priority contain number
When   user Search defects by custom priority contain special chars in defect tracking
Then   should able to search defects by custom priority contain special chars
When   In Test execution page,Search defects by custom priority contain special chars
Then   Defects should search by Custom priority contain special chars
When   user Search defects by Custom priority contain white spaces in defect tracking
Then   should able to search defects by custom priority contain white spaces
When   In Test execution page,Search defects by  custom priority contain white spaces
Then   Defects should search by custom priority contain white spaces
When   user Search defects by Custom priority contain alpha numeric chars in defect tracking
Then   should able to search defects by custom priority contain alpha numeric chars
When   In Test Execution page,Search defects by custom priority contain alpha numeric chars
Then   Defects should search by custom priority contain alpha numeric chars
When   user Search defects by custom priority contain international chars in defect tracking
Then   should able to search defects by custom priority contain international chars
When   In Test Execution page,Search defects by custom priority Contain international chars
Then   Defects should search by custom priority Contain international chars


@Search_Defect
Scenario:221 Search defects by status using JQL with all operator
Given  User is in a Page OF DEFECT TRACKING
When   Search defects using JQL by status with = Operator
Then   should able to search defects using JQL by status with = Operator
When   user searches the defects using JQL by status with = Operator in TestExecution page
Then   Defects should search using JQL by status with = Operator
When   Search defects using JQL by status with != operator In Defect Tracking Page
Then   Should able to search defects using JQL by status with != operator
When   In testexecution,user searches defects using JQL by status with != operator 
Then   To able to search defects using JQL by status with != operator In Test Execution Page
When   Search defects using JQL by status with AND operator In Defect Tracking Page
Then   Should Able to search defects using JQL by status with AND operator
When   In testexecution,user searches defects using JQL by status with AND operator 
Then   should search defects using JQL by status with AND operator In Test Execution Page
When   user search defects using JQL by status with OR operator In Defect Tracking Page
Then   To be able to search defects using JQL by status with OR operator
When   In testexecution,user searches defects using JQL by status with OR operator 
Then   should able to search defects using JQL by status with OR operator In Test Execution Page
When   Search defects using JQL by status with IN operator In Defect Tracking Page
Then   Should able To search defects using JQL by status with IN operator
When   In testexecution,user searches defects using JQL by status with IN operator 
Then   should be searched defects using JQL by status with IN operator In Test Execution Page
When   User search Defects using JQL by status with NOT IN operator In Defect Tracking Page
Then   Should able to search Defects using JQL by status with NOT IN operator
When   In testexecution,user searches defects using JQL by status with NOT IN Operator 
Then   should able to search defects using JQL by status with NOT IN operator In Test Execution Page
When   user Searches defects using JQL by status with IS operator In Defect Tracking Page
Then   should be able to search defects using JQL by status with IS operator
When   In Testexecution,user searches defects using JQL by status with IS operator 
Then   should search defects using JQL by status with IS operator In Test Execution Page
When   search Defects using JQL by status with IS NOT operator In Defect Tracking Page
Then   Should able to search defects using JQL by status with IS NOT operator
When   In Testexecution page,user searches defects using JQL by status with IS NOT operator 
Then   should Be able to search defects using JQL by status with IS NOT operator In Test Execution Page


@Search_Defect
Scenario:225 Search defects by project using JQL
Given  Defect Tracking App is Launched By a User
When   user searches defects by custom project contain long name
Then   To be able to search defects
When   In TestExecution page,user searches defects by Custom project contains Long name
Then   defects should be searched in a TestExecution page
When   user searches defects by custom project consists Number In a DefectTracking
Then   By custom project defects should search
When   In TestExecution page,user searches Defects By custom project contains Number
Then   Defects should be searched In TestExecution
When   user searches defects by custom project contains special chars In Defect tracking page
Then   To be able to search defects by custom project contains special chars
When   In TestExecution page,user searches defects by Custom project contain special chars
Then   defects should be searched by Custom project consists special chars in a TestExecution page
When   In Defect tracking,user searches defects by custom project contain white spaces
Then   To be able to search Defects by custom project contain white spaces
When   In TestExecution page,user searches defects by Custom project consists white spaces
Then   Defects should search in a TestExecution page by Custom project consists white spaces
When   user Search defects By custom project consists alpha numeric chars In defect tracking Page
Then   Should search defects By custom project consists alpha numeric chars
When   In TestExecution page,user searches defects by Custom project contains Alpha Numeric chars
Then   defects should be searched In a TestExecution page by Custom project contains Alpha Numeric chars
When   In Defect Tracking,user searches defects by custom project contains international chars
Then   To be Able to search defects by custom project
When   In TestExecution page,user searches defects by Custom project consists International chars
Then   defects should be searched in a TestExecution page by Custom project consists international chars


@Search_Defect
Scenario:226 Search defects by component using JQL
Given  DEFECTTRACKING Page is Launched BY User
When   user Searches defects by component Contains long name
Then   Should able to search defects by Component contains long name
When   User Searches defects by component contain Long name in TestExecution Page
Then   In Test Execution Page,Defects should search by Component
When   user Searches defects by component contains number In Defect Tracking
Then   Should able to search defects by Component contains number
When   User Searches defects by component contain number in TestExecution Page
Then   In Test Execution Page,Defects should search by component contains number
When   user Searches defects by component contain special chars In defectTracking page
Then   Should able to search defects by Component contains special chars
When   User Searches defects by component contain special chars in TestExecution Page
Then   In Test Execution Page,Defects should search by component consists special chars
When   user Searches defects by component contain  white spaces in defect tracking
Then   Should able to search defects by Component contains  white spaces
When   User Searches defects by component contain  white spaces in TestExecution Page
Then   In Test Execution Page,Defects should search by component contains  white spaces
When   In Defect Tracking page,user Searches defects by component contain alpha numeric chars
Then   Should able to search defects by Component contains alpha numeric chars
When   User Searches defects by component contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by component consists Alpha numeric chars
When   user Searches defects by component contain international chars in Defect Tracking Page
Then   should able to search defects by Component contains International chars
When   User Searches defects by component contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Component Consists International char

@Search_Defect
Scenario:223 Search defects by Assignee using JQL with all operator
Given  USer Launch Defect TRACKING page
When   Searches defects using JQL by Assignee  with = operator
Then   Should Able to Search Defects using JQL by Assignee  with = operator
When   user searches Defects using JQL by Assignee  with = operator In Test Execution Page
Then   In Test Execution Page,should search defects using JQL by assignee
When   User Searches defects using JQL by Assignee  with != operator In Defect Tracking
Then   Should Able to Search Defects using JQL by assignee with != operator
When   user searches Defects using JQL by assignee With != operator In Test Execution Page
Then   In Test Execution Page,should search defects using JQL by Assignee With != operator
When   Searches defects using JQL by Assignee  with AND operator In Defect tracking page
Then   should Able to Search Defects using JQL by Assignee  with AND operator
When   user searches Defects using JQL by Assignee with AND operator In Test Execution Page
Then   In Test Execution Page,should search defects using JQL by assignee with AND operator
When   Searches defects using JQL by Assignee  with OR operator
Then   Should able to search defects using JQL by Assignee  with OR operator
When   user searches Defects using JQL by Assignee  with OR operator In Test Execution Page
Then   In Test Execution Page,should search defects using JQL by assignee with OR operator
When   user Searches Defects using JQL by Assignee  with IN operator in defect tracking
Then   user should Able to Search Defects using JQL by Assignee  with IN operator
When   user searches Defects using JQL by Assignee  with IN operator In test Execution Page
Then   In Test Execution Page,should search defects using JQL by Assignee  with IN operator
When   user search defects using JQL by Assignee  with NOT IN Operator In Defect Tracking
Then   Should be able to Search defects using JQL by Assignee  with NOT IN operator in defect tracking
When   user searches Defects using JQL by Assignee  with NOT IN operator In Test execution Page
Then   In Test Execution Page,should search defects using JQL by Assignee with NOT IN operator
When   In defect tracking page,user Searches defects using JQL by Assignee  with IS operator
Then   Should be Searched Defects using JQL by Assignee  with IS operator
When   user searches Defects using JQL by Assignee  with IS operator In Test Execution Page
Then   In Test Execution Page,Should search Defects using JQL by  Assignee  with IS operator
When   Searches defects using JQL by Assignee with IS NOT Operator in defect tracking page
Then   Should Able to Search Defects using JQL by Assignee  with IS NOT operator
When   user searches Defects using JQL by Assignee  with IS NOT operator In Test Execution Page
Then   In Test Execution Page,should search defects using JQL by Assignee With IS NOT operator

@Search_Defect
Scenario:224 Search defects by Reporter using JQL with all operator
Given  USer Launches DefectTRACKING page
When   Searches defects using jql by Reporter with = operator
Then   should Able to Search Defects using JQL by Reporter with = operator
When   user searches Defects using jql by Reporter with = Operator In Test Execution Page
Then   In Test Execution Page,should search defects using jql by Reporter
When   user Searches defects using JQL by Reporter With != operator In Defect Tracking
Then   To be able to Search Defects using JQL by Reporter with != Operator
When   User searches Defects using JQL by Reporter with != operator In Test Execution Page
Then   In Test Execution Page,should search defects using JQL by Reporter with != Operator
When   Searches defects using JQL by Reporter With AND operator In Defect tracking page
Then   should Able to Search Defects using JQL by Reporter With AND Operator
When   user searches Defects using JQL by Reporter With AND Operator In Test Execution Page
Then   In Test Execution Page,Should search defects using JQL by Reporter with AND operator
When   Searches defects using JQL by Reporter with OR operator in defect tracking
Then   To Be able to search defects using JQL by Reporter with OR operator
When   user searches Defects using JQL By Reporter with OR operator In Test Execution Page
Then   In Test Execution Page,should search Defects using JQL by Reporter with OR operator
When   user Searches Defects using JQL by Reporter with IN operator in defect tracking
Then   user should Able to Search Defects using JQL by Reporter with IN operator
When   user searches Defects using JQL by Reporter with IN operator In test Execution Page
Then   In Test Execution Page,should search Defects using JQL by Reporter with IN Operator
When   user search defects using jql by Reporter with NOT IN Operator In Defect Tracking
Then   Should be Searched defects using JQL by Reporter with NOT IN operator in Defect tracking Page
When   user searches Defects using JQL by Reporter With NOT IN operator In Test execution Page
Then   In Test Execution Page,should search defects using JQL By Reporter with NOT IN operator
When   In defect tracking page,user Searches defects using JQL By Reporter With IS operator
Then   Should be Searched Defects using jql By Reporter with IS operator
When   user searches Defects using jql By Reporter With IS operator In Test Execution Page
Then   In Test Execution Page,Should search Defects using JQL by Reporter with IS Operator
When   Searches defects using JQL By Reporter with IS NOT Operator in defect tracking page
Then   To be Able to Search Defects using JQL by Reporter with IS NOT operator
When   user searches Defects using jql by Reporter with IS NOT operator In Test Execution Page
Then   In Test Execution Page,Should search Defects using JQL by Reporter With IS NOT operator

@Search_Defect
Scenario:227 Search defects by Affected version using JQL
Given  DEFECTTRACKING is Launched by User
When   user Searches defects by Affected version Contains long name
Then   should able to search defects by Affected version consists long name
When   User Searches defects by Affected version contains Long Name in TestExecution Page
Then   In Test Execution Page,Defects should search by Affected version consists long name
When   user Searches defects by Affected version contains number In Defect tracking
Then   Should able To search defects by Affected version contains Number
When   User Searches defects by Affected version Contains number in TestExecution Page
Then   In Test Execution Page,Defects should search by Affected version contains Number
When   user Searches defects by Affected version contains special chars In defectTracking page
Then   Should able to search defects by Affected version contains special characters
When   User Searches defects by Affected version contain special chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Affected version consists special chars
When   user searches defects by Affected version contain  white spaces in defect tracking
Then   To be able to search defects by Affected version contains  white spaces
When   User Searches defects by Affected version contain  white spaces in TestExecution Page
Then   in Test Execution Page,Defects should search by Affected version contains  white spaces
When   In defect Tracking page,user Searches defects by Affected version contain alpha numeric chars
Then   should able to search defects by Affected version contains alpha numeric chars
When   user Searches defects by Affected version contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by affected version consists Alpha numeric chars
When   user Searches defects by Affected version contain international chars in Defect Tracking Page
Then   should able to search defects by Affected version Contains International chars
When   User Searches Defects by Affected version contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Affected version Consists International chars

@Search_Defect
Scenario:228 Search defects by Fix version using JQL
Given  DEFECT TRACKING page is Launched BY User
When   user Searches defects by Fix version Contains long Name
Then   Should Able to search Defects by Fix version contains Long Name
When   User searches defects By Fix Version contain Long name in TestExecution Page
Then   In Test Execution Page,Defects should Search by Fix version
When   user Searches defects By Fix version contains Number In Defect Tracking
Then   To be able to search defects by Fix version contains Number
When   User Searches defects by Fix version contains Number in TestExecution Page
Then   In Test Execution Page,Defects should search by Fix version consists number
When   user Searches defects by Fix Version contain special chars In defectTracking page
Then   To be able to search defects by Fix version contains special chars
When   User Searches Defects by Fix version contain Special chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Fix version consists Special chars
When   user Searches defects by Fix version contain White spaces in defect tracking
Then   Should able to search defects by Fix version Contains White spaces
When   User Searches Defects by Fix version contain  white spaces in Test Execution Page
Then   In Test Execution Page,Defects should be searched by Fix version contains  white spaces
When   In Defect Tracking page,user Searches defects by Fix version contain Alpha numeric chars
Then   Should able to search defects by Fix version contains Alpha numeric chars
When   User Searches defects by Fix version contains alpha numeric Chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Fix version consists Alpha Numeric chars
When   user searches defects by Fix version contain international chars in Defect Tracking Page
Then   should able to search Defects by Fix version contains International chars
When   User Searches defects By Fix version contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Fix version contains International chars

@Search_Defect
Scenario:229 Search defects by text custom field using JQL
Given  DEFECT TRACKING Page is launched BY User
When   user Searches defects by Text custom field Contains long Name
Then   to be able to search defects by text custom field contains long name
When   User Searches Defects by text custom field contain Long name in TestExecution Page
Then   In Test ExecutionPage,Defects should search by Text custom field
When   user Searches defects by text custom field contains number In Defect Tracking
Then   should able to search defects by text Custom field contains number
When   User Searches Defects by text custom field contain number in TestExecution Page
Then   In TestExecution Page,Defects should search by text custom field contains number
When   user Searches defects by text custom field contain special chars In defectTracking page
Then   to be able to search defects by text custom field contains special chars
When   user searches defects by text custom field contain special chars in TestExecution Page
Then   In Test Execution Page,Defects should search by text custom field consists special chars
When   user Searches defects by text custom field contain  white spaces in defect tracking
Then   Should able to search defects by text custom field contains  white spaces
When   User Searches defects by text custom field contain  white spaces in TestExecution Page
Then   in Test Execution Page,Defects should search by text custom field contains  white spaces
When   In defect Tracking page,user Searches defects by text custom field contain alpha numeric chars
Then   Should able to search defects by text custom field contains alpha numeric chars
When   User Searches defects by text custom field contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,defects should search by text custom field consists Alpha numeric chars
When   user Searches defects by Text custom field contain international chars in Defect Tracking Page
Then   should be searched Defects by Text custom field contains International chars
When   User Searches defects by text custom field contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by text custom field Consists International chars

@Search_Defect
Scenario:230 Search defects by Free text custom field using JQL
Given  DEFECTTRACKING Page is Launched By the User
When   user Searches defects by Free text which Contains long name
Then   Should able to search defects by Free text contains Long name
When   User Searches defects by Free text contain Long name in TestExecutionPage
Then   in Test Execution Page,Defects should search by Free Text
When   user Searches Defects by Free text contains number In Defect Tracking
Then   Should be searched defects by Free text contains number
When   User Searches defects By Free text contain number in TestExecution Page
Then   In TestExecution Page,Defects should be searched by Free text contains number
When   user Searches Defects by Free text contain special chars In defectTracking page
Then   Should able to search defects by Free text contains special chars
When   User Searches defects by Free text contain special chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Free text consists special chars
When   user searches defects by Free text contain  white spaces in defect tracking
Then   should able to search defects by Free text contains  white spaces
When   User Searches defects by Free text contain  white spaces in TestExecution Page
Then   In Test Execution Page,Defects should search by Free text contains  white spaces
When   In Defect Tracking page,user Searches defects by Free text contain alpha numeric chars
Then   Should able to search defects by Free text contains alpha numeric chars
When   User Searches defects by Free text contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Free text consists Alpha numeric chars
When   user Searches defects by Free text contain international chars in Defect Tracking Page
Then   should able to search defects by Free text contains International chars
When   User Searches defects by Free text contain international chars in TestExecution Page
Then   In TestExecution page,Defects should search By Free text Consists International chars

@Search_Defect
Scenario:231 Search defects by checkbox custom field using JQL
Given  User Navigates to defect Tracking app
When   User searches Defects By checkbox custom field  Contains long name
Then   To be able to Search defects by checkbox custom field contains long name
When   User Searches Defects by checkbox custom field contain Long name in TestExecution Page
Then   In TestExecution page,Defects should Search by checkbox custom field
When   user searches Defects by checkbox custom field contains number In Defect Tracking
Then   Should be searched defects by checkbox custom field contains Number
When   User Searches defects By checkbox custom field contain number in TestExecution Page
Then   In Test Execution Page,Defects should be searched by checkbox custom field contains Number
When   user Searches defects by Checkbox custom field contain special chars In defectTracking page
Then   Should be able to search defects by checkbox custom field contains special chars
When   User Searches defects by checkbox custom field contain special chars in TestExecution Page
Then   In testExecution Page,Defects should search by checkbox custom field consists special chars
When   user Searches defects by checkbox custom field contain  white spaces in Defect Tracking
Then   should able to search defects by checkbox custom field contains  white spaces
When   User Searches defects bycheckbox custom field contain  white spaces in TestExecution Page
Then   In Test Execution page,Defects should search by checkbox custom field contains White spaces
When   In Defect Tracking page,user Searches defects by checkbox custom field contain alpha numeric chars
Then   Should able to search defects by checkbox custom field contains Alpha numeric chars
When   User Searches defects by checkbox custom field contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by checkbox custom field consists Alpha numeric chars
When   user Searches defects by checkbox custom field contain international chars in Defect Tracking Page
Then   should able to search defects by checkbox custom field contains International chars
When   User Searches defects by checkbox custom field contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by checkbox custom field contains International Chars

@Search_Defect
Scenario:232 Search defects by Radio custom field using JQL
Given  User navigates to Defect Tracking app
When   User searches Defects By Radio custom field Contains Long name
Then   To be Able to Search defects by Radio custom field contains long name
When   User Searches Defects by Radio custom field contain Long name in TestExecution Page
Then   In Test Execution Page,Defects should Search by Radio custom field
When   user searches Defects by Radio custom field contains number In Defect Tracking
Then   Should be searched defects by Radio custom field contains Number
When   User Searches Defects By Radio custom field contain number in TestExecution Page
Then   In Test Execution page,Defects should be searched by Radio custom field contains Number
When   user Searches defects by Radio custom field contain special chars In defectTracking page
Then   Should be able to search defects by Radio custom field contains special chars
When   User Searches defects by Radio custom field contain special chars in TestExecution Page
Then   In test Execution Page,Defects should search by Radio custom field consists special chars
When   user Searches Defects by Radio custom field contain  white spaces in Defect Tracking
Then   should able to search defects by Radio custom field contains  white spaces
When   User Searches defects by Radio custom field contain  white spaces in TestExecution Page
Then   In Test Execution page,Defects should search by Radio custom field contains White spaces
When   In Defect Tracking page,user Searches defects by Radio custom field contain alpha numeric chars
Then   Should able to search defects by Radio custom field contains Alpha numeric chars
When   User Searches defects by Radio custom field contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Radio custom field consists Alpha numeric chars
When   user Searches defects by Radio custom field contain international chars in Defect Tracking Page
Then   should able to search defects by Radio custom field contains International chars
When   User Searches defects by Radio custom field contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Radio custom field contains International Chars

@Search_Defect
Scenario:233 Search defects by single select custom field using JQL
Given  DEFECT TRACKING Page is Launched By The User
When   user Searches defects by Single select custom field which Contains long name
Then   should be able to search defects by single select custom field contains Long name
When   User Searches defects by single select custom field contain Long name in TestExecutionPage
Then   in Test Execution Page,Defects should search by single select custom field
When   user Searches Defects By single select custom field contains number In Defect Tracking
Then   Should be searched Defects By single select custom field contains Number
When   User Searches defects By single select custom field contain number in TestExecution Page
Then   In TestExecution Page,Defects should be searched by single select custom field contains number
When   user Searches Defects by single select custom field contain special chars In DefectTracking page
Then   Should able to search defects by single select custom field contains special chars
When   User Searches defects by single select custom field contain special chars in TestExecution Page
Then   In Test Execution Page,Defects should search by single select custom field consists special chars
When   user searches defects by single select custom field contain  white spaces in Defect tracking
Then   should able to search defects by single select custom field contains  white spaces
When   User Searches defects by single select custom field contain  white spaces in TestExecution Page
Then   In Test Execution Page,Defects should search by single select custom field contains  white spaces
When   In Defect Tracking page,user Searches defects by single select custom field contain alpha numeric Chars
Then   Should able to search defects by single select custom field contains alpha Numeric chars
When   User Searches defects by single select custom field contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by single select custom field consists Alpha numeric chars
When   user Searches defects by single select custom field contain international chars in Defect Tracking Page
Then   should able to search defects by single select custom field contains International chars
When   User Searches defects by single select custom field contain international chars in TestExecution Page
Then   In TestExecution page,Defects should search By single select custom field Consists International chars

@Search_Defect
Scenario:234 Search defects by multi select custom field using JQL
Given  DEFECT Tracking Page is Launched BY the User
When   user Searches Defects by Multi select custom field Contains long name
Then   Should able to Search defects by multi select custom field contains long name
When   User Searches defects By multi select custom field contain Long name in TestExecution Page
Then   In Test Execution page,Defects should search by multi select custom field
When   user Searches Defects by multi select custom field contains number In Defect Tracking
Then   Should be able to search defects by multi select custom field contains number
When   User Searches defects By multi select custom field contain number in TestExecution Page
Then   In Test Execution Page,Defects should search by multi select custom field contains number
When   user Searches defects by multi select Custom field contain special chars In defectTracking page
Then   To be able to search defects by multi select custom field contains special chars
When   User Searches defects by multi select custom field contain special chars in TestExecution Page
Then   In TestExecution Page,Defects should search by multi select custom field consists special chars
When   user Searches defects by multi Select custom field contain  white spaces in Defect Tracking
Then   Should able to search defects by multi select custom field contains  white spaces
When   User Searches defects by multi select custom field contain  white spaces in TestExecution Page
Then   In Test Execution Page,Defects should search by multi select custom field contains White spaces
When   In Defect Tracking page,user Searches defects by multi select custom field contain alpha numeric chars
Then   Should able to search defects by multi select custom field contains Alpha numeric chars
When   User Searches defects by multi select custom field contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by multi select custom field consists Alpha numeric chars
When   user Searches defects by multi select custom field contain international chars in Defect Tracking Page
Then   should able to search defects by multi select custom field contains International chars
When   User Searches defects by multi select custom field contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Multi select custom field contains International chars

@Search_Defect
Scenario:235 Search defects by single version picker custom field using JQL
Given  DEFECT TRACKING Page is Launched BY USER
When   user Searches defects by single version picker custom field Contains long name
Then   Should able to search defects by single version picker custom field contains long name
When   User Searches defects by single version picker custom field contain Long name in TestExecution Page
Then   In Test Execution Page,Defects should search by single version picker custom field
When   user Searches defects by single version picker custom field contains number In Defect Tracking
Then   Should able to search defects by single version picker custom field contains number
When   User Searches defects by single version picker custom field contain number in TestExecution Page
Then   In Test Execution Page,Defects should search by single version picker custom field contains number
When   user Searches defects by single version picker custom field contain special chars In defectTracking page
Then   Should able to search defects by single version picker custom field contains special chars
When   User Searches defects by single version picker custom field contain special chars in TestExecution Page
Then   In Test Execution Page,Defects should search by single version picker custom field consists special chars
When   user Searches defects by single version picker custom field contain  white spaces in defect tracking
Then   Should able to search defects by single version picker custom field contains  white spaces
When   User Searches defects by single version picker custom field contain  white spaces in TestExecution Page
Then   In Test Execution Page,Defects should search by single version picker custom field contains  white spaces
When   In Defect Tracking page,user Searches defects by single version picker custom field contain alpha numeric chars
Then   Should able to search defects by single version picker custom field contains alpha numeric chars
When   User Searches defects by single version picker custom field contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by single version picker custom field consists Alpha numeric chars
When   user Searches defects by single version picker custom field contain international chars in Defect Tracking Page
Then   should able to search defects by single version picker custom field contains International chars
When   User Searches defects by single version picker custom field contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by single version picker custom field Consists International chars

@Search_Defect
Scenario:236  Search defects by multi version picker custom field using JQL
Given  User Navigates To defect Tracking Page
When   User searches Defects By Multi version picker Custom field  Contains long name
Then   To be able to Search defects by Multi version picker Custom field contains long name
When   User Searches Defects by Multi version picker Custom field contain Long name in TestExecution Page
Then   In TestExecution page,Defects should Search by Multi version picker Custom field
When   user searches Defects by Multi version picker Custom field contains number In Defect Tracking
Then   Should be searched defects by Multi version picker Custom field contains Number
When   User Searches defects By Multi version picker Custom field contain number in TestExecution Page
Then   In Test Execution Page,Defects should be searched by Multi version picker Custom field contains Number
When   user Searches defects by Multi version picker Custom field contain special chars In defectTracking page
Then   Should be able to search defects by Multi version picker Custom field contains special chars
When   User Searches defects by Multi version picker Custom field contain special chars in TestExecution Page
Then   In testExecution Page,Defects should search by Multi version picker Custom field consists special chars
When   user Searches defects by Multi version picker Custom field contain  white spaces in Defect Tracking
Then   should able to search defects by Multi version picker Custom field contains  white spaces
When   User Searches defects by Multi version picker Custom field contain  white spaces in TestExecution Page
Then   In Test Execution page,Defects should search by Multi version picker Custom field contains White spaces
When   In Defect Tracking page,user Searches defects by Multi version picker Custom field contain alpha numeric chars
Then   Should able to search defects by Multi version picker Custom field contains Alpha numeric chars
When   User Searches defects by Multi version picker Custom field contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Multi version picker Custom field consists Alpha numeric chars
When   user Searches defects by Multi version picker Custom field contain international chars in Defect Tracking Page
Then   should able to search defects by Multi version picker Custom field contains International chars
When   User Searches defects by Multi version picker Custom field contain international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Multi version picker Custom field contains International Chars




@Search_Defect
Scenario:237  Search defects by Summary using JQL
Given  User navigates To defect Tracking Page
When   User Searches Defects By Summary Contains long name
Then   To be able to Search defects by Summary contains long name
When   User Searches Defects By Summary Contain Long name in TestExecution Page
Then   In TestExecution page,defects should Search by Summary
When   user searches Defects by Summary Contains Number In Defect Tracking
Then   Should be searched defects by Summary which contains Number
When   User Searches defects By Summary contain number in TestExecution Page
Then   In Test Execution Page,Defects should be searched by Summary contains Number
When   user Searches defects by Summary Contain special chars In defectTracking page
Then   Should be able to search defects by Summary contains special chars
When   User Searches defects by Summary contain special chars in TestExecution Page
Then   In testExecution Page,Defects should search by Summary consists special chars
When   user Searches defects by Summary contain  white spaces in Defect Tracking
Then   should able to search defects by Summary contains  white spaces
When   User Searches defects by Summary contain  white spaces in TestExecution Page
Then   In Test Execution page,Defects should search by Summary contains White spaces
When   In Defect Tracking page,user Searches defects by Summary contain alpha numeric chars
Then   Should able to search defects by Summary contains Alpha numeric chars
When   User Searches defects by Summary contain alpha numeric chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Summary consists Alpha numeric chars
When   user Searches defects by Summary contain international chars in Defect Tracking Page
Then   should able to search defects by Summary contains International chars
When   User Searches defects by Summary contain international chars in TestExecution Page
Then   In TestExecution Page,Defects should search by Summary contains International Chars

@Search_Defect
Scenario:238 Search defects by Description using JQL
Given  User navigates to DefectTracking Page
When   User Searches Defects By Description Contains Long Name
Then   To Be able to Search defects by Description contains long Name
When   User Searches Defects By Description Contain long Name in TestExecution Page
Then   In TestExecution page,defects should Search By Description
When   user searches defects by Description Contains Number In Defect Tracking
Then   Should be searched defects by Description which should contains Number
When   User searches defects By Description contain number in TestExecution Page
Then   In Test Execution Page,Defects to be searched by Description contains Number
When   user Searches defects by Description Contain Special chars In defectTracking page
Then   Should be able to search defects By Description contains special chars
When   User Searches defects by Description contain special chars In TestExecution Page
Then   In TestExecution Page,Defects should search by Description consists special chars
When   user Searches defects by Description contains  white spaces in Defect Tracking
Then   should able To search defects by Description contains  white spaces
When   user Searches defects by Description contain  white spaces in TestExecution Page
Then   In TestExecution page,Defects should search by Description contains White spaces
When   In defect Tracking page,user Searches defects by Description contain alpha numeric chars
Then   should able to search defects by Description contains Alpha numeric chars
When   User searches defects by Description contain alpha numeric chars in TestExecution Page
Then   In Test execution Page,Defects should search by Description consists Alpha numeric chars
When   user Searches defects by Description contain international chars in Defect tracking Page
Then   should able to search defects by Description contains international chars
When   User Searches defects by Description contains international chars in TestExecution Page
Then   In Test Execution Page,Defects should search by Description contains International Chars
