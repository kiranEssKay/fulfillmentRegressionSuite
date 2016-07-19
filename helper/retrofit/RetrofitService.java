package retrofit;

import getForceUpdateExchange.GetForceUpadateResponse;
import getMerchantsDetailExchange.GetMerchantsDetailResponse;
import getShopperByCityIdExchange.ShopperByCityIdResponse;
import getShopperByIdExchange.ShopperByIdResponse;
import getShopperByMerchantIdExchange.ShopperByMerchantIdResponse;
import postAddMerchantExchange.PostAddMerchantRequest;
import postAddMerchantExchange.PostAddMerchantResponse;
import postAddShopperExchange.PostShopperRequest;
import postAddShopperExchange.PostShopperResponse;
import postBackupMerchantExchange.PostBackupRequest;
import postBackupMerchantExchange.PostBackupResponse;
import postCancelOrderExchange.PostCanceOrderRequest;
import postCancelOrderExchange.PostCanceOrderResponse;
import postCrmAssignmentExchange.CrmAssignmentRequest;
import postCrmAssignmentExchange.CrmAssignmentResponse;
import postFeAssignmentExchange.FeAssignmentRequest;
import postFeAssignmentExchange.FeAssignmentResponse;
import postGetQueuedUrdersExchange.GetQueuedOrdersResponse;
import postInsertOrderExchange.InsertOrderRequest;
import postInsertOrderExchange.InsertOrderResponse;
import postOrderEnrouteExchange.PostEnrouteRequest;
import postOrderEnrouteExchange.PostOrderEnrouteResponse;
import postOrderExchange.PostOrderRequest;
import postOrderExchange.PostOrderResponse;
import postResetMerchantThresholdExchange.ResetMerchantThresholdResponse;
import postShopperMerchantExchange.PostShopperMerchantRequest;
import postShopperMerchantExchange.PostShopperMerchantResponse;
import postUpdateMerchantThresholdExchange.UpdateMerchantThresholdRequest;
import postUpdateMerchantThresholdExchange.UpdateMerchantThresholdResponse;
import postUpdateMerchantTypeExchange.UpdateMerchantTypeRequest;
import postUpdateMerchantTypeExchange.UpdateMerchantTypeResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitService {
	@POST("/orders/{order_id}")
	Call<InsertOrderResponse> postOrder(@Path("order_id") String order_id, @Body InsertOrderRequest body);

	/*
	 * @POST("/orders/{order_id}/") Call<OrderRescheduleResponse>
	 * postOrder(@Path("order_id")String order_id,@Body OrderRescheduleRequest
	 * body);
	 */
	@POST("/orders/{order_id}/")
	Call<FeAssignmentResponse> postOrder(@Path("order_id") String order_id, @Body FeAssignmentRequest body);

	@POST("/orders/{order_id}/")
	Call<CrmAssignmentResponse> postOrder(@Path("order_id") String order_id, @Body CrmAssignmentRequest body);

	@POST("/merchants/updates?action=update")
	Call<UpdateMerchantThresholdResponse> postOrder(@Body UpdateMerchantThresholdRequest body);

	@POST("/merchants/updates?action=reset")
	Call<ResetMerchantThresholdResponse> postOrder();

	@POST("/orders/queued/")
	Call<GetQueuedOrdersResponse> GetQueuedOrders();

	@GET("/merchants/updates")
	Call<GetMerchantsDetailResponse> GetMerchantsDetail(@Query("ids") int ids);

	@GET("shoppers")
	Call<ShopperByIdResponse> GetShopperById(@Query("id") String id);

	@GET("shoppers")
	Call<ShopperByMerchantIdResponse> GetShopperByMerchantId(@Query("merchantId") String id);

	@GET("shoppers")
	Call<ShopperByCityIdResponse> GetShopperByCityId(@Query("cityId") String id);

	@PUT("/merchants/")
	Call<UpdateMerchantTypeResponse> UpdateMerchantType(@Body UpdateMerchantTypeRequest body);

	@POST("/merchants/")
	Call<PostShopperResponse> postShopper(@Body PostShopperRequest body);
	
	
	@POST("/merchants/")
    Call<PostAddMerchantResponse> addMerchantResponse(@Body PostAddMerchantRequest bodyAuth);
	// Cancel Order API 
	
	@POST("/orders/{order_id}/")
    Call<PostCanceOrderResponse> cancelOrder(@Path("order_id") String order_id,@Body PostCanceOrderRequest bodyAuth);
	
	// Order Enroute
	
	@POST("/orders/{order_id}/")
    Call<PostOrderEnrouteResponse> orderEnroute(@Path("order_id") String order_id,@Body PostEnrouteRequest bodyAuth);
	
	@POST("/mappings/merchant-shopper")
    Call<PostShopperMerchantResponse> shopperMerchant(@Body PostShopperMerchantRequest bodyAuth);
	
	@POST("/mappings/backup-merchant")
    Call<PostBackupResponse> merchantBackup(@Body PostBackupRequest bodyAuth);

	//Call<PostBackupResponse> merchantBackup(PostBackupRequest request);

	
	@GET("/forceupdateconfig")
	Call<GetForceUpadateResponse> getForceUpdate();
	
	//Insert Market Place Orders 
	
	@POST("/orders/{order_id}")
	Call<PostOrderResponse> postOrder(@Path("order_id") String order_id, @Body PostOrderRequest body);
	
	

}
