package getForceUpdateExchange;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

@SerializedName("minVersion")
@Expose
private Integer minVersion;
@SerializedName("interval")
@Expose
private Integer interval;
@SerializedName("id")
@Expose
private Integer id;
@SerializedName("latestVersion")
@Expose
private Integer latestVersion;
@SerializedName("forceUpdateEnabled")
@Expose
private Boolean forceUpdateEnabled;

/**
* 
* @return
* The minVersion
*/
public Integer getMinVersion() {
return minVersion;
}

/**
* 
* @param minVersion
* The minVersion
*/
public void setMinVersion(Integer minVersion) {
this.minVersion = minVersion;
}

/**
* 
* @return
* The interval
*/
public Integer getInterval() {
return interval;
}

/**
* 
* @param interval
* The interval
*/
public void setInterval(Integer interval) {
this.interval = interval;
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

/**
* 
* @return
* The latestVersion
*/
public Integer getLatestVersion() {
return latestVersion;
}

/**
* 
* @param latestVersion
* The latestVersion
*/
public void setLatestVersion(Integer latestVersion) {
this.latestVersion = latestVersion;
}

/**
* 
* @return
* The forceUpdateEnabled
*/
public Boolean getForceUpdateEnabled() {
return forceUpdateEnabled;
}

/**
* 
* @param forceUpdateEnabled
* The forceUpdateEnabled
*/
public void setForceUpdateEnabled(Boolean forceUpdateEnabled) {
this.forceUpdateEnabled = forceUpdateEnabled;
}

}