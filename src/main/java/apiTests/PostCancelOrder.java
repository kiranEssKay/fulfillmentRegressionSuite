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
import utils.Constant;
import utils.FixtureUtils;
import utils.InsertOrderUtil;

public class PostCancelOrder

{

	@Test (priority =11)
	public void CancelOrderTest()

			throws IOException

	{
		InsertOrderUtil utils = new InsertOrderUtil();
		utils.InsertOrderTest();

		// Assign CRM Test Suite

		Reporter.log("Verify the response of Cancel Order Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		PostCancelOrderFixtureModel apiTestData = (PostCancelOrderFixtureModel) FixtureUtils
				.getAsObject(PostCancelOrderFixtureModel.class, "src/main/java/resources/canceOrder.json");

		Call<PostCanceOrderResponse> call = service.cancelOrder("Auto" + utils.ordid, apiTestData.getRequest());
		Response<PostCanceOrderResponse> response = call.execute();

		PostCanceOrderResponse expected1 = apiTestData.getResponse();
		PostCanceOrderResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), utils.ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of CrmAssignment Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of CrmAssignment Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
