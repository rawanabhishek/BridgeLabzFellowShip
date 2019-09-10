/******************************************************************************
 
 *  Purpose: to print the primeAnagram number between 0 to 1000
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/ 
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.AlgorithmUtility;

public class PrimeAnagram {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		int start =0;
		int end=1000;
		
		//starting the loop from start to end
		for(int i=start ;i<end;i++) {
			//checking i is prime or not and returing true or flase
			if(utility.PrimeChecker(i)) {
				
				//startting the loop from i to end point
				for(int j=i ;j<end;j++) {
					if(i!=j) {
						//checking the weather j is prime or not
						if(utility.PrimeChecker(j)) {
							//checking weather i and j are anagram or not and pallindrom or not
							if(utility.Anagram(String.valueOf(i), String.valueOf(j))  && utility.pallindrom(i)) {
								System.out.println(i+" is prime , pallindrom  "
										+ "and " +i+" " +j+" is prime and anagram ");
										
							}
						}
					}
					
				}
			}
			
		}
		

	}

}
