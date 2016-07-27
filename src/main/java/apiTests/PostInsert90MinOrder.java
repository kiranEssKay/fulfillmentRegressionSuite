package apiTests;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import com.google.gson.reflect.TypeToken;

import postInsertOrderExchange.InsertOrderApiTestData;
import postInsertOrderExchange.InsertOrderResponse;
import retrofit2.Call;
import utility.ApiEndPoints;
import utility.FixtureUtils;
import utility.InsertOrderUtil;

public class PostInsert90MinOrder extends BaseApiTest {

	@Test(priority = 1)

	public void InsertOrderTest() throws IOException {

		/*
		 * InsertOrderApiTestData apiTestData = (InsertOrderApiTestData)
		 * FixtureUtils .getAsObject(InsertOrderApiTestData.class,
		 * "testdata/resources/insertorder.json");
		 */
		// System.out.println(con.orderID);
		
		InsertOrderUtil utils = new InsertOrderUtil();
		ArrayList<InsertOrderApiTestData> dataList;
		Type listType = new TypeToken<List<InsertOrderApiTestData>>() {
		}.getType();
		dataList = (ArrayList<InsertOrderApiTestData>) FixtureUtils.getAsList(InsertOrderApiTestData.class,
				"testdata/resources/insertorder.json", listType);

		for (InsertOrderApiTestData apiTestData : dataList) {

			ApiEndPoints con = new ApiEndPoints();
			int ordid = con.orderID;

			apiTestData.getRequest().getData().setScheduledTime(utils.currentDate());
			Call<InsertOrderResponse> call = service.postOrder("Auto" + con.orderID, apiTestData.getRequest());
			
		Reporter.log("Order Id :"+ "Auto"+con.orderID, true);

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
}
