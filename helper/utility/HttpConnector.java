package utility;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import retrofit.RetrofitService;
import retrofit.ServiceGenerator;

public class HttpConnector

{

	public RetrofitService service;

	@BeforeMethod
	public void Createonnection() {
		Reporter.log("", true);
		service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);
		Reporter.log("Base URL is " + ApiEndPoints.BaseURL, true);
	}

	@AfterMethod()

	public void terminateConnection()

	{

	}

}
