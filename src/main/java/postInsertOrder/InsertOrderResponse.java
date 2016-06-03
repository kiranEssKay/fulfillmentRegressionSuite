package postInsertOrder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InsertOrderResponse {

	@SerializedName("message")
	@Expose
	private String message;
	@SerializedName("success")
	@Expose
	private Boolean success;

	/**
	 * 
	 * @return The message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message
	 *            The message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public InsertOrderResponse withMessage(String message) {
		this.message = message;
		return this;
	}

	/**
	 * 
	 * @return The success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * 
	 * @param success
	 *            The success
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public InsertOrderResponse withSuccess(Boolean success) {
		this.success = success;
		return this;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int has = 3;
		has +=7*this.message.hashCode();
		has +=7*this.success.hashCode(); 
		return has;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		InsertOrderResponse response = (InsertOrderResponse) obj;
		if (this.getMessage().equals(response.getMessage()) && this.getSuccess() == response.getSuccess()) {
			return true;
		} else
			return false;

	}
}
