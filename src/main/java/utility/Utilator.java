package utility;

import java.util.Random;

import org.testng.annotations.Test;

public class Utilator

{
	
	
	
	public int getrandomnumber()
    {
		Random randomno = new Random();
		
		int random = randomno.nextInt(10000);
	
		return random;
    }
	
	
	
	
}
