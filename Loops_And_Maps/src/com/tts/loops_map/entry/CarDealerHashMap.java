package com.tts.loops_map.entry;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

/*This project does the following: Create a hash map of vehicles.
 * 	The model is the Key, the make is the Value.
	Ask the customer what car (model) they are looking for.
	Use the Hash Map to determine if you have that vehicle, and what make it is.
	(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")	
 *@author Nelson T. Sherman
 *Date: 12/4/2020
 */
public class CarDealerHashMap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		//Variables
		String model, redo = null;
	
		//hashmap with keys and values added in
		HashMap<String, String> cars = new HashMap<>();
		
		cars.put("Durango", "Dodge");
		cars.put("Mustang", "Ford");
		cars.put("Camaro", "Chevy");
		cars.put("Sportage", "Kia");
		cars.put("Road Glide", "Harley_Davidson");
		cars.put("Civic", "Honda");
		
		
		
	for (Map.Entry pairEntry: cars.entrySet())
	{ //puts entries in order as they are written
		
	
		System.out.println("What model care are you looking for? ");
			model = s.nextLine();
		
		//String vol = cars.get(model);	
		if (model.equals("Durango") || (model.equals("durango")))
		{
			System.out.println("On you're looking for a " +model +" ? Our " +cars.get("Durango")+" selection is right over here..");
			model = s.next();
		}
		
		else if(model.equals("Mustang") || (model.equals("mustang")))
		{
			System.out.println("On you're looking for a Mustang? Our " +cars.get("Mustang")+" selection is right over here..");
			model = s.next();
		}
		else if(model.equals("Camaro") || (model.equals("camaro")))
		{
			System.out.println("On you're looking for a Camaro? Our " +cars.get("Camaro -")+" selection is right over here..");
			model = s.next();
		}
		else if(model.equals("Sportage") || (model.equals("sportage")))
		{
			System.out.println("On you're looking for a Sportage? Our " +cars.get("Sportage")+" selection is right over here..");
			model = s.next();
		}
		else if(model.equals("Road Glide") || (model.equals("road glide") || (model.equals("RoadGlide"))))
		{
			System.out.println("On you're looking for a Road Glide? Our " +cars.get("Road Glide")+" selection is right over here..");
			model = s.next();
		}
		else if(model.equals("Civic") || (model.equals("civic")))
		{
			System.out.println("On you're looking for a Civic? Our " +cars.get("Civic")+" selection is right over here..");
			model = s.next();
		}
		else
		{
			System.out.println("I'm sorry, we don't sell that Model");
		}
		
		
		System.out.println("\nWould you like to search for a different model?");
			redo = s.next();
			
			if (!redo.equals("yes") || (!redo.equals ("y")))
			{
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else {
			}
		}				
	
	
	
	
	s.close();
	}

}
