package com.bridgelabz.creational.singleton;

public class ThreadSafe {
	
	private static ThreadSafe instance;
	private ThreadSafe() {
		
	}

	public static synchronized ThreadSafe getinstance() {
		if(instance==null) {
			instance=new  ThreadSafe();
		}
		return instance;
	}
}
