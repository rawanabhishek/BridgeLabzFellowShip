/******************************************************************************
 
 *  Purpose:­> Create a Slot of 10 to store Chain of Numbers that belong to each 
 *            Slot to efficiently search a number from a given set of number using 
 *            hashing function
 *  @author  Abhishek Rawat
 *  @version 1.1
 *  @since   18-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.handler.Map;

public class HashMap {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> hash = new Map<Integer, Integer>();
		BufferedReader br = new BufferedReader(new FileReader(
				"/home/admin1/FellowShip/FellowShipPrograms" + "/src/com/bridgelabz/" + "textfiles/hashslotinput"));

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
		System.out.println();

		System.out.println("Enter a number to search : ");
		int key = scanner.nextInt();
		scanner.close();
		if (hash.get(key) != null) {
			hash.remove(key);
		} else {
			hash.add(key, key);
		}

		//hash.show();
		hash.SaveToFile();
		String write = hash.Write;
		try {
			File file = new File(
					"/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/textfiles/hashslotoutput");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(write);
			bufferedWriter.close();
			System.out.println();
			System.out.println("Write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}

}
