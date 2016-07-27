
package postOrderExchange;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("customerName")
    @Expose
    private String customerName;
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("scheduledTime")
    @Expose
    private String scheduledTime;
    @SerializedName("ancestorOrderId")
    @Expose
    private Object ancestorOrderId;
    @SerializedName("originalMerchantId")
    @Expose
    private Integer originalMerchantId;
    @SerializedName("stationId")
    @Expose
    private Integer stationId;
    @SerializedName("fe")
    @Expose
    private Object fe;
    @SerializedName("deliverySlotStart")
    @Expose
    private String deliverySlotStart;
    @SerializedName("crm")
    @Expose
    private Crm crm;
    @SerializedName("deliverySlotEnd")
    @Expose
    private String deliverySlotEnd;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("addr")
    @Expose
    private Addr addr;

    /**
     * 
     * @return
     *     The customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 
     * @param customerName
     *     The customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

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

    /**
     * 
     * @return
     *     The ancestorOrderId
     */
    public Object getAncestorOrderId() {
        return ancestorOrderId;
    }

    /**
     * 
     * @param ancestorOrderId
     *     The ancestorOrderId
     */
    public void setAncestorOrderId(Object ancestorOrderId) {
        this.ancestorOrderId = ancestorOrderId;
    }

    /**
     * 
     * @return
     *     The originalMerchantId
     */
    public Integer getOriginalMerchantId() {
        return originalMerchantId;
    }

    /**
     * 
     * @param originalMerchantId
     *     The originalMerchantId
     */
    public void setOriginalMerchantId(Integer originalMerchantId) {
        this.originalMerchantId = originalMerchantId;
    }

    /**
     * 
     * @return
     *     The stationId
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 
     * @param stationId
     *     The stationId
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * 
     * @return
     *     The fe
     */
    public Object getFe() {
        return fe;
    }

    /**
     * 
     * @param fe
     *     The fe
     */
    public void setFe(Object fe) {
        this.fe = fe;
    }

    /**
     * 
     * @return
     *     The deliverySlotStart
     */
    public String getDeliverySlotStart() {
        return deliverySlotStart;
    }

    /**
     * 
     * @param deliverySlotStart
     *     The deliverySlotStart
     */
    public void setDeliverySlotStart(String deliverySlotStart) {
        this.deliverySlotStart = deliverySlotStart;
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

    /**
     * 
     * @return
     *     The deliverySlotEnd
     */
    public String getDeliverySlotEnd() {
        return deliverySlotEnd;
    }

    /**
     * 
     * @param deliverySlotEnd
     *     The deliverySlotEnd
     */
    public void setDeliverySlotEnd(String deliverySlotEnd) {
        this.deliverySlotEnd = deliverySlotEnd;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The addr
     */
    public Addr getAddr() {
        return addr;
    }

    /**
     * 
     * @param addr
     *     The addr
     */
    public void setAddr(Addr addr) {
        this.addr = addr;
    }

}
