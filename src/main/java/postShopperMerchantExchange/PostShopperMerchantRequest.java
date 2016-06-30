package postShopperMerchantExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PostShopperMerchantRequest {

@SerializedName("merchantId")
@Expose
private String merchantId;
@SerializedName("shopperId")
@Expose
private long shopperId;

/**
* 
* @return
* The merchantId
*/
public String getMerchantId() {
return merchantId;
}

/**
* 
* @param merchantId
* The merchantId
*/
public void setMerchantId(String merchantId) {
this.merchantId = merchantId;
}

/**
* 
* @return
* The shopperId
*/
public long getShopperId() {
return shopperId;
}

/**
* 
* @param shopperId
* The shopperId
*/
public void setShopperId(long shopperId) {
this.shopperId = shopperId;
}

}