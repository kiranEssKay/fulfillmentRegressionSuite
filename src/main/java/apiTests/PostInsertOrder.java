package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postInsertOrderExchange.InsertOrderApiTestData;
import postInsertOrderExchange.InsertOrderResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import utility.ApiEndPoints;
import utility.FixtureUtils;

public class PostInsertOrder {

	ApiEndPoints con = new ApiEndPoints();
	public int ordid = con.orderID;

	// Insert Order API Test Script
	@Test(priority = 1)

	public void InsertOrderTest() throws IOException {
		Reporter.log("Verify the response of InsertOrder Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);
		Reporter.log("Base URL is " + ApiEndPoints.BaseURL, true);
		// pos-master//src//main//resources//PostStockIn.json
		InsertOrderApiTestData apiTestData = (InsertOrderApiTestData) FixtureUtils
				.getAsObject(InsertOrderApiTestData.class, "src/main/java/resources/insertorder.json");

		// System.out.println(orderNo);
		Call<InsertOrderResponse> call = service.postOrder("Auto" +con.orderID, apiTestData.getRequest());

		retrofit2.Response<InsertOrderResponse> response = call.execute();

		InsertOrderResponse expected1 = apiTestData.getResponse();
		InsertOrderResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of insertOrder Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of insertOrder Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}
}