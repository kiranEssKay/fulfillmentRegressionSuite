
package getForceUpdateExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GetForceUpdateFixtureModel {

    @SerializedName("response")
    @Expose
    private GetForceUpadateResponse response;

    /**
     * 
     * @return
     *     The response
     */
    public GetForceUpadateResponse getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(GetForceUpadateResponse response) {
        this.response = response;
    }

}
