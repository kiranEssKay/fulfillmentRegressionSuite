package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import getMerchantsDetailExchange.GetMerchantsDetailResponse;
import getMerchantsDetailExchange.GetMerchantsDetailTestData;
import retrofit2.Call;
import retrofit2.Response;
import utility.FixtureUtils;

/**
 * Created by Kiran SK on 4/4/2016.
 */
public class GetMerchantsDetail extends BaseApiTest {

	@Test(priority = 11)

	public void GetMerchantsDetailTest() throws IOException {
		

		GetMerchantsDetailTestData apiTestData = (GetMerchantsDetailTestData) FixtureUtils
				.getAsObject(GetMerchantsDetailTestData.class, "src/main/java/resources/getMerchantsDetail.json");

		Call<GetMerchantsDetailResponse> call = service.GetMerchantsDetail(1003);
		Response<GetMerchantsDetailResponse> response = call.execute();

		GetMerchantsDetailResponse expected1 = apiTestData.getResponse();
		GetMerchantsDetailResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
			
		

		} else {
		
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
