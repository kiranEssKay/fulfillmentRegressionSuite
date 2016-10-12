package regressionSuite;

import java.util.concurrent.TimeUnit;

import org.hibernate.dialect.FirebirdDialect;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import mx4j.tools.config.DefaultConfigurationBuilder.New;
import utility.DBConnection;
import utility.OrderGenerator;

public class testtt 

{
	
	@SuppressWarnings("null")
	@Test
	public void test()
	{
		
		DBConnection dbcon1 = DBConnection.getInstance();
	
		
		
		System.out.println(dbcon1.getVerificationData());
		
	/*System.out.println(OrderGenerator.getInstance().getrandomnumber());
		
		
		OrderGenerator gamma = OrderGenerator.getInstance();
		System.out.println(gamma.getOrderId());*/
		
	}

}
