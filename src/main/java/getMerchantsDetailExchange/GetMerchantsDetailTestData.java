package getMerchantsDetailExchange ;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GetMerchantsDetailTestData {

    @SerializedName("response")
    @Expose
    private GetMerchantsDetailResponse response;

    /**
     *
     * @return
     * The response
     */
    public GetMerchantsDetailResponse getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The response
     */
    public void setResponse(GetMerchantsDetailResponse response) {
        this.response = response;
    }

}