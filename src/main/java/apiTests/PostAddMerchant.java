
package apiTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postAddMerchantExchange.PostAddMerchantFixtureModel;
import postAddMerchantExchange.PostAddMerchantRequest;
import postAddMerchantExchange.PostAddMerchantResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utility.ApiEndPoints;
import utility.FixtureUtils;

/**
 * Created by Kiran SK on 4/5/2016.
 */

public class PostAddMerchant {

	@Test(priority = 13)

	public void AddMerchantTestt() throws Exception

	{
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);

		PostAddMerchantFixtureModel respoAuthentication = (PostAddMerchantFixtureModel) FixtureUtils
				.getAsObject(PostAddMerchantFixtureModel.class, "src/main/java/resources/AddMerchant.json");

		PostAddMerchantRequest requestBody = respoAuthentication.getRequest();

		Call<PostAddMerchantResponse> postAuth = service.addMerchantResponse(requestBody);
		Reporter.log("End Point Under Test" + ApiEndPoints.BaseURL, true);

		Response<PostAddMerchantResponse> response = postAuth.execute();

		PostAddMerchantResponse actualData = response.body();

		// Expected ShopperAppResponse from json reader
		PostAddMerchantResponse expectedData = respoAuthentication.getResponse();

		if (response.code() == 200)

		{

			ReflectionAssert.assertReflectionEquals(actualData, expectedData);

			Reporter.log("ShopperAppResponse for Post Authentication ShopperAppRequest is " + response.code(), true);

			Reporter.log("Post Authentication API for POS - Master successful", true);

			Reporter.log("Test Cases : Post Authentication API Passed ");

			// ReflectionAssert.assertReflectionEquals(actualData,
			// expectedData);

		}

		else {

			Reporter.log("Test Cases : Post Authentication API Failed ");

			ReflectionAssert.assertReflectionEquals(actualData, expectedData);

		}

	}

}
