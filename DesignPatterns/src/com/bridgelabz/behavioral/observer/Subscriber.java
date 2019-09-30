package com.bridgelabz.behavioral.observer;

public class Subscriber {
	private String name;
	private Channel channel = new Channel();

	public void update() {
		System.out.println("Hey "+name+" ,video uploaded ");
	}

	public void subscribeChannel(Channel ch) {
		channel = ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}
}
