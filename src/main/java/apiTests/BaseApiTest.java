package apiTests;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import utility.ApiEndPoints;

public class BaseApiTest

{
	
	//private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(BaseAPITest.class.getName());
	public RetrofitService service;

	@BeforeMethod(alwaysRun=true)
	public void Createonnection(ITestResult result) {
		
		Reporter.log("------------------------------------------------------------------------------------");
		Reporter.log("Starting Execution of Test: " + result.getMethod().getMethodName()	);
		Reporter.log("------------------------------------------------------------------------------------");
		
			
		service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);
		Reporter.log("Base URL is " + ApiEndPoints.BaseURL, true);
	}

	@AfterMethod()

	public void terminateConnection(ITestResult result)

	{
		
		Reporter.log("------------------------------------------------------------------------------------");
		Reporter.log("Completed the Execution of Test: " + result.getMethod().getMethodName()	);
		Reporter.log("------------------------------------------------------------------------------------");

	}

}
