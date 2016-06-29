package utils;

import java.io.IOException;

import org.testng.Reporter;
import org.unitils.reflectionassert.ReflectionAssert;

import postInsertOrderExchange.InsertOrderApiTestData;
import postInsertOrderExchange.InsertOrderResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;

public class InsertOrderUtil {

	Constant con = new Constant();
	public int ordid = con.orderID;

	// Insert Order API Test Script


	public void InsertOrderTest() throws IOException {
		
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, Constant.BaseURL);
		
		
		
		// pos-master//src//main//resources//PostStockIn.json
		InsertOrderApiTestData apiTestData = (InsertOrderApiTestData) FixtureUtils
				.getAsObject(InsertOrderApiTestData.class, "src/main/java/resources/insertorder.json");

		// System.out.println(orderNo);
		Call<InsertOrderResponse> call = service.postOrder("Auto" + ordid, apiTestData.getRequest());

		retrofit2.Response<InsertOrderResponse> response = call.execute();

		

		
		

		}}

	