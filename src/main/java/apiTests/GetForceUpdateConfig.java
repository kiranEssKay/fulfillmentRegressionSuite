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
public class GetForceUpdateConfig  extends BaseApiTest{

	@Test(priority = 7)

	public void GetShoppersByIdTest() throws IOException {
		
	

		GetForceUpdateFixtureModel apiTestData = (GetForceUpdateFixtureModel) FixtureUtils.getAsObject(GetForceUpdateFixtureModel.class,
				"testdata/resources/getForceUpdate.json");
		Call<GetForceUpadateResponse> call = service.getForceUpdate();
		Response<GetForceUpadateResponse> response = call.execute();

		GetForceUpadateResponse expected1 = apiTestData.getResponse();
		GetForceUpadateResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
		

		} else {
			
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}
}
