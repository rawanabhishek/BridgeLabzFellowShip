/******************************************************************************
 
 *  Purpose: ­> Read the Text from a file, split it into words and arrange it as Linked List.
              Take a user input to search a Word in the List. If the Word is not found then add it
              to the list, and if it found then remove the word from the List. In the end save the
              list into a file
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.Handler.LinkedList;

public class UnOrderedList {

	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> utility = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
		// Reading the string from the file
		BufferedReader br = new BufferedReader(new FileReader(
				"/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/TextFiles/unorderedlistinput"));

		String str = "";
		try {

			str = str + br.readLine();

			br.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		String[] strArray = str.split(",");
        //inserting the string in the linked list
		for (int i = 0; i < strArray.length; i++) {
			utility.insert(strArray[i]);

		}
         //printing the list
		utility.show();
		System.out.println();
		//taking input string from user to search it in the list
		System.out.println("Enter a name you want to search : ");
		String name = scanner.next();
		int count = 1;
		//checking weather is name string is present in the list or not
		 if(count<strArray.length) {
				
				for (int i = 0; i < strArray.length; i++) {
					count++;
				if (name.equals(strArray[i])) {
					utility.deleteAt(i);
					

					break;
				}
				 else if(count>strArray.length){
						utility.insert(name);
						
					}
				}
				}
                
			
		
		System.out.println();
		utility.show();
		System.out.println();
		utility.SaveToFile();
		scanner.close();
		
		
		String strWrite=LinkedList.Write;
		//writing the update list to the file 
		try {
			File file=new File("/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/TextFiles/unorderedlistoutput");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(strWrite);
			bufferedWriter.close();
			System.out.println();
			System.out.println("Write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	}


