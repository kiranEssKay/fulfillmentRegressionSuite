package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postOrderEnrouteExchange.PostOrderEnrouteFixtureModel;
import postOrderEnrouteExchange.PostOrderEnrouteResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utility.ApiEndPoints;
import utility.FixtureUtils;
import utility.InsertOrderUtil;

public class PostOrderEnroute

{

	@Test(priority = 14)
	public void CancelOrderTest()

			throws IOException

	{
		InsertOrderUtil utils = new InsertOrderUtil();
		utils.InsertOrderTest();

		// Assign CRM Test Suite

		Reporter.log("Verify the response of Order Enroute Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);
		Reporter.log("Base URL is " + ApiEndPoints.BaseURL, true);

		PostOrderEnrouteFixtureModel apiTestData = (PostOrderEnrouteFixtureModel) FixtureUtils
				.getAsObject(PostOrderEnrouteFixtureModel.class, "src/main/java/resources/canceOrder.json");

		Call<PostOrderEnrouteResponse> call = service.orderEnroute("Auto" + utils.ordid, apiTestData.getRequest());
		Response<PostOrderEnrouteResponse> response = call.execute();

		PostOrderEnrouteResponse expected1 = apiTestData.getResponse();
		PostOrderEnrouteResponse expected = response.body();

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
