package postAddShopper;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PostShopperRequest {

@SerializedName("name")
@Expose
private String name;
@SerializedName("mobileNo")
@Expose
private String mobileNo;
@SerializedName("cityId")
@Expose
private String cityId;

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
* The mobileNo
*/
public String getMobileNo() {
return mobileNo;
}

/**
* 
* @param mobileNo
* The mobileNo
*/
public void setMobileNo(String mobileNo) {
this.mobileNo = mobileNo;
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