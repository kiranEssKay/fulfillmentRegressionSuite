package postBackupMerchantExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PostBackupRequest {

@SerializedName("merchantId")
@Expose
private String merchantId;
@SerializedName("stationId")
@Expose
private Integer stationId;
@SerializedName("backupMerchantId")
@Expose
private String backupMerchantId;
@SerializedName("cityId")
@Expose
private String cityId;

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
* The stationId
*/
public Integer getStationId() {
return stationId;
}

/**
* 
* @param stationId
* The stationId
*/
public void setStationId(Integer stationId) {
this.stationId = stationId;
}

/**
* 
* @return
* The backupMerchantId
*/
public String getBackupMerchantId() {
return backupMerchantId;
}

/**
* 
* @param backupMerchantId
* The backupMerchantId
*/
public void setBackupMerchantId(String backupMerchantId) {
this.backupMerchantId = backupMerchantId;
}

/**
* 
* @return
* The cityId
*/
public String getCityId() {
return cityId;
}

/**
* 
* @param cityId
* The cityId
*/
public void setCityId(String cityId) {
this.cityId = cityId;
}

}
