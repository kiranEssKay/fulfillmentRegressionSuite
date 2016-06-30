
package postOrderEnrouteExchange;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")

public class PostOrderEnrouteFixtureModel {

	@SerializedName("request")

	@Expose

	private PostEnrouteRequest request;

	@SerializedName("response")

	@Expose

	private PostOrderEnrouteResponse response;

	public PostEnrouteRequest getRequest() {

		return request;

	}

	public void setRequest(PostEnrouteRequest request) {

		this.request = request;

	}

	public PostOrderEnrouteResponse getResponse() {

		return response;

	}

	public void setResponse(PostOrderEnrouteResponse response) {

		this.response = response;

	}

}