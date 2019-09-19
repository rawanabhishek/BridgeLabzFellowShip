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

import com.bridgelabz.handler.LinkedList;

public class HashSlot {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
		LinkedList<Integer> list0 = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		LinkedList<Integer> list4 = new LinkedList<Integer>();
		LinkedList<Integer> list5 = new LinkedList<Integer>();
		LinkedList<Integer> list6 = new LinkedList<Integer>();
		LinkedList<Integer> list7 = new LinkedList<Integer>();
		LinkedList<Integer> list8 = new LinkedList<Integer>();
		LinkedList<Integer> list9 = new LinkedList<Integer>();
		LinkedList<Integer> list10 = new LinkedList<Integer>();
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

		System.out.println();

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			@SuppressWarnings("deprecation")
			Integer temp = new Integer(arr[i]);
			int index = arr[i] % 11;
			if (index == 0) {
				list0.insert(temp);

			} else if (index == 1) {
				list1.insert(temp);

			} else if (index == 2) {
				list2.insert(temp);

			} else if (index == 3) {
				list3.insert(temp);

			} else if (index == 4) {
				list4.insert(temp);

			} else if (index == 5) {
				list5.insert(temp);

			} else if (index == 6) {
				list6.insert(temp);

			} else if (index == 7) {
				list7.insert(temp);

			} else if (index == 8) {
				list8.insert(temp);

			} else if (index == 9) {
				list9.insert(temp);

			} else if (index == 10) {
				list10.insert(temp);

			}

		}
		list.insert(list0);
		list.insert(list1);
		list.insert(list2);
		list.insert(list3);
		list.insert(list4);
		list.insert(list5);
		list.insert(list6);
		list.insert(list7);
		list.insert(list8);
		list.insert(list9);
		list.insert(list10);

		System.out.println();

		System.out.println("Enter a  number");
		int key = scanner.nextInt();

		int newIndex = key % 11;

		if (newIndex == 0) {
			list0.SearchByKey(key, list0.getSize());

		} else if (newIndex == 1) {
			list1.SearchByKey(key, list1.getSize());

		} else if (newIndex == 2) {
			list2.SearchByKey(key, list2.getSize());

		} else if (newIndex == 3) {
			list3.SearchByKey(key, list3.getSize());

		} else if (newIndex == 4) {
			list4.SearchByKey(key, list4.getSize());

		} else if (newIndex == 5) {
			list5.SearchByKey(key, list5.getSize());

		} else if (newIndex == 6) {
			list6.SearchByKey(key, list6.getSize());

		} else if (newIndex == 7) {
			list7.SearchByKey(key, list7.getSize());

		} else if (newIndex == 8) {
			list8.SearchByKey(key, list8.getSize());

		} else if (newIndex == 9) {
			list9.SearchByKey(key, list9.getSize());

		} else if (newIndex == 10) {
			list10.SearchByKey(key, list10.getSize());

		}

		list.show();
		list.SaveToFile();

		String write = LinkedList.Write;

		try {
			File file = new File(
					"/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/TextFiles/hashslotoutput");
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
