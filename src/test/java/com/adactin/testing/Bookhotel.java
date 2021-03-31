package com.adactin.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {

	public static WebDriver driver;

	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
		private WebElement lname;
		
	@FindBy(id="address")
	private WebElement adress;
	
	@FindBy(id="cc_num")
	private WebElement creditnumber;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement button;
	
	
	public Bookhotel(WebDriver bdriver) {
this.driver=bdriver;
PageFactory.initElements(bdriver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCreditnumber() {
		return creditnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getButton() {
		return button;
	}

	
	
}
