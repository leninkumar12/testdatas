package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.testing.Selecthotel;
import com.frame_work.org.Cucumberframework.BaseClass1;

import cucumber.api.java.en.*;

public class Selecthotelstepdefinition extends BaseClass1 {
	public static WebDriver driver = Runner.driver;
	//Selecthotel sh = new Selecthotel(driver);
PageObjectManager pom=new PageObjectManager(driver);
	@Given("^user selecting the hotel$")
	public void user_selecting_the_hotel() throws Throwable {
		click1(pom.getse().getCheckbox());
	}

	@Then("^user validate to continue$")
	public void user_validate_to_continue() throws Throwable {
		click1(pom.getse().getButton());
	}

}
