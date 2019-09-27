/******************************************************************************
 
 *  Purpose:  to merger two linked list and print there value alternate
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   18-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.dataStructure.copy;

import com.bridgelabz.handler.LinkedList;

public class MergingOfTwoLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		LinkedList<String> list3 = new LinkedList<String>();

		//inserting value in list1
		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		
		//inserting value in list2
		list2.insert(4);
		list2.insert(5);
		list2.insert(6);
		list2.insert(7);

		//getting the size of list 1 and list2 and adding them
		int size = list1.getSize()+list2.getSize();
		boolean flag = false;
		
		
		int temp1 = 0;
		int temp2 = 0;

		
		//till size equal to zero
		while(size!=0) {

			if (!flag) {

				
				if (list1.getData(temp1)!=null) {

					list3.insert(list1.getData(temp1));
					size--;
				}
				temp1++;
				flag = true;
			}

			else {
				
				if (list2.getData(temp2)!=null) {
					list3.insert(list2.getData(temp2));
					size--;
					
				}
				temp2++;
				flag = false;
				

			}

		}
		
		//printing the list 3
		list3.show();
	}
}
