
package postBackupMerchantExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Datum {

@SerializedName("backupMerchant")
@Expose
private BackupMerchant backupMerchant;
@SerializedName("merchant")
@Expose
private Merchant merchant;
@SerializedName("stationId")
@Expose
private Integer stationId;
@SerializedName("id")
@Expose
private Integer id;

/**
* 
* @return
* The backupMerchant
*/
public BackupMerchant getBackupMerchant() {
return backupMerchant;
}

/**
* 
* @param backupMerchant
* The backupMerchant
*/
public void setBackupMerchant(BackupMerchant backupMerchant) {
this.backupMerchant = backupMerchant;
}

/**
* 
* @return
* The merchant
*/
public Merchant getMerchant() {
return merchant;
}

/**
* 
* @param merchant
* The merchant
*/
public void setMerchant(Merchant merchant) {
this.merchant = merchant;
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
* The id
*/
public Integer getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(Integer id) {
this.id = id;
}

}