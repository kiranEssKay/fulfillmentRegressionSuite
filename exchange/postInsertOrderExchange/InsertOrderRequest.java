
package postInsertOrderExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class InsertOrderRequest {

    @SerializedName("actionType")
    @Expose
    private String actionType;
    @SerializedName("data")
    @Expose
    private Data data;

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

    public InsertOrderRequest withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

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

    public InsertOrderRequest withData(Data data) {
        this.data = data;
        return this;
    }

}