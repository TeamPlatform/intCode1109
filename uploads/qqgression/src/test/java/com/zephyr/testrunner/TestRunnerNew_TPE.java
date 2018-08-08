package com.zephyr.testrunner;



import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Features"},


//tags={"@DT_Admin"},
tags={"@Defect_Tracking,@DT_View,@Search_Defect,@DT_Admin"},

glue={"com.zephyr.stepdefinition"},
plugin = {"html:target/cucumber-html-report",
		"pretty:target/cucumber-pretty.txt","rerun:target/rerun.txt",
		"usage:target/cucumber-usage.json","json:target/cucumber135.json"},
		monochrome = false)

public class TestRunnerNew_TPE 
{
	
	
	
	

}
