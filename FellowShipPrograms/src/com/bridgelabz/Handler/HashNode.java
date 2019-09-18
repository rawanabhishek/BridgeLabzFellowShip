/******************************************************************************
 
 *  Purpose: this is hashNode Class
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   18-09-2019
 *
 ******************************************************************************/ 
package com.bridgelabz.Handler;

public 	class HashNode<K, V> 
	{ 
	    K key; 
	    V value; 
	  
	    // Reference to next node 
	    HashNode<K, V> next; 
	  
	    // Constructor 
	    public HashNode(K key, V value) 
	    { 
	        this.key = key; 
	        this.value = value; 
	    } 
	} 


