package apiTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postBackupMerchantExchange.PostBackupMerchantFixtureModel;
import postBackupMerchantExchange.PostBackupResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utility.ApiEndPoints;
import utility.FixtureUtils;

public class PostMerchantBackupMapping extends BaseApiTest

{

	@Test(priority = 14)
	public void CancelOrderTest()

			throws IOException

	{

		PostBackupMerchantFixtureModel apiTestData = (PostBackupMerchantFixtureModel) FixtureUtils
				.getAsObject(PostBackupMerchantFixtureModel.class, "src/main/java/resources/backupMerchant.json");

		Call<PostBackupResponse> call = service.merchantBackup(apiTestData.getRequest());
		Response<PostBackupResponse> response = call.execute();

		PostBackupResponse expected1 = apiTestData.getResponse();
		PostBackupResponse expected = response.body();

		if (response.code() == 200) {

			ReflectionAssert.assertReflectionEquals(expected, expected1);

			Reporter.log("Test Status of CrmAssignment Api :  PASS  ", true);

		} else {

			Reporter.log("Test Status of CrmAssignment Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
