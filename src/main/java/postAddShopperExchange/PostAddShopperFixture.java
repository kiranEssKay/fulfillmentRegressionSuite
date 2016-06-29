package postAddShopperExchange;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostAddShopperFixture {

	@SerializedName("request")
	@Expose
	private PostShopperRequest request;
	@SerializedName("response")
	@Expose
	private PostShopperResponse response;

	/**
	 *
	 * @return The request
	 */
	public PostShopperRequest getRequest() {
		return request;
	}

	/**
	 *
	 * @param request
	 *            The request
	 */
	public void setRequest(PostShopperRequest request) {
		this.request = request;
	}

	/**
	 *
	 * @return The response
	 */
	public PostShopperResponse getResponse() {
		return response;
	}

	/**
	 *
	 * @param response
	 *            The response
	 */
	public void setResponse(PostShopperResponse response) {
		this.response = response;
	}

}
