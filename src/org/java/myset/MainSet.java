package org.java.myset;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class MainSet {

	public static void main(String[] args) {
		
		Set<Integer> rndList = new HashSet<>();
		Random rnd = new Random();
		while(rndList.size() < 5) {
			
			int val = rnd.nextInt(2, 13);
			rndList.add(val);
			
		}
		
		System.out.println(rndList);
	}
}
