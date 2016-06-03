
package postUpdateMerchantType;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("cityId")
    @Expose
    private String cityId;
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
     *     The cityId
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 
     * @param cityId
     *     The cityId
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
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

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

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

}
