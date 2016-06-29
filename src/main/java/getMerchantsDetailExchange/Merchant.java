package getMerchantsDetailExchange ;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Merchant {

    @SerializedName("merchantThresholdTime")
    @Expose
    private Object merchantThresholdTime;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     *
     * @return
     * The merchantThresholdTime
     */
    public Object getMerchantThresholdTime() {
        return merchantThresholdTime;
    }

    /**
     *
     * @param merchantThresholdTime
     * The merchantThresholdTime
     */
    public void setMerchantThresholdTime(Object merchantThresholdTime) {
        this.merchantThresholdTime = merchantThresholdTime;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

}