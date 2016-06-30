
package postShopperMerchantExchange;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")

public class PostShopperMerchantFixtureModel {

	@SerializedName("request")

	@Expose

	private PostShopperMerchantRequest request;

	@SerializedName("response")

	@Expose

	private PostShopperMerchantResponse response;

	public PostShopperMerchantRequest getRequest() {

		return request;

	}

	public void setRequest(PostShopperMerchantRequest request) {

		this.request = request;

	}

	public PostShopperMerchantResponse getResponse() {

		return response;

	}

	public void setResponse(PostShopperMerchantResponse response) {

		this.response = response;

	}

}