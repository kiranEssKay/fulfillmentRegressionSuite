package postAddMerchantExchange;

/**
 * Created by kiransk on 28/06/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("cityId")
    @Expose
    private String cityId;
    @SerializedName("merchantThresholdTime")
    @Expose
    private Integer merchantThresholdTime;
    @SerializedName("merchantType")
    @Expose
    private Integer merchantType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     *
     * @return
     * The cityId
     */
    public String getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The cityId
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The merchantThresholdTime
     */
    public Integer getMerchantThresholdTime() {
        return merchantThresholdTime;
    }

    /**
     *
     * @param merchantThresholdTime
     * The merchantThresholdTime
     */
    public void setMerchantThresholdTime(Integer merchantThresholdTime) {
        this.merchantThresholdTime = merchantThresholdTime;
    }

    /**
     *
     * @return
     * The merchantType
     */
    public Integer getMerchantType() {
        return merchantType;
    }

    /**
     *
     * @param merchantType
     * The merchantType
     */
    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
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