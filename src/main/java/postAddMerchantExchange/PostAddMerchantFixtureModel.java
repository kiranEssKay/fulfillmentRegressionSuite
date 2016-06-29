package postAddMerchantExchange;




import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kiransk on 29/03/16.
 */
public class PostAddMerchantFixtureModel {
    @SerializedName("request")
    @Expose
    private PostAddMerchantRequest request;
    @SerializedName("response")
    @Expose
    private PostAddMerchantResponse response;

    /**
     *
     * @return
     * The request
     */
    public PostAddMerchantRequest getRequest() {
        return request;
    }

    /**
     *
     * @param request
     * The request
     */
    public void setRequest(PostAddMerchantRequest request) {
        this.request = request;
    }

    /**
     *
     * @return
     * The response
     */
    public PostAddMerchantResponse getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The response
     */
    public void setResponse(PostAddMerchantResponse response) {
        this.response = response;
    }
}
