package apiTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postResetMerchantThresholdExchange.ResetMerchantThresholdResponse;
import postResetMerchantThresholdExchange.ResetMerchantThresholdTestData;
import retrofit2.Call;
import retrofit2.Response;
import utility.FixtureUtils;

/**
 * Created by Kiran SK on 4/4/2016.
 */
public class PostResetMerchantThreshold extends BaseApiTest {

	@Test(priority = 6)

	public void ResetMerchantThresholdTest() throws IOException {
		

		ResetMerchantThresholdTestData apiTestData = (ResetMerchantThresholdTestData) FixtureUtils.getAsObject(
				ResetMerchantThresholdTestData.class, "testdata/resources/resetMerchantsThreshold.json");

		Call<ResetMerchantThresholdResponse> call = service.postOrder();
		Response<ResetMerchantThresholdResponse> response = call.execute();

		ResetMerchantThresholdResponse expected1 = apiTestData.getResponse();
		ResetMerchantThresholdResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
			

		} else {
			
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
