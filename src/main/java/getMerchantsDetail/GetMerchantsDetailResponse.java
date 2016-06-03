package getMerchantsDetail ;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GetMerchantsDetailResponse {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("merchants")
    @Expose
    private List<Merchant> merchants = new ArrayList<Merchant>();
    @SerializedName("success")
    @Expose
    private Boolean success;

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The merchants
     */
    public List<Merchant> getMerchants() {
        return merchants;
    }

    /**
     *
     * @param merchants
     * The merchants
     */
    public void setMerchants(List<Merchant> merchants) {
        this.merchants = merchants;
    }

    /**
     *
     * @return
     * The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     *
     * @param success
     * The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

}