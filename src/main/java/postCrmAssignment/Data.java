package postCrmAssignment;



import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;



@Generated("org.jsonschema2pojo")

public class Data {



    @SerializedName("crm")

    @Expose

    private Crm crm;



    /**

     *

     * @return

     * The crm

     */

    public Crm getCrm() {

        return crm;

    }



    /**

     *

     * @param crm

     * The crm

     */

    public void setCrm(Crm crm) {

        this.crm = crm;

    }



}