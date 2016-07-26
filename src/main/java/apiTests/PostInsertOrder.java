package apiTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postInsertOrderExchange.InsertOrderApiTestData;
import postInsertOrderExchange.InsertOrderResponse;
import retrofit2.Call;
import utility.ApiEndPoints;
import utility.FixtureUtils;

public class PostInsertOrder extends BaseApiTest {

	ApiEndPoints con = new ApiEndPoints();
	public int ordid = con.orderID;

	@Test(priority = 1)

	public void InsertOrderTest() throws IOException {

		InsertOrderApiTestData apiTestData = (InsertOrderApiTestData) FixtureUtils
				.getAsObject(InsertOrderApiTestData.class, "testdata/resources/insertorder.json");

		// System.out.println(orderNo);
		Call<InsertOrderResponse> call = service.postOrder("Auto" + con.orderID, apiTestData.getRequest());

		retrofit2.Response<InsertOrderResponse> response = call.execute();

		InsertOrderResponse expected1 = apiTestData.getResponse();
		InsertOrderResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);

		} else {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}
}