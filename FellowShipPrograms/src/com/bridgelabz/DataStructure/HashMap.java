/******************************************************************************
 
 *  Purpose:­> Create a Slot of 10 to store Chain of Numbers that belong to each 
 *            Slot to efficiently search a number from a given set of number using 
 *            hashing function
 *  @author  Abhishek Rawat
 *  @version 1.1
 *  @since   18-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.DataStructure;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


import com.bridgelabz.Handler.Map;

public class HashMap{

	public static void main(String[] args) throws IOException {
		Map<Integer ,Integer> hash=new Map<Integer,Integer>();
		BufferedReader br = new BufferedReader(new FileReader(
				"/home/admin1/FellowShip/FellowShipPrograms" + "/src/com/bridgelabz/" + "TextFiles/hashslotinput"));

		String str = "";

		try {
			str = br.readLine();

		} catch (IOException e) {
			e.fillInStackTrace();

		}
		br.close();

		String strArray[] = str.split(",");

		int arr[] = new int[strArray.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			hash.add(arr[i], arr[i]);
		}
		
		hash.show();
		
	}

}
