package apiTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;
import postUpdateMerchantType.UpdateMerchantTypeResponse;
import postUpdateMerchantType.UpdateMerchantTypeTestData;
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
public class UpdateMerchantType {

    @Test(priority = 1)

    public void UpdateMerchantTypeTest() throws IOException {
        Reporter.log("Verify the response of UpdateMerchantType Api.", true);
        RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
        Reporter.log("Base URL is " + Constant.BaseURL, true);

        UpdateMerchantTypeTestData apiTestData = (UpdateMerchantTypeTestData) FixtureUtils.getAsObject(UpdateMerchantTypeTestData.class, "src/main/java/resources/updateMerchantType.json");

        Call<UpdateMerchantTypeResponse> call = service.UpdateMerchantType(apiTestData.getRequest());
        Response<UpdateMerchantTypeResponse> response = call.execute();


        UpdateMerchantTypeResponse expected1 = apiTestData.getResponse();
        UpdateMerchantTypeResponse expected = response.body();

        if(response.code()==200){



            ReflectionAssert.assertReflectionEquals(expected, expected1);
            Reporter.log("Expected and Actual response are same.  ", true);
            Reporter.log("Test Status of UpdateMerchantType Api :  PASS  ", true);


        }
        else
        {
            Reporter.log("http response code is not 200. ", true);
            Reporter.log("Test Status of UpdateMerchantType Api :  FAIL  ", true);
            ReflectionAssert.assertReflectionEquals(expected, expected1);
        }

    }

}
