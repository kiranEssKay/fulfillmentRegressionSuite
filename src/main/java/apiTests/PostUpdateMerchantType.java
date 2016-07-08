package apiTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postUpdateMerchantTypeExchange.UpdateMerchantTypeResponse;
import postUpdateMerchantTypeExchange.UpdateMerchantTypeTestData;
import retrofit2.Call;
import retrofit2.Response;
import utility.FixtureUtils;

/**
 * Created by Kiran SK on 4/4/2016.
 */
public class PostUpdateMerchantType extends BaseApiTest {

	@Test(priority = 4)

	public void UpdateMerchantTypeTest() throws IOException {

		UpdateMerchantTypeTestData apiTestData = (UpdateMerchantTypeTestData) FixtureUtils
				.getAsObject(UpdateMerchantTypeTestData.class, "src/main/java/resources/updateMerchantType.json");

		Call<UpdateMerchantTypeResponse> call = service.UpdateMerchantType(apiTestData.getRequest());
		Response<UpdateMerchantTypeResponse> response = call.execute();

		UpdateMerchantTypeResponse expected1 = apiTestData.getResponse();
		UpdateMerchantTypeResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);

		} else {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
