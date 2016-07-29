package regressionSuite;


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

public class LoginToApp

{

	WebDriver driver;

	@BeforeTest

	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "A");
		 

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest

	public void teardown() {

	//	driver.quit();

	}

	@Test

	public void LoginwithValidEmail() throws InterruptedException {

		
		
		driver.findElement(By.id("com.grofers.handpick:id/login_number")).sendKeys(" 8971915180");

		driver.findElement(By.id("com.grofers.handpick:id/login_button")).click();
		driver.findElement(By.id("com.grofers.handpick:id/otp_field")).sendKeys("1234");

		driver.findElement(By.id("com.grofers.handpick:id/verify_button")).click();

		
		
	}
	
	@Test
	public void pendingOrderScreen()
	
	{
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.TextView[2]")).click();

		driver.findElement(By.id("com.grofers.handpick:id/search_text_bar")).sendKeys("1469784661130");
		
		driver.findElement(By.id("com.grofers.handpick:id/search_text_bar")).sendKeys(Keys.ENTER);
		
		
	}

}
