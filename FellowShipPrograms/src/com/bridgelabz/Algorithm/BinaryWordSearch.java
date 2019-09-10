/******************************************************************************
 
 *  Purpose: to read string from a file and perform binary search on it 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.Utility.AlgorithmUtility;

public class BinaryWordSearch {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		AlgorithmUtility utility = new AlgorithmUtility();
		FileReader file=new FileReader("/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz"
				+ "/TextFiles/BinaryWordSearchInput");
		BufferedReader bufferedreader=new BufferedReader(file);
		String str="";
		try {
			str=bufferedreader.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		bufferedreader.close();
		String []strArr=str.split(",");
		
		utility.bubbleSortString(strArr);
		
		
		System.out.println();
		
		System.out.println("Enter a key value to search ");
		String keyStr = scanner.next();
		
		utility.binarySearchString(strArr, keyStr);
		
		scanner.close();
	}

}
