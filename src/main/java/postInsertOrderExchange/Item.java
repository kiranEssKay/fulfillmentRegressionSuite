
package postInsertOrderExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("img")
    @Expose
    private Object img;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("qty")
    @Expose
    private Long qty;
    @SerializedName("unit")
    @Expose
    private String unit;

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

    public Item withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The img
     */
    public Object getImg() {
        return img;
    }

    /**
     * 
     * @param img
     *     The img
     */
    public void setImg(Object img) {
        this.img = img;
    }

    public Item withImg(Object img) {
        this.img = img;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public Item withId(Long id) {
        this.id = id;
        return this;
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

    public Item withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The qty
     */
    public Long getQty() {
        return qty;
    }

    /**
     * 
     * @param qty
     *     The qty
     */
    public void setQty(Long qty) {
        this.qty = qty;
    }

    public Item withQty(Long qty) {
        this.qty = qty;
        return this;
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

    public Item withUnit(String unit) {
        this.unit = unit;
        return this;
    }

}
