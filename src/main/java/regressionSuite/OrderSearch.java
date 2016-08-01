package regressionSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OrderSearch extends LoginToShopper {

	@Test
	public void pendingOrderScreen()

	{

		driver.findElement(By
				.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.TextView[2]"))
				.click();

		driver.findElement(By.id("com.grofers.handpick:id/search_text_bar")).sendKeys("1469784661130");

		driver.findElement(By.id("com.grofers.handpick:id/search_text_bar")).sendKeys(Keys.ENTER);

	}
}
