package apiTests;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import utility.ApiEndPoints;

public class BaseApiTest

{

	public RetrofitService service;

	@BeforeMethod
	public void Createonnection(Method method) {

		Reporter.log("------------------------------------------------------------------------------------", true);
		Reporter.log("Starting Execution of Test: " + method.getName(), true);
		Reporter.log("------------------------------------------------------------------------------------", true);

		Reporter.log("", true);
		service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);
		

	}

	@AfterMethod()	

	public void terminateConnection(Method method) {

		
		Reporter.log("API Test Passed " + method.getName(), true);
		
		Reporter.log("------------------------------------------------------------------------------------", true);
		Reporter.log("Completed Execution of Test: " + method.getName(), true);
		
		
		Reporter.log("------------------------------------------------------------------------------------", true);
	}

	

}
