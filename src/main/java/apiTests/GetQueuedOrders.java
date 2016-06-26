package apiTests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.unitils.reflectionassert.ReflectionAssert;
import postGetQueuedUrders.GetQueuedOrdersResponse;
import postGetQueuedUrders.GetQueuedOrdersTestData;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;
import utils.Constant;
import utils.FixtureUtils;

import java.io.IOException;

/**
 * Created by  Kiran SK on 4/4/2016.
 */
public class GetQueuedOrders {

    @Test
    (priority = 1)

    public void GetQueuedOrdersTest() throws IOException {
        Reporter.log("Verify the response of GetQueuedOrders Api.", true);
        RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
        Reporter.log("Base URL is " + Constant.BaseURL, true);

        GetQueuedOrdersTestData apiTestData = (GetQueuedOrdersTestData) FixtureUtils.getAsObject(GetQueuedOrdersTestData.class, "src/main/java/resources/getQueuedOrders.json");

        Call<GetQueuedOrdersResponse> call = service.GetQueuedOrders();
        Response<GetQueuedOrdersResponse> response = call.execute();

        GetQueuedOrdersResponse expected1 = apiTestData.getResponse();
        GetQueuedOrdersResponse expected = response.body();
        
        System.out.println(response.code());

        if(response.code()==200){

            ReflectionAssert.assertReflectionEquals(expected, expected1);
            Reporter.log("Expected and Actual response are same.  ", true);
            Reporter.log("Test Status of GetQueuedOrders Api :  PASS  ", true);


        }
        else
        {
            Reporter.log("http response code is not 200. ", true);
            Reporter.log("Test Status of GetQueuedOrders Api :  FAIL  ", true);
            ReflectionAssert.assertReflectionEquals(expected, expected1);
        }

    }

}
