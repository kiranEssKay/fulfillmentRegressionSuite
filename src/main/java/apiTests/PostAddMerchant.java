
package apiTests;

import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postAddMerchantExchange.PostAddMerchantFixtureModel;
import postAddMerchantExchange.PostAddMerchantRequest;
import postAddMerchantExchange.PostAddMerchantResponse;
import retrofit2.Call;
import retrofit2.Response;
import utility.FixtureUtils;

/**
 * Created by Kiran SK on 4/5/2016.
 */

public class PostAddMerchant extends BaseApiTest {

	@Test(priority = 13)

	public void AddMerchantTest() throws Exception

	{

		PostAddMerchantFixtureModel respoAuthentication = (PostAddMerchantFixtureModel) FixtureUtils
				.getAsObject(PostAddMerchantFixtureModel.class, "src/main/java/resources/AddMerchant.json");

		PostAddMerchantRequest requestBody = respoAuthentication.getRequest();

		Call<PostAddMerchantResponse> postAuth = service.addMerchantResponse(requestBody);

		Response<PostAddMerchantResponse> response = postAuth.execute();

		PostAddMerchantResponse actualData = response.body();

		// Expected ShopperAppResponse from json reader
		PostAddMerchantResponse expectedData = respoAuthentication.getResponse();

		if (response.code() == 200)

		{

			ReflectionAssert.assertReflectionEquals(actualData, expectedData);

			// ReflectionAssert.assertReflectionEquals(actualData,
			// expectedData);

		}

		else {

			ReflectionAssert.assertReflectionEquals(actualData, expectedData);

		}

	}

}
