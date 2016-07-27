package postOrderExchange;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;




public class PostOrderApiTestData {

	@SerializedName("request")
	@Expose
	private PostOrderRequest request;
	@SerializedName("response")
	@Expose
	private PostOrderResponse response;

	/**
	 * 
	 * @return The request
	 */
	public PostOrderRequest getRequest() {
		return request;
	}

	/**
	 * 
	 * @param request
	 *            The request
	 */
	public void setRequest(PostOrderRequest request) {
		this.request = request;
	}

	/**
	 * 
	 * @return The response
	 */
	public PostOrderResponse getResponse() {
		return response;
	}

	/**
	 * 
	 * @param response
	 *            The response
	 */
	public void setResponse(PostOrderResponse response) {
		this.response = response;
	}

}