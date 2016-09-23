package utility;

import java.util.Random;

public class OrderGenerator 

{
	
	private int orderId;
	
	private OrderGenerator()
	{
		
	}
	
	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public static OrderGenerator orderInstance = null;
	
	
	public static OrderGenerator getInstance()
	{
		
		if(orderInstance == null){
			
			
			orderInstance = new OrderGenerator();
		}
		
		return orderInstance;
		
	}
	

		
		public int getrandomnumber()
	    {
			Random randomno = new Random();
			
			 orderId = randomno.nextInt(10000);
		
			return orderId;
	    }


	

}
