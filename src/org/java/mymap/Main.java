package org.java.mymap;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		System.out.println(Arrays.asList(str.split(" ")));
		
		String[] parole = str.split(" ");
		
		Map<String, Integer> frequenzaParole = new HashMap<>();
		
		for(String parola : parole) {
			
			if (frequenzaParole.containsKey(parola)) {
					
				frequenzaParole.put(parola, frequenzaParole.get(parola) + 1);
		        
		    } else {
		    	
		    	frequenzaParole.put(parola, 1);
		    
		    }	
		}		
		System.out.println(frequenzaParole);		
	}
}
