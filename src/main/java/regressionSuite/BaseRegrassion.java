package regressionSuite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import utility.ApiEndPoints;
import utility.InsertOrderUtil;

public class BaseRegrassion

{

	public static WebDriver driver;

	public RetrofitService service;

	@BeforeSuite
	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Mi 2 Prime ");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		// Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Reporter.log("------------------------------------------------------------------------------------", true);
		Reporter.log("Starting Execution of Test: ", true);
		Reporter.log("------------------------------------------------------------------------------------", true);

		Reporter.log("", true);
		service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);

	}

	@AfterSuite
	public void teardown() {

		driver.quit();

	}

	@Test(priority = 1)

	public void LoginwithValidMobile() throws InterruptedException, IOException {

		driver.findElement(By.id("com.grofers.handpick:id/login_number")).sendKeys(" 9686642940");

		driver.findElement(By.id("com.grofers.handpick:id/login_button")).click();
		driver.findElement(By.id("com.grofers.handpick:id/otp_field")).sendKeys("1234");

		driver.findElement(By.id("com.grofers.handpick:id/verify_button")).click();

		InsertOrderUtil utils = new InsertOrderUtil();

		Reporter.log("Login Successful ", true);
		utils.InsertOrderTest();

		Thread.sleep(3000);

	}

	@Test(priority = 2)

	public void leftNavigationPanel() {

		Reporter.log("Left Navigation done ", true);

		driver.findElement(By
				.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]"))
				.click();

		Reporter.log("Left Navigation done ", true);

	}

	@Test(priority = 3)
	public void goOffline()

	{
		driver.findElement(By.id("com.grofers.handpick:id/shift_change_button")).click();

		driver.findElement(By.id("com.grofers.handpick:id/dialog_action_button")).click();

		Reporter.log("Go Offline ", true);
	}

	@Test(priority = 4)
	public void goOnline() {
		
		
		driver.findElement(By.id("com.grofers.handpick:id/action_button_text")).click();
		Reporter.log("Login Successful ", true);
	}

	/*
	 * @Test()
	 * 
	 * public void Search()
	 * 
	 * { driver.findElement(By.xpath(
	 * "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.TextView[2]"
	 * )).click();
	 * 
	 * //driver.findElement(By.id("com.grofers.handpick:id/search_text_bar")).
	 * sendKeys("1469784661130");
	 * 
	 * //driver.findElement(By.id("com.grofers.handpick:id/search_text_bar")).
	 * sendKeys(Keys.ENTER);
	 * 
	 * 
	 * driver.findElement(By.xpath(
	 * "//android.widget.ImageButton[@content-desc=‘Navigate up’]")).click();; }
	 */
}
