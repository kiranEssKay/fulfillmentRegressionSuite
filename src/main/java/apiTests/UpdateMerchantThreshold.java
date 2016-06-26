package apiTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import postUpdateMerchantThreshold.UpdateMerchantThresholdResponse;
import postUpdateMerchantThreshold.UpdateMerchantThresholdTestData;
import postUpdateMerchantThreshold.UpdateMerchantThresholdTestData;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utils.Constant;
import utils.FixtureUtils;

import java.io.IOException;

/**
 * Created by Kiran SK on 4/4/2016.
 */
public class UpdateMerchantThreshold {

    @Test(priority = 1)

    public void UpdateMerchantThresholdTest() throws IOException {
        Reporter.log("Verify the response of UpdateMerchantThreshold Api.", true);
        RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
        Reporter.log("Base URL is " + Constant.BaseURL, true);

        UpdateMerchantThresholdTestData apiTestData = (UpdateMerchantThresholdTestData) FixtureUtils.getAsObject(UpdateMerchantThresholdTestData.class, "src/main/java/resources/updateMerchantThreshold.json");

        Call<UpdateMerchantThresholdResponse> call = service.postOrder(apiTestData.getRequest());
        Response<UpdateMerchantThresholdResponse> response = call.execute();


        UpdateMerchantThresholdResponse expected1 = apiTestData.getResponse();
        UpdateMerchantThresholdResponse expected = response.body();

        if(response.code()==200){



            ReflectionAssert.assertReflectionEquals(expected, expected1);
            Reporter.log("Expected and Actual response are same.  ", true);
            Reporter.log("Test Status of UpdateMerchantThreshold Api :  PASS  ", true);


        }
        else
        {
            Reporter.log("http response code is not 200. ", true);
            Reporter.log("Test Status of UpdateMerchantThreshold Api :  FAIL  ", true);
            ReflectionAssert.assertReflectionEquals(expected, expected1);
        }

    }

}
