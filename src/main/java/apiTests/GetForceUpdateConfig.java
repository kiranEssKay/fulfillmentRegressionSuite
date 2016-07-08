package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import getForceUpdateExchange.GetForceUpadateResponse;
import getForceUpdateExchange.GetForceUpdateFixtureModel;
import getShopperByIdExchange.ShopperByIdResponse;
import getShopperByIdExchange.ShopperByIdTestData;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utility.ApiEndPoints;
import utility.FixtureUtils;

/**
 * Created by Kiran SK on 4/5/2016.
 */
public class GetForceUpdateConfig {

	@Test(priority = 7)

	public void GetShoppersByIdTest() throws IOException {
		Reporter.log("Verify the response of GetShoppersById Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);
		Reporter.log("Base URL is " + ApiEndPoints.BaseURL, true);

		GetForceUpdateFixtureModel apiTestData = (GetForceUpdateFixtureModel) FixtureUtils.getAsObject(GetForceUpdateFixtureModel.class,
				"src/main/java/resources/getForceUpdate.json");
		Call<GetForceUpadateResponse> call = service.getForceUpdate();
		Response<GetForceUpadateResponse> response = call.execute();

		GetForceUpadateResponse expected1 = apiTestData.getResponse();
		GetForceUpadateResponse expected = response.body();

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
