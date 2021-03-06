package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postOrderExchange.PostOrderApiTestData;
import postOrderExchange.PostOrderResponse;
import retrofit2.Call;
import utility.ApiEndPoints;
import helper.utility.FixtureUtils;
import utility.InsertOrderUtil;
import ApiEndPoints

public class PostInsertMarketPlaceOrder extends BaseApiTest {

	ApiEndPoints con = new ApiEndPoints();
	public int ordid = con.orderID;
	
	
	InsertOrderUtil utils = new InsertOrderUtil();

	// Insert Order API Test Script
	@Test(priority = 1)

	public void InsertMarketPlaceOrderTest() throws IOException {

		PostOrderApiTestData apiTestData = (PostOrderApiTestData) FixtureUtils
				.getAsObject(PostOrderApiTestData.class, "testdata/resources/marketPlaceOrder.json");

		// System.out.println(orderNo);
		
		//System.out.println(utils.currentDate());
		
		apiTestData.getRequest().getData().setScheduledTime(utils.currentDate());
		Call<PostOrderResponse> call = service.postOrder("Auto" + ordid, apiTestData.getRequest());
		Reporter.log("Order Id for the Test: "+ "Auto"+ordid,true);
		retrofit2.Response<PostOrderResponse> response = call.execute();

		PostOrderResponse actual = apiTestData.getResponse();
		PostOrderResponse expected = response.body();
		
		System.out.println(apiTestData.getResponse());

		if (response.code() == 200) {

			actual.setMessage(String.format(actual.getMessage(), ordid));
			ReflectionAssert.assertReflectionEquals(expected, actual);

			Reporter.log("Test Status of Merchant Place Api :  PASS  ", true);

		} else {

			Reporter.log("Test Status of insertOrder Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, actual);
		}

	}
}