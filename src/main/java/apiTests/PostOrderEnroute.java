package apiTests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postOrderEnrouteExchange.PostOrderEnrouteFixtureModel;
import postOrderEnrouteExchange.PostOrderEnrouteResponse;
import retrofit2.Call;
import retrofit2.Response;
import utility.FixtureUtils;
import utility.InsertOrderUtil;

public class PostOrderEnroute extends BaseApiTest

{

	@Test
	public void CancelOrderTest()

			throws IOException

	{
		InsertOrderUtil utils = new InsertOrderUtil();
		utils.InsertOrderTest();

		PostOrderEnrouteFixtureModel apiTestData = (PostOrderEnrouteFixtureModel) FixtureUtils
				.getAsObject(PostOrderEnrouteFixtureModel.class, "testdata/resources/canceOrder.json");

		Call<PostOrderEnrouteResponse> call = service.orderEnroute("Auto" + utils.ordid, apiTestData.getRequest());
		Response<PostOrderEnrouteResponse> response = call.execute();

		PostOrderEnrouteResponse expected1 = apiTestData.getResponse();
		PostOrderEnrouteResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), utils.ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);

		} else {

			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
