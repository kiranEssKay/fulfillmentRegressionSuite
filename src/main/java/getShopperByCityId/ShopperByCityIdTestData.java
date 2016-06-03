
package getShopperByCityId;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ShopperByCityIdTestData {

    @SerializedName("response")
    @Expose
    private ShopperByCityIdResponse response;

    /**
     * 
     * @return
     *     The response
     */
    public ShopperByCityIdResponse getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(ShopperByCityIdResponse response) {
        this.response = response;
    }

}
