
package postGetQueuedUrders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class GetQueuedOrdersTestData {

    @SerializedName("response")
    @Expose
    private GetQueuedOrdersResponse response;

    /**
     * 
     * @return
     *     The response
     */
    public GetQueuedOrdersResponse getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(GetQueuedOrdersResponse response) {
        this.response = response;
    }

}
