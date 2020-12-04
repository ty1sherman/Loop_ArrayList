package com.tts.loops_map.entry;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/*This project does the following:
 * 	o	Asks the user for 5 numbers
	o	Stores them in an array list
	o	Finds the sum, product, largest, and smallest of those numbers
 
 *@author Nelson T. Sherman
 *Date: 12/4/2020
 */

public class LoopsAndMapEntry {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Declare an array of 5 integers	
		ArrayList<Integer> NumList = new ArrayList<Integer>(5);
	
		//Get 5 numbers from the user
					
				for(int num=0; num<5; num++)
				{
					System.out.println("Enter a number from 1 to 10: ");
					int numbers = keyboard.nextInt();
						
					NumList.add(numbers);	
				}
		//Print the Array List of Numbers	
		System.out.println("The Numbers you entered are: "  +NumList);

			
		//get the sum of Array Values and print
				int sum=0;
		
				for(int x=0; x < NumList.size(); x++)
				{
					sum += NumList.get(x);
				}
		System.out.println("\nThe sum of your numbers are: " +sum);
		
		//get the product of Array Values and print
				int product=1;
				
				for(int x=0; x < NumList.size(); x++)
				{
					product = product *NumList.get(x);
				}
				System.out.println("\nThe product of your numbers are: " +product);
		
		//get the largest number and print
				//declare min value as the first element of the list
				int max = NumList.get(0);
				
				//declare min element index as 0 (i.e. first element)
				int maxIndex = 0;
				
				for(int x=1; x < NumList.size(); x++)
				{
						if(NumList.get(x) > max)
						{
							max = NumList.get(x);
							maxIndex = x;
						}
				}
					
				System.out.println("\nThe larges number in the array is: " +max);
		
			
		//get the smallest number and print
				//declare min value as the first element of the list
				int min = NumList.get(0);
				
				//declare min element index as 0 (i.e. first element)
				int minIndex = 0;
				
				for(int x=1; x < NumList.size(); x++)
				{
						if(NumList.get(x) < min)
						{
							min = NumList.get(x);
							minIndex = x;
						}
				}
					
				System.out.println("\nThe smallest number in the array is: " +min);
		
		keyboard.close();
	
		
	}

}
