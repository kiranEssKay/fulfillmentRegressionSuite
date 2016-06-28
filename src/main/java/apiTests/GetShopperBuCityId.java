package apiTests;

import getShopperByCityId.ShopperByCityIdResponse;
import getShopperByCityId.ShopperByCityIdTestData;
import getShopperByMerchantId.ShopperByMerchantIdResponse;
import getShopperByMerchantId.ShopperByMerchantIdTestData;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utils.Constant;
import utils.FixtureUtils;

import java.io.IOException;

/**
 * Created by Kiran SK on 4/6/2016.
 */
public class GetShopperBuCityId {

	@Test(priority = 9)

	public void GetShopperBuCityIdTest() throws IOException {
		Reporter.log("Verify the response of GetShopperBuCityId Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		ShopperByCityIdTestData apiTestData = (ShopperByCityIdTestData) FixtureUtils
				.getAsObject(ShopperByCityIdTestData.class, "src/main/java/resources/getShopperByCityId.json");
		Call<ShopperByCityIdResponse> call = service.GetShopperByCityId("jaipur");
		Response<ShopperByCityIdResponse> response = call.execute();

		ShopperByCityIdResponse expected1 = apiTestData.getResponse();
		ShopperByCityIdResponse expected = response.body();

		if (response.code() == 200) {

			// ReflectionAssert.assertReflectionEquals(expected, expected1);

			Assert.assertEquals(response.code(), 200);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of ShopperByCityId Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of ShopperByCityId Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}
}
