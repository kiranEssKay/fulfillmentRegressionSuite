package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postCancelOrderExchange.PostCanceOrderResponse;
import postCancelOrderExchange.PostCancelOrderFixtureModel;
import postCrmAssignmentExchange.CrmAssignmentApiTestData;
import postCrmAssignmentExchange.CrmAssignmentResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utility.ApiEndPoints;
import utility.FixtureUtils;
import utility.InsertOrderUtil;

public class PostCancelOrder extends BaseApiTest

{

	@Test(priority = 11)
	public void CancelOrderTest()

			throws IOException

	{
		InsertOrderUtil utils = new InsertOrderUtil();
		utils.InsertOrderTest();

		// Assign CRM Test Suite

		PostCancelOrderFixtureModel apiTestData = (PostCancelOrderFixtureModel) FixtureUtils
				.getAsObject(PostCancelOrderFixtureModel.class, "testdata/resources/canceOrder.json");

		Call<PostCanceOrderResponse> call = service.cancelOrder("Auto" + utils.ordid, apiTestData.getRequest());
		Response<PostCanceOrderResponse> response = call.execute();

		PostCanceOrderResponse expected1 = apiTestData.getResponse();
		PostCanceOrderResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), utils.ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);

			Reporter.log("Test Status of CrmAssignment Api :  PASS  ", true);

		} else {

			Reporter.log("Test Status of CrmAssignment Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
