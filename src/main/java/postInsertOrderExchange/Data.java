
package postInsertOrderExchange;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("scheduledTime")
    @Expose
    private String scheduledTime;
    @SerializedName("originalMerchantId")
    @Expose
    private String originalMerchantId;
    @SerializedName("stationId")
    @Expose
    private Long stationId;
    @SerializedName("fe")
    @Expose
    private Fe fe;
    @SerializedName("crm")
    @Expose
    private Crm crm;

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Data withItems(List<Item> items) {
        this.items = items;
        return this;
    }

    /**
     * 
     * @return
     *     The scheduledTime
     */
    public String getScheduledTime() {
        return scheduledTime;
    }

    /**
     * 
     * @param scheduledTime
     *     The scheduledTime
     */
    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Data withScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }

    /**
     * 
     * @return
     *     The originalMerchantId
     */
    public String getOriginalMerchantId() {
        return originalMerchantId;
    }

    /**
     * 
     * @param originalMerchantId
     *     The originalMerchantId
     */
    public void setOriginalMerchantId(String originalMerchantId) {
        this.originalMerchantId = originalMerchantId;
    }

    public Data withOriginalMerchantId(String originalMerchantId) {
        this.originalMerchantId = originalMerchantId;
        return this;
    }

    /**
     * 
     * @return
     *     The stationId
     */
    public Long getStationId() {
        return stationId;
    }

    /**
     * 
     * @param stationId
     *     The stationId
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public Data withStationId(Long stationId) {
        this.stationId = stationId;
        return this;
    }

    /**
     * 
     * @return
     *     The fe
     */
    public Fe getFe() {
        return fe;
    }

    /**
     * 
     * @param fe
     *     The fe
     */
    public void setFe(Fe fe) {
        this.fe = fe;
    }

    public Data withFe(Fe fe) {
        this.fe = fe;
        return this;
    }

    /**
     * 
     * @return
     *     The crm
     */
    public Crm getCrm() {
        return crm;
    }

    /**
     * 
     * @param crm
     *     The crm
     */
    public void setCrm(Crm crm) {
        this.crm = crm;
    }

    public Data withCrm(Crm crm) {
        this.crm = crm;
        return this;
    }

}
