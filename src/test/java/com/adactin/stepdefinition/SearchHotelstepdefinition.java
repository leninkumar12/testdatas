package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.testing.SearchHotel;
import com.frame_work.org.Cucumberframework.BaseClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelstepdefinition extends BaseClass1 {
	public static WebDriver driver = Runner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	//SearchHotel sh = new SearchHotel(driver);

	@Given("^user selected sydeny as location$")
	public void user_selected_sydeny_as_location() throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		dropdown(pom.getsh().getLocation(), "value", "Sydney");
	}

	@When("^user selected hotel creek as hotel$")
	public void user_selected_hotel_creek_as_hotel() throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		dropdown(pom.getsh().getHotels(), "value", "Hotel Creek");
	}

	@When("^user selected Standard as room type$")
	public void user_selected_Standard_as_room_type() throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		dropdown(pom.getsh().getRoomtype(), "value", "Standard");
	}

	@When("^user selected (\\d+)-One as number of rooms$")
	public void user_selected_One_as_number_of_rooms(int arg1) throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		dropdown(pom.getsh().getRooms(), "value", "1");
	}

	@When("^user enter (\\d+)/(\\d+)/(\\d+) as check-in date$")
	public void user_enter_as_check_in_date(int arg1, int arg2, int arg3) throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		clear1(pom.getsh().getCheckin());
		text(pom.getsh().getCheckin(), "01/04/21");
	}

	@When("^user enter (\\d+)/(\\d+)/(\\d+) as check-out date$")
	public void user_enter_as_check_out_date(int arg1, int arg2, int arg3) throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		clear1(pom.getsh().getCheckout());
		text(pom.getsh().getCheckout(), "02/04/21");
	}

	@When("^user selected (\\d+)-One as adults$")
	public void user_selected_One_as_adults(int arg1) throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		dropdown(pom.getsh().getAdults(), "value", "1");
	}

	@When("^user selected (\\d+)-One as Validchildren$")
	public void user_selected_One_as_Validchildren(int arg1) throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		dropdown(pom.getsh().getChildrens(), "value", "1");
	}

	@Then("^user verify valid location,valid hotels,valid roomtype,valid number of rooms,valid check-in date,valid check-out date,valid adults and valid childrens$")
	public void user_verify_valid_location_valid_hotels_valid_roomtype_valid_number_of_rooms_valid_check_in_date_valid_check_out_date_valid_adults_and_valid_childrens()
			throws Throwable {
		//FileReaderManager.getInstance().getCrInstance().wait();
		click1(pom.getsh().getButton());
	}

}
