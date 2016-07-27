package utility;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import postOrderExchange.PostOrderApiTestData;
import postOrderExchange.PostOrderResponse;
import retrofit.RetrofitService;
import retrofit.ServiceGenerator;
import retrofit2.Call;

public class InsertOrderUtil {

	ApiEndPoints con = new ApiEndPoints();
	public int ordid = con.orderID;

	// Insert Order API Test Script

	public void InsertOrderTest() throws IOException {

		
		RetrofitService service = ServiceGenerator.createService(RetrofitService.class, ApiEndPoints.BaseURL);

		// pos-master//src//main//resources//PostStockIn.json
		PostOrderApiTestData apiTestData = (PostOrderApiTestData) FixtureUtils
				.getAsObject(PostOrderApiTestData.class, "testdata/resources/marketPlaceOrder.json");

		// System.out.println(orderNo);
		
		apiTestData.getRequest().getData().setScheduledTime(currentDate());
		Call<PostOrderResponse> call = service.postOrder("Auto" + ordid, apiTestData.getRequest());

		retrofit2.Response<PostOrderResponse> response = call.execute();

	}

	public String currentDate() {

		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
		isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = new Date();
		String dateToday = isoFormat.format(date);

		System.out.println(dateToday);
		return dateToday;
	}
}
