
package postUpdateMerchantThresholdExchange;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class UpdateMerchantThresholdResponse {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("merchants")
    @Expose
    private List<String> merchants = new ArrayList<String>();
    @SerializedName("success")
    @Expose
    private Boolean success;

    /**
     * 
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The merchants
     */
    public List<String> getMerchants() {
        return merchants;
    }

    /**
     * 
     * @param merchants
     *     The merchants
     */
    public void setMerchants(List<String> merchants) {
        this.merchants = merchants;
    }

    /**
     * 
     * @return
     *     The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * 
     * @param success
     *     The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
