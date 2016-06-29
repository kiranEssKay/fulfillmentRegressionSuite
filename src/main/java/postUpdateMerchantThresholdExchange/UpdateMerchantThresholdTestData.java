
package postUpdateMerchantThresholdExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class UpdateMerchantThresholdTestData {

    @SerializedName("request")
    @Expose
    private UpdateMerchantThresholdRequest request;
    @SerializedName("response")
    @Expose
    private UpdateMerchantThresholdResponse response;

    /**
     *
     * @return
     *     The request
     */
    public UpdateMerchantThresholdRequest getRequest() {
        return request;
    }

    /**
     *
     * @param request
     *     The request
     */
    public void setRequest(UpdateMerchantThresholdRequest request) {
        this.request = request;
    }

    /**
     *
     * @return
     *     The response
     */
    public UpdateMerchantThresholdResponse getResponse() {
        return response;
    }

    /**
     *
     * @param response
     *     The response
     */
    public void setResponse(UpdateMerchantThresholdResponse response) {
        this.response = response;
    }

}
