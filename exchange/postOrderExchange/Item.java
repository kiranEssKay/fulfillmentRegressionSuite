
package postOrderExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("mrp")
    @Expose
    private Object mrp;
    @SerializedName("qty")
    @Expose
    private Integer qty;
    @SerializedName("mapping_id")
    @Expose
    private Integer mappingId;
    @SerializedName("freebee_id")
    @Expose
    private Object freebeeId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The product_id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The img
     */
    public String getImg() {
        return img;
    }

    /**
     * 
     * @param img
     *     The img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The mrp
     */
    public Object getMrp() {
        return mrp;
    }

    /**
     * 
     * @param mrp
     *     The mrp
     */
    public void setMrp(Object mrp) {
        this.mrp = mrp;
    }

    /**
     * 
     * @return
     *     The qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * 
     * @param qty
     *     The qty
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * 
     * @return
     *     The mappingId
     */
    public Integer getMappingId() {
        return mappingId;
    }

    /**
     * 
     * @param mappingId
     *     The mapping_id
     */
    public void setMappingId(Integer mappingId) {
        this.mappingId = mappingId;
    }

    /**
     * 
     * @return
     *     The freebeeId
     */
    public Object getFreebeeId() {
        return freebeeId;
    }

    /**
     * 
     * @param freebeeId
     *     The freebee_id
     */
    public void setFreebeeId(Object freebeeId) {
        this.freebeeId = freebeeId;
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
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
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

}
