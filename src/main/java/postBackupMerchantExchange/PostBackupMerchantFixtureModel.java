
package postBackupMerchantExchange;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")

public class PostBackupMerchantFixtureModel {

	@SerializedName("request")

	@Expose

	private PostBackupRequest request;

	@SerializedName("response")

	@Expose

	private PostBackupResponse response;

	public PostBackupRequest getRequest() {

		return request;

	}

	public void setRequest(PostBackupRequest request) {

		this.request = request;

	}

	public PostBackupResponse getResponse() {

		return response;

	}

	public void setResponse(PostBackupResponse response) {

		this.response = response;

	}

}