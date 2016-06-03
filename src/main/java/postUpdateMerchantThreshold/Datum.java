
package postUpdateMerchantThreshold;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("threshold_time")
    @Expose
    private Integer thresholdTime;

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
     *     The thresholdTime
     */
    public Integer getThresholdTime() {
        return thresholdTime;
    }

    /**
     * 
     * @param thresholdTime
     *     The threshold_time
     */
    public void setThresholdTime(Integer thresholdTime) {
        this.thresholdTime = thresholdTime;
    }

}
