package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.DatastructureUtility.LinkedListUtility;

public class OrderedList {

	public static int size;
	public static void main(String[] args) throws IOException {

		LinkedListUtility<Integer> utility = new LinkedListUtility<Integer>();

		Scanner scanner = new Scanner(System.in);
		// Reading the string from the file
		BufferedReader br = new BufferedReader(
				new FileReader("/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/TextFiles/orderedlistinput"));

		String str = "";
		try {

			str = str + br.readLine();

			br.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		String[] strArray = str.split(",");
		int arr[] = new int[strArray.length];

		//inserting the value into the list
		for (int i = 0; i < strArray.length; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
			utility.insert(arr[i]);
		}
        size=arr.length;
		//Arrays.sort(arr);
		
		utility.show();
		System.out.println("Sorted list is : ");
		utility.Sort(size);

		utility.show();
		System.out.println();
		System.out.println("Enter a number you want to search : ");
		int num = scanner.nextInt();


		size=utility.SearchByKey(num,size);
		utility.Sort(size);
		utility.show();
		utility.SaveToFile();
		
		String strWrite=LinkedListUtility.Write;
		//writing to the output file 
		try {
			File file=new File("/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/TextFiles/orderedlistoutput");
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
		scanner.close();
	}

	}


