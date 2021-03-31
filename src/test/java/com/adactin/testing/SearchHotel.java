package com.adactin.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement rooms;

	@FindBy(id = "datepick_in")
	private WebElement checkin;

	@FindBy(id = "datepick_out")
	private WebElement checkout;

	@FindBy(id = "adult_room")
	private WebElement adults;

	@FindBy(id = "child_room")
	private WebElement childrens;

	@FindBy(id = "Submit")
	private WebElement button;

	public static WebDriver getDriver() {
		return driver;
	}

	public SearchHotel(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildrens() {
		return childrens;
	}

	public WebElement getButton() {
		return button;
	}
}
