

package postFeAssignment;



        import javax.annotation.Generated;

        import com.google.gson.annotations.Expose;

        import com.google.gson.annotations.SerializedName;



@Generated("org.jsonschema2pojo")

public class FeAssignmentApiTestData {



    @SerializedName("request")

    @Expose

    private FeAssignmentRequest request;

    @SerializedName("response")

    @Expose

    private FeAssignmentResponse response;



    /**

     *

     * @return

     * The request

     */

    public FeAssignmentRequest getRequest() {

        return request;

    }



    /**

     *

     * @param request

     * The request

     */

    public void setRequest(FeAssignmentRequest request) {

        this.request = request;

    }



    /**

     *

     * @return

     * The response

     */

    public FeAssignmentResponse getResponse() {

        return response;

    }



    /**

     *

     * @param response

     * The response

     */

    public void setResponse(FeAssignmentResponse response) {

        this.response = response;

    }



}