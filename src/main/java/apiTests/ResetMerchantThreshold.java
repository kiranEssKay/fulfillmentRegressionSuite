package apiTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;
import postResetMerchantThreshold.ResetMerchantThresholdResponse;
import postResetMerchantThreshold.ResetMerchantThresholdTestData;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utils.Constant;
import utils.FixtureUtils;

import java.io.IOException;

/**
 * Created by Kiran SK on 4/4/2016.
 */
public class ResetMerchantThreshold {

	@Test(priority = 6)

	public void ResetMerchantThresholdTest() throws IOException {
		Reporter.log("Verify the response of ResetMerchantThreshold Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		ResetMerchantThresholdTestData apiTestData = (ResetMerchantThresholdTestData) FixtureUtils.getAsObject(
				ResetMerchantThresholdTestData.class, "src/main/java/resources/resetMerchantsThreshold.json");

		Call<ResetMerchantThresholdResponse> call = service.postOrder();
		Response<ResetMerchantThresholdResponse> response = call.execute();

		ResetMerchantThresholdResponse expected1 = apiTestData.getResponse();
		ResetMerchantThresholdResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of ResetMerchantThreshold Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of ResetMerchantThreshold Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
