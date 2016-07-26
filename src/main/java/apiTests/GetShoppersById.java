package apiTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import getShopperByIdExchange.ShopperByIdResponse;
import getShopperByIdExchange.ShopperByIdTestData;
import retrofit2.Call;
import retrofit2.Response;
import utility.FixtureUtils;

/**
 * Created by Kiran SK on 4/5/2016.
 */
public class GetShoppersById extends BaseApiTest {

	@Test(priority = 7)

	public void GetForceUpdateConfig() throws IOException {

		ShopperByIdTestData apiTestData = (ShopperByIdTestData) FixtureUtils.getAsObject(ShopperByIdTestData.class,
				"testdata/resources/getShopperById.json");
		Call<ShopperByIdResponse> call = service.GetShopperById("4904445116678144");
		Response<ShopperByIdResponse> response = call.execute();

		ShopperByIdResponse expected1 = apiTestData.getResponse();
		ShopperByIdResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);

		} else {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}
}
