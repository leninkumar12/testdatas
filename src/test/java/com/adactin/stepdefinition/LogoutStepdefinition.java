package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.testing.Logoutpage;
import com.frame_work.org.Cucumberframework.BaseClass1;

import cucumber.api.java.en.Then;

public class LogoutStepdefinition extends BaseClass1{
	public static WebDriver driver=Runner.driver;
	//Logoutpage lo=new Logoutpage(driver);
	PageObjectManager pom=new PageObjectManager(driver);
	@Then("^user successfully completed validation\\.$")
	public void user_successfully_completed_validation() throws Throwable {
	    click1(pom.getlo().getLogout());
	}


}
