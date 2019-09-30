package com.bridgelabz.behavioral.observer;

public class Youtube {

	public static void main(String[] args) {
		Channel pedalpower = new Channel();
        Subscriber s1=new Subscriber("Abhishek");
        Subscriber s2=new Subscriber("Ajay");
        Subscriber s3=new Subscriber("Kshama");
        Subscriber s4=new Subscriber("Irene");
        Subscriber s5=new Subscriber("Sabby");
        
        pedalpower.subscriber(s1);
        pedalpower.subscriber(s2);
        pedalpower.subscriber(s3);
        pedalpower.subscriber(s4);
        pedalpower.subscriber(s5);
        
        s1.subscribeChannel(pedalpower);
        s2.subscribeChannel(pedalpower);
        s3.subscribeChannel(pedalpower);
        s4.subscribeChannel(pedalpower);
        s5.subscribeChannel(pedalpower);
        
        pedalpower.upload("How to ride effciently ");
        
        
        
	}

}
