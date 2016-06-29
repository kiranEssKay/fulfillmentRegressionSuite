
package postResetMerchantThresholdExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ResetMerchantThresholdTestData {

    @SerializedName("response")
    @Expose
    private ResetMerchantThresholdResponse response;

    /**
     * 
     * @return
     *     The response
     */
    public ResetMerchantThresholdResponse getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(ResetMerchantThresholdResponse response) {
        this.response = response;
    }

}
