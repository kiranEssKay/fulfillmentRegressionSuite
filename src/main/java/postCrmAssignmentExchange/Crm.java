
package postCrmAssignmentExchange;



        import javax.annotation.Generated;

        import com.google.gson.annotations.Expose;

        import com.google.gson.annotations.SerializedName;



@Generated("org.jsonschema2pojo")

public class Crm {



    @SerializedName("name")

    @Expose

    private String name;

    @SerializedName("phone")

    @Expose

    private String phone;



    /**

     *

     * @return

     * The name

     */

    public String getName() {

        return name;

    }



    /**

     *

     * @param name

     * The name

     */

    public void setName(String name) {

        this.name = name;

    }



    /**

     *

     * @return

     * The phone

     */

    public String getPhone() {

        return phone;

    }



    /**

     *

     * @param phone

     * The phone

     */

    public void setPhone(String phone) {

        this.phone = phone;

    }



}