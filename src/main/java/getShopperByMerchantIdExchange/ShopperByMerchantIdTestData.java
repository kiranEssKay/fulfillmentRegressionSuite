
package getShopperByMerchantIdExchange;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ShopperByMerchantIdTestData {

    @SerializedName("response")
    @Expose
    private ShopperByMerchantIdResponse response;

    /**
     * 
     * @return
     *     The response
     */
    public ShopperByMerchantIdResponse getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(ShopperByMerchantIdResponse response) {
        this.response = response;
    }

}
