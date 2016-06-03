package apiTests;


import java.io.IOException;
import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;




import postInsertOrder.InsertOrderApiTestData;
import postInsertOrder.InsertOrderResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import utils.Constant;
import utils.FixtureUtils;

public class InsertOrder {

	public static  int orderNo= 0;
	@Test(priority = 1)

	public void InsertOrderTest() throws IOException {
		Reporter.log("Verify the response of InsertOrder Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);
		//pos-master//src//main//resources//PostStockIn.json
	    InsertOrderApiTestData apiTestData = (InsertOrderApiTestData) FixtureUtils.getAsObject(InsertOrderApiTestData.class ,"src/main/java/resources/insertorder.json");

		orderNo= new Random().nextInt(10000);
	 	Call<InsertOrderResponse> call = service.postOrder("Auto"+orderNo, apiTestData.getRequest());
		retrofit2.Response<InsertOrderResponse> response = call.execute();


		InsertOrderResponse expected1 = apiTestData.getResponse();
		InsertOrderResponse expected = response.body();


		if(response.code()==200){


				expected1.setMessage(String.format(expected1.getMessage(), orderNo));
				ReflectionAssert.assertReflectionEquals(expected, expected1);
				Reporter.log("Expected and Actual response are same.  ", true);
			    Reporter.log("Test Status of insertOrder Api :  PASS  ", true);


		}
		else
		{
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of insertOrder Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}
		         
		}


	}


