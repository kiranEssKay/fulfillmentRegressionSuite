
package apiTests;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import com.google.gson.reflect.TypeToken;

import postFeAssignmentExchange.FeAssignmentApiTestData;
import postFeAssignmentExchange.FeAssignmentResponse;
import retrofit2.Call;
import retrofit2.Response;
import utility.FixtureUtils;
import utility.InsertOrderUtil;

/**
 * Created by Kiran SK on 4/1/2016.
 */

public class PostFeAssignment extends BaseApiTest {

	// Assign FE Test Suite

	@Test
	public void FeAssignmentTest() throws IOException {
		InsertOrderUtil utils = new InsertOrderUtil();
		utils.InsertOrderTest();

		// FeAssignmentApiTestData apiTestData = (FeAssignmentApiTestData)
		// FixtureUtils
		// .getAsObject(FeAssignmentApiTestData.class,
		// "src/main/java/resources/feAssignment.json");

		ArrayList<FeAssignmentApiTestData> dataList;
		Type listType = new TypeToken<List<FeAssignmentApiTestData>>(){}.getType();
		dataList = (ArrayList<FeAssignmentApiTestData>) FixtureUtils.getAsList(FeAssignmentApiTestData.class,
				"src/main/java/resources/feAssignment.json",listType);

		for (FeAssignmentApiTestData apiTestData : dataList) {
			Call<FeAssignmentResponse> call = service.postOrder("Auto" + utils.ordid, apiTestData.getRequest());
			Response<FeAssignmentResponse> response = call.execute();

			FeAssignmentResponse expected1 = apiTestData.getResponse();
			FeAssignmentResponse expected = response.body();

			if (response.code() == 200) {

				expected1.setMessage(String.format(expected1.getMessage(), utils.ordid));
				ReflectionAssert.assertReflectionEquals(expected, expected1);

				Reporter.log("Test Status of FeAssignment Api :  PASS  ", true);

			} else {

				Reporter.log("Test Status of FeAssignment Api :  FAIL  ", true);
				ReflectionAssert.assertReflectionEquals(expected, expected1);
			}
		}
	}

}
