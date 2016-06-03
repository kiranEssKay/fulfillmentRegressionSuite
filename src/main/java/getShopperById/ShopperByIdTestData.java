
package getShopperById;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ShopperByIdTestData {

    @SerializedName("response")
    @Expose
    private ShopperByIdResponse response;

    /**
     * 
     * @return
     *     The response
     */
    public ShopperByIdResponse getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(ShopperByIdResponse response) {
        this.response = response;
    }

}
