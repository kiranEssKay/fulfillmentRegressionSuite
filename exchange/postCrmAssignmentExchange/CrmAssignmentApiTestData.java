
package postCrmAssignmentExchange;



        import javax.annotation.Generated;

        import com.google.gson.annotations.Expose;

        import com.google.gson.annotations.SerializedName;



@Generated("org.jsonschema2pojo")

public class CrmAssignmentApiTestData {



    @SerializedName("request")

    @Expose

    private CrmAssignmentRequest request;

    @SerializedName("response")

    @Expose

    private CrmAssignmentResponse response;



    /**

     *

     * @return

     * The request

     */

    public CrmAssignmentRequest getRequest() {

        return request;

    }



    /**

     *

     * @param request

     * The request

     */

    public void setRequest(CrmAssignmentRequest request) {

        this.request = request;

    }



    /**

     *

     * @return

     * The response

     */

    public CrmAssignmentResponse getResponse() {

        return response;

    }



    /**

     *

     * @param response

     * The response

     */

    public void setResponse(CrmAssignmentResponse response) {

        this.response = response;

    }



}