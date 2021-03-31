package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.testing.Loginpage;
import com.frame_work.org.Cucumberframework.BaseClass1;

import cucumber.api.java.en.*;

public class Loginstepdefinition extends BaseClass1 {
	public static WebDriver driver = Runner.driver;
	PageObjectManager pg=new PageObjectManager(driver);
	//Loginpage lp = new Loginpage(driver);

	@Given("^user launch application$")
	public void user_launch_application() throws Throwable {
		String geturl = FileReaderManager.getInstance().getCrInstance().geturl();
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		screenshot("username");
		text(pg.getlp().getUsername(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		text(pg.getlp().getPassword(), arg1);
	}

	@Then("^user verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {
		click1(pg.getlp().getButton());
	}
	
	



}
