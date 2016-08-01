package regressionSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import utility.ApiEndPoints;

public class BaseRegrassion

{

	public WebDriver driver;

	public RetrofitService service;

	@BeforeMethod
	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "A");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Reporter.log("------------------------------------------------------------------------------------", true);
		Reporter.log("Starting Execution of Test: ", true);
		Reporter.log("------------------------------------------------------------------------------------", true);

		Reporter.log("", true);
		service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);

	}

	@AfterMethod
	public void teardown() {

		// driver.quit();

	}

	


}
