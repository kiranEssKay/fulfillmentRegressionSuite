package apiTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import getMerchantsDetailExchange.GetMerchantsDetailResponse;
import getMerchantsDetailExchange.GetMerchantsDetailTestData;
import getShopperByIdExchange.ShopperByIdResponse;
import getShopperByIdExchange.ShopperByIdTestData;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utils.Constant;
import utils.FixtureUtils;

import java.io.IOException;

/**
 * Created by Kiran SK on 4/5/2016.
 */
public class GetShoppersById {

	@Test(priority = 7)

	public void GetShoppersByIdTest() throws IOException {
		Reporter.log("Verify the response of GetShoppersById Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		ShopperByIdTestData apiTestData = (ShopperByIdTestData) FixtureUtils.getAsObject(ShopperByIdTestData.class,
				"src/main/java/resources/getShopperById.json");
		Call<ShopperByIdResponse> call = service.GetShopperById("4904445116678144");
		Response<ShopperByIdResponse> response = call.execute();

		ShopperByIdResponse expected1 = apiTestData.getResponse();
		ShopperByIdResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of ShopperById Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of ShopperById Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}
}
