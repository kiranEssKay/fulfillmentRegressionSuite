package postCancelOrderExchange;




import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kiransk on 29/03/16.
 */
public class PostCancelOrderFixtureModel {
    @SerializedName("request")
    @Expose
    private PostCanceOrderRequest request;
    @SerializedName("response")
    @Expose
    private PostCanceOrderResponse response;

    /**
     *
     * @return
     * The request
     */
    public PostCanceOrderRequest getRequest() {
        return request;
    }

    /**
     *
     * @param request
     * The request
     */
    public void setRequest(PostCanceOrderRequest request) {
        this.request = request;
    }

    /**
     *
     * @return
     * The response
     */
    public PostCanceOrderResponse getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The response
     */
    public void setResponse(PostCanceOrderResponse response) {
        this.response = response;
    }
}
