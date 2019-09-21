/******************************************************************************
 
 *  Purpose: this is utility class for Reader and Write File IO
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   20-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteUtility {
	/**
	 * @param adress the source path for reading the file
	 * @return a string containing the file objects
	 * @throws IOException
	 */
	public static String Reader(String adress) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(adress));

		String str = "";

		try {
			str = br.readLine();

		} catch (IOException e) {
			e.fillInStackTrace();

		}
		br.close();
		return str;
	}

	/**
	 * @param adress the source path for reading the file
	 * @param write string file which is suppose to be written
	 */
	public static void Write(String adress, String write) {
		try {
			File file = new File(adress);
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(write);
			bufferedWriter.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
