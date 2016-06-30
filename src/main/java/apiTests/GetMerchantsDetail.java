package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import getMerchantsDetailExchange.GetMerchantsDetailResponse;
import getMerchantsDetailExchange.GetMerchantsDetailTestData;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utils.Constant;
import utils.FixtureUtils;

/**
 * Created by Kiran SK on 4/4/2016.
 */
public class GetMerchantsDetail {

	@Test(priority = 11)

	public void GetMerchantsDetailTest() throws IOException {
		Reporter.log("Verify the response of GetMerchantsDetail Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		GetMerchantsDetailTestData apiTestData = (GetMerchantsDetailTestData) FixtureUtils
				.getAsObject(GetMerchantsDetailTestData.class, "src/main/java/resources/getMerchantsDetail.json");

		Call<GetMerchantsDetailResponse> call = service.GetMerchantsDetail(1003);
		Response<GetMerchantsDetailResponse> response = call.execute();

		GetMerchantsDetailResponse expected1 = apiTestData.getResponse();
		GetMerchantsDetailResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of GetMerchantsDetail Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of GetMerchantsDetail Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
