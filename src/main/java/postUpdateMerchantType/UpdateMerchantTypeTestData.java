
package postUpdateMerchantType;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class UpdateMerchantTypeTestData {

    @SerializedName("request")
    @Expose
    private UpdateMerchantTypeRequest request;
    @SerializedName("response")
    @Expose
    private UpdateMerchantTypeResponse response;

    /**
     * 
     * @return
     *     The request
     */
    public UpdateMerchantTypeRequest getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    public void setRequest(UpdateMerchantTypeRequest request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The response
     */
    public UpdateMerchantTypeResponse getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(UpdateMerchantTypeResponse response) {
        this.response = response;
    }

}
