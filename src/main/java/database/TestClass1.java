package database;

import java.util.Random;

public class TestClass1 {
	
	private int random;
	
	
	private int getrandomnumber()
    {
		Random randomno = new Random();
		
		random = randomno.nextInt(10000);
	
		return random;
    }


	public int getRandom() {
		return random;
	}


	public void setRandom(int random) {
		this.random = random;
	}
	
	/*public int setorderid(int random)
	{
		this.random=random;
		
		return random;
	}
	
	public static int getorderid()
	{
		return random;
	}
	*/



}
