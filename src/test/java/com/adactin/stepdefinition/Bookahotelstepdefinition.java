package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.testing.Bookhotel;
import com.frame_work.org.Cucumberframework.BaseClass1;

import cucumber.api.java.en.*;

public class Bookahotelstepdefinition extends BaseClass1 {
	public static WebDriver driver=Runner.driver;
	//Bookhotel bh=new Bookhotel(driver);
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^user enter \"([^\"]*)\" as first_name$")
	public void user_enter_as_first_name(String arg1) throws Throwable {
	   text(pom.getbh().getFname(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as last_name$")
	public void user_enter_as_last_name(String arg1) throws Throwable {
	    text(pom.getbh().getLname(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as billing address$")
	public void user_enter_as_billing_address(String arg1) throws Throwable {
	  text(pom.getbh().getAdress(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as credit card number$")
	public void user_enter_as_credit_card_number(String arg1) throws Throwable {
	 text(pom.getbh().getCreditnumber(), arg1);
	}

	@When("^user selected VISA as credit card type$")
	public void user_selected_VISA_as_credit_card_type() throws Throwable {
	   dropdown(pom.getbh().getCardtype(), "value", "VISA");
	}

	@When("^user selected  Jan as month$")
	public void user_selected_Jan_as_month() throws Throwable {
	   dropdown(pom.getbh().getMonth(), "value", "1");
	}

	@When("^user selected (\\d+) as year$")
	public void user_selected_as_year(int arg1) throws Throwable {
	   dropdown(pom.getbh().getYear(), "value", "2022");
	}

	@When("^user enter \"([^\"]*)\" as cvv$")
	public void user_enter_as_cvv(String arg1) throws Throwable {
	   text(pom.getbh().getCvv(), arg1);
	}

	@Then("^user verify valid first_name,valid last_name,valid billing_Address,valid credit_card number,valid credit card type and valid cvv$")
	public void user_verify_valid_first_name_valid_last_name_valid_billing_Address_valid_credit_card_number_valid_credit_card_type_and_valid_cvv() throws Throwable {
	  click1(pom.getbh().getButton());
	}


}
