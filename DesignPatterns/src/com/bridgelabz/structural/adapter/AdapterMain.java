package com.bridgelabz.structural.adapter;

public class AdapterMain {

	public static void main(String[] args) {
	  AudioPlayer audioplayer=new AudioPlayer();
	  audioplayer.play("mp3", "shape of you.mp3");
	  audioplayer.play("mp4", "alone.mp4");
	  audioplayer.play("vlc", "far away.vlc");
	  audioplayer.play("avi", "alive.avi");
	  

	}

}
