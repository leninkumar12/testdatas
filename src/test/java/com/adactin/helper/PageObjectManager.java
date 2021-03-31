package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.testing.Bookhotel;
import com.adactin.testing.Loginpage;
import com.adactin.testing.Logoutpage;
import com.adactin.testing.SearchHotel;
import com.adactin.testing.Selecthotel;

public class PageObjectManager {
	public static WebDriver driver;
	private Loginpage lp;
	private SearchHotel sh;
	private Selecthotel se;
	private Bookhotel bh;
	private Logoutpage lo;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public Loginpage getlp() {
		Loginpage lp = new Loginpage(driver);
		return lp;
	}

	public SearchHotel getsh() {
		SearchHotel sh = new SearchHotel(driver);
		return sh;
	}

	public Selecthotel getse() {
		Selecthotel se = new Selecthotel(driver);
		return se;
	}

	public Bookhotel getbh() {
		bh = new Bookhotel(driver);
		return bh;
	}

	public Logoutpage getlo() {
		Logoutpage lo = new Logoutpage(driver);
		return lo;
	}

}
