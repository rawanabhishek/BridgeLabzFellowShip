/******************************************************************************
 
 *  Purpose: this is utility function for hashMap
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   18-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.handler;

import java.util.ArrayList;

public class Map<V, K> {
	private ArrayList<HashNode<K, V>> bucketArray;

	// Current capacity of array list
	private int numBuckets;

	// Current size of array list
	private int size;

	// Constructor (Initializes capacity, size and
	// empty chains.
	public Map() {
		bucketArray = new ArrayList<>();
		numBuckets = 10;
		size = 0;

		// Create empty chains
		for (int i = 0; i < numBuckets; i++)
			bucketArray.add(null);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	// This implements hash function to find index
	// for a key
	private int getBucketIndex(K key) {
		int hashCode = (int) key;
		int index = hashCode % 11;
		return index;
	}

	// Method to remove a given key
	public V remove(K key) {
		// Apply hash function to find index for given key
		int bucketIndex = getBucketIndex(key);

		// Get head of chain
		HashNode<K, V> head = bucketArray.get(bucketIndex);

		// Search for key in its chain
		HashNode<K, V> prev = null;
		while (head != null) {
			// If Key found
			if (head.key.equals(key))
				break;

			// Else keep moving in chain
			prev = head;
			head = head.next;
		}

		// If key was not there
		if (head == null)
			return null;

		// Reduce size
		size--;

		// Remove key
		if (prev != null)
			prev.next = head.next;
		else
			bucketArray.set(bucketIndex, head.next);

		return head.value;
	}

	// Returns value for a key
	public V get(K key) {
		// Find head of chain for given key
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArray.get(bucketIndex);

		// Search key in chain
		while (head != null) {
			if (head.key.equals(key))
				return head.value;
			head = head.next;
		}

		// If key not found
		return null;
	}

	// Adds a key value pair to hash
	public void add(K key, V value) {
		// Find head of chain for given key
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArray.get(bucketIndex);

		// Check if key is already present
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}

		// Insert key in chain
		size++;
		head = bucketArray.get(bucketIndex);
		HashNode<K, V> newNode = new HashNode<K, V>(key, value);
		newNode.next = head;
		bucketArray.set(bucketIndex, newNode);

		// If load factor goes beyond threshold, then
		// double hash table size
		if ((1.0 * size) / numBuckets >= 0.7) {
			ArrayList<HashNode<K, V>> temp = bucketArray;
			bucketArray = new ArrayList<>();
			numBuckets = 2 * numBuckets;
			size = 0;
			for (int i = 0; i < numBuckets; i++)
				bucketArray.add(null);

			for (HashNode<K, V> headNode : temp) {
				while (headNode != null) {
					add(headNode.key, headNode.value);
					headNode = headNode.next;
				}
			}
		}
	}

	// showing the hashmap
	public void show() {
		// System.out.println(chainArray.get(3));
		for (int i = 0; i < bucketArray.size(); i++) {
			try {
				if (!(bucketArray.get(i) == null)) {
					System.out.println("\nindex : " + i);
					HashNode<K, V> head = bucketArray.get(i);
					while (head != null) {
						System.out.print(head.value + " ");
						head = head.next;
					}

				}
			} catch (Exception e) {
				System.err.println(e);
			}

		}

	}

	public String Write = "";

	//saving the show method to write String
	public void SaveToFile() {
		// System.out.println(chainArray.get(3));
		for (int i = 0; i < bucketArray.size(); i++) {
			try {
				if (!(bucketArray.get(i) == null)) {
					System.out.println("\nindex : " + i);
					Write += "\nindex : " + i;
					HashNode<K, V> head = bucketArray.get(i);
					while (head != null) {
						System.out.print(head.value + " ");
						Write += head.value + " ";
						head = head.next;
					}

				}
			} catch (Exception e) {
				System.err.println(e);
			}

		}

	}

}
