package com.adactin.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	public static WebDriver driver;

	@FindBy(xpath="//a[text()='Logout']")
private WebElement logout;

	public Logoutpage(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(ldriver, this);
	}

	public WebElement getLogout() {
		return logout;
	}
	

}
