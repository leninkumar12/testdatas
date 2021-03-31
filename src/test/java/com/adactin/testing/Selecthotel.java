package com.adactin.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement checkbox;

	@FindBy(id = "continue")
	private WebElement button;

	public Selecthotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getButton() {
		return button;
	}

}
