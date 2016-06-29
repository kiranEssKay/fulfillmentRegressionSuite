
package postUpdateMerchantTypeExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class UpdateMerchantTypeRequest {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("merchantType")
    @Expose
    private Integer merchantType;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The merchantType
     */
    public Integer getMerchantType() {
        return merchantType;
    }

    /**
     * 
     * @param merchantType
     *     The merchantType
     */
    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
    }

}
