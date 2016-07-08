package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postInsertOrderExchange.InsertOrderResponse;
import postShopperMerchantExchange.PostShopperMerchantFixtureModel;
import postShopperMerchantExchange.PostShopperMerchantResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utility.ApiEndPoints;
import utility.FixtureUtils;

public class PostAddMerchantShopperMappingTest extends BaseApiTest

{

	@Test(priority = 11)
	public void AddMerchantShopperMapping()

			throws IOException

	{

		// Assign CRM Test Suite

		
		Reporter.log("Base URL is " + ApiEndPoints.BaseURL, true);

		PostShopperMerchantFixtureModel apiTestData = (PostShopperMerchantFixtureModel) FixtureUtils.getAsObject(
				PostShopperMerchantFixtureModel.class, "src/main/java/resources/merchantShopperMapping.json");

		Call<PostShopperMerchantResponse> call = service.shopperMerchant(apiTestData.getRequest());
		retrofit2.Response<PostShopperMerchantResponse> response = call.execute();

		PostShopperMerchantResponse expected1 = apiTestData.getResponse();
		PostShopperMerchantResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);

			Reporter.log("Test Status of CrmAssignment Api :  PASS  ", true);

		} else {

			Reporter.log("Test Status of CrmAssignment Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
