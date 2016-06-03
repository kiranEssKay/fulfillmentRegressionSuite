package postFeAssignment;



import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;



@Generated("org.jsonschema2pojo")

public class Fe {



    @SerializedName("name")

    @Expose

    private String name;

    @SerializedName("mobile")

    @Expose

    private String mobile;



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

     * The mobile

     */

    public String getMobile() {

        return mobile;

    }



    /**

     *

     * @param mobile

     * The mobile

     */

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }



}