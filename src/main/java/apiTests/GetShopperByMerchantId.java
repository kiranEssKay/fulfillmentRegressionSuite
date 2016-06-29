package apiTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import getShopperByIdExchange.ShopperByIdResponse;
import getShopperByIdExchange.ShopperByIdTestData;
import getShopperByMerchantIdExchange.ShopperByMerchantIdResponse;
import getShopperByMerchantIdExchange.ShopperByMerchantIdTestData;
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
public class GetShopperByMerchantId {

	@Test(priority = 8)

	public void GetShopperByMerchantIdTest() throws IOException {
		Reporter.log("Verify the response of GetShopperByMerchantId Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		ShopperByMerchantIdTestData apiTestData = (ShopperByMerchantIdTestData) FixtureUtils
				.getAsObject(ShopperByMerchantIdTestData.class, "src/main/java/resources/getShopperByMerchantId.json");
		Call<ShopperByMerchantIdResponse> call = service.GetShopperByMerchantId("1003");
		Response<ShopperByMerchantIdResponse> response = call.execute();

		ShopperByMerchantIdResponse expected1 = apiTestData.getResponse();
		ShopperByMerchantIdResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of ShopperByMerchantId Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of ShopperByMerchantId Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}
}
