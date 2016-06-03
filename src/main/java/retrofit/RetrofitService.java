package retrofit;


import getMerchantsDetail.GetMerchantsDetailResponse;
import getShopperByCityId.ShopperByCityIdResponse;
import getShopperById.ShopperByIdResponse;
import getShopperByMerchantId.ShopperByMerchantIdResponse;
import postCrmAssignment.CrmAssignmentRequest;
import postCrmAssignment.CrmAssignmentResponse;
import postFeAssignment.FeAssignmentRequest;
import postFeAssignment.FeAssignmentResponse;
import postGetQueuedUrders.GetQueuedOrdersResponse;
import postInsertOrder.InsertOrderRequest;
import postInsertOrder.InsertOrderResponse;
import postResetMerchantThreshold.ResetMerchantThresholdResponse;
import postUpdateMerchantThreshold.UpdateMerchantThresholdRequest;
import postUpdateMerchantThreshold.UpdateMerchantThresholdResponse;
import postUpdateMerchantType.UpdateMerchantTypeRequest;
import postUpdateMerchantType.UpdateMerchantTypeResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface RetrofitService {
    @POST("/orders/{order_id}")
    Call<InsertOrderResponse> postOrder(@Path("order_id")String order_id,@Body InsertOrderRequest body);

   /* @POST("/orders/{order_id}/")
    Call<OrderRescheduleResponse> postOrder(@Path("order_id")String order_id,@Body OrderRescheduleRequest body);
*/
    @POST("/orders/{order_id}/")
    Call<FeAssignmentResponse> postOrder(@Path("order_id")String order_id,@Body FeAssignmentRequest body);

    @POST("/orders/{order_id}/")
    Call<CrmAssignmentResponse> postOrder(@Path("order_id")String order_id,@Body CrmAssignmentRequest body);

    @POST("/merchants/updates?action=update")
    Call<UpdateMerchantThresholdResponse> postOrder(@Body UpdateMerchantThresholdRequest body);

    @POST("/merchants/updates?action=reset")
    Call<ResetMerchantThresholdResponse> postOrder();

    @POST("/orders/queued/")
    Call<GetQueuedOrdersResponse> GetQueuedOrders();

    @GET( "/merchants/updates")
    Call<GetMerchantsDetailResponse> GetMerchantsDetail(@Query("ids") int ids);

    @GET( "shoppers")
    Call<ShopperByIdResponse> GetShopperById(@Query("id") String id);

    @GET( "shoppers")
    Call<ShopperByMerchantIdResponse> GetShopperByMerchantId(@Query("merchantId") String id);

    @GET( "shoppers")
    Call<ShopperByCityIdResponse> GetShopperByCityId(@Query("cityId") String id);

    @PUT("/merchants/")
    Call<UpdateMerchantTypeResponse> UpdateMerchantType(@Body UpdateMerchantTypeRequest body);



}
