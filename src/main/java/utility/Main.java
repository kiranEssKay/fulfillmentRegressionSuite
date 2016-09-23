package utility;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;

public class Main {
  
    	 public static void main(String[] args) {
    	        final List<Integer> randomNumbers = new ArrayList<>();

    	        for (int i = 0; i < 10; i++) {
    	            randomNumbers.add(RandomNumberGenerator.getRandomNumber(10000));
    	            System.out.println(randomNumbers);
    	        }
    	    
    	
    	
    	
    	
        
       
    }
    
    
    
}