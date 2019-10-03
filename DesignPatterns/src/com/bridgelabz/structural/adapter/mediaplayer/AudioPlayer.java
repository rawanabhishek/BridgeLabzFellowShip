/******************************************************************************

 *  Purpose: this is audioplayer class implementing media player
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.adapter.mediaplayer;

public class AudioPlayer implements MediaPlayer{
       MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file.Name :"+fileName);
		}
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter =new MediaAdapter(audioType);
			mediaAdapter.play(audioType ,fileName);
		}else {
			System.out.println("invalid media "+audioType+" format not supported ");
		}
		
	}

}
