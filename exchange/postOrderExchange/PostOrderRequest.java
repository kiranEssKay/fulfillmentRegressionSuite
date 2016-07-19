
package postOrderExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PostOrderRequest {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("actionType")
    @Expose
    private String actionType;

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The actionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * 
     * @param actionType
     *     The actionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

}
