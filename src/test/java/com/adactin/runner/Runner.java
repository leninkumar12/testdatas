package com.adactin.runner;

import java.io.IOException;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import com.adactin.helper.FileReaderManager;
import com.frame_work.org.Cucumberframework.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
glue = "com\\adactin\\stepdefinition",
monochrome = true,
dryRun = false,
strict = true)
public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		String getbrowsername = FileReaderManager.getInstance().getCrInstance().getbrowsername();
		driver = BaseClass1.browserLaunch("chrome");
	}

	@org.junit.AfterClass
	public static void teardown() throws InterruptedException, IOException {
		FileReaderManager.getInstance().getCrInstance().wait1();
		//Thread.sleep(3000);
		driver.quit();
	}
}
