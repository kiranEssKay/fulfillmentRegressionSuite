package regressionSuite;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import utility.InsertOrderUtil;

public class LoginToAppProdSauceLabs

{

	public static final String USERNAME = "kiransk91";
	public static final String ACCESS_KEY = "fc1ca68c-2472-4830-bf32-399e4353b307";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public  WebDriver driver;

	@BeforeTest

	public void setup() throws MalformedURLException {

				
	
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("appiumVersion", "1.4.16");
		caps.setCapability("deviceName", "LG Nexus 4 GoogleAPI Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "");
		caps.setCapability("platformVersion", "4.4");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", "sauce-storage:testing.apk");
	
		caps.setCapability("name", "Shopper App:SK");

		driver = new AndroidDriver(new URL(URL), caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest

	public void teardown() 
	{

		driver.quit();

	}
	
	public LoginToAppProdSauceLabs() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Test

	public void LoginwithValidEmail() throws InterruptedException, IOException {

		
		
		driver.findElement(By.id("com.grofers.handpick:id/login_number")).sendKeys(" 8971915180");

		driver.findElement(By.id("com.grofers.handpick:id/login_button")).click();
		driver.findElement(By.id("com.grofers.handpick:id/otp_field")).sendKeys("1234");

		driver.findElement(By.id("com.grofers.handpick:id/verify_button")).click();

		
		InsertOrderUtil utils = new InsertOrderUtil();
		utils.InsertOrderTest();
		
		
	}
	
	

	@Test
	public void pendingOrderScreen()
	
	{
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.TextView[2]")).click();

		driver.findElement(By.id("com.grofers.handpick:id/search_text_bar")).sendKeys("1469784661130");
		
		driver.findElement(By.id("com.grofers.handpick:id/search_text_bar")).sendKeys(Keys.ENTER);
		
		
	}


	}