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
import utility.InsertOrderUtil;
import utility.Utilator;

public class PostInsertChildOrder extends BaseApiTest {

	ApiEndPoints con = new ApiEndPoints();
	//public int ordid = con.orderID;
	
	
	InsertOrderUtil utils = new InsertOrderUtil();

	// Insert Order API Test Script
	@Test(priority = 1)

	public void InsertChildOrderTest() throws IOException {

		InsertOrderApiTestData apiTestData = (InsertOrderApiTestData) FixtureUtils
				.getAsObject(InsertOrderApiTestData.class, "testdata/resources/insertChildorder.json");

		// System.out.println(orderNo);
		
		//System.out.println(utils.currentDate());
		
		//apiTestData.getRequest().getData().setScheduledTime(utils.currentDate());
		Call<InsertOrderResponse> call = service.postOrder("Auto" + ordid, apiTestData.getRequest());

		retrofit2.Response<InsertOrderResponse> response = call.execute();

		InsertOrderResponse expected1 = apiTestData.getResponse();
		InsertOrderResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), o));
			ReflectionAssert.assertReflectionEquals(expected, expected1);

			Reporter.log("Test Status of insertOrder Api :  PASS  ", true);

		} else {

			Reporter.log("Test Status of insertOrder Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}
}