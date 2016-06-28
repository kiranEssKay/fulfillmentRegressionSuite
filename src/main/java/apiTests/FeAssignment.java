
package apiTests;

import postFeAssignment.FeAssignmentApiTestData;
import postFeAssignment.FeAssignmentResponse;
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
 * Created by Kiran SK on 4/1/2016.
 */

public class FeAssignment {
	Constant con = new Constant();
	public int ordid = con.orderID;

	@Test(priority = 12)

	public void FeAssignmentTest() throws IOException {
		Reporter.log("Verify the response of FeAssignment Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		FeAssignmentApiTestData apiTestData = (FeAssignmentApiTestData) FixtureUtils
				.getAsObject(FeAssignmentApiTestData.class, "src/main/java/resources/feAssignment.json");

		Call<FeAssignmentResponse> call = service.postOrder("Saurabh" + ordid, apiTestData.getRequest());
		Response<FeAssignmentResponse> response = call.execute();

		FeAssignmentResponse expected1 = apiTestData.getResponse();
		FeAssignmentResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of FeAssignment Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of FeAssignment Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
