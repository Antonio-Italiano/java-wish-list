package org.lessons.java.christmas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		List<String> dreamsList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);			
		
		while(true) {
			
			System.out.println("1 - Inserire desiderio");
			System.out.println("2 - Mostra I desideri");
			int choice = sc.nextInt();	
			
			if(choice < 1 || choice > 2) {
				
				System.out.println("Scelta non valida");
				continue;	
			}
			
			if(choice == 2) break;
		
			sc.nextLine();	
			
			System.out.println("Inserire desiderio");
			String dream = sc.nextLine();			
			dreamsList.add(dream);
			System.out.println("\nDesideri: " + dreamsList.size()+ "\n");		
		}
		
		sc.close();
		System.out.println("Lista dei desideri:");
		System.out.println(dreamsList);
	}
}
