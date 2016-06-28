package apiTests;

import java.io.IOException;
import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postCrmAssignment.CrmAssignmentApiTestData;
import postCrmAssignment.CrmAssignmentResponse;
import postFeAssignment.FeAssignmentApiTestData;
import postFeAssignment.FeAssignmentResponse;
import postInsertOrder.InsertOrderApiTestData;
import postInsertOrder.InsertOrderResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utils.Constant;
import utils.FixtureUtils;

public class InsertOrder {

	Constant con = new Constant();
	public int ordid = con.orderID;

	// Insert Order API Test Script
	@Test(priority = 1)

	public void InsertOrderTest() throws IOException {
		Reporter.log("Verify the response of InsertOrder Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);
		// pos-master//src//main//resources//PostStockIn.json
		InsertOrderApiTestData apiTestData = (InsertOrderApiTestData) FixtureUtils
				.getAsObject(InsertOrderApiTestData.class, "src/main/java/resources/insertorder.json");

		// System.out.println(orderNo);
		Call<InsertOrderResponse> call = service.postOrder("Auto" + ordid, apiTestData.getRequest());

		retrofit2.Response<InsertOrderResponse> response = call.execute();

		InsertOrderResponse expected1 = apiTestData.getResponse();
		InsertOrderResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of insertOrder Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of insertOrder Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

	@Test(priority = 2)

	// Assign CRM Test Suite
	public void CrmAssignmentTest() throws IOException {
		Reporter.log("Verify the response of CrmAssignment Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		CrmAssignmentApiTestData apiTestData = (CrmAssignmentApiTestData) FixtureUtils
				.getAsObject(CrmAssignmentApiTestData.class, "src/main/java/resources/crmAssignment.json");

		Call<CrmAssignmentResponse> call = service.postOrder("Auto" + ordid, apiTestData.getRequest());
		Response<CrmAssignmentResponse> response = call.execute();

		CrmAssignmentResponse expected1 = apiTestData.getResponse();
		CrmAssignmentResponse expected = response.body();

		if (response.code() == 200) {

			expected1.setMessage(String.format(expected1.getMessage(), ordid));
			ReflectionAssert.assertReflectionEquals(expected, expected1);
			Reporter.log("Expected and Actual response are same.  ", true);
			Reporter.log("Test Status of CrmAssignment Api :  PASS  ", true);

		} else {
			Reporter.log("http response code is not 200. ", true);
			Reporter.log("Test Status of CrmAssignment Api :  FAIL  ", true);
			ReflectionAssert.assertReflectionEquals(expected, expected1);
		}

	}

	@Test(priority = 3)

	// Assign FE Test Suite
	public void FeAssignmentTest() throws IOException {
		Reporter.log("Verify the response of FeAssignment Api.", true);
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		Reporter.log("Base URL is " + Constant.BaseURL, true);

		FeAssignmentApiTestData apiTestData = (FeAssignmentApiTestData) FixtureUtils
				.getAsObject(FeAssignmentApiTestData.class, "src/main/java/resources/feAssignment.json");

		Call<FeAssignmentResponse> call = service.postOrder("Auto" + ordid, apiTestData.getRequest());
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
