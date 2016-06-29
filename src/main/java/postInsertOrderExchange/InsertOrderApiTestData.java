package postInsertOrderExchange;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;




public class InsertOrderApiTestData {

	@SerializedName("request")
	@Expose
	private InsertOrderRequest request;
	@SerializedName("response")
	@Expose
	private InsertOrderResponse response;

	/**
	 * 
	 * @return The request
	 */
	public InsertOrderRequest getRequest() {
		return request;
	}

	/**
	 * 
	 * @param request
	 *            The request
	 */
	public void setRequest(InsertOrderRequest request) {
		this.request = request;
	}

	/**
	 * 
	 * @return The response
	 */
	public InsertOrderResponse getResponse() {
		return response;
	}

	/**
	 * 
	 * @param response
	 *            The response
	 */
	public void setResponse(InsertOrderResponse response) {
		this.response = response;
	}

}