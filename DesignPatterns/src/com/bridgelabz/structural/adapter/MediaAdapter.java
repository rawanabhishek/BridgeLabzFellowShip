package com.bridgelabz.structural.adapter;

public class MediaAdapter implements MediaPlayer{

	
	AdvancedMediaPlayer advancedmusicplayer;
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedmusicplayer=new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedmusicplayer=new Mp4Player();
		}
		
	}
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedmusicplayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedmusicplayer.playMp4(fileName);
		}
		
	}

}
