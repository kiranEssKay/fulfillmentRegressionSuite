package postFeAssignment;



import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;



@Generated("org.jsonschema2pojo")

public class Data {



    @SerializedName("fe")

    @Expose

    private Fe fe;



    /**

     *

     * @return

     * The fe

     */

    public Fe getFe() {

        return fe;

    }



    /**

     *

     * @param fe

     * The fe

     */

    public void setFe(Fe fe) {

        this.fe = fe;

    }



}