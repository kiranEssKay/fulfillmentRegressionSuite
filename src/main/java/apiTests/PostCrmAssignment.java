
package apiTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postCrmAssignmentExchange.CrmAssignmentApiTestData;
import postCrmAssignmentExchange.CrmAssignmentResponse;
import postInsertOrderExchange.InsertOrderApiTestData;
import postInsertOrderExchange.InsertOrderResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utils.Constant;
import utils.FixtureUtils;
import utils.InsertOrderUtil;
import utils.Utilator;

import java.io.IOException;

/**
 * Created by Kiran SK on 4/5/2016.
 */

public class PostCrmAssignment {

	@Test(priority = 13)

	// Insert Order
	public void CrmAssignmentTest() throws IOException {

		InsertOrderUtil utils = new InsertOrderUtil();
		utils.InsertOrderTest();
		Reporter.log("Verify the response of CrmAssignment Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		CrmAssignmentApiTestData apiTestData = (CrmAssignmentApiTestData) FixtureUtils
				.getAsObject(CrmAssignmentApiTestData.class, "src/main/java/resources/crmAssignment.json");

		Call<CrmAssignmentResponse> call = service.postOrder("Auto" + utils.ordid, apiTestData.getRequest());
		Response<CrmAssignmentResponse> response = call.execute();

		CrmAssignmentResponse expected1 = apiTestData.getResponse();
		CrmAssignmentResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), utils.ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of CrmAssignment Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of CrmAssignment Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

}
