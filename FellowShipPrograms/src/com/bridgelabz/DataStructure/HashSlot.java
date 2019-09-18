package com.bridgelabz.DataStructure;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.Handler.LinkedList;

public class HashSlot {

	public static void main(String[] args) throws Exception {
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
				list3.show();
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
	
		
		

		
	}
}
