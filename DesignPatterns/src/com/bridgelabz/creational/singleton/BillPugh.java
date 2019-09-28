package com.bridgelabz.creational.singleton;

public class BillPugh {
	

	    private BillPugh(){}
	    
	    private static class SingletonHelper{
	        private static final BillPugh instance = new BillPugh();
	    }
	    
	    public static BillPugh getinstance(){
	        return SingletonHelper.instance;
	    }
	

}
