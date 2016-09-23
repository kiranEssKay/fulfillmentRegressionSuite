package regressionSuite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import utility.ApiEndPoints;
import utility.DBConnection;
import utility.InsertOrderUtil;

public class BaseRegrassion

{

	public static MobileDriver driver;

	public RetrofitService service;

	@BeforeSuite
	public void setup() throws MalformedURLException {
		
	

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Mi 2 Prime Emulator");

		capabilities.setCapability("noResetValue","false"); 
		capabilities.setCapability("platformName", "Android");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		// driver = new AndroidDriver(new
		// URL("http://192.168.56.101:5555/wd/hub"), capabilities);

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

	@Test(priority = 0)

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
/*
	@Test(priority = 1)
	public void checkOrder() {
		driver.findElement(By
				.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]"))
				.click();

		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		driver.scrollTo("Continue");

		driver.findElement(By.id("com.grofers.handpick:id/available_button")).click();
		driver.findElement(By.id("com.grofers.handpick:id/not_available_button")).click();

		driver.findElement(By
				.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]"))
				.click();

		driver.findElement(By.id("android:id/button1")).click();

	}*/

	@Test(priority = 2)

	public void leftNavigationPanel() {

		Reporter.log("Left Navigation done ", true);

		driver.findElement(By
				.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]"))
				.click();

		Reporter.log("Left Navigation done ", true);

	}
/*
	@Test(priority = 3)
	public void outOfStockItems()

	{
		driver.findElement(By.id("com.grofers.handpick:id/out_of_stock_button")).click();
		driver.findElement(By.id("com.grofers.handpick:id/merchant_item_layout")).click();

		driver.findElement(By.id("com.grofers.handpick:id/out_of_stock_available_button")).click();
		driver.findElement(By.id("com.grofers.handpick:id/disabled_proceed_button")).click();
		driver.findElement(By.id("com.grofers.handpick:id/confirm_button")).click();

	}*/

	@Test(priority = 4)
	public void goOffline()

	{
		driver.findElement(By.id("com.grofers.handpick:id/shift_change_button")).click();

		driver.findElement(By.id("com.grofers.handpick:id/dialog_action_button")).click();

		Reporter.log("Go Offline ", true);
	}
/*
	@Test(priority = 5)
	public void goOnline() {

		driver.findElement(By.id("com.grofers.handpick:id/action_button_text")).click();
		Reporter.log("Login Successful ", true);

	}*/

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
