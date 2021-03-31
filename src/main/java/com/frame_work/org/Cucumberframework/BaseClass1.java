package com.frame_work.org.Cucumberframework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass1 {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void actionclass(String options, WebElement source) {

		Actions ac = new Actions(driver);
		if (options.equalsIgnoreCase("rightClick")) {
			ac.contextClick(source).build().perform();
		} else if (options.equalsIgnoreCase("doubleClick")) {
			ac.doubleClick(source).build().perform();
		} else if (options.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(source).click().build().perform();
		}
	}

	public static void draganddrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navito(String url) {
		driver.navigate().to(url);
	}

	public static void naviback() {
		driver.navigate().back();
	}

	public static void naviforward() {
		driver.navigate().forward();
	}

	public static void navirefresh() {
		driver.navigate().refresh();
	}

	public static void alerts(String options, String text) {

		if (options.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (options.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}

	}

	public static void alertsendkeys(String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	public static void frames(int num) {
		driver.switchTo().frame(num);
	}

	public static void frames2(WebElement id) {
		driver.switchTo().frame(id);
	}

	public static void dropdown(WebElement element, String options, String value) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}

	public static void windowhandle(String value) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).equals(value)) {
				driver.close();
			}
		}

	}

	public static void checkbox(WebElement element) {
		element.click();
	}

	public static void implictwait1() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void explictwait(WebElement time) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(time));
	}

	public static void fluentwait() {
		Wait wait = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(Exception.class);
	}

	public static void text(WebElement text1, String pass) {
		text1.sendKeys(pass);
	}

	public static void currenturl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void gettitle() {
		System.out.println(driver.getTitle());
	}

	public static void click1(WebElement on) {
		on.click();
	}

	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void screenshot(String destpath) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File(System.getProperty("user.dir")+"\\Cucumberframework\\Screenshot"+destpath+".png");
		FileUtils.copyFile(sourcefile, destinationfile);
	}

	public static void windowhandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void scroll(WebElement name) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", name);
	}

	public static void scrollbyarguments() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static void isdisplayed(WebElement displyed) {
		boolean displayed = displyed.isDisplayed();
		System.out.println(displayed);
	}

	public static void isenabled(WebElement enabled) {
		boolean enabled2 = enabled.isEnabled();
		System.out.println(enabled2);
	}

	public static void isselected(WebElement selected) {
		boolean selected2 = selected.isSelected();
		System.out.println(selected2);
	}

	public static void ismultiple1(WebElement multiple1) {
		Select s = new Select(multiple1);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	public static void getattribute(WebElement attribute, String text) {
		String attribute2 = attribute.getAttribute(text);
		System.out.println(attribute2);
	}

	public static void gettext(WebElement text) {
		String text2 = text.getText();
		System.out.println(text2);
	}

	public static void clear1(WebElement clear2) {
		clear2.clear();
	}

	public static void windowmaxmize() {
		driver.manage().window().maximize();
	}

	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

	public static void getallselectedoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

	public static void getfirstselectselectedoption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}

	public static void framedefault() {
		driver.switchTo().defaultContent();
	}

	public static void robotclass() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void robotenter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
