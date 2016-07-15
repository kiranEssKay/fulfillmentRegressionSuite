package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postUpdateMerchantThresholdExchange.UpdateMerchantThresholdResponse;
import postUpdateMerchantThresholdExchange.UpdateMerchantThresholdTestData;
import retrofit2.Call;
import retrofit2.Response;
import utility.FixtureUtils;

/**
 * Created by Kiran SK on 4/4/2016.
 */
public class PostUpdateMerchantThreshold extends BaseApiTest {

	@Test(priority = 5)

	public void UpdateMerchantThresholdTest() throws IOException {

		UpdateMerchantThresholdTestData apiTestData = (UpdateMerchantThresholdTestData) FixtureUtils.getAsObject(
				UpdateMerchantThresholdTestData.class, "testdata/resources/updateMerchantThreshold.json");

		Call<UpdateMerchantThresholdResponse> call = service.postOrder(apiTestData.getRequest());
		Response<UpdateMerchantThresholdResponse> response = call.execute();

		UpdateMerchantThresholdResponse expected1 = apiTestData.getResponse();
		UpdateMerchantThresholdResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);

		} else {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
