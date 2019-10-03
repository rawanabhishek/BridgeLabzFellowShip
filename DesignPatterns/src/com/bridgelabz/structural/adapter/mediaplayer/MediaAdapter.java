/******************************************************************************

 *  Purpose: this is Mediaplayer class implementing media player
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.adapter.mediaplayer;

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
