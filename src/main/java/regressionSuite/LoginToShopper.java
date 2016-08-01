package regressionSuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToShopper extends BaseRegrassion

{
	@Test

	public void LoginwithValidEmail() throws InterruptedException {

		driver.findElement(By.id("com.grofers.handpick:id/login_number")).sendKeys(" 8971915180");

		driver.findElement(By.id("com.grofers.handpick:id/login_button")).click();
		driver.findElement(By.id("com.grofers.handpick:id/otp_field")).sendKeys("1234");

		driver.findElement(By.id("com.grofers.handpick:id/verify_button")).click();

	}

}
